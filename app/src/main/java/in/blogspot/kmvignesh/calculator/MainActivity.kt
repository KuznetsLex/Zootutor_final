package `in`.blogspot.kmvignesh.calculator

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.tutorialwing.scrollview.cow

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

 }
    fun toastMe(view: View) {
        val randomIntent = Intent(this, cow::class.java)
        startActivity(randomIntent)
    }

    fun toMainMenu(view: View) {
        val randomIntent = Intent(this, MainMenu::class.java)
        startActivity(randomIntent)
    }


}


