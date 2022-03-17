package com.elmundo.halex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView

class Titulos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_titulos)

        var apartados:ArrayList<Apartado> =ArrayList()
        apartados.add(Apartado("Historia",R.drawable.hystro))
        apartados.add(Apartado("Misterios",R.drawable.misterios))
        apartados.add(Apartado("Curiosidades",R.drawable.curioso))

        val lista=findViewById<ListView>(R.id.listado)
        val adaptador=AdaptusList(this,apartados)
        lista.adapter=adaptador
        lista.onItemClickListener= AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent= Intent(this,Detalles::class.java)
            startActivity(intent)
        }
    }
}