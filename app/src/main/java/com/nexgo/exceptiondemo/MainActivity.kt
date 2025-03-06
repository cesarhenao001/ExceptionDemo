package com.nexgo.exceptiondemo

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnJavaCrash:Button = findViewById(R.id.btn_java_crash);

        btnJavaCrash.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                Log.d("MAIN","btnJavaCrash")
                val c = 10 / 0
            }

        })
        val btnANRCrash:Button = findViewById(R.id.btn_anr_crash);

        btnANRCrash.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                Log.d("MAIN","btnANRCrash")
                Thread.sleep(1000000);
            }

        })

    }
}