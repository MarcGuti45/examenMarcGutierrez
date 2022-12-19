package com.marc.examenmarcgutierrez

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AlumneAdapter (private val alumnesList:List<Alumne>, private val onClickListener:(Alumne) -> Unit): RecyclerView.Adapter<AlumneViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumneViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return AlumneViewHolder(layoutInflater.inflate(R.layout.item_alumne, parent, false))
    }

    override fun onBindViewHolder(holder: AlumneViewHolder, position: Int) {
        val item = alumnesList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = alumnesList.size

}