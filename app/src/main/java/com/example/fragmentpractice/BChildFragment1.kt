package com.example.fragmentpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentpractice.databinding.FragmentABinding
import com.example.fragmentpractice.databinding.FragmentBChild1Binding

class BChildFragment1 : Fragment() {
    lateinit var binding : FragmentBChild1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBChild1Binding.inflate(inflater, container, false)
        return binding.root
    }


}