package com.paudam.practicaalumnesrepastotal.llistar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.paudam.practicaalumnesrepastotal.R
import com.paudam.practicaalumnesrepastotal.databinding.FragmentLlistarAlumnesBinding


class LlistarAlumnes : Fragment() {

    private lateinit var binding: FragmentLlistarAlumnesBinding
    private lateinit var llistarAlumnesVM: LlistarAlumnesVM

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_llistar_alumnes, container, false
        )

        llistarAlumnesVM = ViewModelProvider(this).get(LlistarAlumnesVM::class.java)
        llistarAlumnesVM.llistar_alumnes(requireContext())
        binding.recyclerViewAlumnes.layoutManager = LinearLayoutManager(requireContext())

        llistarAlumnesVM.llistat_alumnes?.observe(viewLifecycleOwner, Observer { alumnesLlistat ->
            binding.recyclerViewAlumnes.adapter = AlumnesAdapter(alumnesLlistat)
        })




        return binding.root
    }

}