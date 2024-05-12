package com.r.macam_macambunga.navigation

sealed class Screen(
    val route:String
) {
    data object Home : Screen("rumah")
    data object Grid : Screen("grid")
    data object Profile : Screen("profile")
    data object Detail : Screen("detail")
    data object DetailColumn : Screen("detailcolumn")
    data object DetailGrid : Screen("detailgrid")
}