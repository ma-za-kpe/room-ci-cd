package com.maku.roomapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.maku.roomapp.data.db.FoodDb
import com.maku.roomapp.data.entity.Food
import com.maku.roomapp.data.repo.FoodRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class FoodViewmodel(application: Application): AndroidViewModel(application){

    private val readAllFood: LiveData<List<Food>>
    private val repo: FoodRepo

    init {
        val foodDao = FoodDb.getDB(application).foodDao()
        repo = FoodRepo(foodDao)
        readAllFood = repo.readAllFoodData
    }

    fun readFood(food: Food){
        viewModelScope.launch(Dispatchers.IO) {
            repo.addFood(food)
        }
    }
}