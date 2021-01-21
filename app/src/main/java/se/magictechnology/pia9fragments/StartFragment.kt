package se.magictechnology.pia9fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class StartFragment : Fragment() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onStart() {
        super.onStart()

        var countButton = view!!.findViewById<Button>(R.id.startCountButton)

        countButton.setOnClickListener {

            counter = counter + 1

            var startText = view!!.findViewById<TextView>(R.id.startTextView)

            startText.text = counter.toString()
        }
    }

}