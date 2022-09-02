package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private fun rolldice(){
        val t= Dice(6)
        val result=t.roll()
        /*val tester:TextView=findViewById(R.id.Tester)
        tester.text=("$result")*/
        val output:ImageView=findViewById(R.id.Result)
        when(result){
            1 -> output.setImageResource(R.drawable.dice_1)
            2 -> output.setImageResource(R.drawable.dice_2)
            3 -> output.setImageResource(R.drawable.dice_3)
            4 -> output.setImageResource(R.drawable.dice_4)
            5 -> output.setImageResource(R.drawable.dice_5)
            6 -> output.setImageResource(R.drawable.dice_6)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll:Button=findViewById(R.id.Roll)
        roll.setOnClickListener{rolldice()} }
}
class Dice(private var sides:Int){
    fun roll():Int{
        return ((1..sides).random())
    }
}
