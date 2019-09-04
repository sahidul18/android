package com.rjt.shopping.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.rjt.shopping.R
import com.rjt.shopping.models.Product
import kotlinx.android.synthetic.main.activity_cart.*

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        var quantity = 1

        var bundle = intent.extras.get("product") as Product
        imageView.setImageResource(bundle.productImage)
        text_view_name.text = bundle.productName
        var price = bundle.productPrice.toInt()
        text_view_price.text = "$${price.toString()}"

        var totalPrice = price
        text_view_items.text = "Items: $quantity"
        text_view_amount.text = "Amount: $$totalPrice"

        text_view_plus.setOnClickListener(){
            quantity ++
            text_view_quantity.text = quantity.toString()
            totalPrice += price
            text_view_amount.text = "Amount: $$totalPrice"
            text_view_items.text = "Items: $quantity"
        }
        text_view_minus.setOnClickListener(){
            if (quantity < 1){
                text_view_quantity.text = "0"
            }else{
                quantity --
                text_view_quantity.text = quantity.toString()
                totalPrice -= price
                text_view_amount.text = "Amount: $$totalPrice"
                text_view_items.text = "Items: $quantity"
            }
        }

        button_cancel.setOnClickListener(){
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        text_view_checkout.setOnClickListener(){
            var intent = Intent(this, PaymentActivity::class.java)
            intent.putExtra("total", totalPrice.toString())
            startActivity(intent)
        }
    }
}
