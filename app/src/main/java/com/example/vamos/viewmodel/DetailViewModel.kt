package com.example.vamos.viewmodel

import androidx.lifecycle.ViewModel
import com.example.vamos.data.model.Location
import com.example.vamos.data.model.RecipesResponseItem

class DetailViewModel : ViewModel() {
    var itemm = RecipesResponseItem(
        "descrip",
        listOf("ajo", "ala"),
        Location("ciud", 40.0, 50.0),
        "platt",
        "ssw"
    )
}