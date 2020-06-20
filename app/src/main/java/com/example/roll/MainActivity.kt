package com.example.roll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val tulemus = findViewById<TextView>(R.id.tulemus)

        rollButton.setOnClickListener(){
            val rand = Random().nextInt(seekBar.progress)
            tulemus.text = rand.toString()
        }
    }
}