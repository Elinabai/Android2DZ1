package com.geektech.myapplication.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geektech.myapplication.data.TextModel
import com.geektech.myapplication.databinding.ItemCinemaBinding
import com.geektech.myapplication.ui.ItemClick

class CinemaAdapter(private val listCinema: MutableList<TextModel>,private val itemClick: ItemClick):
    RecyclerView.Adapter<CinemaAdapter.CinemaViewHolder>() {

    inner class CinemaViewHolder (var binding: ItemCinemaBinding): RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                itemClick.onItemClick(listCinema[absoluteAdapterPosition])
            }
        }
        fun onBind (textModel: TextModel){
            binding.txtName.text = textModel.name
            Glide.with(binding.imageCat.context).load(textModel.image).into(binding.imageCat)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        return CinemaViewHolder(ItemCinemaBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {
        holder.onBind(listCinema[position])
    }
    override fun getItemCount(): Int = listCinema.size
}