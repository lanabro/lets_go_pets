package com.example.letsgopets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory


class MapActivity : AppCompatActivity(), OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)


        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }
    override fun onMapReady(googleMap: GoogleMap) {
        val dogIcon: BitmapDescriptor = BitmapDescriptorFactory.fromResource(R.drawable.icons_dog)
        // точка геолокации
        val location = LatLng(-34.0, 151.0) // Пример координат
        googleMap.addMarker(MarkerOptions().position(location).title("Питомец находится здесь").icon(dogIcon))
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(location))
    }
}