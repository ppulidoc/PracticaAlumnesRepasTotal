package com.paudam.practicaalumnesrepastotal.afegir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.paudam.practicaalumnesrepastotal.R
import com.paudam.practicaalumnesrepastotal.databinding.FragmentAfegirAlumnesBinding


class AfegirAlumnes : Fragment() {

    private lateinit var binding: FragmentAfegirAlumnesBinding

    private lateinit var afegirAlumneVM: AfegirAlumneVM

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_afegir_alumnes, container, false
        )

        afegirAlumneVM = ViewModelProvider(this).get(AfegirAlumneVM::class.java)

        binding.buttonInsert.setOnClickListener{
            var edat=binding.editTextEdat.text.toString().toIntOrNull()
            var any = binding.editTextAny.text.toString().toIntOrNull()
            var nom=binding.editTextNom.text.toString()
            var cognom = binding.editTextCognom.text.toString()

            if (edat != null) {
                if (any != null) {
                    afegirAlumneVM.nouAlumne(requireContext(),edat,any,nom,cognom)
                }
            }


        }


        binding.buttonGoToLlistar.setOnClickListener{
            findNavController().navigate(R.id.action_afegirAlumnes_to_llistarAlumnes)
        }

        return binding.root
    }

}