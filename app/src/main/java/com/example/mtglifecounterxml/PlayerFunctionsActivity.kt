package com.example.mtglifecounterxml

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class PlayerFunctionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_player)

        val currentLife = findViewById<TextView>(R.id.text_lifeTotal)
        val hpUpButton = findViewById<ImageButton>(R.id.button_CountUP)
        val hpDownButton = findViewById<ImageButton>(R.id.button_CountDown)

        hpUpButton.setOnClickListener {
            val hpActual = currentLife.text.toString().toInt()
            val nuevoHP = hpActual + 1
            currentLife.text = nuevoHP.toString()
        }
        hpDownButton.setOnClickListener {
            val hpActual = currentLife.text.toString().toInt()
            val nuevoHP = hpActual - 1
            currentLife.text = nuevoHP.toString()
        }
    }
}