package com.example.colourmview

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListner()
    }

    private fun setListner() {
        val clicklabView: List<View> = listOf(one, two, three, four,box_one_text,textView2,
            red_btn,yello_btn,grn_btn)

        for (item in clicklabView) {
            item.setOnClickListener {
                mackColoured(it)

            }

        }

    }

    @SuppressLint("ResourceAsColor")
    private fun mackColoured(view: View) {
        when (view.id) {
            R.id.one -> view.setBackgroundColor(Color.RED)
            R.id.two -> view.setBackgroundColor(Color.DKGRAY)
            R.id.three -> view.setBackgroundColor(Color.LTGRAY)
            R.id.four ->  view.setBackgroundColor(Color.CYAN)
            R.id.box_one_text ->view.setBackgroundColor(Color.YELLOW)
            R.id.textView2->view.setBackgroundColor(Color.MAGENTA)

            R.id.red_btn ->two.setBackgroundColor(Color.RED)
            R.id.yello_btn ->three.setBackgroundColor(Color.YELLOW)
            R.id.grn_btn ->four.setBackgroundColor(Color.GREEN)

        }

    }

}