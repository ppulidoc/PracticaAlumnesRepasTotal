package com.paudam.practicaalumnesrepastotal.llistar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.paudam.practicaalumnesrepastotal.R
import com.paudam.practicaalumnesrepastotal.data.Alumne

class AlumnesAdapter (private val mList: List<Alumne>) : RecyclerView.Adapter<AlumnesAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cardview_alumne, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val alumne = mList[position]

        holder.textViewEdat.text = alumne.edat.toString()
        holder.textViewAny.text = alumne.any.toString()
        holder.textViewNom.text = alumne.nom
        holder.textViewCognom.text = alumne.cognom

        holder.layoutRecycler.setOnClickListener {view ->
           /* Toast.makeText(holder.layoutRecycler.context, "Hola Mundo", Toast.LENGTH_SHORT).show()*/

            view.findNavController().navigate(R.id.action_llistarAlumnesFiltrats_to_afegirAlumnes)

        }
    }


    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val textViewEdat: TextView = itemView.findViewById(R.id.textViewEdat)
        val textViewAny: TextView = itemView.findViewById(R.id.textViewAny)
        val textViewNom: TextView = itemView.findViewById(R.id.textViewNom)
        val textViewCognom: TextView = itemView.findViewById(R.id.textViewCognom)
        val layoutRecycler: LinearLayout = itemView.findViewById(R.id.linearId)
    }
}