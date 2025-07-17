package com.example.mtglifecounterxml

import android.content.Intent
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


        var dieResult = findViewById<TextView>(R.id.text_dieResult)
        dieResult.visibility = View.GONE
        val dieButton = findViewById<ImageButton>(R.id.button_die)
        val toGameButton = findViewById<ImageButton>(R.id.button_toGame)
        toGameButton.visibility = View.GONE
        dieButton.setOnClickListener {
            dieResult.text = (1..20).random().toString()
            dieResult.visibility = View.VISIBLE
            toGameButton.visibility = View.VISIBLE
        }
        toGameButton.setOnClickListener {
            val intent = Intent(this, PlayerFunctionsActivity::class.java)
            startActivity(intent)
        }
    }

}
