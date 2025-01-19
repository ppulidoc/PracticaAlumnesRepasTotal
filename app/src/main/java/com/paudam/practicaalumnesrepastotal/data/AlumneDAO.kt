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

    //select all
    @Query("SELECT * FROM Alumne WHERE edat = :edat ORDER BY edat DESC")
    fun obtenirAlumneFiltrat(edat: Int): LiveData<List<Alumne>>

}