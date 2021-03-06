package com.example.fragmentusinginterface

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentusinginterface.fragment.FragmentA
import com.example.fragmentusinginterface.fragment.FragmentB

class MainActivity : AppCompatActivity(),Commuicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentA=FragmentA()
        supportFragmentManager.beginTransaction().replace(R.id.fragmetcontenar,fragmentA).commit()
    }

      override fun passdata(editTextInput: String) {
      val bundle=Bundle()
        bundle.putString("message",editTextInput)
        val transaction=this.supportFragmentManager.beginTransaction()
        val fragmentB=FragmentB()
        fragmentB.arguments=bundle
          transaction.replace(R.id.fragmetcontenar,fragmentB)
         transaction.commit()
    }
}