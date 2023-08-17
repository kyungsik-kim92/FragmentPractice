package com.example.fragmentpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentpractice.databinding.FragmentBChild1Binding
import com.example.fragmentpractice.databinding.FragmentBChild2Binding

class BChildFragment2 : Fragment() {
    lateinit var binding : FragmentBChild2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBChild2Binding.inflate(inflater, container, false)
        return binding.root
    }


}