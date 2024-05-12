package com.r.macam_macambunga

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.r.macam_macambunga.ui.theme.MacamMacamBungaTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanAbout(
    modifier: Modifier
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
                        Text(text = "Halaman Profile", fontSize = 20.sp,color = Color.Black)
                    }
                }
            )
        },
        // dibawah tempat isinya
    ) {contentPadding ->
        Column(modifier.padding(contentPadding)) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 30.dp, start = 10.dp, bottom = 10.dp, end = 10.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier.padding(top = 40.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(200.dp)
                    )
                }
            }
            Column(
                modifier = Modifier.padding(start = 30.dp, top = 16.dp)
            ) {

                Text(text = "Nama :", fontWeight = FontWeight.Bold)
                Text(text = "Marda Haryani",modifier = Modifier
                    .border(2.dp, Color.Black, shape = RoundedCornerShape(16.dp))
                    .padding(5.dp))
                Spacer(modifier = Modifier.size(15.dp))
                Text(text = "Email :",fontWeight = FontWeight.Bold)
                Text(text = "mardahariani19@gmail.com",modifier = Modifier
                    .border(2.dp, Color.Black, shape = RoundedCornerShape(16.dp))
                    .padding(5.dp))
                Spacer(modifier = Modifier.size(15.dp))
                Text(text = "Asal Perguruan Tinggi :", fontWeight = FontWeight.Bold)
                Text(text = "Universitas Sriwijaya",modifier = Modifier
                    .border(2.dp, Color.Black, shape = RoundedCornerShape(16.dp))
                    .padding(5.dp))
                Spacer(modifier = Modifier.size(15.dp))
                Text(text = "Jurusan :", fontWeight = FontWeight.Bold)
                Text(text = "Sistem Komputer",modifier = Modifier
                    .border(2.dp, Color.Black, shape = RoundedCornerShape(16.dp))
                    .padding(5.dp))
                Spacer(modifier = Modifier.size(15.dp))
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
private fun PreviewHalamanAbout() {
    MacamMacamBungaTheme {
        HalamanAbout(modifier = Modifier)
    }
}