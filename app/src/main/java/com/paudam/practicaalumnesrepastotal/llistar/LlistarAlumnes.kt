package com.paudam.practicaalumnesrepastotal.llistar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.paudam.practicaalumnesrepastotal.R
import com.paudam.practicaalumnesrepastotal.databinding.FragmentLlistarAlumnesBinding


class LlistarAlumnes : Fragment() {

    private lateinit var binding: FragmentLlistarAlumnesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_llistar_alumnes, container, false
        )



        return binding.root
    }

}