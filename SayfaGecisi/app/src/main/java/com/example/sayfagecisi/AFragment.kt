package com.example.sayfagecisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class AFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        val buttonGoToB = view.findViewById<Button>(R.id.buttonGoToB)
        buttonGoToB.setOnClickListener {
            findNavController().navigate(R.id.Ato_B)
        }

        return view
    }


}