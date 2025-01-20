package com.paudam.practicaalumnesrepastotal

import android.content.Context
import androidx.lifecycle.LiveData
import com.paudam.practicaalumnesrepastotal.data.Alumne
import com.paudam.practicaalumnesrepastotal.data.dataBase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class Repositori {
    companion object {
        var repositori_database: dataBase? = null

        var alumnes: LiveData<List<Alumne>>? = null



        //funció per a inicialitzar la BD

        fun initializeDB(context: Context): dataBase {
            return dataBase.getDatabase(context)
        }

        //TODO:funcio qyue cridi a l'insert

        fun inserirAlumne(context: Context, alumne: Alumne) {

            //Connectar la BD
            repositori_database = initializeDB(context)

            CoroutineScope(IO).launch {
                repositori_database!!.alumneDao().afegirAlumne(alumne)
            }
        }

        //TODO:funcio que torni la select

        fun obtenirAlumnes(context: Context): LiveData<List<Alumne>>? {
            //Connectar la BD
            repositori_database = initializeDB(context)

            CoroutineScope(IO).launch {
                alumnes = repositori_database!!.alumneDao().obtenirAlumne()
            }

            return alumnes

        }

        fun obtenirAlumnesFiltrats(context: Context,edat: Int): LiveData<List<Alumne>>? {
            //Connectar la BD
            repositori_database = initializeDB(context)

            CoroutineScope(IO).launch {
                alumnes = repositori_database!!.alumneDao().obtenirAlumneFiltrat(edat)
            }

            return alumnes

        }


        fun actualizarAlumne(context: Context,nombre: String, edat: Int) {
            //Connectar la BD
            repositori_database = initializeDB(context)

            CoroutineScope(IO).launch {
                repositori_database!!.alumneDao().updateAlumne(nombre,edat)
            }

        }





    }
}