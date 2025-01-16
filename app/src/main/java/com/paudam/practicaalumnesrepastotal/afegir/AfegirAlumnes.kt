package com.paudam.practicaalumnesrepastotal.afegir

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
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

        //SPINNER -------------------------------------------------
        // Inicializar el Spinner
        val spinner = binding.spinnerBasic

        // Crear el ArrayAdapter usando el string-array del resources
        val adapter = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.social_networks_array,
            android.R.layout.simple_spinner_item
        )

        // Estilo para los elementos desplegados
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Asignar el adaptador al Spinner
        spinner.adapter = adapter

        // Manejar la selección de elementos en el Spinner
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                // Obtener el elemento seleccionado
                val selectedItem = parent?.getItemAtPosition(position).toString()
                // Mostrar un mensaje o realizar una acción con el elemento seleccionado
                Toast.makeText(requireContext(), "Seleccionaste: $selectedItem", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Opcional: manejar el caso en que no se selecciona nada
            }
        }

        //---------------------------------------------------------------------------

        // Botón de inserción
        binding.buttonInsert.setOnClickListener {
            val edat = binding.editTextEdat.text.toString().toIntOrNull()
            val any = binding.editTextAny.text.toString().toIntOrNull()
            val nom = binding.editTextNom.text.toString()
            val cognom = binding.editTextCognom.text.toString()

            if (edat != null && any != null) {
                afegirAlumneVM.nouAlumne(requireContext(), edat, any, nom, cognom)
            }
        }

        // Botón para navegar
        binding.buttonGoToLlistar.setOnClickListener {
            findNavController().navigate(R.id.action_afegirAlumnes_to_actualizarAlumne)
        }

        return binding.root
    }
}
