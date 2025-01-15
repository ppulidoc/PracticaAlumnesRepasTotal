package com.paudam.practicaalumnesrepastotal.data

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface AlumneDAO {
    //Consultes

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun afegirAlumne(alumne: Alumne)


    //select all
    @Query("SELECT * FROM Alumne ORDER BY edat DESC")
    fun obtenirAlumne(): LiveData<List<Alumne>>
}