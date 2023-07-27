package com.example.vamos.data.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vamos.R
import com.example.vamos.data.model.RecipesResponseItem

class RecipeAdapter(
    private val recipes: List<RecipesResponseItem>,
    private val onClickListener: (RecipesResponseItem) -> Unit
) : RecyclerView.Adapter<RecipeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {


        val layoutInflater = LayoutInflater.from(parent.context)
        return RecipeViewHolder(layoutInflater.inflate(R.layout.item_short, parent, false))

    }

    override fun getItemCount(): Int = recipes.size

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val item = recipes[position]
        holder.bind(item, onClickListener)
    }
}

