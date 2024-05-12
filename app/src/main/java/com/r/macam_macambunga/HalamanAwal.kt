package com.r.macam_macambunga

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.r.macam_macambunga.gambarbunga.listbunga
import com.r.macam_macambunga.navigation.Screen
import com.r.macam_macambunga.susunan.BungaColumn
import com.r.macam_macambunga.susunan.BungaRow
import com.r.macam_macambunga.format.BungaLazyRow
import com.r.macam_macambunga.format.BungaLazyColumn


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanAwal(
    navController: NavController,
    modifier: Modifier = Modifier,
    bungaRows: List<BungaRow> = listbunga.bungaLazyRow,
    bungaColumns: List<BungaColumn> = listbunga.bungaLazyColumn
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
                        Text(text = "Halaman Awal", fontSize = 20.sp,color = Color.Black)
                    }
                }
            )
        },
        // dibawah tempat isinya
    ) {contentPadding ->
        Column(modifier.padding(contentPadding)) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(10.dp),
                modifier = Modifier.padding(top = 50.dp)
            ) {
                item {

                    LazyRow(
                        contentPadding = PaddingValues(10.dp),
                        horizontalArrangement = Arrangement.spacedBy(15.dp),
                        modifier = modifier
                    ) {
                        items(bungaRows, key = { it.id}) {
                            BungaLazyRow(bungaRow = it) {lazyrowid ->
                                navController.navigate(Screen.Detail.route + "/$lazyrowid")
                            }
                        }
                    }
                    Text(text = "Lainnya",modifier.padding(start = 10.dp))
                }
                items(bungaColumns, key = {it.id }) {
                    BungaLazyColumn(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        bungaColumn = it
                    ){lazycolumnid ->
                        navController.navigate(Screen.DetailColumn.route + "/$lazycolumnid")
                    }
                }
            }

        }
    }

}

