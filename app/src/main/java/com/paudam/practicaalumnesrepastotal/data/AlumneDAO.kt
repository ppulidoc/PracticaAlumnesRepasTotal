package com.paudam.practicaalumnesrepastotal.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update

@Dao
interface AlumneDAO {
    //Consultes

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun afegirAlumne(alumne: Alumne)


    //select all
    @Query("SELECT * FROM Alumne ORDER BY edat DESC")
    fun obtenirAlumne(): LiveData<List<Alumne>>

    //fer update
    @Update(onConflict = OnConflictStrategy.IGNORE)
    fun actualizarAlum(alumne: Alumne)
}