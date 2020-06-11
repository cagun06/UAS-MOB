package com.example.pesonajawatimur.Data

import com.example.pesonajawatimur.DetailsWisata.Wisata
import com.example.pesonajawatimur.R

object DataSejarah {
    private val wisataName = arrayOf(
        "Tugu Pahlawan, Surabaya",
        "Candi Singasari, Malang",
        "Candi Penataran, Blitar",
        "Candi Jolotundo, Mojokerto",
        "Candi Bajang Ratu, Mojokerto",
        "Candi Jawi, Pasuruan",
        "Candi Jago, Malang",
        "Candi Jabung, Probolinggo",
        "Monumen Kapal Selam, Surabaya",
        "Jembatan Merah, Surabaya",
        "Hotel Majapahit, Surabaya",
        "Gedung Siola, Surabaya"
    )

    private val wisataDetails = arrayOf(
        "Salah satu ikon Kota Surabaya ini dibangun di atas area Taman Kebonrojo seberang kantor Gubernur Jawa Timur. Berada satu lokasi dengan Tugu Pahlawan, kamu bisa mengunjungi Museum Sepuluh Nopember berbentuk piramida yang menyimpan berbagai macam dokumentasi perjuangan rakyat Surabaya lho. Salah satunya adalah transkrip suara Bung Tomo ketika menyemangati rakyat Surabaya melawan pasukan Sekutu.",
        "Tempat bersejarah di jawa timur Candi Singasari terletak di Jalan Kertanegara nomor 148, desa Candirenggo, Singosari, Malang. Seperti namanya, candi ini adalah peninggalan bersejarah Kerajaan Singasari.Candi Jawa Timur, yang tingginya 15 meter, adalah Hindu-Budha. Bagian bawah candi berbentuk bujur sangkar dengan relung di setiap sisi candi, sementara atapnya berbentuk meru dalam deretan di mana ia menjadi lebih kecil saat naik.",
        "Tampaknya tidak lengkap untuk mengunjungi kota Blitar tanpa melihat kemegahan candi Penataran. Bahkan, candi ini akan menjadi yang terbesar di Jawa Timur. Sudah berdiri sejak zaman Kerajaan Kediri, sekitar 1200 M, candi ini terdiri dari beberapa bangunan memanjang sepanjang sumbu barat laut selatan tenggara. Di bagian depan candi terdapat dua patung raksasa yang berfungsi sebagai kuli angkut, serta Bale Agung, yang seharusnya menjadi tempat perundingan atau pertemuan para pendeta kerajaan. Dan Candi ini berada di desa Penataran, Kecamatan Nglegok, Kab. Blitar, Jawa Timur. Yang menarik, kuil ini diusulkan sebagai Situs Warisan Dunia UNESCO pada 1995!",
        "Candi Jolotundo merupakan peninggalan Raja Udayana yang dimaksudkan untuk Raja Airlangga (putra) setelah dinobatkan Raja Sumedang Kahuripan. Secara geografis, Candi Jolotundo sekitar 800 m / d, tepatnya di Bukit Bekel, lereng barat Gunung Penanggungan. Pusat Pendidikan Lingkungan Seloliman (PPLH) terletak hanya 900 meter. Candi ini di Jawa Timur masih dipadati wisatawan karena diperkirakan musim semi menyembuhkan berbagai penyakit. Sudah biasa bagi wisatawan dari luar provinsi untuk juga membawa beberapa wadah air ke rumah. Biaya masuk hanya IDR 10.000 untuk orang dewasa dan 5.000 untuk anak di bawah 12 tahun.",
        "Juga di daerah Mojokerto, lebih tepatnya di wilayah Temon, Trowulan, Anda juga dapat menemukan candi Bajang Ratu yang tidak kalah eksotis dari candi Jolotundo. Beberapa orang juga menyebut candi ini nama Gerbang Bajang Ratu, karena bangunan ini digunakan sebagai lokasi bangunan suci untuk memperingati kematian Raja Jayanegara. Bangunan di Pura Bajang Ratu menggunakan batu bata merah yang khas, luas, tebal dan kokoh. Namun, berbeda dengan tangga dan di dalam atap candi, dibangun dari batu andesit. Bangunan peninggalan di Majapahit ini memiliki pintu tanpa ruang utama atau reses di luar. Di atas, ada patung-patung dengan detail yang rumit. Jadi, pastikan untuk tidak melewatkan semua detail bangunan ini!",
        "Candi ini terletak di desa Candi Wates, Kabupaten Prigen, Pasuruan. Candi Jawi diciptakan atas perintah raja terakhir dari Kerajaan Singasari, yaitu Raja Kertanegara. Memiliki ketinggian 24,5 meter, lebar 9,5 meter, dan panjang sekitar 14,2 meter, bentuk candi ini mirip dengan candi Prambanan di Jawa Tengah dengan atap yang menggabungkan stupa dan sebuah kubus meruncing di puncaknya. Menariknya, dalam pembangunan candi, yang sangat populer di Jawa Timur, dua jenis batu digunakan. Di kaki aula candi dibangun batu hitam, sedangkan tubuh candi menggunakan batu putih. Popularitas candi ini sering membuatnya ramai dengan pengunjung, jadi Anda harus bersabar ketika ingin mengambil gambar di berbagai sudut!",
        "Candi Jago didirikan pada abad ke-13 di bawah Kerajaan Singasari. Candi yang tersusun dari batuan andesit memiliki bagian atap yang tidak sempurna. Dikatakan bahwa bagian atas candi rusak oleh petir. Bangunan candi Jago sendiri memiliki bentuk teras di punden, di mana ukuran candi menjadi semakin kecil. Candi ini memiliki ketinggian hampir 10 meter dan lebar sekitar 14 meter, dengan panjang hingga 24 meter. Selain karakter bangunan yang unik, patung relief yang mengelilingi bangunan kuil Jago, yang menceritakan ajaran Hindu dan Budha, juga layak diabadikan dalam lensa kamera Anda. Apakah Anda ingin melihat detail bangunan Kuil Jago? Anda bisa datang langsung ke Jalan Wisnuwardhana, Dago Jago, Tumpang, Malang.",
        "Menuju ke Desa Jabung, Distrik Paiton, Probolinggo, Anda akan menemukan Candi Jabung. Candi ini adalah salah satu tujuan wisata candi-candi Jawa Timur yang tidak pernah berhenti menarik perhatian pengunjung. Bangunan utama candi terbuat dari batu merah dengan panjang 13,11 meter, lebar 9,58 meter, dan tinggi 15,58 meter. Namun, dilarang bagi pengunjung untuk memasuki bangunan karena candi Jabung sudah cukup rapuh. Di candi Jabung ini, tidak ada tiket resmi atau tiket untuk mengunjungi candi. Namun, Anda harus terlebih dahulu mengisi buku tamu dan melaporkan kepada petugas yang sedang mengawasi lokasi candi sebelum memasuki area candi.",
        "Monumen Kapal Selam bertempat di Embong Kaliasin, Genteng, Surabaya. Monumen ini sebenarnya ialah kapal selam KRI Pasopati 410, yaitu salah satu armada Angkatan Laut Republik Indonesia buatan Uni Soviet tahun 1952. Kapal ini digunakan dalam Pertempuran Laut Aru demi membebaskan Irian Barat dari pendudukan Belanda.Kapal selam ini dibawa ke darat untuk dijadikan monument dalam rangka memperingati keberanian pahlawan Indoesia. Kapal ini dipotong menjadi beberapa bagian untuk kemudian diangkut ke darat dan dirangkai serta disambung kembali. Selain interior kapal selam, terdapat juga pemutaran film tentang proses peperangan yang terjadi di Laut Aru. Baca juga artikel mengenai sejarah Museum Kapal Selam Surabaya.",
        "Bangunan Bersejarah di Surabaya selanjutnya adalah Jembatan Merah semasa VOC bernilai penting karena merupakan penghubung paling vital melewati Kalimas menuju Gedung Karesidenan Surabaya. Kawasan ini dulunya adalah daerah perniagaan yang mulai berkembang karena akibat Perjanjian Paku Buwono II dari Mataram dengan VOC pada 11 November 1743. Hingga kini, fungsinya sebagai pusat perniagaan masih terus berlangsung. Pada tahun 1890an, terjadi perubahan fisik pada Jembatan Merah. Pagar pembatas diubah dari kayu menjadi besi. Kondisi jembatan saat ini hampir sama seperti jembatan lainnya, dengan warna merahnya yang khas. Saat ini, Jembatan Merah menghubungkan Jalan Rajawali dan Kembang Jepun di sisi utara Surabaya.",
        "Hotel Majapahit merupakan hotel mewah bersejarah di Surabaya. Hotel ini sempat berganti nama beberapa kali, yaitu mulai dari LMS, Hotel Oranje, Hotel Yamato, Hotel Hoteru, hingga menjadi Hotel Majapahit. Hotel ini didirikan oleh Sarkies Bersaudara pada tahun 1910. Hotel ini dikelola oleh Mandarin Oriental Hotel Group pada tahun 1993 hingga 2006. Selanjutnya diakuisisi oleh PT Sekman Wisata pada tahun 2006.Hotel Majapahit menjadi saksi perjuangan peristiwa perobekan warna biru pada bendera Belanda menjadi bendera merah putih, yaitu bendera Republik Indonesia pada 19 September 1945. Peristiwa ini diawali dengn sekelompok orang Belanda yang dipimpin oleh Mr. Ploegman yang mengibarkan bendera Merah Putih Biru di puncak sebelah kanan hotel. Masyarakat Surabaya tidak terima akan hal tersebut, sehingga mereka pun berbondong-bondong mendatangi hotel. Para pejuang kemudian naik dan merobek bagian warna biru dari bendera Belanda, sehingga akhirnya tersisa bendera Merah Putih atau bendera Republik Indonesia.",
        "Gedung Siola dahulu bernama White Laidlaw. Gedung ini didirikan pertama kali pada 1877 dan ditempati oleh Toko Whiteaway Laidlaw&Co milik pengusaha Inggris (Robert Laidlaw). Tempat ini menjual tekstil dan pakaian dan selanjutnya berkembang menjadi toserba terbesar di wilayah Hindia Belanda.Gedung Siola (saat itu masih Toko Chiyoda) terbakar habis dalam pertempuran 10 November 1945 di Surabaya. Gedung ini kemudain dibuka kembali pada 1960-an sebagai Toko Siola, yaitu dari nama pemiliknya Soemitro-Ing Wibisono-Ong-Liem-Ang. Toko ini ditutup pada 1998 dan dibuka kembali sebagai Ramayana Siola dari 1999-2008 atau sekarang bernama Tunjungan City. Gedung Siola saat ini digunakan sebagai Kantor Dinas Pendudukan dan Pencatatan Sipil Surabaya, Kantor Badan Koordinasi Pelayan dan Penanaman Modal (BKPPM), dan Museum Surabaya."
         )

    private val wisataPhoto = arrayOf(
        R.drawable.sejarah1,
        R.drawable.sejarah2,
        R.drawable.sejarah3,
        R.drawable.sejarah4,
        R.drawable.sejarah5,
        R.drawable.sejarah6,
        R.drawable.sejarah7,
        R.drawable.sejarah8,
        R.drawable.sejarah9,
        R.drawable.sejarah10,
        R.drawable.sejarah11,
        R.drawable.sejarah12


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