package com.example.vamos.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vamos.data.model.RecipeModel
import com.example.vamos.domain.GetRecipesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipesViewModel @Inject constructor(private var getRecipesUseCase: GetRecipesUseCase) :
    ViewModel() {
    val recipeListModel = MutableLiveData<RecipeModel>()
    val isLoading = MutableLiveData<Boolean>()

    fun onCreate(){
        viewModelScope.launch {
            isLoading.postValue(true)
            val result:List<RecipeModel> = getRecipesUseCase()
            Log.d("TAJ", "onCreate: $result ")
            if(!result.isNullOrEmpty()){
                isLoading.postValue(false)
            }
        }
    }
}