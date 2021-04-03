package com.tutorialwing.scrollview

import `in`.blogspot.kmvignesh.calculator.R
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    //companion object{
    //    const val TOTAL_COUNT = "total_count"
    // }
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/%D0%A1%20%D0%A2%D0%B8%D0%BC%D0%BE%D0%B9.jpg?alt=media&token=15ab4a7b-b2b8-4ff4-b9eb-d4380fc67c8a").into(image1);


    }
}