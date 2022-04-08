package com.example.userlocation

import android.Manifest
import android.content.pm.PackageManager
import android.location.Location
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

class MainActivity : AppCompatActivity() {
    private lateinit var  fusedLocationProviderClient:FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initLocationProviderClient()
        setButtionClicedListener()
    }

    private fun setButtionClicedListener() {
        val getLocationbtn=findViewById<Button>(R.id.getLocationbtn)
        getLocationbtn.setOnClickListener{
            getuserLocation()
        }
    }
    private fun getuserLocation() {
            if(ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)!=PackageManager.PERMISSION_GRANTED){
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),1)
                return

            }
        else
            {
                fusedLocationProviderClient.lastLocation.addOnSuccessListener { location:Location?->
                    val latitudeTV=findViewById<TextView>(R.id.latitudeTV)
                    val Logitute=findViewById<TextView>(R.id.Logitute)

                    latitudeTV.text="Latitude:"+location?.latitude
                    Logitute.text="Logitute:"+location?.longitude
                }
            }

    }

    private fun initLocationProviderClient() {
        fusedLocationProviderClient=LocationServices.getFusedLocationProviderClient(this)

    }
}