package com.example.vamos.data.network

import android.util.Log
import com.example.vamos.data.model.RecipeModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RecipesService@Inject constructor(private val api:RecipesApi) {
    suspend fun getAllRecipes():List<RecipeModel>{
        return withContext(Dispatchers.IO){
            val response = api.getAllRecipes()
            Log.d("TAJ", "getAllRecipe: $response")
            Log.d("TAJ", "getAllRecip: ${response.body()}")
            response.body()?: emptyList()
        }
    }
}
