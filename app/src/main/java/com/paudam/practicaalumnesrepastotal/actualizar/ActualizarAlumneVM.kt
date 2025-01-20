package com.paudam.practicaalumnesrepastotal.actualizar

import android.content.Context
import androidx.lifecycle.ViewModel
import com.paudam.practicaalumnesrepastotal.Repositori
import com.paudam.practicaalumnesrepastotal.data.Alumne

class ActualizarAlumneVM:ViewModel() {
    fun updAlumne(context: Context, nombre: String, edat: Int) {
        Repositori.actualizarAlumne(context,nombre,edat)
    }
}