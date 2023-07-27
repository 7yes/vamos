package com.example.vamos.data.network

import com.example.vamos.data.model.RecipesResponseItem
import retrofit2.Response
import retrofit2.http.GET

interface RecipesApi {
    @GET("recetas")
    suspend fun getAllRecipes():Response<List<RecipesResponseItem>>
}
