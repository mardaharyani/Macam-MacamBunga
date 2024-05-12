package com.r.macam_macambunga.format

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.r.macam_macambunga.R
import com.r.macam_macambunga.susunan.BungaColumn
import com.r.macam_macambunga.ui.theme.MacamMacamBungaTheme

@Composable
fun BungaLazyColumn(
    bungaColumn: BungaColumn,
    modifier: Modifier = Modifier,
    onItemClicked: (Int) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(5.dp)
            .background(Color.Magenta)
            .clickable { onItemClicked(bungaColumn.id) }
            .padding(15.dp)
    ) {
        Image(
            painter = painterResource(id = bungaColumn.gambar),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(RoundedCornerShape(50.dp))
                .size(100.dp)
        )
        Spacer(modifier = modifier.size(3.dp))
        Column {
            Text(
                text = " ${bungaColumn.nama_bunga}", fontSize = 20.sp, color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewBungaLazyColumn() {
    MacamMacamBungaTheme {
        BungaLazyColumn(
            bungaColumn = BungaColumn(
                1,
                R.drawable.__campanula_column,
                "Campanula (Bellflower)",
                "Bunga lonceng kecil dengan warna biru, ungu, atau putih, sering tumbuh di tepi jalan atau taman."
            ),
            onItemClicked = { lazycolumnId ->
                println("LazyRow Id : $lazycolumnId")
            }
        )
    }
}
