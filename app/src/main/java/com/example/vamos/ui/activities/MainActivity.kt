package com.example.vamos.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.vamos.R
import com.example.vamos.databinding.ActivityMainBinding
import com.example.vamos.viewmodel.RecipesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val recipesViewModel: RecipesViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recipesViewModel.onCreate()

        recipesViewModel.recipeListModel.observe(this, Observer {
            // ver
        })

        recipesViewModel.isLoading.observe(this, Observer {
            //
        })

    }
}
