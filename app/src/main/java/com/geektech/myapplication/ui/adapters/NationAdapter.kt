package com.geektech.myapplication.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geektech.myapplication.data.TextModel
import com.geektech.myapplication.databinding.ItemNatonBinding

class NationAdapter(private val listNation: MutableList<TextModel>):
    RecyclerView.Adapter<NationAdapter.NationViewHolder>(){

    class NationViewHolder(var binding: ItemNatonBinding): RecyclerView.ViewHolder(binding.root) {
         fun onBind(textModel: TextModel){
            binding.txtName.text = textModel.name
            Glide.with(binding.imageCat.context).load(textModel.image).into(binding.imageCat)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NationViewHolder {
        return NationViewHolder(ItemNatonBinding.inflate(LayoutInflater.from(parent.context),parent,false))    }

    override fun onBindViewHolder(holder: NationViewHolder, position: Int) {
        holder.onBind(listNation[position])
    }

    override fun getItemCount(): Int = listNation.size
}