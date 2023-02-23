package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerview:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview = findViewById(R.id.kalyani)

        recyclerview.layoutManager = LinearLayoutManager(this)

        val data = ArrayList<ItemsViewModel>()



        data.add(ItemsViewModel(R.drawable.img, "Item " + "silk"))
        data.add(ItemsViewModel(R.drawable.img_1,"Item " + "banaras"))
        data.add(ItemsViewModel(R.drawable.img_2,"Item " + "womens fashion"))
        data.add(ItemsViewModel(R.drawable.img_3,"Item " + "sarees"))
        data.add(ItemsViewModel(R.drawable.img_4,"Item " + "boys shirts"))
        data.add(ItemsViewModel(R.drawable.img_5,"Item " + "jeans"))
        data.add(ItemsViewModel(R.drawable.img_6,"Item " + "womens dress"))
        data.add(ItemsViewModel(R.drawable.img_7,"Item " + "children dreses"))
        data.add(ItemsViewModel(R.drawable.img, "Item " + "silk"))
        data.add(ItemsViewModel(R.drawable.img_1,"Item " + "banaras"))
        data.add(ItemsViewModel(R.drawable.img_2,"Item " + "womens fashion"))
        data.add(ItemsViewModel(R.drawable.img_3,"Item " + "sarees"))
        data.add(ItemsViewModel(R.drawable.img_4,"Item " + "boys shirts"))
        data.add(ItemsViewModel(R.drawable.img_5,"Item " + "jeans"))
        data.add(ItemsViewModel(R.drawable.img_6,"Item " + "womens dress"))
        data.add(ItemsViewModel(R.drawable.img_7,"Item " + "children dreses"))






        val adapter = CustomAdapter(data)

        recyclerview.adapter = adapter

    }
}
