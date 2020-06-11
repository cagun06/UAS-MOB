package com.example.pesonajawatimur

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.wisata.activity.ActivityWisataAlam
import com.example.pesonajawatimur.activity.ActivityWisataKuliner
import com.example.pesonajawatimur.activity.ActivityWisataPantai
import com.example.pesonajawatimur.activity.ActivityWisataSejarah
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.layout_adapter.view.*


class DashboardActivity : AppCompatActivity() {
    var adapter: ImageAdapter? = null
    var homeAdapter = ArrayList<AdapterDashbord>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // load foods
        homeAdapter.add(AdapterDashbord("Wisata Alam", R.drawable.alam))
        homeAdapter.add(AdapterDashbord("Wisata Pantai", R.drawable.pantai))
        homeAdapter.add(AdapterDashbord("Wisata Sejarah", R.drawable.sejarah))
        homeAdapter.add(AdapterDashbord("Wisata Kuliner", R.drawable.kuliner))
        adapter = ImageAdapter(this, homeAdapter)

        gvHome.adapter = adapter
        gvHome.setOnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                //Toast.makeText(this, "Anda memilih: 0",Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ActivityWisataAlam::class.java)
                startActivity(intent)
            } else if (position == 1) {
//                Toast.makeText(this, "Anda memilih: 1", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ActivityWisataPantai::class.java)
                startActivity(intent)
            } else if (position == 2) {
                //Toast.makeText(this, "Anda memilih: 2", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ActivityWisataSejarah::class.java)
                startActivity(intent)
            } else if (position == 3) {
//                Toast.makeText(this, "Anda memilih: 3", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ActivityWisataKuliner::class.java)
                startActivity(intent)
            }
        }
    }

    class ImageAdapter : BaseAdapter {
        var homeAdapter = ArrayList<AdapterDashbord>()
        var context: Context? = null

        constructor(context: Context, homeAdapter: ArrayList<AdapterDashbord>) : super() {
            this.context = context
            this.homeAdapter = homeAdapter
        }

        override fun getCount(): Int {
            return homeAdapter.size
        }

        override fun getItem(position: Int): Any {
            return homeAdapter[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }


        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val list = this.homeAdapter[position]

            var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var homeView = inflator.inflate(R.layout.layout_adapter, null)
            homeView.imgList.setImageResource(list.image!!)
            homeView.tvName.text = list.name!!

            return homeView
        }
    }
}

