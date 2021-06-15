package com.example.foodapp10062021

import Cache.MySharedPrefarance
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import kotlinx.android.synthetic.main.activity_add_phone_view.*

class AddPhoneView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_phone_view)
        val text = "<font color='#2C2C2C'>Phone types</font>"

        supportActionBar!!.title = Html.fromHtml(text)
       title="Phone types"

        taom1.setOnClickListener {
            intent.putExtra("category", 0)
            val intent = (Intent(this, Add_food::class.java))

        }
        taom2.setOnClickListener {
            intent.putExtra("category", 1)
            startActivity(Intent(this, Add_food::class.java))

        }
        taom3.setOnClickListener {
            intent.putExtra("category", 2)
            startActivity(Intent(this, Add_food::class.java))

        }
        taom4.setOnClickListener {
            intent.putExtra("category", 3)
            startActivity(Intent(this, Add_food::class.java))

        }
        taom5.setOnClickListener {
            intent.putExtra("category", 4)
            startActivity(Intent(this, Add_food::class.java))

        }
        taom6.setOnClickListener {
            intent.putExtra("category", 5)
            startActivity(Intent(this, Add_food::class.java))

        }
        clear.setOnClickListener {

        }

    }
}