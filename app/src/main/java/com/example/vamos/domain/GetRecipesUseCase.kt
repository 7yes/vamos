package com.example.vamos.domain

import com.example.vamos.data.RecipesRepository
import com.example.vamos.data.model.RecipeModel
import javax.inject.Inject

class GetRecipesUseCase @Inject constructor(private val repository: RecipesRepository) {
    suspend operator fun invoke():List<RecipeModel>{
        return repository.getAllRecipes()
    }
}