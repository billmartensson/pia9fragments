package se.magictechnology.pia9fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.mainFragment, StartFragment()).commit()


        var gootherbutton = findViewById<Button>(R.id.goOtherButton)

        gootherbutton.setOnClickListener {

            supportFragmentManager.beginTransaction().replace(R.id.mainFragment, OtherFragment()).commit()

        }

        var gostartbutton = findViewById<Button>(R.id.goStartButton)

        gostartbutton.setOnClickListener {

            var startfrag = StartFragment()
            startfrag.counter = 78

            supportFragmentManager.beginTransaction().replace(R.id.mainFragment, startfrag).commit()

        }

    }
}