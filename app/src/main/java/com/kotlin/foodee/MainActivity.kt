package com.kotlin.foodee

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kotlin.foodee.adapter.MenuAdapter
import com.kotlin.foodee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var freefoods:MutableList<Food>
    private lateinit var ingredients : MutableList<Ingredient>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        addFood()
        val adapter = MenuAdapter(freefoods)
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        binding.freerecycler.layoutManager = manager
        binding.freerecycler.adapter = adapter




    }
    fun addFood(){
        freefoods = mutableListOf()
        ingredients = mutableListOf()
        ingredients.add(Ingredient("Chedder","+ $0.79",R.drawable.sir))
        ingredients.add(Ingredient("Bacon","+ $0.59",R.drawable.bacon))
        ingredients.add(Ingredient("Onion","+ $0.29",R.drawable.onion))
        freefoods.add(Food("Free Donut","For orders over $20", R.drawable.donut,ingredients,Color.parseColor("#84A59D")))
        freefoods.add(Food("Free Vanilla ice","For orders over $15",R.drawable.vanilla,ingredients,Color.parseColor("#84C65E")))

    }

}