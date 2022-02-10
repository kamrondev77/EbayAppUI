package com.example.ebayappui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ebayappui.adapter.FavoriteAdapter
import com.example.ebayappui.model.Favorite

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        recyclerView = findViewById(R.id.recyclerView)
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = manager

        refreshAdapter(getFavorites())
    }

    fun refreshAdapter(items: ArrayList<Favorite>) {
        val adapter = FavoriteAdapter(this, items)
        recyclerView!!.adapter = adapter
    }

    fun getFavorites(): ArrayList<Favorite> {
        val items: ArrayList<Favorite> = ArrayList()

        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        items.add(Favorite("Apple Watch", R.drawable.im_product))
        return items
    }
}