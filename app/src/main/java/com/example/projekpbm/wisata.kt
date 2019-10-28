package com.example.projekpbm

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_wisata.*

class wisata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_wisata)

        val testwisata= createdatawisata()
        rv_wisata.layoutManager = LinearLayoutManager(this)
        rv_wisata.setHasFixedSize(true)
        rv_wisata.adapter = Adapter(testwisata, {wisataItem: data_wisata-> wisataItemClicked(wisataItem)})
    }
    private fun wisataItemClicked(wisataItem: data_wisata){
        val showDetailActivityIntent = Intent(this, detailwisata::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, wisataItem.wisata.toString())
        startActivity(showDetailActivityIntent)
    }

    private fun createdatawisata() : List<data_wisata>{
        val partList = ArrayList<data_wisata>()
        val image = resources.obtainTypedArray(data_wisata)
        partList.add(data_wisata(" di jogja", "Taman sungai mudal"))
        partList.add(data_wisata("di jogja", "Prambanan"))
        partList.add(data_wisata("di jogja", "malioboro"))
        partList.add(data_wisata()

        return partList


    }
}