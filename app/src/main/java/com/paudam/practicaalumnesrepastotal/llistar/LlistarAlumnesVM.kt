package com.paudam.practicaalumnesrepastotal.llistar

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.paudam.practicaalumnesrepastotal.Repositori
import com.paudam.practicaalumnesrepastotal.data.Alumne

class LlistarAlumnesVM: ViewModel() {

    private var _llistat_alumnes: LiveData<List<Alumne>>?=null
    val llistat_alumnes: LiveData<List<Alumne>>?
        get()=_llistat_alumnes


    //funció obtenirAlumnes

    fun llistar_alumnes(context: Context) {
        _llistat_alumnes = Repositori.obtenirAlumnes(context)
    }
}