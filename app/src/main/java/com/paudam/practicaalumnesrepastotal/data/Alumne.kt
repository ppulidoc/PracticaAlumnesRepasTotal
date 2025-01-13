package com.paudam.practicaalumnesrepastotal.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Alumne")
data class Alumne(
    @ColumnInfo(name = "Edat")
    var edat: Int,
    @ColumnInfo(name = "Any")
    var any: Int,
    @ColumnInfo(name = "Nom")
    var nom: String,
    @ColumnInfo(name = "Cognom")
    var cognom: String
){
    @PrimaryKey(autoGenerate = true)
    var Id: Int? = null
}
