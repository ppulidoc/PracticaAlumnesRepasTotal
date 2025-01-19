package com.paudam.practicaalumnesrepastotal.llistarFiltres

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
import com.paudam.practicaalumnesrepastotal.databinding.FragmentLlistarAlumnesFiltratsBinding

import com.paudam.practicaalumnesrepastotal.llistar.AlumnesAdapter


class LlistarAlumnesFiltrats : Fragment() {

    private lateinit var binding: FragmentLlistarAlumnesFiltratsBinding
    private lateinit var llistarAlumnesFiltratsVM: LlistarAlumnesFiltratsVM
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_llistar_alumnes_filtrats, container, false
        )

        llistarAlumnesFiltratsVM = ViewModelProvider(this).get(LlistarAlumnesFiltratsVM::class.java)

       llistarAlumnesFiltratsVM.llistar_alumnes_f(requireContext(),20)
        binding.recyclerViewAlumnesFiltrats.layoutManager = LinearLayoutManager(requireContext())


        llistarAlumnesFiltratsVM.llistat_alumnes_filtrats?.observe(viewLifecycleOwner, Observer { alumnesLlistatFiltrat ->
            binding.recyclerViewAlumnesFiltrats.adapter = AlumnesAdapter(alumnesLlistatFiltrat)
        })






        return binding.root
    }

}