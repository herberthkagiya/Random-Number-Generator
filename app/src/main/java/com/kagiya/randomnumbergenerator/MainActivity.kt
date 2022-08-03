package com.kagiya.randomnumbergenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

private lateinit var randomNumberButton: Button;
private lateinit var resultTextView: TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randomNumberButton = findViewById(R.id.random_number_button)
        resultTextView = findViewById(R.id.result_textView)

        randomNumberButton.setOnClickListener{
            val result = Random.nextInt(1, 10000);

            val stringResult = resources.getString(R.string.random_number_result)

            resultTextView.setText("$stringResult $result")
        }
    }
}