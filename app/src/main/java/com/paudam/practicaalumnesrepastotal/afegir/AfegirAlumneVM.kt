package com.paudam.practicaalumnesrepastotal.afegir

import android.content.Context
import androidx.lifecycle.ViewModel
import com.paudam.practicaalumnesrepastotal.Repositori
import com.paudam.practicaalumnesrepastotal.data.Alumne

class AfegirAlumneVM:ViewModel() {
    //funció cridar repositori i afegir alumnes
    fun nouAlumne(context: Context, edat:Int, any:Int, nom:String, cognom:String) {
        var alumneVM=Alumne(edat,any,nom,cognom)
        Repositori.inserirAlumne(context,alumneVM)
    }
}