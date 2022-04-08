package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val songs= listOf<String>("hello","ABC","JGGG","JGGG","JGGG","JGGG","JGGG","JGGG","JGGG","hello","ABC","JGGG","JGGG","JGGG","JGGG","JGGG","JGGG","JGGG")

        val des= listOf<String>("you","are","done","swapnil","Nangare","c","a","b","c","a","b","c","a","b","c","a","b","c","a","b","c","a","b","c","a","b","c")

        songList.adapter=MyAdapter(songs,des)


        songList.layoutManager=LinearLayoutManager(this)



    }
}