package com.example.sayfagecisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class anaSayfaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_ana_sayfa, container, false)

        // Butonları bul
        val buttonGoToA = view.findViewById<Button>(R.id.buttonGoToA)
        val buttonGoToX = view.findViewById<Button>(R.id.buttonGoToX)

        // GIT → A
        buttonGoToA.setOnClickListener {
            findNavController().navigate(R.id.homeTo_A)
        }

        // GIT → X
        buttonGoToX.setOnClickListener {
            findNavController().navigate(R.id.homeTo_X)
        }

        return view

    }


}