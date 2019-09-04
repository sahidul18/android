package com.rjt.shopping.models

import java.io.Serializable

data class Product(var productName:String, var productPrice:String,
                   var productDescription:String, var productImage:Int
):Serializable


//package com.rjt.shopping.models
//
//import com.rjt.shopping.R
//
////open class Product{(productName:String, productPrice:String, productDescription:String, productImage:Int) {
//
////    init {
////        var name = productName
////        var price = productPrice
////        var description = productDescription
////        var image = productImage
////    }
//
//    open public fun addProduct():ArrayList<Product>{
//        var productList:ArrayList<Product> = ArrayList()
//
//        productList.add(Product("Parent", "Description", "800", R.drawable.samsungS10))
//        productList.add(Product("Parent", "Description2", "801", R.drawable.samsungS10))
//        productList.add(Product("Parent", "Description3", "802", R.drawable.samsungS10))
//
//
//        return productList
//    }
//}