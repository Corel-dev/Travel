package com.example.easyt.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.easyt.ui.theme.screens.dashscreen.DashScreen
import com.example.easyt.ui.theme.screens.home.HomeScreen
import com.example.easyt.ui.theme.screens.login.LoginScreen
import com.example.easyt.ui.theme.screens.second.SecondScreen
import com.example.easyt.ui.theme.screens.signup.SignupScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String = HOME_URL) {
    NavHost(navController = navController,
        startDestination = startDestination,
        modifier = Modifier
    ) {
        composable(DASH_URL){
            DashScreen(navController = navController)
        }
        composable(WELCOME_URL){
            SecondScreen(navController = navController)
        }
        composable(LOGIN_URL){
            LoginScreen(navController = navController)
        }
        composable(HOME_URL){
            HomeScreen(navController = navController)
        }
        composable(SIGNUP_URL){
            SignupScreen(navController = navController)
        }

    }
}