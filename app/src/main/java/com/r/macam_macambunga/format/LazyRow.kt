package com.r.macam_macambunga.format

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.r.macam_macambunga.R
import com.r.macam_macambunga.susunan.BungaRow
import com.r.macam_macambunga.ui.theme.MacamMacamBungaTheme

@Composable
fun BungaLazyRow(
    bungaRow: BungaRow,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
            .height(170.dp)
            .width(150.dp)
            .clickable { onItemClicked(bungaRow.id) }
            .background(Color.Magenta)
            .padding(20.dp)
    ) {
        Image(
            painter = painterResource(id = bungaRow.gambar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(50.dp))
                .size(100.dp)
        )
        Text(text = "${bungaRow.nama_bunga}", fontSize = 20.sp, color = Color.White)
    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewBungaLazyRow() {
    MacamMacamBungaTheme {
        BungaLazyRow(
            bungaRow = BungaRow(
                1,
                R.drawable.__mawar_row,
                "Mawar",
                "Bunga yang sangat populer dan indah dengan beragam warna dan aroma yang menyegarkan.",
            ),
            onItemClicked = { lazyrowId ->
                println("LazyRow Id : $lazyrowId")
            }
        )
    }
}