package com.app.doadandzikir.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reihan.doadandzikir.DzikirDoa
import com.reihan.doadandzikir.R
import org.w3c.dom.Text

class DzikirDoaAdapter(private val ListDzikirDoa: ArrayList<DzikirDoa>):
    RecyclerView.Adapter<DzikirDoaAdapter.MyViewHolder>() {

    inner class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        //Inisialisasi view dari layout row_item_dzikir.xml
        val tvDesc: TextView = view.findViewById(R.id.tv_desc)
        val tvLafaz: TextView = view.findViewById(R.id.tv_lafaz)
        val tvTerjemah: TextView = view.findViewById(R.id.tv_terjemah)
    }

    // digunakan untuk menampilkan data sesuai dengan view yang ada
    // sesuai dengan posisi data dalam layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.row_item_dzikir_doa, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.tvDesc.text = ListDzikirDoa[position].desc
        holder.tvLafaz.text = ListDzikirDoa[position].lafaz
        holder.tvTerjemah.text = ListDzikirDoa[position].terjemah
    }

    override fun getItemCount() = ListDzikirDoa.size
}