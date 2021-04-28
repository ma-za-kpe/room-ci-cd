package com.maku.roomapp.ui.fragment.onboarding.pages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.maku.roomapp.R
import com.maku.roomapp.databinding.FragmentSecondScreenBinding
import com.maku.roomapp.databinding.FragmentThirdScreenBinding

class SecondScreen : Fragment() {

    private var _binding: FragmentSecondScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =  FragmentSecondScreenBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        val viewPager =  activity?.findViewById<ViewPager2>(R.id.viewpager)

        binding.next2.setOnClickListener {
            viewPager?.currentItem = 2
        }

        return binding.root
    }

}