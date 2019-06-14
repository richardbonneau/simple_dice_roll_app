package com.example.dice_roller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton:Button = findViewById(R.id.roll_button)
        val countUpButton:Button = findViewById(R.id.count_up_button)

        val diceRolledText: TextView = findViewById(R.id.dice_rolled_text)
        fun rollDice(){
            Toast.makeText(this, "button clicked",
                Toast.LENGTH_SHORT).show()

            val randomInt = Random.nextInt(6)+1

            diceRolledText.text = randomInt.toString()
        }

        fun countUp(){
            var currentNum = diceRolledText.text.toString().toInt()
            currentNum += 1

            diceRolledText.text = currentNum.toString()
        }

        rollButton.setOnClickListener { rollDice() }
        countUpButton.setOnClickListener { countUp() }

    }
}
