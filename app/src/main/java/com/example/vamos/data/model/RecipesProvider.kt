package com.example.vamos.data.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RecipesProvider @Inject constructor() {
    var recipes: List<RecipeModel> = emptyList()
}
