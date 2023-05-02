package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigationcomponent.databinding.FragmentDBinding

class DFragment : Fragment() {

    private val binding by lazy {
        FragmentDBinding.inflate(layoutInflater)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        addCallBacks()
    }

    private fun addCallBacks() {
        binding.buttonBack.setOnClickListener {button->
            button.findNavController().popBackStack() // kotlin extension function ktx in dependency
          //  Navigation.findNavController(button).popBackStack()
        }
    }

}