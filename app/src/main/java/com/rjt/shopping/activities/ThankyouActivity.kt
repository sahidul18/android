package com.rjt.shopping.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rjt.shopping.R
import kotlinx.android.synthetic.main.activity_thankyou.*
import kotlin.system.exitProcess

class ThankyouActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thankyou)

        button_shop_again.setOnClickListener(){
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

//        button_exit.setOnClickListener(){
//            System.exit(0)
////            exitProcess(0)
//        }
    }
}
