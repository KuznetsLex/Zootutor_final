package `in`.blogspot.kmvignesh.calculator

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Environment
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.tutorialwing.scrollview.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val pigSound = MediaPlayer.create(this, R.raw.pig)


        button5.setOnClickListener{
            var path = Environment.getExternalStorageDirectory().toString()+"/pig.wav"
            var mp=MediaPlayer()
            mp.setDataSource(path)
            mp.prepare()
            mp.start()
        }
    }





    fun toastMe(view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)
        startActivity(randomIntent)
    }



    }




