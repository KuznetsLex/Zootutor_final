package com.tutorialwing.scrollview

import `in`.blogspot.kmvignesh.calculator.MainActivity
import `in`.blogspot.kmvignesh.calculator.R
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
import com.cretlabs.viewpager.CustomPagerAdapter
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    //companion object{
    //    const val TOTAL_COUNT = "total_count"
    // }
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        getWindow().setBackgroundDrawableResource(R.drawable.mainscreen);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val viewPager = findViewById<View>(R.id.viewpager) as ViewPager
        viewPager.adapter = CustomPagerAdapter(this)

        //radioButton1 = findViewById(R.id.radioButton1) as RadioButton


        button7.setOnClickListener {
            var resID = getResources().getIdentifier("cow", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }




            radioGroup.setOnCheckedChangeListener { _, checkedId ->
                if(checkedId ==R.id.radioButton1) {

                    image3.visibility = (View.VISIBLE)
                    image2.visibility = (View.GONE)
                    image4.visibility = (View.GONE)
                }
                else if(checkedId ==R.id.radioButton2) {

                    image2.visibility = (View.VISIBLE)
                    image3.visibility = (View.GONE)
                    image4.visibility = (View.GONE)
                }
                else if(checkedId ==R.id.radioButton3) {

                    image4.visibility = (View.VISIBLE)
                    image2.visibility = (View.GONE)
                    image3.visibility = (View.GONE)
                }
            }






        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/food%2Fcow_and_sheep_food.png?alt=media&token=0b0652b4-0e6f-44f1-94eb-635dd3525321").into(image2);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/footprints%2Fcow_foot1.png?alt=media&token=0da481b1-737a-41e3-981d-ef68a2ba06f7").into(image3);
    }

    fun rideOnMe(view: View) {
        val rideIntent = Intent(this, MainActivity::class.java)
        startActivity(rideIntent)
    }



}