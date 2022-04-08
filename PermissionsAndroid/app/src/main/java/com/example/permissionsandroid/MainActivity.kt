package com.example.permissionsandroid

import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*
import android.Manifest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnrequest.setOnClickListener{
          requestpermission()
        }


    }

    //function
    private fun hasWriteextrnalStoragePermission()=
        ActivityCompat.checkSelfPermission(this,android.Manifest.permission.WRITE_EXTERNAL_STORAGE)==PackageManager.PERMISSION_GRANTED

    private fun hasLocationForgroundPermission()=

            ActivityCompat.checkSelfPermission(this,android.Manifest.permission.ACCESS_COARSE_LOCATION)==PackageManager.PERMISSION_GRANTED

    private fun hasLocationBackground()=

            ActivityCompat.checkSelfPermission(this,android.Manifest.permission.ACCESS_BACKGROUND_LOCATION)==PackageManager.PERMISSION_GRANTED

        private fun requestpermission() {

             var permissionTORequest= mutableListOf<String>()

            if(!hasWriteextrnalStoragePermission())
            {
                permissionTORequest.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)

            }
            if(!hasLocationForgroundPermission())
            {
                permissionTORequest.add(Manifest.permission.ACCESS_COARSE_LOCATION)

            }

            if(!hasLocationBackground())
            {
                permissionTORequest.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION)

            }

            if(permissionTORequest.isNotEmpty())
            {
                ActivityCompat.requestPermissions(this,permissionTORequest.toTypedArray(),0)

            }
        }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)


        if(requestCode==0 && grantResults.isNotEmpty()) {
          for (i in grantResults.indices)
              {
                if(grantResults[i]==PackageManager.PERMISSION_GRANTED)
                {
                     Log.d("permissionTORequest","${permissions[i]} granted.")
                }

               }
        }

    }
}