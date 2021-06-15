package com.example.foodapp10062021

import Cache.MySharedPrefarance
import Models.Food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_food.*

class Add_food : AppCompatActivity() {
    var category = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)
    //    supportActionBar?.hide()
        title= "Add phone"
        val text = "<font color='#2C2C2C'>Add Phones</font>"
        supportActionBar!!.title = Html.fromHtml(text)



        category = intent.getIntExtra("category", 0)

        MySharedPrefarance.init(this)

        btn_save.setOnClickListener {
            val name =edt_food_name.text.toString().trim()
            val preparationOrder=edt_preparations.text.toString().trim()

            if (name!="" &&  preparationOrder!=""){
                 val list= MySharedPrefarance.obektString
                list.add(Food(name, category, preparationOrder))
                MySharedPrefarance.obektString=list
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
                finish()

            }else{
                Toast.makeText(this, "Malumot yetarli emas", Toast.LENGTH_SHORT).show()
            }
        }
    }
}