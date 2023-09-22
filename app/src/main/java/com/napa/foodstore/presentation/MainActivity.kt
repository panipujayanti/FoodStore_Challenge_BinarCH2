package com.napa.foodstore.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.napa.foodstore.R
import com.napa.foodstore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}