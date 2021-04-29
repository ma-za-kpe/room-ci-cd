package com.maku.roomapp.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.maku.roomapp.data.entity.Food

@Dao
interface FoodDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addFood(food: Food)

    @Query("SELECT * FROM food_table ORDER BY ID ASC")
    fun readAllFoodData(): LiveData<List<Food>>
}