package com.example.pesonajawatimur.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pesonajawatimur.Data.DataSejarah
import com.example.pesonajawatimur.DetailsWisata.Wisata
import com.example.pesonajawatimur.DetailsWisata.WisataAlam
import com.example.pesonajawatimur.R
import com.example.pesonajawatimur.listadapter.ListAdapteralam


class ActivityWisataSejarah : AppCompatActivity() {
    private lateinit var rvWisata: RecyclerView
    private var list: ArrayList<Wisata> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wisata_sejarah)

        rvWisata = findViewById(R.id.recyclerView)
        rvWisata.setHasFixedSize(true)

        list.addAll(DataSejarah.listData)
        showRecyclerList()
    }

    private fun showRecyclerList(){
        rvWisata.layoutManager = LinearLayoutManager(this)
        val listWisataAdapter = ListAdapteralam(list)
        rvWisata.adapter = listWisataAdapter

        listWisataAdapter.setOnItemClickCallback(object : ListAdapteralam.OnItemClickCallback{
            override fun onItemClicked(wisata: Wisata) {
                showSelectedWisata(wisata)
            }
        })
    }

    fun showSelectedWisata(wisata: Wisata){
        val intent = Intent(this, WisataAlam::class.java)
        intent.putExtra("wisata", wisata)
        startActivity(intent)
    }
}