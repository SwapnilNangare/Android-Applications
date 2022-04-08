package com.example.jsonparseing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONException
import org.json.JSONObject
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.MalformedURLException
import java.net.URL


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val url: URL? = try {
            URL("https://pastebin.com/raw/2bW31yqa")
        }catch (e: MalformedURLException){
            Log.d("Exception", e.toString())
            null
        }

        // download json data and parse it and display in text view
        button.setOnClickListener {
            url?.let { textView.text = it.toString() }

            // io dispatcher for networking operation
            lifecycleScope.launch(Dispatchers.IO){
                url?.getString()?.apply {

                    // default dispatcher for json parsing, cpu intensive work
                    withContext(Dispatchers.Default){
                        val list = parseJson(this@apply)

                        // main dispatcher for interaction with ui objects
                        withContext(Dispatchers.Main){
                            textView.append("\n\nReading data from json....\n")

                            list?.forEach {
                                textView.append("\n${it.firstName}" +
                                        " ${it.lastName} ${it.age}")
                            }

                        }

                    }
                }
            }
        }

    }
}


// extension function to get string data from url
fun URL.getString(): String? {
    val stream = openStream()
    return try {
        val r = BufferedReader(InputStreamReader(stream))
        val result = StringBuilder()
        var line: String?
        while (r.readLine().also { line = it } != null) {
            result.append(line).appendln()
        }
        result.toString()
    }catch (e: IOException){
        e.toString()
    }
}


// data class to hold student instance
data class Student(
    val firstName:String,
    val lastName:String,
    val age:Int
)


// parse json data
fun parseJson(data:String):List<Student>?{
    val list = mutableListOf<Student>()

    try {
        val array = JSONObject(data).getJSONArray("students")
        for(i in 0 until array.length()){
            val obj = JSONObject(array[i].toString())
            val firstName = obj.getString("firstname")
            val lastName = obj.getString("lastname")
            val age = obj.getInt("age")
            list.add(Student(firstName,lastName,age))
        }
    }
    catch (e: JSONException){
        Log.d("Exception", e.toString())
    }

    return list
}