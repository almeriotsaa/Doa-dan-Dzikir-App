package com.almerio.doadandzikir.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.almerio.doadandzikir.DzikirDoa
import com.almerio.doadandzikir.R

class DzikirDoaAdapter(private val listDzikirDoa: ArrayList<DzikirDoa>):
    RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //inisialisasi view dari layout row_item dzikir.xml
        val tvDesc: TextView = view.findViewById(R.id.tv_desc)
        val tvLavaz: TextView = view.findViewById(R.id.tv_lavaz)
        val tvTerjemah: TextView = view.findViewById(R.id.tv_terjemah)
    }

    //menampilan data yang sesuai dengan posisi layout yang ditentukan

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvDesc.text = listDzikirDoa[position].desc
        holder.tvLavaz.text = listDzikirDoa[position].lafaz
        holder.tvTerjemah.text = listDzikirDoa[position].terjemah
    }

    override fun getItemCount() = listDzikirDoa.size
}