package com.example.permissionsatruntime

import android.content.DialogInterface
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity()
{


    var FINE_Location_RQ=1
    var Camare_RQ=2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnTab()


    }

private fun btnTab()
{

    val locationbtn=findViewById<Button>(R.id.locationbtn)
    val camarabtn=findViewById<Button>(R.id.camarabtn)

    locationbtn.setOnClickListener{
checkForPermission(android.Manifest.permission.ACCESS_FINE_LOCATION,"Location",FINE_Location_RQ)
    }

camarabtn.setOnClickListener{
checkForPermission(android.Manifest.permission.CAMERA,"camera",Camare_RQ)
    }



}


    private fun checkForPermission(permission:String,name:String,requestCode:Int)
    {
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M)
        {
            when{
                ContextCompat.checkSelfPermission(applicationContext,permission)==PackageManager.PERMISSION_GRANTED ->
                {
                    Toast.makeText(applicationContext,"$name permission granted",Toast.LENGTH_SHORT).show()
                }
                shouldShowRequestPermissionRationale(permission)->showDialog(permission,name,requestCode)
                else->ActivityCompat.requestPermissions(this, arrayOf(permission),requestCode)

            }

        }

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        fun innerCheck(name: String)
        {
            if (grantResults.isNotEmpty() ||  grantResults[0]!=PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(applicationContext,"$name permission refused",Toast.LENGTH_SHORT).show()
            }else
            {
                Toast.makeText(applicationContext,"$name permission granted",Toast.LENGTH_SHORT).show()
            }
        }
        when(requestCode){
            FINE_Location_RQ->innerCheck("location")
            Camare_RQ->innerCheck("Camera")
        }
    }

     private fun showDialog(permission: String,name: String,requestCode: Int)
     {

            val builder=AlertDialog.Builder(this)
         builder.apply {
             setMessage("Permission to access your $name is required to use this app ")
             setTitle("Permission Required")
             setPositiveButton("Ok"){ dialogInterface: DialogInterface, i: Int ->
                 ActivityCompat.requestPermissions(this@MainActivity, arrayOf(permission),requestCode)
             }

         }

         val dialog=builder.create()
         dialog.show()

     }
}