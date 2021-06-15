package com.example.foodapp10062021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import kotlinx.android.synthetic.main.activity_menu_phones.*

class MenuPhones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_phones)

        val text = "<font color='#2C2C2C'>Phones</font>"

        supportActionBar!!.title = Html.fromHtml(text)
        title="Phones"


        card1.setOnClickListener {
            intent.putExtra("category", 0)
            startActivity(Intent(this, ListFoodActivity::class.java))
        }
        card2.setOnClickListener {
            intent.putExtra("category", 1)
            startActivity(Intent(this, ListFoodActivity::class.java))
        }
        card3.setOnClickListener {
            intent.putExtra("category", 2)
            startActivity(Intent(this, ListFoodActivity::class.java))

        }
        card4.setOnClickListener {
            intent.putExtra("category", 3)
            startActivity(Intent(this, ListFoodActivity::class.java))

        }
        card5.setOnClickListener {
            intent.putExtra("category", 4)
            startActivity(Intent(this, ListFoodActivity::class.java))

        }
        card6.setOnClickListener {
            intent.putExtra("category", 5)
            startActivity(Intent(this, ListFoodActivity::class.java))
        }

    }
}