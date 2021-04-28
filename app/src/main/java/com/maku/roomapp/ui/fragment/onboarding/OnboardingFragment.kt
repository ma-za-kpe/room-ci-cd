package com.maku.roomapp.ui.fragment.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.maku.roomapp.R
import com.maku.roomapp.databinding.FragmentOnboardingBinding
import com.maku.roomapp.ui.fragment.onboarding.pages.FirstScreen
import com.maku.roomapp.ui.fragment.onboarding.pages.SecondScreen
import com.maku.roomapp.ui.fragment.onboarding.pages.ThirdScreen

class OnboardingFragment : Fragment() {

    private var _binding: FragmentOnboardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =  FragmentOnboardingBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewpager.adapter = adapter

        return binding.root
    }

}