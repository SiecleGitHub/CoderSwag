package com.slopestyle.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.slopestyle.coderswag.Adapters.CategoryAdapter
import com.slopestyle.coderswag.Model.Category
import com.slopestyle.coderswag.R
import com.slopestyle.coderswag.Service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter

        categoryListView.setOnItemClickListener { parent, view, position, id ->
            val category = DataService.categories[position]
            Toast.makeText(this, "You clicked on ${category.title} cell", Toast.LENGTH_SHORT).show()
        }
    }
}
