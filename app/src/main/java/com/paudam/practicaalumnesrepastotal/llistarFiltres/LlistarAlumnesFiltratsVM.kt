package com.paudam.practicaalumnesrepastotal.llistarFiltres

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.paudam.practicaalumnesrepastotal.Repositori
import com.paudam.practicaalumnesrepastotal.data.Alumne

class LlistarAlumnesFiltratsVM: ViewModel() {

    private var _llistat_alumnes_filtrats: LiveData<List<Alumne>>?=null
    val llistat_alumnes_filtrats: LiveData<List<Alumne>>?
        get()=_llistat_alumnes_filtrats


    //funció obtenirAlumnes

    fun llistar_alumnes_f(context: Context,edat: Int) {
        _llistat_alumnes_filtrats = Repositori.obtenirAlumnesFiltrats(context, edat)
    }
}