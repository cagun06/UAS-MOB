package com.example.pesonajawatimur.Data

import com.example.pesonajawatimur.DetailsWisata.Wisata
import com.example.pesonajawatimur.R

object DataPanatai {
    private val wisataName = arrayOf(
        "Pantai Plengkung (G-Land), Banyuwangi",
        "Pantai Balekambang, Malang",
        "Pantai Pulau Merah, Banyuwangi",
        "Pantai Klayar, Pacitan",
        "Pantai Kedung Tumpang, Tulungagung",
        "Green Bay (Teluk Ijo), Banyuwangi",
        "Pantai Banyu Tibo, Pacitan",
        "Pantai Papuma, Jember",
        "Pantai Tambakrejo, Blitar",
        "Pantai Pasir Putih, Situbondo"
    )

    private val wisataDetails = arrayOf(
        "Pantai Plengkung atau yang juga dikenal dengan Pantai G-land merupakan pantai populer di Banyuwangi. Pantai yang satu ini juga terkenal di kalangan surfers dunia karena pantai G-land ini terkenal memiliki ombak yang cocok untuk surfing. Bahkan, ombak di pantai ini dikatakan sebagai ombak terbaik kedua di dunia (setelah Hawaii) untuk berselancar!Ombak di Pantai Plengkung dijuluki sebagai The Seven Giant Waves Wonder karena ketinggian ombak di pantai ini bisa mencapai 4 hingga 7 meter dengan panjang mencapai 2 km dan formasi bersusun. Keindahan ombak ini menjadi daya tarik utama pantai ini. Selain itu, pantai ini memiliki pasir berwarna putih dan dikelilingi hutan yang masih alami yang masuk dalam kawasan Taman Nasional Alas Purwo.",
        "Terletak di Desa Srigonco, Kecamatan Bantur, Malang, Pantai Balekambang menawarkan pemandangan indah yang sayang sekali jika dilewatkan. Pantai ini sering disebut Tanah Lot-nya Malang karena pemandangan di pantai ini mirip dengan Tanah Lot di Bali, yaitu adanya sebuah pura di pulau karang di tengah laut yang dihubungkan dengan jembatan kayu.Panorama di pantai ini begitu memukau! Pantai ini memiliki pasir yang kecoklatan, air yang bersih dan jernih dengan gradasi warna biru disertai ombak yang cukup besar. Tak heran jika pantai ini menjadi salah satu pantai paling terkenal di Malang.",
        "Terletak di Desa Sumberagung, Kecamatan Pesanggaran, Banyuwangi, Pantai Pulau Merah merupakan pantai indah lainnya yang wajib Anda kunjungi di Jawa Timur. Pantai ini merupakan salah satu destinasi wisata favorit di Banyuwangi. Keindahan pantai ini dijamin bakal buat kamu malas pulang!Memiliki garis pantai yang lumayan panjang, pantai ini memiliki sebuah pulau di tengah lautnya yang menjadi ciri khas pantai ini. Di pulau tersebut ada pura yang masih aktif digunakan umat Hindu setempat untuk beribadah. Pasir di pantai ini berwarna cokelat agak kemerahan. Saat matahari terbenam, langit di pantai ini berubah menjadi warna jingga yang sangat mempesona.",
        "Terletak di Kecamatan Donorojo, pacitan, Pantai Klayar merupakan salah satu wisata unggulan di Pacitan. Pantai ini memiliki pasir putih seperti susu, air yang bening serta gradasi warna air laut dijamin bakal buat kamu malas pulang.Ada juga air mancur alami dengan tinggi 10 meter dan ada juga batu karang yang bentuknya menyerupai Spinx di pantai ini yang menjadi salah satu keistimewaan Pantai Klayar ini.",
        "Pantai yang satu ini memiliki pemandangan yang unik. Di pinggir pantai ini terdapat banyak lubang besar di atas karang yang berisi air laut yang terbawa hempasan ombak.Lubang-lubang ini menjadi kolam alami yang super keren! Banyak wisatawan yang datang ke pantai ini untuk berenang di kolam-kolam alami tersebut atau sekedar duduk santai menikmati pemandangan Pantai Kedung Tumpang yang yang sangat mempesona.",
        "Terletak di Desa Sarongan, Kecamatan Pesanggaran, Banyuwangi, Teluk Ijo atau yang dikenal juga dengan nama Green Bay ini menawarkan pemandangan pantai super cantik yang dijamin buat kamu betah lama-lama bermain di pantai ini!Pasirnya yang putih dan lembut airnya yang jernih serta berwarna toska serta ombak yang tidak begitu besar membuat pantai ini menjadi favorit wisatawan yang berkunjung ke Banyuwangi.",
        "Terletak di Desa Widoro, Kecamatan Donorojo, Pacitan, Pantai Banyu Tibo memiliki pemandangan yang unik dan mempesona. Dalam Bahasa Jawa, banyu tibo berarti air yang jatuh.Di Pantai Banyu Tibo ini terdapat air terjun yang airnya berasal dari sungai kecil yang ada di atas tebing di dekat pantai ini. Aliran air sungai inilah yang jatuh ke laut menyatu dengan ombak dari pantai Banyu Tibo ini. Air sungai ini sangat segar, jernih dan tidak pernah kering sehingga bisa dinikmati kapan saja kamu berkunjung ke pantai ini.",
        "Terletak di Desa Lojejer, Kecamatan Wuluhan, Kabupaten Jember, Pantai Papuma menawarkan pemandangan serta keindahan pantai yang memukau. Meski lokasi pantai ini lumayan jauh dari pusat Kota Jember, tetapi pantai cantik yang satu ini selalu ramai pengunjung.Perpaduan pasir putih serta batu karang yang tersebar di pinggir pantai membuat pemandangan di pantai ini begitu indah. Di pantai ini terdapat 7 karang besar yang menjulang tinggi yang menyerupai pulau. Ketujuh batu karang ini memiliki nama lho! Keindahan Pantai Papuma juga sering dimanfaatkan masyarakat untuk tempat berburu foto.",
        "Terletak di Desa Tambakrejo, Kecamatan Wonotirto, Blitar, Pantai Tambakrejo memiliki pemandangan yang sangat cantik. Ombaknya yang relatif tenang membuat pantai ini cocok untuk berenang atau sekedar bermain air di tepi pantai.Tak jauh dari pantai ini juga terdapat Tempat Pelelangan Ikan yang selalu dipadati nelayan dan masyarakat yang ingin membeli ikan segar. Kamu juga bisa menemukan berbagai perahu tradisional yang ditambatkan di tepi pantai karena mencari ikan menjadi sumber mata pencaharian utama warga yang ada di sekitar pantai ini.",
        "Terletak di Dusun Kembangsari, Pasir Putih, Bungatan, Kabupaten Situbondo, pantai ini merupakan salah satu pantai favorit di Situbondo. Sesuai dengan namanya, pantai Pasir Putih di Situbondo ini memiliki hamparan pasir berwarna putih dan dikelilingi hutan yang masih asri.Pemandangan di pantai ini sangat memikat! Selain berenang, kamu juga bisa snorkelling menikmati keindahan bawah laut pantai ini. Bahkan, kamu juga bisa menyewa perahu layar dan berlayar di sekitaran pantai."
         )

    private val wisataPhoto = arrayOf(
        R.drawable.pantai1,
        R.drawable.pantai2,
        R.drawable.pantai3,
        R.drawable.pantai4,
        R.drawable.pantai5,
        R.drawable.pantai6,
        R.drawable.pantai7,
        R.drawable.pantai8,
        R.drawable.pantai9,
        R.drawable.pantai10


    )

    val listData: ArrayList<Wisata>
        get() {
            val list = ArrayList<Wisata>()
            for(position in wisataName.indices){
                val wisata = Wisata()
                wisata.photo = wisataPhoto[position]
                wisata.name = wisataName[position]
                wisata.detail = wisataDetails[position]
                list.add(wisata)
            }
            return list
        }
}