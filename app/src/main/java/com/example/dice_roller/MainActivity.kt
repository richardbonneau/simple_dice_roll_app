package com.example.dice_roller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var rollButton:Button
    lateinit var clearButton:Button
    lateinit var firstDiceImage:ImageView
    lateinit var secondDiceImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        clearButton = findViewById(R.id.clear_button)
        firstDiceImage = findViewById(R.id.first_dice_image)
        secondDiceImage = findViewById(R.id.second_dice_image)

        fun rollDice(diceImage:ImageView){
            Toast.makeText(this, "button clicked",
                Toast.LENGTH_SHORT).show()

            val randomInt = Random.nextInt(6)+1
            val drawableRessource = when (randomInt){
                1-> R.drawable.dice_1
                2-> R.drawable.dice_2
                3-> R.drawable.dice_3
                4-> R.drawable.dice_4
                5-> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableRessource)
        }



        rollButton.setOnClickListener {
            rollDice(firstDiceImage)
            rollDice(secondDiceImage)
        }
        clearButton.setOnClickListener {
            firstDiceImage.setImageResource(R.drawable.empty_dice)
            secondDiceImage.setImageResource(R.drawable.empty_dice)
        }


    }
}
