package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentA:Fragment()
{
    val TAG="Tag"

    override fun onAttach(context: Context)
    {
        Log.d(TAG,"A onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"A onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"A onCreateView")
        return inflater!!.inflate(R.layout.fragment_a,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG,"A onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"A onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"A onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"A onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"A onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG,"A onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG,"A onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG,"A onDetach")
        super.onDetach()
    }


}