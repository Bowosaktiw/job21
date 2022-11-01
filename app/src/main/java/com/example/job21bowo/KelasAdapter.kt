package com.example.job21bowo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KelasAdapter(private val list:ArrayList<Kelas>): RecyclerView.Adapter<KelasAdapter.KelasViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KelasViewHolder {
        return KelasViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))
    }

    override fun onBindViewHolder(holder: KelasViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class KelasViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.textDaftar)
        fun bind(get: Kelas) {
            nama.text = get.nama
        }
    }
}