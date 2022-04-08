 package com.example.retrofitnetworkcall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Response
import javax.security.auth.callback.Callback

 class MainActivity : AppCompatActivity() {
     lateinit var adaptar: newsAdaptar

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getNews()
    }

    private fun getNews()
    {
        val news=NewsService.newsInstance.getheadLine()
        news.run {
            enqueue(object :retrofit2.Callback<News>{

                override fun onResponse(call: retrofit2.Call<News>, response: Response<News>) {
                  val news=response.body()

                    if(news!=null)
                    {
                        Log.d("Swapnil",news.toString())
                        adaptar= newsAdaptar(this@MainActivity,news.articles)
                        val newsList=findViewById<RecyclerView>(R.id.newsList)
                        newsList.adapter=adaptar
                        newsList.layoutManager=LinearLayoutManager(this@MainActivity)

                    }
                }

                override fun onFailure(call: retrofit2.Call<News>, t: Throwable) {
                    Log.d("Swapnil","ERROR")


                }
            })
        }
    }
}