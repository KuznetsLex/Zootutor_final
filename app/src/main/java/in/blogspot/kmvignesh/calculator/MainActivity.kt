package `in`.blogspot.kmvignesh.calculator

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
<<<<<<< HEAD
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.tutorialwing.scrollview.*
=======
import android.os.Environment
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.tutorialwing.scrollview.SecondActivity
>>>>>>> 8f1fbb3cbac2bb6d7b39b3f9485b0ae9b42fdef3
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

<<<<<<< HEAD
=======


>>>>>>> 8f1fbb3cbac2bb6d7b39b3f9485b0ae9b42fdef3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< HEAD
        vopros.setOnClickListener {
            var resID = getResources().getIdentifier("main", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }


        arrow.setOnClickListener{
            val randomIntent = Intent(this, MainMenu::class.java)
            startActivity(randomIntent)
        }


        korova.setOnClickListener {
            var resID = getResources().getIdentifier("this_cow", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, cow::class.java)
            startActivity(randomIntent)
        }


        loshad.setOnClickListener {
            var resID = getResources().getIdentifier("this_horse", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, horse::class.java)
            startActivity(randomIntent)
        }

        svinya.setOnClickListener {
            var resID = getResources().getIdentifier("this_pig", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, pig::class.java)
            startActivity(randomIntent)
        }

        ovechka.setOnClickListener {
            var resID = getResources().getIdentifier("this_sheep", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, sheep::class.java)
            startActivity(randomIntent)
        }

        koza.setOnClickListener {
            var resID = getResources().getIdentifier("this_cow", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, goat::class.java)
            startActivity(randomIntent)
               }

        krolik.setOnClickListener {
            var resID = getResources().getIdentifier("this_cow", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, rabbit::class.java)
            startActivity(randomIntent)
               }


        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Floshad.png?alt=media&token=0e361f02-6173-4f51-85fa-270212d6dfc9").into(loshad);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fkorova.png?alt=media&token=b6d8512b-f7ae-45f3-83f2-9a3630177aff").into(korova);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fovechka.png?alt=media&token=d51709dd-c4eb-4cbe-84c9-fcde0a927145").into(ovechka);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fsvinya.png?alt=media&token=90064324-51f7-4230-a116-be85023f70e7").into(svinya);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fkoza.png?alt=media&token=7ed47746-fd60-4183-9c20-9fdf764c16e6").into(koza);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Frabbit.png?alt=media&token=acf23e88-20ab-4697-88e2-da45f6829d41").into(krolik);

        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fvopros.png?alt=media&token=87701bbc-0ed0-4948-8b23-0f4f8ca16139").into(vopros);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Farrow.png?alt=media&token=9a717b8e-6fe6-4c31-93cc-34226ae9339c").into(arrow);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fexam.png?alt=media&token=dabedfa3-91fb-4326-bf84-886e212a611a").into(exam);
=======


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



>>>>>>> 8f1fbb3cbac2bb6d7b39b3f9485b0ae9b42fdef3
    }



<<<<<<< HEAD
}
=======

>>>>>>> 8f1fbb3cbac2bb6d7b39b3f9485b0ae9b42fdef3
