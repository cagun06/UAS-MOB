package com.example.pesonajawatimur.Data

import com.example.pesonajawatimur.DetailsWisata.Wisata
import com.example.pesonajawatimur.R

object DataKuliner {
    private val wisataName = arrayOf(
        "Soto Lamongan",
        "Rujak Cingur",
        "Rawon",
        "Gado-Gado",
        "Lontong Balap",
        "Pecel",
        "Tahu Tek",
        "Nasi Tumpang",
        "Rujak Soto",
        "Sego Tempong"
    )

    private val wisataDetails = arrayOf(
        "Soto Lamongan menjadi salah satu makanan khas Jawa Timur yang saat sangat mudah ditemukan di berbagai daerah lainnya. Namun, terdapat perbedaan antara soto Lamongan dengan soto lainnya, yakni koya, tahukah Anda apa itu koya? Koya merupakan sejenis bubuk gurih dengan bahan dasar pembuatannya berasal dari kerupuk udang dan bawang putih.Tambahan koya membuat cita rasa soto Lamongan menjadi semakin gurih dan membuat siapa yang menikmatinya akan semakin ketagihan. Jika Anda penasaran dengan citarasanya, segera cari dan temukan kuliner lezat ini di kota Anda.",
        "Nah, jika kuliner Rujak Cingur pastinya sebagian besar dari kita pernah mendengar tentangnya bukan? Berbeda dari rujak biasanya yang berisikan irisan buah-buahan dan sambel, Rujak Cingur menjadi kesukaan para pecinta kuliner karena berisikan rujak mulut sapi, cingur, sayuran dan berbagai bahan pelengkap lainnya..",
        "Wisata kuliner khas Jawa Timur berikutnya yang wajib Anda coba ialah Rawon, sebagian dari kita pasti telah sering mendengarnya. Rawon merupakan sebuah makanan dengan kuah yang berwarna coklat kehitam-hitaman.Karena warna kuah inilah makanan yang satu ini disebut dengan nama Rawon. Tahukah Anda? Warna kuah rawon yang kehitam-hitaman ini didapatkan karean sebuah bahan rahasia yang bernama kluwek. Di Jawa Timur, salah satu lokasi terkenal yang menjajal Rawon ialah di daerah Pasuruan.",
        "Kuliner khas Jawa Timur selanjutnya ialah gado-gado yang memang telah terkenal dengan kelezatan citarasanya di lidah para penikmat wisata kuliner. Tidak hanya masyarakat Indonesia, bahkan wisatawan mancanegara pun telah membuktikan dan mengakui sendiri kelezatan dan kenikmatan kuliner unik yang satu ini.",
        "Namanya saja sudah sangat unik, namun jangan berpikir jika kuliner lontong yang satu ini digunakan untuk ajang perlombaan, kompetisi atau sejenisnya ya. Lontong Balap merupakan salah satu kuliner khas Jawa Timur dan Anda bisa menemukannya dengan mudah di sekitaran Jalanan Jawa Timur.",
        "Pecel merupakan salah satu kuliner yang sangat mudah ditemukan di berbagai kota di Indonesia, termasuk di Jawa Timur dengan cita rasa yang tidak diragukan lagi. Makanan khas Jawa Timur ini hampur digemari semua kalangan, dari muda hingga tua, baik pria maupun wanita memiliki selera yangs ama dalam menilai sebuah masakan terbaik.",
        "Kuliner khas Jawa Timur yang wajib Anda coba dengan cita rasa yang dijamin bikin nagih ialah Tahu Tek. Seperti namanya, jelas saja kuliner yang satu terbuat dari bahan utama berupa tahu.Tahu Tek sendiri merupakan kuliner yang berisi tahu goreng setengah matang yang selanjutnya dipadukan dengan bahan lainnya, seperti tauge, kentang goreng, potongan lontong hingga timun.",
        "Nasi Tumpang khas Jawa Timur juga sering disebut dengan nama sego tumpang dan menjadi salah satu makanan terbaik khas Kediri, Jawa Timur. Kuliner menarik yang satu ini wajib dicoba oleh Anda para pecinta dan pemburu kuliner terbaik.Alasan mengapa menu ini diberi nama nasi tumpang ialah karena menunya yang menggunakan kuah sambal tumpang, yakni terbuat dari tempe basi atau biasa disebut tempe bosok oleh masyarakat Jawa.",
        "Rujak soto menjadi menu khas Jawa Timur selanjutnya yang tidak boleh dilewatkan saat Anda berkunjung kesana. Menu yang satu ini bisa ditemukan di Banyuwangi dengan soto yang berbeda dari yang biasanya pastinya Anda akan dibuat ketagihan.Rujak soto khas Banyuwangi Jawa Timur di buat dari dua makanan yang berbeda yang digabungkan jadi satu, yaitu rujak dan soto. Ya, rujak akan digabungkan dengan soto kuning, tepatnya rujak sayur dan soto babat.",
        "Pasti sangat asing mendengar nama Sego Tempong, terlebih bagi Anda yang bukan berasal dari Jawa Timur. Namun, jangan pernah merasa asing dengan rasa nikmatnya ya para pemburu kuliner terbaik khas Jawa timur. Ya, sego tempong merupakan makanan khas Banyuwangi, Jawa Timur."
    )

    private val wisataPhoto = arrayOf(
        R.drawable.kuliner1,
        R.drawable.kuliner2,
        R.drawable.kuliner3,
        R.drawable.kuliner4,
        R.drawable.kuliner5,
        R.drawable.kuliner6,
        R.drawable.kuliner7,
        R.drawable.kuliner8,
        R.drawable.kuliner9,
        R.drawable.kuliner10
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