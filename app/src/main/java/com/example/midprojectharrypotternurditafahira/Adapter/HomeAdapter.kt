package com.example.midprojectharrypotternurditafahira.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.midprojectharrypotternurditafahira.DataKarakterItem
import com.example.midprojectharrypotternurditafahira.R
import kotlinx.android.synthetic.main.item_home.view.*
import java.util.ArrayList

class HomeAdapter (private val listKarakter : ArrayList<DataKarakterItem>): RecyclerView.Adapter<HomeAdapter.Homeholder>(){

    class Homeholder(itemview: View) : RecyclerView.ViewHolder(itemview){
        fun bind(karakter : DataKarakterItem){
            with(itemView){
                nametv.text = karakter.name
                speciestv.text = "Species : "+karakter.species
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.Homeholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return Homeholder(view)
    }

    override fun onBindViewHolder(holder: HomeAdapter.Homeholder, position: Int) {
        holder.bind(listKarakter[position])
    }

    override fun getItemCount(): Int {
        return listKarakter.size
    }
}