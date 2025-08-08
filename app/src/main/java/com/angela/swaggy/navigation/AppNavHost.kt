package com.angela.swaggy.navigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.angela.swaggy.data.UserDatabase
import com.angela.swaggy.repository.UserRepository
import com.angela.swaggy.ui.screens.about.AboutScreen
import com.angela.swaggy.ui.screens.auth.LoginScreen
import com.angela.swaggy.ui.screens.auth.RegisterScreen
import com.angela.swaggy.ui.screens.category.CategoryScreen
import com.angela.swaggy.ui.screens.contact.ContactScreen
import com.angela.swaggy.ui.screens.dashboard.DashboardScreen
import com.angela.swaggy.ui.screens.dashboard.DashboardScreen2
import com.angela.swaggy.ui.screens.detail.DetailScreen
import com.angela.swaggy.ui.screens.form.FormScreen
import com.angela.swaggy.ui.screens.home.HomeScreen
import com.angela.swaggy.ui.screens.intent.IntentScreen
import com.angela.swaggy.ui.screens.item.ItemScreen
import com.angela.swaggy.ui.screens.products.AddProductScreen
import com.angela.swaggy.ui.screens.products.EditProductScreen
import com.angela.swaggy.ui.screens.products.ProductListScreen
import com.angela.swaggy.ui.screens.scaffold.ScaffoldScreen
import com.angela.swaggy.ui.screens.splash.SplashScreen
import com.angela.swaggy.viewmodel.AuthViewModel
import com.angela.swaggy.viewmodel.ProductViewModel

@RequiresApi(Build.VERSION_CODES.Q)
@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH,
    productViewModel: ProductViewModel = viewModel(),
) {

    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }

        composable(ROUT_CATEGORY) {
            CategoryScreen(navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUT_SCAFFOLD) {
            ScaffoldScreen(navController)
        }
        composable(ROUT_DETAIL) {
            DetailScreen(navController)
        }

        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_DASHBOARD2) {
            DashboardScreen2(navController)
        }

        composable(ROUT_FORM) {
            FormScreen(navController)
        }


        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }
        // End of Authentication


        //CRUD -Products
        composable(ROUT_ADD_PRODUCT) {
            AddProductScreen(navController, productViewModel)
        }

        composable(ROUT_PRODUCT_LIST) {
            ProductListScreen(navController, productViewModel)
        }

        composable(
            route = ROUT_EDIT_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId")
            if (productId != null) {
                EditProductScreen(productId, navController, productViewModel)
            }
        }

        //End of products




    }
}