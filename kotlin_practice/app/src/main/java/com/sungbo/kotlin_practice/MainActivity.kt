package com.sungbo.kotlin_practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.button)

        button.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                TODO("Not yet implemented")
            }

        } )

        // 1. kotlin interface 가 아닌 자바 인터페이스여야한다.
        // 2. 그 인터페이스는 딱 하나의 메소드만 가져야 한다.
        button.setOnClickListener {
            //  to do ..

        }
    }


}