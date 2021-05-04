package com.maku.roomapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maku.roomapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }

}
