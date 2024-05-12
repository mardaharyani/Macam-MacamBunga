package com.r.macam_macambunga

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.r.macam_macambunga.navigation.ItemNav
import com.r.macam_macambunga.navigation.Screen
import com.r.macam_macambunga.ui.theme.MacamMacamBungaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MacamMacamBungaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HalamanAwal()
                }
            }
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanAwal(
    modifier: Modifier = Modifier,
    navController: NavHostController= rememberNavController()
) {
    Scaffold(
        bottomBar = {
            BagianBottom(navController)
        },
        modifier = Modifier
    ) {contentpadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(contentpadding)
        ) {
            composable(Screen.Home.route) {
                HalamanAwal(navController)
            }
            composable(Screen.Grid.route) {
                HalamanGrid(navController)
            }
            composable(Screen.Profile.route) {
                HalamanAbout(modifier = Modifier)
            }
            composable(
                Screen.Detail.route + "/{bungarowid}",
                arguments = listOf(navArgument("bungarowid") {type = NavType.IntType})
            ){navBackStackEntry ->
                HalamanDetailRow(
                    navController = navController,
                    bungarowid = navBackStackEntry.arguments?.getInt("bungarowid")
                )
            }
            composable(
                Screen.DetailColumn.route + "/{bungacolumnid}",
                arguments = listOf(navArgument("bungacolumnid") {type = NavType.IntType})
            ) { navBackStackEntry ->
                HalamanDetailColumn(
                    navController = navController,
                    bungacolumid = navBackStackEntry.arguments?.getInt("bungacolumnid")
                )

            }
            composable(
                Screen.DetailGrid.route + "/{bungagridid}",
                arguments = listOf(navArgument("bungagridid") {type = NavType.IntType})
            ) { navBackStackEntry ->
                HalamanDetailGrid(
                    navController = navController,
                    bungagrid  = navBackStackEntry.arguments?.getInt("bungagridid")
                )
            }
        }
    }
}

@Composable
private fun BagianBottom(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    NavigationBar(
        modifier = modifier
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute =navBackStackEntry?.destination?.route

        val itemNav = listOf(
            ItemNav(
                title = "List",
                icon = Icons.Default.List,
                screen = Screen.Home
            ),
            ItemNav(
                title = "Grid",
                icon = Icons.Default.DateRange,
                screen = Screen.Grid
            ),
            ItemNav(
                title = "Profile",
                icon = Icons.Default.Person,
                screen = Screen.Profile
            )
        )
        itemNav.map {itemNav ->
            NavigationBarItem(
                selected = currentRoute == itemNav.screen.route,
                onClick = {
                    navController.navigate(itemNav.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = { Icon(imageVector = itemNav.icon, contentDescription = itemNav.title) },
                label = { Text(text = itemNav.title) }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun InfiniteAppPrev() {
    HalamanAwal()
}