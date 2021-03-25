package `in`.blogspot.kmvignesh.calculator

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.bumptech.glide.Glide
import com.tutorialwing.scrollview.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vopros.setOnClickListener {
            var resID = getResources().getIdentifier("main", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        korova.setOnClickListener {
            var resID = getResources().getIdentifier("this_cow", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, SecondActivity::class.java)
            startActivity(randomIntent)
        }


        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Floshad.png?alt=media&token=0e361f02-6173-4f51-85fa-270212d6dfc9").into(loshad);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fkorova.png?alt=media&token=b6d8512b-f7ae-45f3-83f2-9a3630177aff").into(korova);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fovechka.png?alt=media&token=d51709dd-c4eb-4cbe-84c9-fcde0a927145").into(ovechka);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fsvinya.png?alt=media&token=90064324-51f7-4230-a116-be85023f70e7").into(svinya);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fsobaka.png?alt=media&token=59dc5ef8-9347-450e-9c1c-859ee83d6c93").into(sobaka);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/animals%2Fkurochka.png?alt=media&token=1238c9da-05fb-4f65-a205-cf00463cf4ab").into(kurochka);

        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fvopros.png?alt=media&token=87701bbc-0ed0-4948-8b23-0f4f8ca16139").into(vopros);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Farrow.png?alt=media&token=9a717b8e-6fe6-4c31-93cc-34226ae9339c").into(arrow);
        Glide.with(getApplicationContext()).load("https://firebasestorage.googleapis.com/v0/b/zoobase-ddfc3.appspot.com/o/controls%2Fexam.png?alt=media&token=dabedfa3-91fb-4326-bf84-886e212a611a").into(exam);
    }
    fun toastMe(view: View) {

    }

    fun toMainMenu(view: View) {
        val randomIntent = Intent(this, MainMenu::class.java)
        startActivity(randomIntent)
    }


}


