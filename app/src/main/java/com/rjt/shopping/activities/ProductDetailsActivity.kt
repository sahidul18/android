package com.rjt.shopping.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rjt.shopping.R
import com.rjt.shopping.models.Product
import kotlinx.android.synthetic.main.activity_product_details.*

class ProductDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        var bundle = intent.extras.get("product") as Product

        image_view.setImageResource(bundle.productImage)
        text_view_product_name.text = bundle.productName
        text_view_description.text = bundle.productDescription
        text_view_price.append(bundle.productPrice)

        button_add.setOnClickListener(){
            var intent = Intent(this, CartActivity::class.java)
            intent.putExtra("product", bundle)

            startActivity(intent)
        }

    }
}
