package com.example.vamos.data.model

data class RecipeModel(
    val description: String,
    val ingredients: List<String>,
    val location: Location,
    val name: String,
    val photo: String
)
