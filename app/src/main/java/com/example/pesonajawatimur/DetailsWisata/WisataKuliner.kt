package com.example.pesonajawatimur.DetailsWisata

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.pesonajawatimur.R

class WisataKuliner : AppCompatActivity() {
    private lateinit var photo: ImageView
    private lateinit var name: TextView
    private lateinit var details: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata_kuliner)

        val wisata: Wisata = intent.getParcelableExtra("wisata")

        photo = findViewById(R.id.img_item_photo)
        name = findViewById(R.id.tv_item_name)
        details = findViewById(R.id.tv_item_detail)

        photo.setImageResource(wisata.photo)
        name.text = wisata.name
        details.text = wisata.detail
    }
}