package com.rjt.shopping.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.rjt.shopping.R
import kotlinx.android.synthetic.main.activity_payment.*

class PaymentActivity : AppCompatActivity() {

    var temp = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        var total = intent.getStringExtra("total")
        text_view_pay.append(total)

        radio_group?.setOnCheckedChangeListener{ group, checkedId ->
            if(R.id.radio_button_credit == checkedId || R.id.radio_button_online == checkedId){
                text_view_message.text = "Please pay with cash, Sorry for the inconvenience"
                temp = false
            }
            else if (R.id.radio_button_cash == checkedId){
                text_view_message.text = "Please Click pay button bellow"
                temp = true
                pay()
            }
        }
    }

    fun pay(){
        text_view_pay.setOnClickListener(){
            if (temp){
                var intent = Intent(this, ThankyouActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
