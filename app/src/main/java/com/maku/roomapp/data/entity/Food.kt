package com.maku.roomapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food_table")
class Food(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val name: String) {
}