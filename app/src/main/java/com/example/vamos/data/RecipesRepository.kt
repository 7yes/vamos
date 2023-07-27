package com.example.vamos.data

import com.example.vamos.data.model.RecipeModel
import com.example.vamos.data.model.RecipesProvider
import com.example.vamos.data.network.RecipesApi
import com.example.vamos.data.network.RecipesService
import javax.inject.Inject

class RecipesRepository @Inject constructor(
    private val api: RecipesService,
    private val recipesProvider: RecipesProvider
) {
    suspend fun getAllRecipes(): List<RecipeModel> {
        val response = api.getAllRecipes()
        recipesProvider.recipes =response
        return response
    }
}
