package com.example.sayfagecisi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class YFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_y, container, false)

        val buttonBackToHome = view.findViewById<Button>(R.id.buttonBackToHome)
        buttonBackToHome.setOnClickListener {
            // Stack'i temizle ve ANASAYFA'ya dön
            findNavController().popBackStack(R.id.anaSayfaFragment, false)
            findNavController().navigate(R.id.anaSayfaFragment)
        }

        return view
    }



}