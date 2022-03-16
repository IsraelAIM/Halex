package com.elmundo.halex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class Titulos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_titulos)

        var entregas:ArrayList<Entrega> =ArrayList()
        entregas.add(Entrega("Halo Combat Evolved",R.drawable.halo1))
        entregas.add(Entrega("Halo 2",R.drawable.halo2))
        entregas.add(Entrega("Halo 3",R.drawable.halo3))
        entregas.add(Entrega("Halo 4",R.drawable.halo4))
        entregas.add(Entrega("Halo 5",R.drawable.halo5))
        entregas.add(Entrega("Halo Infinite",R.drawable.halo5inf))

        val lista=findViewById<GridView>(R.id.columnas)
        val adaptador=AdaptusGrid(this,entregas)
        lista.adapter=adaptador
        lista.onItemClickListener= AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,entregas.get(position).nombre, Toast.LENGTH_SHORT).show()
        }
    }
}