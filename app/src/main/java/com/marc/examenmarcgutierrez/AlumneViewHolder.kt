package com.marc.examenmarcgutierrez

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marc.examenmarcgutierrez.databinding.ItemAlumneBinding

class AlumneViewHolder(view: View): RecyclerView.ViewHolder(view){

    val binding = ItemAlumneBinding.bind(view)

    fun render(alumneModel: Alumne, onClickListener:(Alumne) -> Unit){
        binding.tvName.text = alumneModel.nom
        binding.tvEdat.text = alumneModel.edat.toString()
        Glide.with(binding.ivAlumne.context).load(alumneModel.photo).into(binding.ivAlumne)

        itemView.setOnClickListener{
            onClickListener(alumneModel)
        }
    }
}