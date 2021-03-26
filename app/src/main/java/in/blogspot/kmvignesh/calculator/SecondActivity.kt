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

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val viewPager = findViewById<View>(R.id.viewpager) as ViewPager
        viewPager.adapter = CustomPagerAdapter(this)

        //radioButton1 = findViewById(R.id.radioButton1) as RadioButton




        vopros.setOnClickListener {
            var resID = getResources().getIdentifier("main_2", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        food.setOnClickListener {
            var resID = getResources().getIdentifier("cow_food", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        foot.setOnClickListener {
            var resID = getResources().getIdentifier("cow_footprint", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        soundpic.setOnClickListener {
            var resID = getResources().getIdentifier("cow", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }
        



            radioGroup.setOnCheckedChangeListener { _, checkedId ->
                if(checkedId ==R.id.radioFoot) {

                    foot.visibility = (View.VISIBLE)
                    food.visibility = (View.GONE)
                    soundpic.visibility = (View.GONE)
                    viewpager.visibility = (View.GONE)
                }
                else if(checkedId ==R.id.radioFood) {

                    food.visibility = (View.VISIBLE)
                    foot.visibility = (View.GONE)
                    soundpic.visibility = (View.GONE)
                    viewpager.visibility = (View.GONE)
                }
                else if(checkedId ==R.id.radioSound) {

                    soundpic.visibility = (View.VISIBLE)
                    food.visibility = (View.GONE)
                    foot.visibility = (View.GONE)
                    viewpager.visibility = (View.GONE)
                }
                else if(checkedId ==R.id.radioFace) {

                    soundpic.visibility = (View.GONE)
                    food.visibility = (View.GONE)
                    foot.visibility = (View.GONE)
                    viewpager.visibility = (View.VISIBLE)
                }
            }





        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/food%2Fcow_and_sheep_food.png?alt=media&token=0b0652b4-0e6f-44f1-94eb-635dd3525321").into(food);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/footprints%2Fcow_foot1.jpg?alt=media&token=d7ef1ba6-714e-4691-9889-505671bb4438").into(foot);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/soundpick%2FCow__soundpic.png?alt=media&token=af102aeb-2fbe-40d2-82d7-1418bed2c886").into(soundpic);

        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fvopros.png?alt=media&token=87701bbc-0ed0-4948-8b23-0f4f8ca16139").into(vopros);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Farrow.png?alt=media&token=9a717b8e-6fe6-4c31-93cc-34226ae9339c").into(arrow);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fexam.png?alt=media&token=dabedfa3-91fb-4326-bf84-886e212a611a").into(exam);
    }

    fun rideOnMe(view: View) {
        val rideIntent = Intent(this, MainActivity::class.java)
        startActivity(rideIntent)
    }



}