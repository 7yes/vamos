package com.example.vamos.data.network

import com.example.vamos.data.model.RecipesResponseItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RecipesService@Inject constructor(private val api:RecipesApi) {
    suspend fun getAllRecipes():List<RecipesResponseItem>{
        return withContext(Dispatchers.IO){
            val response = api.getAllRecipes()
            response.body()?: emptyList()
        }
    }
}
