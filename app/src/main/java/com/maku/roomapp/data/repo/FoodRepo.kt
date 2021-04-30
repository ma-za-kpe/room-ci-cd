package com.maku.roomapp.data.repo

import androidx.lifecycle.LiveData
import com.maku.roomapp.data.dao.FoodDao
import com.maku.roomapp.data.entity.Food

class FoodRepo(private val foodDao: FoodDao) {

    val readAllFoodData: LiveData<List<Food>> = foodDao.readAllFoodData()

     suspend fun addFood(food: Food){
        foodDao.addFood(food)
    }
}