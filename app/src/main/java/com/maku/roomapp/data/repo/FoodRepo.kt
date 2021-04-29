package com.maku.roomapp.data.repo

import androidx.lifecycle.LiveData
import com.maku.roomapp.data.dao.FoodDao
import com.maku.roomapp.data.entity.Food

class FoodRepo(foodDao: FoodDao) {

    val readAllFoodData: LiveData<List<Food>> = foodDao.readAllFoodData()

     fun addFood(food: Food){
        
    }
}