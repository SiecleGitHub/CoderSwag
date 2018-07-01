package com.slopestyle.coderswag

import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import android.support.v7.widget.RecyclerView
import com.slopestyle.coderswag.Adapters.ProductsAdapter
import com.slopestyle.coderswag.Model.Product
import com.slopestyle.coderswag.Service.DataService
import com.slopestyle.coderswag.Utilities.EXTRA_CATEGORY

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.slopestyle.coderswag", appContext.packageName)
    }

    lateinit var adapter: ProductsAdapter

    @Test
    fun testX() {
        //adapter = ProductsAdapter(this, DataService.getProducts("HATS"))
    }

//    internal var tested = ProductsAdapter(this, products = ) : RecyclerView.Adapter<com.slopestyle.coderswag.Adapters.ProductsAdapter.ProductHolder>(){
//        ()
//
//    @Test
//    fun testHandlesNullArguments() {
//        tested.getItemId()
//    }
}
