package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationcomponent.databinding.FragmentABinding

class AFragment : Fragment() {
    private val binding by lazy {
        FragmentABinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonB.setOnClickListener { button ->
            val action =AFragmentDirections.actionAFragmentToBFragment()
            Navigation.findNavController(button).navigate(action)
        }
        binding.buttonC.setOnClickListener { button ->
            val action =AFragmentDirections.actionAFragmentToCFragment()
            Navigation.findNavController(button).navigate(action)
        }
    }

}