package com.rjt.shopping.adapters

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rjt.shopping.R
import com.rjt.shopping.activities.ProductDetailsActivity
import com.rjt.shopping.models.Product
import kotlinx.android.synthetic.main.product_row.view.*

class AdapterRecyclerView(val productList:ArrayList<Product>, val context: Context ):
    RecyclerView.Adapter<AdapterRecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.product_row, parent, false))
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var product = productList[position]

        holder?.productName.text = product.productName
        holder?.productPrice.text = "$"+product.productPrice
        holder?.productDescription.text = product.productDescription
        holder?.productImage.setImageResource(product.productImage)
    }


    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){

        var productName = view.text_view_product_name
        var productPrice = view.text_view_price
        var productDescription = view.text_view_description
        var productImage = view.image_view


        init {
            view.setOnClickListener(){
                var product = productList[adapterPosition]

                var intent = Intent(view.context, ProductDetailsActivity::class.java)

                intent.putExtra("product", product)
                view.context.startActivity(intent)
            }
        }

    }
}