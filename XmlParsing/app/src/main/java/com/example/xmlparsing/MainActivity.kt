package com.example.xmlparsing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserException
import org.xmlpull.v1.XmlPullParserFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var xml_data=assets.open("file1.xml")
        var factory=XmlPullParserFactory.newInstance()
        var parser=factory.newPullParser()
        parser.setInput(xml_data,null)


        var event=parser.eventType
        while (event!=XmlPullParser.END_DOCUMENT)
        {
            var tagName=parser.name
            when(event)
            {
                XmlPullParser.END_TAG ->{
                    if (tagName=="student" ||tagName=="teacher")
                    {
                        var name="\n"+parser.getAttributeName(0)+" "+parser.getAttributeValue(1)
                        editTextTextMultiLine.append(name)
                    }
                }
            }
            event=parser.next()
        }




    }
}