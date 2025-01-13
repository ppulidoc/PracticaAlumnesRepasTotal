package com.paudam.practicaalumnesrepastotal.afegir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.paudam.practicaalumnesrepastotal.R
import com.paudam.practicaalumnesrepastotal.databinding.FragmentAfegirAlumnesBinding


class AfegirAlumnes : Fragment() {

    private lateinit var binding: FragmentAfegirAlumnesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_afegir_alumnes, container, false
        )


        binding.buttonGoToLlistar.setOnClickListener{
            findNavController().navigate(R.id.action_afegirAlumnes_to_llistarAlumnes)
        }

        return binding.root
    }

}