package com.example.pesonajawatimur.Data

import com.example.pesonajawatimur.DetailsWisata.Wisata
import com.example.pesonajawatimur.R

object DataAlam {
    private val wisataName = arrayOf(
        "Gunung Bromo",
        "Kawah Ijen",
        "Air Terjun Madangkaripura",
        "Gili Labak",
        "Taman Nasional Blauran",
        "Goa Gong",
        "Air Terjun Cuban Rondo",
        "Ranu Kumbolo",
        "Gunung kelud",
        "Puncak B29"
    )

    private val wisataDetails = arrayOf(
        "Gunung Bromo adalah ikon dari Jawa Timur yang sudah terkenal hingga ke mancanegara. Setiap tahun, ribuan turis asing dari kawasan Eropa berdatangan ke tempat wisata di Jawa Timur ini, terutama saat musim panas. Mereka ingin melihat sendiri seperti apa kemagisan dari Gunung Bromo yang memiliki ketinggian 2.329 mdpl ini. Gunung yang terletak di Probolinggo ini menawarkan 3 pesona yang tidak bisa ditolak dengan mudah. Pertama adalah lautan pasir yang luas. Berjalan dari parkiran hingga ke puncak gunung akan membuat Anda seperti berada di gurun pasir. Kedua adalah pemandangan dari jauh yang Instaram-able. Dari kawasan Penanjakan Anda bisa menyaksikan matahari terbit yang menembus kabut.",
        "Kawah Ijen telah berhasil menjadi ikon kedua dari Jawa Timur yang ketenarannya tidak kalah dengan Bali. Terletak di kawasan Banyuwangi, kawah dari gunung yang terus mengeluarkan belerang ini menjadi tujuan wisatawan yang ingin merasakan pendakian kecil sembari menyaksikan bentang alam yang menakjubkan. Atraksi yang ditawarkan oleh tempat wisata di Jawa Timur ini adalah kegiatan penambang belerang yang unik. Ada puluhan orang menambang dari pagi untuk membawa bongkahan batu belerang dari gunung hingga ke bawah. Selain itu, Kawah Ijen juga memiliki blue fire yang merupakan salah satu fenomena alam terbaik di dunia. Saat dini hari, kawasan kawah di gunung ini memendarkan warna biru seperti api. Untuk bisa menyaksikannya, wisatawan harus berangkat pukul 01.00 atau 02.00 pagi agar sinar matahari tidak mengaburkan fenomena menakjubkan ini.",
        "Air terjun Madakaripura adalah sebuah air terjun yang terletak di Kabupaten Probolinggo, Provinsi Jawa Timur. Air terjun setinggi 200 meter ini merupakan air terjun tertinggi di Pulau Jawa dan tertinggi kedua di Indonesia. Air terjun ini adalah salah satu air terjun di kawasan Taman Nasional Bromo Tengger Semeru tepatnya di lereng Gunung Bromo. Air terjun Madakaripura berada di ujung lembah sempit dan berbentuk ceruk yang dikelilingi tebing-tebing curam yang meneteskan air pada seluruh bidang tebingnya seperti layaknya sedang hujan, 3 di antaranya bahkan mengucur deras membentuk air terjun lagi. Nama air terjun yang berada di ketinggian 1.000 Mdpl ini berasal dari kata Madakaripura, tanah perdikan milik mahapatih Gajah Mada dari kerajaan Majapahit. Air Terjun Madakaripura juga kerap disebut Air Terjun Abadi. Hal itu karena air yang dialirkan oleh air terjun ini selalu melimpah dan tak pernah berkurang debitnya.",
        "Setelah berkutat di kawasan Pulau Utama, sekarang kita akan berlanjut ke kawasan Madura yang ternyata juga menawarkan destinasi menarik. Di kawasan Sumenep terdapat sebuah pulau bernama Gili Labak yang keindahannya bisa menyamai Gili Trawangan yang ada di kawasan Lombok, Nusa Tenggara Timur. Gili Labak bisa diakses dengan menggunakan perahu motor dengan tarif sewa Rp350.000 per 15 orang. Setelah melakukan perjalanan dari Kawasan Kalianget, wisatawan bisa menyaksikan birunya lautan yang bening dan juga pulau kecil yang memiliki pasir putih nan lembut. Di tempat wisata di Jawa Timur ini, wisatawan bisa melakukan aktivitas menarik seperti berenang di air yang tenang, berkeliling pulau yang tidak begitu luas, dan melakukan snorkeling untuk menikmati keindahan terumbu karang. Gili Labak adalah alternatif wisata pulau yang menarik dan masih sepi di Jawa Timur & bahkan di Indonesia",
        "Taman Nasional Baluran terletak di dua wilayah kota yaitu Situbondo dan Banyuwangi. Dengan luas mencapai 25.000 hektare, kawasan ini terbagi menjadi beberapa wilayah yang berbeda. Pertama ada kawasan pegunungan dengan Gunung Bauran sebagai puncak tertingginya. Selanjutnya ada kawasan hutan musim, hutan mangrove di dekat pantai, dan sabana. Atraksi paling menarik di taman nasional ini ada pada sabana yang sangat luas. Saat musim hujan tiba, kawasan ini akan menjadi hijau dan dipenuhi banyak sekali binatang liar. Wisatawan yang datang ke tempat wisata di Jawa Timur ini bisa menyaksikan banteng, kerbau liar, anjing hutan, kijang, rusa, dan macan tutul. Untuk bisa menikmati aneka satwa dan bentang alam, wisatawan bisa mengunjungi beberapa pos pengamatan di Batangan, Bekol yang memiliki banyak merak, ayam hutan, dan rusa, Bama yang dekat dengan pantai, Manting, dan Kalitopo.",
        "Gua Gong merupakan gua tercantik di Asia Tenggara yang menawarkan keindahan stalaktit dan stalakmit serta ukiran alam di dalamnya. Wisatawan yang ingin menikmati tempat wisata di Jawa Timur ini diwajibkan membayar retribusi Rp5.000. Selanjutnya karena di dalam gua sangat gelap, pengunjung bisa menyewa senter dengan biaya Rp5.000. Begitu masuk ke dalam gua, wisatawan bisa menyaksikan aneka stalakit dan stalakmit yang besar. Beberapa batu yang terbentuk selama jutaan tahun itu diberi nama Jawa seperti Selor Giri, Selo Pakuan Buwono dan Selo Bantara Angin agar terlihat lebih menarik dan memiliki sensasi magis. Sesuai namanya, beberapa bagian batu di gua akan berbunyi nyaring saat dipukul. Suara gong yang keras akan menggema sehingga mirip pertunjukan gamelan. Tidak mengherankan kalau kawasan gua yang cukup besar ini pernah dijadikan tempat konser musik 4 negara.",
        "Air Terjun Coban Rondo adalah destinasi unggulan di Batu selain aneka taman bermain. Terletak di lereng pegunungan, air terjun ini menawarkan 3 pesona kepada pengunjung. Pertama tentu saja gerojokan air dari atas bukit yang memberikan efek embun nan segar meski siang hari terasa begitu panas. Kedua adalah bentang alam yang memikat. Karena terletak di kaki gunung, kawasan ini dipenuhi hutan yang lebat. Hewan liar seperti kera kadang turun saat pagi atau siang hari untuk mencari makan atau menunggu wisatawan yang kerap memberikan makanan kepada mereka. Yang terakhir adalah kawasan mancakrida. Wisatawan yang datang bisa mengikuti kegiatan luar ruangan dengan mengasyikan. Ada permainan flying fox, panjat pohon, dan permainan lain yang membutuhkan ketangkasan. Oh ya, tidak jauh dari lokasi utama juga terdapat labirin yang cocok untuk lokasi berburu foto.",
        "Danau ini berada di dalam kawasan Taman Nasional Bromo Tengger Semeru (TNBTS). Terletak di ketinggian kurang lebih 2.400 mdpl, suhu udara di kawasan ini sangat sejuk dan nyaman untuk bersantai. Jika sempat datang ke lokasi danau ini pada musim liburan, kita akan mendapati banyak pendaki ataupun wisatawan yang sengaja datang hanya untuk camping dan menghabiskan waktu liburnya di tempat ini. Ranu Kumbolo memang menawarkan keindahan yang tiada duanya. Selain keeksotisan wujud danau yang memanjakan mata, pada sore hari kita juga bisa menyaksikan momen sunset yang muncul di antara puncak dua gunung dari lokasi danau. Selain itu, bagi pengunjung yang hobi photography, maka tempat ini adalah surga untuk menyalurkan hobi tersebut.",
        "Gunung Kelud menjadi salah satu gunung teraktif di Indonesia yang telah meletus hingga 30 kali sejak tahun 1.000 masehi. Gunung ini memliki besaran letusan di skala 5 dari 8 level, artinya letusannya sangat besar menurut Volcanic Explosivity Index (VEI). Gunung Kelud masuk dalam tipe stratovulkan, yakni letusannya yang eksplosif. Ada jarak yang relatif pendek bagi Gunung Kelud meletus kembali, yakni 9-25 tahun. Itu salah satu penyebabnya jadi gunung yang sangat berbahaya bagi masyarakat sekitar. Terlebih lagi gunung itu memiliki danau kawah yang jika ada letusan akan meyemburkan begitu banyak massa lahar.",
        "Tempat tujuan wisata anda jika ke Jawa Timur kini bertambah, Puncak B29 Lumajang. Lokasi wisata yang satu ini merupakan lereng gunung dengan ketinggian 2900 meter diatas permukaan laut. Puncak B29 dikenal juga dengan Puncak Argosari. Puncak ini merupakan puncak yang paling tinggi di kawasan gunung bromo. Pemandangan yang indah ditambah udara yang dingin serta hamparan vegetasi khas gunung dan savanna menjadi pemandangan yang menarik di lokasi wisata yang satu ini. Rute menuju lokasi wisata ini akan menantang anda. Dengan jalur yang berkelok dan berliku sepanjang perjalanan akan memicu adrenalin."
    )

    private val wisataPhoto = arrayOf(
        R.drawable.alam1,
        R.drawable.alam2,
        R.drawable.alam3,
        R.drawable.alam4,
        R.drawable.alam5,
        R.drawable.alam6,
        R.drawable.alam7,
        R.drawable.alam8,
        R.drawable.alam9,
        R.drawable.alam10
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