package com.maku.roomapp.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.maku.roomapp.data.dao.FoodDao
import com.maku.roomapp.data.entity.Food

@Database(entities = [Food::class], version = 1, exportSchema = true)
abstract class FoodDb: RoomDatabase() {

    abstract fun foodDao(): FoodDao

    companion object{
        @Volatile
        private var INSTANCE: FoodDb? = null

        fun getDB(context: Context): FoodDb{
            val tempInstance = INSTANCE
            //check if not null
            if (tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                //everything in this block is protected from concurrent execution by multiple threads
                var instance = Room.databaseBuilder(
                    context.applicationContext,
                    FoodDb::class.java,
                    "foof_db"
                ).build()
                instance = INSTANCE!!
                return  instance
            }
        }
    }
}