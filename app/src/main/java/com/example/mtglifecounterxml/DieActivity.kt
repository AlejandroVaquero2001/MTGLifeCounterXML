package com.example.mtglifecounterxml

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_die)


        var die_result = findViewById<TextView>(R.id.text_dieResult)
        die_result.visibility = View.GONE
        val die_button = findViewById<ImageButton>(R.id.button_die)
        val toGame_button = findViewById<ImageButton>(R.id.button_toGame)
        toGame_button.visibility = View.GONE
        die_button.setOnClickListener {
            die_result.text = (1..20).random().toString()
            die_result.visibility = View.VISIBLE
            toGame_button.visibility = View.VISIBLE
        }

    }

}
