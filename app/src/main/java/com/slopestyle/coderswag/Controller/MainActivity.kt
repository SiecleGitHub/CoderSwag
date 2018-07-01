package com.slopestyle.coderswag.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.slopestyle.coderswag.Adapters.CategoryRecycleAdapter
import com.slopestyle.coderswag.R
import com.slopestyle.coderswag.Service.DataService
import com.slopestyle.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*
import android.os.StrictMode



class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories) {
            category ->
            val productsActivity = Intent(this, ProductsActivity::class.java)
            productsActivity.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productsActivity)
        }

        categoryListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }
}
