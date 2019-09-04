package com.rjt.shopping.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.rjt.shopping.R
import com.rjt.shopping.adapters.AdapterRecyclerView
import com.rjt.shopping.models.Mobile
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var product = Mobile()

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = AdapterRecyclerView(product.addMobile(), this)
    }
}
