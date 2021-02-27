package `in`.blogspot.kmvignesh.calculator

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.tutorialwing.scrollview.SecondActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button7.setOnClickListener {
            var resID = getResources().getIdentifier("main", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
        }

        button4.setOnClickListener {
            var resID = getResources().getIdentifier("this_cow", "raw", getPackageName())
            val mediaPlayer = MediaPlayer.create(this, resID)
            mediaPlayer.start()
            val randomIntent = Intent(this, SecondActivity::class.java)
            startActivity(randomIntent)
        }



    }
    fun toastMe(view: View) {

    }

    fun toMainMenu(view: View) {
        val randomIntent = Intent(this, MainMenu::class.java)
        startActivity(randomIntent)
    }


}


