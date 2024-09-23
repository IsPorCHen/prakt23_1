package com.bignerdranch.android.prakt23_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ResultActivity : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        button = findViewById(R.id.button3)
        button.setOnClickListener{
            Toast.makeText(this, "Sucess", Toast.LENGTH_SHORT).show()
        }
    }
}