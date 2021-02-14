package `in`.blogspot.kmvignesh.calculator

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.tutorialwing.scrollview.SecondActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun toastMe(view: View) {
        val randomIntent = Intent(this, SecondActivity::class.java)
        startActivity(randomIntent)
    }
}


