package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentB:Fragment()
{
    val TAG="Fragment two"

    override fun onAttach(context: Context)
    {
        Log.d(TAG,"B onAttach")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG,"B onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG,"B onCreateView")
        return inflater!!.inflate(R.layout.fragment_a,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d(TAG,"B onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d(TAG,"B onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"B onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG,"B onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG,"B onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d(TAG,"B onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.d(TAG,"B onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.d(TAG,"B onDetach")
        super.onDetach()
    }


}
