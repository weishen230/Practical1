package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage1 : ImageView
    lateinit var diceImage2 : ImageView
    lateinit var diceImage3 : ImageView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val rollButton: Button = findViewById(R.id.roll_button)
        val resetDice: Button = findViewById(R.id.clear_button)

        diceImage1 = findViewById(R.id.dice1_image)
        diceImage2 = findViewById(R.id.dice2_image)
        diceImage3 = findViewById(R.id.dice3_image)

        rollButton.setOnClickListener { rollDice() }
        resetDice.setOnClickListener{resetDice()}
    }

    private fun rollDice() {


        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()

        diceImage1.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
        diceImage3.setImageResource(getRandomDiceImage())






    }

    private fun resetDice()
    {
        Toast.makeText(this, "Reset Completed", Toast.LENGTH_SHORT).show()

        diceImage1.setImageResource(R.drawable.dice_1)
        diceImage2.setImageResource(R.drawable.dice_1)
        diceImage3.setImageResource(R.drawable.dice_1)
    }

    private fun getRandomDiceImage() : Int
    {


        val number = Random.nextInt(6) + 1





        return when (number) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    }

}

