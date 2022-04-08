package com.example.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isFragmentLoader=true

    val manager=supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


          showFragmentOne()
             showFragmentTwo()
        btn.setOnClickListener{

             if (isFragmentLoader)
                 showFragmentTwo()
             else
            showFragmentOne()
        }


    }

       fun showFragmentOne()

       {
            val transation=manager.beginTransaction()
            val fragmet=FragmentA()
            transation.replace(R.id.framelayout,fragmet)
            transation.addToBackStack(null)
            transation.commit()
            isFragmentLoader=true
        }
        fun showFragmentTwo()
        {
            val transation=manager.beginTransaction()
            val fragmet=FragmentB()
            transation.replace(R.id.framelayout,fragmet)
            transation.addToBackStack(null)
            transation.commit()
            isFragmentLoader=false

        }
    }
