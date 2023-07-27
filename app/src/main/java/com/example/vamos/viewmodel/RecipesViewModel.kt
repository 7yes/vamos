package com.example.vamos.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.vamos.data.model.RecipesResponseItem
import com.example.vamos.domain.GetRecipesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipesViewModel @Inject constructor(private var getRecipesUseCase: GetRecipesUseCase) :
    ViewModel() {
    val recipeListModel = MutableLiveData<List<RecipesResponseItem>>()
    val isLoading = MutableLiveData<Boolean>()

    fun onCreate(){
        viewModelScope.launch {
            isLoading.postValue(true)
            val result:List<RecipesResponseItem> = getRecipesUseCase()
            Log.d("TAJ", "onCreatea: $result ")
            if(!result.isNullOrEmpty()){
              recipeListModel.postValue(result)
                isLoading.postValue(false)
            }
        }
    }
}
