package com.bignerdranch.android.geoquiz

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.bignerdranch.android.geoquiz.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

//Recieved help from Hemanshu and Ruihang.
//Used: https://developer.android.com/reference/com/google/android/material/snackbar/Snackbar
//To learn more about View binding and Snackbar Methods which was cool and helped me with my arithmatic programn.
class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.trueButton.setOnClickListener{
            Snackbar.make(binding.root, "True", Snackbar.LENGTH_SHORT).show()
        }

        binding.falseButton.setOnClickListener {
            Snackbar.make(binding.root, "False", Snackbar.LENGTH_SHORT).show()
        }
    }

}


