package com.example.lemonade

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var nlayout = 0
        var nsqueez =0
        val lemona: ImageView = findViewById(R.id.lemona)

        lemona.setOnClickListener{
            lemonaf(nlayout)
            when(nlayout){
                0->nlayout=1
                1->nlayout=2
                2->{nlayout=3;nsqueez+=1}
                3->{nlayout=0}
            }
            val squeezes:TextView=findViewById(R.id.squeezes)
            squeezes.text=""
        }
        lemona.setOnLongClickListener{
            squeezes1(nsqueez)
            false
        }
    }
    @SuppressLint("SetTextI18n")
    private fun lemonaf(nlayout: Int) {
        val content: TextView = findViewById(R.id.Content)
        val lemona: ImageView = findViewById(R.id.lemona)
        val squeezes:TextView=findViewById(R.id.squeezes)
        squeezes.setBackgroundColor(Color.WHITE)
        when(nlayout) {
            0-> {lemona.setImageResource(R.drawable.lemon);content.text="Click to juice the lemon!";}
            1-> {lemona.setImageResource(R.drawable.lemonj);content.text="Click to drink your lemonade!";}
            2-> {lemona.setImageResource(R.drawable.glass);content.text="Click to start again!";}
            3-> {lemona.setImageResource(R.drawable.lemona);content.text="Click to select a lemon!";}
        }
    }
    @SuppressLint("SetTextI18n")
    private fun squeezes1(nsqueez:Int){
        val squeezes:TextView=findViewById(R.id.squeezes)
        squeezes.setBackgroundColor(Color.parseColor("#4C4646"))
        squeezes.text="Squeez Count:${nsqueez}, keep squeezing!"
    }
}


