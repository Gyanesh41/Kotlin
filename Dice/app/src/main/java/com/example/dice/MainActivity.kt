package com.example.dice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
     @SuppressLint("SetTextI18n")
     private fun rolldice(){
        val t=Dice(6)
        val result=t.roll()
        val output:TextView=findViewById(R.id.Result)
        output.text="$result"
        val win:TextView=findViewById((R.id.Win))
        val luckynumber=4
        when(result){
             luckynumber -> win.text=("You won!")
             1 -> win.text=("So sorry! You rolled a 1. Try again!")
             2 -> win.text=("Sadly, you rolled a 2. Try again!")
             3 -> win.text=("Unfortunately, you rolled a 3. Try again!")
             5 -> win.text=("Don't cry! You rolled a 5. Try again!")
             6 -> win.text=("Apologies! You rolled a 6. Try again!")
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
