package com.example.projekpbm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_wisata.view.*

class Adapter (val wisataItemList: List<data_wisata>, val clickListener: (data_wisata) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_wisata, parent,false)
        return PartViewHolder(view)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(wisataItemList[position], clickListener)

    }
    override fun getItemCount() : Int= wisataItemList.size
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image = View.<ImageView>(R.id.image)
        fun bind(wisata: data_wisata, clickListener: (data_wisata) -> Unit) {
            itemView.txt_tempat.text = wisata.namawisata
            itemView.txt_des.text = wisata.wisata.toString()
            itemView.setOnClickListener{ clickListener(wisata)}
        }
    }
}