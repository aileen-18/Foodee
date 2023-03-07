package com.kotlin.foodee.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.foodee.Food
import com.kotlin.foodee.R

class MenuAdapter(var foods: MutableList<Food>):RecyclerView.Adapter<MenuAdapter.MyHolder>(){
    class MyHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var name: TextView = itemView.findViewById(R.id.free_item_text)
        var image: ImageView = itemView.findViewById(R.id.image)
        var cardview: CardView = itemView.findViewById(R.id.cardview)
        var price : TextView = itemView.findViewById(R.id.price)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(parent.context).inflate(R.layout.menu_itemlayout,parent,false))
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var food = foods.get(position)
        holder.image.setImageResource(food.image)
        holder.name.text = food.name
        holder.cardview.setCardBackgroundColor(food.color)
        holder.price.text = food.food_price

    }
    interface MyFoodInterface

    override fun getItemCount(): Int {
        return  foods.size
    }
}