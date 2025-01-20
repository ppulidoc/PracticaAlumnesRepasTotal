package com.paudam.practicaalumnesrepastotal.actualizar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.paudam.practicaalumnesrepastotal.R
import com.paudam.practicaalumnesrepastotal.afegir.AfegirAlumneVM
import com.paudam.practicaalumnesrepastotal.databinding.FragmentActualizarAlumneBinding


class ActualizarAlumne : Fragment() {

    private lateinit var binding: FragmentActualizarAlumneBinding
    private lateinit var actualizarAlumneVM: ActualizarAlumneVM
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_actualizar_alumne, container, false
        )

        actualizarAlumneVM = ViewModelProvider(this).get(ActualizarAlumneVM::class.java)

        binding.buttonUpdate.setOnClickListener(){

            var edat=binding.editTextEdat.text.toString().toInt()
            var nom=binding.editTextNom.text.toString()

            actualizarAlumneVM.updAlumne(requireContext(),nom,edat)


        }



        binding.buttonGoToLlistar.setOnClickListener{
            findNavController().navigate(R.id.action_actualizarAlumne_to_llistarAlumnes)
        }

        return binding.root
    }

}