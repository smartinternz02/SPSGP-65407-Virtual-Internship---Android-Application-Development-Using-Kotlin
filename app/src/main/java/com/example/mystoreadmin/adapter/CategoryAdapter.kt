package com.example.mystoreadmin.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mystoreadmin.databinding.ItemCategoryLayoutBinding
//import com.google.firebase.firestore.core.View
import android.view.View
import com.bumptech.glide.Glide
import com.example.mystoreadmin.R
import com.example.mystoreadmin.model.CategoryModel

class CategoryAdapter(var context : Context, var list: ArrayList<CategoryModel>): RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {
    inner class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var binding = ItemCategoryLayoutBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(LayoutInflater.from(context).inflate(R.layout.item_category_layout, parent,false))
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.binding.textView2.text =list[position].cat
        Glide.with(context).load(list[position].img).into(holder.binding.imageView2)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}