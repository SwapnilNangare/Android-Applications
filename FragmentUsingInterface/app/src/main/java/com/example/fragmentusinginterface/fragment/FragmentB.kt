package com.example.fragmentusinginterface.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentusinginterface.R
import kotlinx.android.synthetic.main.fragment_b.view.*


class FragmentB : Fragment() {

    var displayMessage:String?=""


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {



        val view= inflater.inflate(R.layout.fragment_b, container, false)

        displayMessage=arguments?.getString("message")
        view.displaymsg.text=displayMessage
        return view
    }
}

