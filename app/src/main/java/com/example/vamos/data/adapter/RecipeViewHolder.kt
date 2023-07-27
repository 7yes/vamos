package com.example.vamos.data.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.vamos.core.load
import com.example.vamos.data.model.RecipesResponseItem
import com.example.vamos.databinding.ItemShortBinding

class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemShortBinding.bind(view)

    fun bind(item: RecipesResponseItem, onClickListener: (RecipesResponseItem) -> Unit) {
        binding.tvName.text = item.name
        binding.ivPhoto.load(item.photo)
        itemView.setOnClickListener {
            onClickListener(item)
        }
    }
}

