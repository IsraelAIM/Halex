package com.elmundo.halex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Detalles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)
        val apartado = intent.getStringExtra("com.elmundo.halex.titulos.Apartados")
        val entrega = intent.getStringExtra("com.elmundo.halex.titulos.Entrega")
        Toast.makeText(this,apartado+" y "+entrega,Toast.LENGTH_SHORT).show()

    }
}