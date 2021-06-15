package com.example.foodapp10062021

import Adapter.MyAdapter
import Cache.MySharedPrefarance
import Models.Food

import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list_food.*


class ListFoodActivity : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_food)
         val text = "<font color='#2C2C2C'>Phones</font>"
          supportActionBar!!.title = Html.fromHtml(text)
        title="Phones"


        MySharedPrefarance.init(this)
        val list=MySharedPrefarance.obektString
        val categoryS = intent.getIntExtra("category", 0)
        var listSort = ArrayList<Food>()
        for (food in list) {
            if (food.category == categoryS){
                listSort.add(food)
            }
        }
                  myAdapter=MyAdapter(this, listSort)
                list_food.adapter= myAdapter

        list_food.setOnItemClickListener { parent, view, position, id ->
            val intent=Intent(this, AboutFood::class.java)
            intent.putExtra("position", position)
            startActivity(intent)
        }
    }
}