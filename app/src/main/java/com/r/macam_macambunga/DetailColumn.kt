package com.r.macam_macambunga

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.r.macam_macambunga.gambarbunga.listbunga
import com.r.macam_macambunga.susunan.BungaColumn
import com.r.macam_macambunga.susunan.BungaRow
import com.r.macam_macambunga.ui.theme.MacamMacamBungaTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanDetailColumn(
    modifier: Modifier = Modifier,
    navController: NavController,
    bungacolumid: Int?
) {
    val inimacam_macambungacolumn = listbunga.bungaLazyColumn.filter { bungaColumn ->
        bungaColumn.id == bungacolumid
    }
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
                        IconButton(onClick = {
                            navController.navigate("rumah")
                        }) {
                            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null, modifier = Modifier.background(Color.Black))
                        }
                        Text(text = inimacam_macambungacolumn[0].nama_bunga, fontSize = 20.sp, color = Color.Black)
                    }
                }
            )
        },
        // dibawah tempat isinya
    ) {contentPadding ->
        Column(modifier.padding(contentPadding)) {
            HalamanIsi(inimacam_macambungacolumn = inimacam_macambungacolumn)
        }
    }
}

@Composable
private fun HalamanIsi(
    inimacam_macambungacolumn: List<BungaColumn>,
    modifier: Modifier = Modifier.fillMaxSize(),
) {
    val routes =
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = inimacam_macambungacolumn[0].gambar),
                contentDescription = null,
                modifier = Modifier
                    .padding(10.dp)
                    .clip(RoundedCornerShape(15.dp))
            )
            Spacer(modifier = Modifier.size(10.dp))
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                Text(text = inimacam_macambungacolumn[0].deskripsi)

            }
        }
}
@Preview(showBackground = true)
@Composable
private fun PreviewHalamanList() {
    MacamMacamBungaTheme {
        HalamanIsi(inimacam_macambungacolumn = listbunga.bungaLazyColumn)
        //Appbar()
    }
}