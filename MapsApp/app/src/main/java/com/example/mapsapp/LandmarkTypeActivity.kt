package com.example.mapsapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LandmarkTypeActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var landmarksAdapter: LandmarksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landmark)

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recyclerViewLandmarks)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Set up the adapter
        landmarksAdapter = LandmarksAdapter(this, getLandmarksByType())
        recyclerView.adapter = landmarksAdapter
    }

    private fun getLandmarksByType(): List<Landmark> {
        val landmarks = mutableListOf<Landmark>()

        landmarks.add(Landmark("CN Tower", "301 Front St W, Toronto, ON", 43.6426, -79.3871, "Attraction"))
        landmarks.add(Landmark("Royal Ontario Museum", "100 Queens Park, Toronto, ON", 43.6677, -79.3948, "Museum"))
        landmarks.add(Landmark("Air Canada Centre", "40 Bay St, Toronto, ON", 43.6437, -79.3791, "Stadium"))
        landmarks.add(Landmark("Casa Loma", "1 Austin Terrace, Toronto, ON", 43.6780, -79.4094, "Old Building"))

        return landmarks
    }
}
