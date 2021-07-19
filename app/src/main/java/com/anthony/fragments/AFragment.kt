package com.anthony.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.anthony.fragments.databinding.FragmentABinding


class AFragment : Fragment() {
    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentABinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.moveBotton.setOnClickListener {

            val activity = requireActivity() as MainActivity
            activity.navigate(BFragment())
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}