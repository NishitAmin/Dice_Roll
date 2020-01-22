package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {

    var diceImage : ImageView? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

        diceImage = findViewById(R.id.imageView)
    }

    private fun rollDice(){
        val randomInt = Random().nextInt(6) + 1
        Toast.makeText(this, "Dice: $randomInt", Toast.LENGTH_SHORT).show()

        val drawaleResource = when(randomInt){
            1 -> R.drawable.face1
            2 -> R.drawable.face2
            3 -> R.drawable.face3
            4 -> R.drawable.face4
            5 -> R.drawable.face5
            else -> R.drawable.face6
        }

        diceImage?.setImageResource(drawaleResource)
    }
}
