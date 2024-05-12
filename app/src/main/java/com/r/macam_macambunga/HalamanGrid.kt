package com.r.macam_macambunga

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.r.macam_macambunga.gambarbunga.listbunga
import com.r.macam_macambunga.susunan.BungaGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.r.macam_macambunga.format.BungaGrid
import com.r.macam_macambunga.navigation.Screen
import com.r.macam_macambunga.ui.theme.MacamMacamBungaTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanGrid(
    navController: NavController,
    modifier: Modifier = Modifier,
    bungaGrids: List<BungaGrid> = listbunga.bungaLazyGrid
) {
    Scaffold(
        // buat topbar
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier
                            .background(Color.Gray)
                            .height(50.dp)
                            .width(335.dp)
                            .padding(end = 5.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Halaman Grid", fontSize = 20.sp, color = Color.Black)
                    }
                }
            )
        },
        // dibawah tempat isinya
    ) {contentPadding ->
        Column(modifier.padding(contentPadding)) {
            LazyVerticalGrid(
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                columns = GridCells.Adaptive(140.dp),
                modifier = modifier
                    .fillMaxSize()
                    .padding(top = 50.dp)
            ) {

                items(bungaGrids, key = { it.id }) {

                    BungaGrid(bungaGrid = it
                    ){lazygridid ->
                        navController.navigate(Screen.DetailGrid.route + "/$lazygridid")
                    }

                }
            }
        }
    }

}
