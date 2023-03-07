package com.kotlin.foodee

data class Food(var name:String,
                var food_price: String,
                var image:Int,
                var ingredient: MutableList<Ingredient>,
           var color:Int) {

}


