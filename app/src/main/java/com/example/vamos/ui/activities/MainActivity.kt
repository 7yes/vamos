package com.example.vamos.ui.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vamos.data.adapter.RecipeAdapter
import com.example.vamos.data.model.RecipesResponseItem
import com.example.vamos.databinding.ActivityMainBinding
import com.example.vamos.viewmodel.RecipesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val recipesViewModel: RecipesViewModel by viewModels()

    private lateinit var adapter:RecipeAdapter
    private val recipesList = mutableListOf<RecipesResponseItem>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recipesViewModel.onCreate()

        recipesViewModel.recipeListModel.observe(this, Observer {
           recipesList.clear()
            recipesList.addAll(it)
            adapter.notifyDataSetChanged()
        })

        recipesViewModel.isLoading.observe(this, Observer {
            binding.progress.isVisible = it
        })

        initRV()

    }

    private fun initRV() {
        adapter = RecipeAdapter(recipesList)
        binding.rvRecipes.layoutManager = LinearLayoutManager(this)
        binding.rvRecipes.adapter = adapter
    }
}
