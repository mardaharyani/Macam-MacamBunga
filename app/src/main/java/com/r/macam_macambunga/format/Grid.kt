package com.r.macam_macambunga.format

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.r.macam_macambunga.R
import com.r.macam_macambunga.susunan.BungaGrid
import com.r.macam_macambunga.ui.theme.MacamMacamBungaTheme

@Composable
fun BungaGrid(
    bungaGrid: BungaGrid,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clickable { onItemClicked(bungaGrid.id) },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = bungaGrid.gambar),
            contentDescription = null
        )
        Text(
            text = "${bungaGrid.nama_bunga}"
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewHalamanGrid() {
    MacamMacamBungaTheme {
        BungaGrid(
            bungaGrid = BungaGrid(
                1,
                R.drawable.__orkid_grid,
                "Orkid",
                "Bunga eksotis dengan beragam bentuk dan warna, sering ditemukan di daerah tropis dan subtropis."
            ),
            onItemClicked = { lazygridId ->
                println("LazyRow Id : $lazygridId")
            }
        )
    }
}
