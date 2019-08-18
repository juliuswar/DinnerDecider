package com.jw.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.random


class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Nasi Goreng","Sate Ayam","Bakso")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        textView1.text ="Burger King"
        buttondecide.setOnClickListener {
            val randomfood = kotlin.random.Random.nextInt(foodList.count())
            textView1.text = foodList[randomfood]
        }
        buttonadd.setOnClickListener {
            val newfood = textinput1.text.toString()
            foodList.add(newfood)
            textinput1.text.clear()
            println("Tambah : data")
        }
    }
}
