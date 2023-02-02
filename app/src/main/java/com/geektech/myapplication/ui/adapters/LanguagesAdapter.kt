package com.geektech.myapplication.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geektech.myapplication.data.TextModel
import com.geektech.myapplication.databinding.ItemLanguagesBinding

class LanguagesAdapter(private val listLanguages: MutableList<TextModel>):
    RecyclerView.Adapter<LanguagesAdapter.LanguagesViewHolder>(){

    class LanguagesViewHolder(var binding: ItemLanguagesBinding): RecyclerView.ViewHolder(binding.root){
        fun onBind(textModel: TextModel){
            binding.txtName.text = textModel.name
            Glide.with(binding.imageCat.context).load(textModel.image).into(binding.imageCat)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguagesViewHolder {
        return LanguagesViewHolder(ItemLanguagesBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }
    override fun onBindViewHolder(holder: LanguagesViewHolder, position: Int) {
       holder.onBind(listLanguages[position])
    }
    override fun getItemCount(): Int = listLanguages.size
}