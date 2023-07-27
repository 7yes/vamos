package com.example.vamos.data

import com.example.vamos.data.model.RecipesProvider
import com.example.vamos.data.model.RecipesResponseItem
import com.example.vamos.data.network.RecipesService
import javax.inject.Inject

class RecipesRepository @Inject constructor(
    private val api: RecipesService,
    private val recipesProvider: RecipesProvider
) {
    suspend fun getAllRecipes(): List<RecipesResponseItem> {
        val response = api.getAllRecipes()
        recipesProvider.recipes =response
        return response
    }
}
