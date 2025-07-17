package com.example.mtglifecounterxml

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val button2J = findViewById<ImageButton>(R.id.button_2J)
        button2J.setOnClickListener {
            val intent = Intent(this, DieActivity::class.java)
            startActivity(intent)
        }
        val button3J = findViewById<ImageButton>(R.id.button_3J)
        button3J.setOnClickListener {
            val intent = Intent(this, DieActivity::class.java)
            startActivity(intent)
        }
        val button4J = findViewById<ImageButton>(R.id.button_4J)
        button4J.setOnClickListener {
            val intent = Intent(this, DieActivity::class.java)
            startActivity(intent)
        }

    }
}