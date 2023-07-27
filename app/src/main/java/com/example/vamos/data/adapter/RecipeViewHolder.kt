package com.example.vamos.data.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.vamos.data.model.RecipesResponseItem
import com.example.vamos.databinding.ItemShortBinding

class RecipeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemShortBinding.bind(view)

    fun bind(item: RecipesResponseItem) {
        binding.tvName.text = item.name
    }
}

