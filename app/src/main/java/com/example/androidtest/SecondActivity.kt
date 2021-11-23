package com.example.androidtest

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidtest.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity(){

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(this.binding.root)
    }
}