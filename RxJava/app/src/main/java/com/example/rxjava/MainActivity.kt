package com.example.rxjava

import android.database.Observable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        io.reactivex.rxjava3.core.Observable.fromArray("Swapnil","Ram","Kishan")
            .unsubscribeOn(Schedulers.newThread())
            .filter { item->item=="Swapnil"}
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe { onNext->TextView.text=onNext }






    }
}