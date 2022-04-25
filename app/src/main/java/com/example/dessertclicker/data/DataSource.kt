package com.example.dessertclicker.data

import com.example.dessertclicker.R
import com.example.dessertclicker.model.dessert

class DataSource {
    fun loadDesserts():List<dessert> {
        return listOf<dessert>(
            //image, price, amount
            dessert(R.drawable.cupcake, 5, 0),
            dessert(R.drawable.donut, 10, 5),
            dessert(R.drawable.eclair, 15, 20),
            dessert(R.drawable.froyo, 30, 50),
            dessert(R.drawable.gingerbread, 50, 100),
            dessert(R.drawable.honeycomb, 100, 200),
            dessert(R.drawable.icecreamsandwich, 500, 500),
            dessert(R.drawable.jellybean, 1000, 1000),
            dessert(R.drawable.kitkat, 2000, 2000),
            dessert(R.drawable.lollipop, 3000, 4000),
            dessert(R.drawable.marshmallow, 4000, 8000),
            dessert(R.drawable.nougat, 5000, 16000),
            dessert(R.drawable.oreo, 6000, 20000)
        )
    }
}