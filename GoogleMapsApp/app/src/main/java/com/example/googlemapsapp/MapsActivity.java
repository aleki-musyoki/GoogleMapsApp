package com.example.googlemapsapp;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        LatLng nairobi = new LatLng(-1.3028618, 36.7073117);
        mMap.addMarker(new MarkerOptions().position(nairobi).title("Marker in Nairobi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(nairobi));

        LatLng kampala = new LatLng(0.3132008, 32.5290852);
        mMap.addMarker(new MarkerOptions().position(kampala).title("Marker in Kampala"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kampala));

        LatLng arusha = new LatLng(-3.3979699, 36.6071726);
        mMap.addMarker(new MarkerOptions().position(arusha).title("Marker in Arusha"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(arusha));

        LatLng lagos = new LatLng(6.5483768, 3.1438743);
        mMap.addMarker(new MarkerOptions().position(lagos).title("Marker in Lagos"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lagos));

    }
}
