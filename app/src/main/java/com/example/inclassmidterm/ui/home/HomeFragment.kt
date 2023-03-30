package com.example.inclassmidterm.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.inclassmidterm.R
import com.example.inclassmidterm.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    lateinit var homeStartButton: Button
    lateinit var pauseButton: Button
    lateinit var resetButton: Button

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }


        return root
    }
/*
    private var startButton: View.OnClickListener = View.OnClickListener {

    }

    private val pauseButton: View.OnClickListener = View.OnClickListener {

    }

    private var resetButton: View.OnClickListener = View.OnClickListener {

    }

 */

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}