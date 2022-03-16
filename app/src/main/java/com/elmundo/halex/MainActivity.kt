package com.elmundo.halex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val entrada=findViewById<Button>(R.id.btnEntrar)

        entrada.setOnClickListener(View.OnClickListener {
            val intent=Intent(this,Universo::class.java)
            startActivity(intent)
        })
    }
}