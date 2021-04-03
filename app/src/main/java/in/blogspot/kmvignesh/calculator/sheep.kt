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
import com.codinginflow.picassoimagesliderexample.ViewPagerAdapter
import kotlinx.android.synthetic.main.layout_cow.*


class sheep : AppCompatActivity() {

    private val imageUrls = arrayOf(
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Fsheep_1.png?alt=media&token=60718bc5-fa8d-4426-9da3-f38be84f2eef",
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Fsheep_2.png?alt=media&token=da7238f2-1498-4063-a972-425cebe77b48",
            "https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/Photos%2Fsheep_3.jpg?alt=media&token=fa1dfad3-9e43-47a1-99ad-03d14d522efc"
    )
    @Override
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_cow)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val adapter = ViewPagerAdapter(this, imageUrls)
        viewPager.adapter = adapter

        //radioButton1 = findViewById(R.id.radioButton1) as RadioButton




        vopros.setOnClickListener {
            var resID = getResources().getIdentifier("main_2", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        food.setOnClickListener {
            var resID = getResources().getIdentifier("sheep_food", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        foot.setOnClickListener {
            var resID = getResources().getIdentifier("sheep_footprint", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        soundpic.setOnClickListener {
            var resID = getResources().getIdentifier("sheep", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }




        radioGroup.setOnCheckedChangeListener { _, checkedId ->
            if(checkedId ==R.id.radioFoot) {

                foot.visibility = (View.VISIBLE)
                food.visibility = (View.GONE)
                soundpic.visibility = (View.GONE)
                viewPager.visibility = (View.GONE)
            }
            else if(checkedId ==R.id.radioFood) {

                food.visibility = (View.VISIBLE)
                foot.visibility = (View.GONE)
                soundpic.visibility = (View.GONE)
                viewPager.visibility = (View.GONE)
            }
            else if(checkedId ==R.id.radioSound) {

                soundpic.visibility = (View.VISIBLE)
                food.visibility = (View.GONE)
                foot.visibility = (View.GONE)
                viewPager.visibility = (View.GONE)
            }
            else if(checkedId ==R.id.radioFace) {

                soundpic.visibility = (View.GONE)
                food.visibility = (View.GONE)
                foot.visibility = (View.GONE)
                viewPager.visibility = (View.VISIBLE)
            }
        }





        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/food%2Fcow_and_sheep_food.png?alt=media&token=0b0652b4-0e6f-44f1-94eb-635dd3525321").into(food);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/footprints%2Fsheepsteps.jpg?alt=media&token=211f68ef-cc71-488d-9744-b8634e8eba63").into(foot);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/soundpick%2FSheep__soundpic1.png?alt=media&token=a07facbe-d03c-40ae-9212-0870e00c0306").into(soundpic);

        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fvopros.png?alt=media&token=87701bbc-0ed0-4948-8b23-0f4f8ca16139").into(vopros);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Farrow.png?alt=media&token=9a717b8e-6fe6-4c31-93cc-34226ae9339c").into(arrow);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fexam.png?alt=media&token=dabedfa3-91fb-4326-bf84-886e212a611a").into(exam);
    }

    fun rideOnMe(view: View) {
        val rideIntent = Intent(this, MainActivity::class.java)
        startActivity(rideIntent)
    }



}