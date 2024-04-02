package com.example.mapsapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class LandmarksAdapter(private val context: Context, private val landmarks: List<String>) :
    RecyclerView.Adapter<LandmarksAdapter.LandmarkViewHolder>() {

    inner class LandmarkViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val landmarkName: TextView = itemView.findViewById(R.id.textLandmarkName)
        val landmarkAddress: TextView = itemView.findViewById(R.id.textLandmarkAddress)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_landmark, parent, false)
        return LandmarkViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: LandmarkViewHolder, position: Int) {
        val landmark = landmarks[position]
        holder.landmarkName.text = landmark.name
        holder.landmarkAddress.text = landmark.address
    }

    override fun getItemCount(): Int {
        return landmarks.size
    }
}
