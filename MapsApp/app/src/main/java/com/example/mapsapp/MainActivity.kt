package com.example.mapsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var landmarkTypesAdapter: LandmarksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewLandmarkTypes)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Set up the adapter
        landmarkTypesAdapter = LandmarksAdapter(this, getLandmarkTypes())
        recyclerView.adapter = landmarkTypesAdapter
    }

    private fun getLandmarkTypes(): List<String> {
        return listOf("Old Buildings", "Museums", "Stadiums", "Attractions", "Parks")
    }
}
