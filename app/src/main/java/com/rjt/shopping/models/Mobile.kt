package com.rjt.shopping.models

import com.rjt.shopping.R

class Mobile{

    public fun addMobile():ArrayList<Product>{
        var productList:ArrayList<Product> = ArrayList()

        productList.add(Product("GlaxyNote", "949", glaxyNoteDetails, R.drawable.galaxy_note))
        productList.add(Product("iPhoneX", "899", iPhone10Details, R.drawable.i1))
        productList.add(Product("GalaxyS10+", "833", galaxyS10PlusDetails, R.drawable.galaxys10plus))
        productList.add(Product("iPhoneXS", "999", iPhoneXSDetails, R.drawable.ixs))
        productList.add(Product("Razer2", "799", razer2Details, R.drawable.one_plus))
        productList.add(Product("Samsung13", "803", samsung12Details, R.drawable.s2))

        return productList
    }

    var razer2Details = "120Hz ULTRAMOTION QHD 5. 72-INCH DISPLAY: the fastest mobile gaming display, now brighter" +
            "QUALCOMM SNAPDRAGON 845: With a custom vapor chamber cooling system" +
            "DUAL FRONT-FACING STEREO SPEAKERS: Featuring Dolby Atomos and a THX Certified DAC" +
            "WIRELESS FAST CHARGING: With large internal 4, 000 mAh battery" +
            "STORAGE: 8GB RAM / 64GB storage + micro SD Slot (up to 2TB)"

    var iPhoneXSDetails = "5.8-inch Super Retina HD display. Dual 12MP wide-angle and telephoto cameras." +
            "7MP TrueDepth camera. Face ID. A12 Bionic chip with Neural Engine. Rated IP67 " +
            "(maximum depth of 1 meter up to 30 minutes) under IEC standard 60529. " +
            "Yes (works with Qi chargers)"

    var iPhone10Details = "5.8-inch Super Retina HD display. Dual 12MP wide-angle and telephoto cameras." +
            "7MP TrueDepth camera. Face ID. A11 Bionic chip with Neural Engine. Rated IP67 " +
            "(maximum depth of 1 meter up to 30 minutes) under IEC standard 60529. " +
            "Yes (works with Qi chargers)"
    var glaxyNoteDetails = "Fast-charging, long-lasting intelligent power and super speed processing outlast whatever you throw at Note 10. " +
            "S pen’s newest Evolution gives you the power of air gestures, a remote shutter and playlist button and handwriting-to-text, all in One Magic wand." +
            "With a full set of Pro lenses, super-stabilization, live video bokeh and precision audio recording, Note 10 is a studio in your pocket." +
            "Note 10’s nearly bezel-less Infinity display gives an immersive, cinematic quality to whatever you’re viewing."
    var galaxyS10PlusDetails = """An immersive Cinematic Infinity Display, Pro grade Camera and Wireless PowerShare The next generation is here.
        | Ultrasonic in display fingerprint ID protects and unlocks with the first touch; Video Play Time: Up to 22 hours
        |  Pro grade Camera effortlessly captures epic, pro quality images of the world as you see it
        |  Intelligently accesses power by learning how and when you use your phone; All day Intelligent Battery: 4,100mAh""".trimMargin()

    var samsung12Details = """Details for samsung12 dskfjfkjf samsung12 ddkfjsfkjjf samsung12 dkfjds fdlkfjf
        |sdkffjkfdjfs f
        |skfjsfkjsfksd s
    """.trimMargin()
}

//class Mobile(var mobileName:String, var mobilePrice:String,
//                    var mobileDescription:String,var mobileImage:Int):Product
//    {//(mobileName, mobilePrice, mobileDescription, mobileImage){
//
//
//     public override fun addProduct():ArrayList<Product>{
//        var mobileList:ArrayList<Product> = ArrayList()
//
//        mobileList.add(Product("Samsung10", "Description", "800", R.drawable.samsungS10))
//        mobileList.add(Product("Samsung11", "Description2", "801", R.drawable.samsungS10))
//        mobileList.add(Product("Samsung12", "Description3", "802", R.drawable.samsungS10))
//
//
//        return mobileList
//    }
//}