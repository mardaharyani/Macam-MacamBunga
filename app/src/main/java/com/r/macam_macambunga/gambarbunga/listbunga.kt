package com.r.macam_macambunga.gambarbunga

import com.r.macam_macambunga.R
import com.r.macam_macambunga.susunan.BungaColumn
import com.r.macam_macambunga.susunan.BungaGrid
import com.r.macam_macambunga.susunan.BungaRow

object listbunga {
    val bungaLazyRow = listOf(
        BungaRow(
            id = 1,
            gambar = R.drawable.__mawar_row,
            nama_bunga = "Mawar",
            deskripsi = "Bunga yang sangat populer dan indah dengan beragam warna dan aroma yang menyegarkan."
        ),
        BungaRow(
            id = 2,
            gambar = R.drawable.__edelweiss_row,
            nama_bunga = "Edelweiss",
            deskripsi = "Bunga putih keabu-abuan yang tumbuh di daerah pegunungan, sering dianggap sebagai simbol keberanian dan keabadian."
        ),
        BungaRow(
            id = 3,
            gambar = R.drawable.__lavender_row,
            nama_bunga = "Lavender",
            deskripsi = "Bunga ungu kebiruan dengan aroma yang menenangkan, sering digunakan dalam pengobatan herbal dan produk kecantikan."
        ),
        BungaRow(
            id = 4,
            gambar = R.drawable.__lily_row,
            nama_bunga = "Lily",
            deskripsi = "Bunga yang elegan dengan kelopak yang besar dan aroma yang kuat, hadir dalam berbagai warna dan variasi."
        ),
        BungaRow(
            id = 5,
            gambar = R.drawable.__matahari_row,
            nama_bunga = "Matahari",
            deskripsi = "Bunga besar dengan kepala yang menghadap matahari, menciptakan pemandangan yang indah di ladang."
        ),
        BungaRow(
            id = 6,
            gambar = R.drawable.__sakura_row,
            nama_bunga = "Sakura",
            deskripsi = "Bunga simbolik dari Jepang yang muncul pada awal musim semi dengan warna pink yang lembut."
        ),
        BungaRow(
            id = 7,
            gambar = R.drawable.__sepatu_row,
            nama_bunga = "Hibiscus",
            deskripsi = "Bunga berwarna cerah dengan kelopak yang besar dan menarik, sering ditemukan di daerah tropis."
        ),
        BungaRow(
            id = 8,
            gambar = R.drawable.__tulip_row,
            nama_bunga = "Tulip",
            deskripsi = "Bunga berbentuk lonceng dengan daun lancip yang tersedia dalam berbagai warna, termasuk merah, kuning, dan ungu."
        ),
        BungaRow(
            id = 9,
            gambar = R.drawable.__wisteria_row,
            nama_bunga = "Wisteria",
            deskripsi = "Bunga anggun dengan tandan panjang dan kelopak yang berlimpah, sering ditemukan di taman-taman tradisional sebagai tanaman merambat."
        ),
        BungaRow(
            id = 10,
            gambar = R.drawable.__azalea_row,
            nama_bunga = "Azalea",
            deskripsi = "Bunga kecil berwarna-warni yang tumbuh dalam tandan besar, sering ditemukan di taman dan kebun."
        ),
    )
    val bungaLazyColumn = listOf(
        BungaColumn(
            id = 1,
            gambar = R.drawable.__campanula_column,
            nama_bunga = "Campanula (Bellflower)",
            deskripsi = "Bunga lonceng kecil dengan warna biru, ungu, atau putih, sering tumbuh di tepi jalan atau taman."
        ),
        BungaColumn(
            id = 2,
            gambar = R.drawable.__gerbera_column,
            nama_bunga = "Gerbera",
            deskripsi = "Bunga cerah dengan kelopak besar dan warna-warni, sering digunakan dalam karangan bunga dan dekorasi."
        ),
        BungaColumn(
            id = 3,
            gambar = R.drawable.__anggrek_bulan_column,
            nama_bunga = "Anggrek Bulan (Moonflower)",
            deskripsi = "Bunga putih besar yang mekar di malam hari dengan aroma yang harum."
        ),
        BungaColumn(
            id = 4,
            gambar = R.drawable.__melati_column,
            nama_bunga = "Melati (Jasmine)",
            deskripsi = "Bunga putih harum yang sering digunakan dalam minyak esensial dan parfum."
        ),
        BungaColumn(
            id = 5,
            gambar = R.drawable.__cempaka_column,
            nama_bunga = "Cempaka (Magnolia)",
            deskripsi = "Bunga berwarna putih atau merah muda dengan aroma yang harum, sering dianggap sebagai simbol kecantikan dan kesucian."
        ),
        BungaColumn(
            id = 6,
            gambar = R.drawable.__daffodil_column,
            nama_bunga = "Daffodil",
            deskripsi = "Bunga kuning cerah yang menandai kedatangan musim semi, sering dianggap sebagai lambang kebahagiaan dan kehidupan baru."
        ),
        BungaColumn(
            id = 7,
            gambar = R.drawable.__krisan_column,
            nama_bunga = "Krisan (Chrysanthemum)",
            deskripsi = "Bunga dengan kelopak yang rimbun dan berwarna-warni, sering dipakai dalam aransemen bunga."
        ),
        BungaColumn(
            id = 8,
            gambar = R.drawable.__lantana_column,
            nama_bunga = "Lantana",
            deskripsi = "Bunga berkelopak kecil dengan warna-warni cerah, sering ditemukan di daerah tropis dan subtropis."
        ),
        BungaColumn(
            id = 9,
            gambar = R.drawable.__poppy_column,
            nama_bunga = "Poppy",
            deskripsi = "Bunga dengan kelopak yang tipis dan warna-warni, sering tumbuh liar di padang rumput atau taman."
        ),
        BungaColumn(
            id = 10,
            gambar = R.drawable.__violet_column,
            nama_bunga = "Violet",
            deskripsi = "Bunga kecil dengan warna ungu yang lembut, sering ditemukan di hutan-hutan dan tepi jalan."
        ),
    )
    val bungaLazyGrid = listOf(
        BungaGrid(
            id = 1,
            gambar = R.drawable.__orkid_grid,
            nama_bunga = "Orkid (Orchid)",
            deskripsi = "Bunga eksotis dengan beragam bentuk dan warna, sering ditemukan di daerah tropis dan subtropis."
        ),
        BungaGrid(
            id = 2,
            gambar = R.drawable.__bulan_grid,
            nama_bunga = "Bulan (Night-blooming Jasmine)",
            deskripsi = "Bunga putih kekuningan dengan aroma yang kuat dan menyegarkan, sering mekar di malam hari."
        ),
        BungaGrid(
            id = 3,
            gambar = R.drawable.__camellia_grid,
            nama_bunga = "Camellia",
            deskripsi = "Bunga dengan kelopak yang lebat dan berkilau, tersedia dalam berbagai warna dan ukuran."
        ),
        BungaGrid(
            id = 4,
            gambar = R.drawable.__kembang_suci_grid,
            nama_bunga = "Suci (Frangipani)",
            deskripsi = "Bunga tropis yang cantik dengan aroma yang manis, sering dijumpai di daerah pantai."
        ),
        BungaGrid(
            id = 5,
            gambar = R.drawable.__bougainvillea_grid,
            nama_bunga = "Merah Jambu (Bougainvillea)",
            deskripsi = "Bunga merambat yang penuh warna, menambahkan sentuhan tropis pada taman atau teras."
        ),
        BungaGrid(
            id = 6,
            gambar = R.drawable.__carnation_grid,
            nama_bunga = "Carnation",
            deskripsi = "Bunga dengan kelopak yang bengkok dan tajam, tersedia dalam berbagai warna dan sering digunakan dalam karangan bunga."
        ),
        BungaGrid(
            id = 7,
            gambar = R.drawable.__iris_grid,
            nama_bunga = "Iris",
            deskripsi = "Bunga dengan kelopak yang tipis dan tegak, sering ditemukan di daerah beriklim sedang dan subtropis."
        ),
        BungaGrid(
            id = 8,
            gambar = R.drawable.__anggrek_grid,
            nama_bunga = "Anggrek (Plumeria)",
            deskripsi = "Bunga tropis yang indah dengan aroma yang manis, sering digunakan dalam rangkaian bunga atau hiasan rambut."
        ),
        BungaGrid(
            id = 9,
            gambar = R.drawable.__lily_of_the_valley_grid,
            nama_bunga = "Lily of the Valley",
            deskripsi = "Bunga kecil berbentuk lonceng dengan aroma yang manis, sering ditemukan di taman-taman tradisional."
        ),
        BungaGrid(
            id = 10,
            gambar = R.drawable.__freesia_grid,
            nama_bunga = "Freesia",
            deskripsi = "Bunga kecil dengan aroma yang manis dan tersedia dalam berbagai warna."
        ),
    )
}