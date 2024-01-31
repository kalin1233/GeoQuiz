package com.bignerdranch.android.geoquiz

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import com.bignerdranch.android.geoquiz.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.trueButton.setOnClickListener{
            Snackbar.make(binding.root, "True", Snackbar.LENGTH_SHORT).show()
            Log.d("ButtonClicked", "True button clicked")
        }

        binding.falseButton.setOnClickListener {
            Snackbar.make(binding.root, "False", Snackbar.LENGTH_SHORT).show()
            Log.d("ButtonClicked", "False button clicked")
        }
    }

}


