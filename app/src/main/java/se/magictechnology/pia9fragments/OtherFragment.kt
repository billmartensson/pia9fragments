package se.magictechnology.pia9fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class OtherFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_other, container, false)
    }

    override fun onStart() {
        super.onStart()

        var gothirdbutton = view!!.findViewById<Button>(R.id.goThirdButton)

        gothirdbutton.setOnClickListener {

            activity!!.supportFragmentManager.beginTransaction().add(R.id.mainFragment, ThirdFragment()).addToBackStack(null).commit()

        }
    }
}