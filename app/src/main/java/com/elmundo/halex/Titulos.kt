package com.elmundo.halex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.widget.Toolbar

class Titulos : AppCompatActivity() {
    val TAG = "com.elmundo.halex.titulos.Apartados";
    val TAG2 = "com.elmundo.halex.titulos.Entrega";
    override fun onCreate(savedInstanceState: Bundle?) {
        var toolbar: Toolbar? = null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_titulos)

        val entrega = intent.getStringExtra("com.elmundo.halex.universo.Entrega")
        toolbar =findViewById(R.id.toolbar)
        toolbar?.title = entrega
        setSupportActionBar(toolbar)

        Toast.makeText(this,entrega,Toast.LENGTH_SHORT).show()
        var apartados:ArrayList<Apartado> =ArrayList()
        apartados.add(Apartado("Historia",R.drawable.hystro))
        apartados.add(Apartado("Misterios",R.drawable.misterios))
        apartados.add(Apartado("Curiosidades",R.drawable.curioso))

        val lista=findViewById<ListView>(R.id.listado)
        val adaptador=AdaptusList(this,apartados)
        lista.adapter=adaptador
        lista.onItemClickListener= AdapterView.OnItemClickListener { parent, view, position, id ->
            when(apartados.get(position).nombre){
                "Historia" -> {
                    val intent = Intent(this, Detalles::class.java)
                    intent.putExtra(TAG, apartados.get(position).nombre)
                    intent.putExtra(TAG2,entrega)
                    startActivity(intent)
                }
                "Misterios" -> {
                    val intent = Intent(this, Detalles::class.java)
                    intent.putExtra(TAG, apartados.get(position).nombre)
                    intent.putExtra(TAG2,entrega)
                    startActivity(intent)
                }
                "Curiosidades" -> {
                    val intent = Intent(this, Detalles::class.java)
                    intent.putExtra(TAG, apartados.get(position).nombre)
                    intent.putExtra(TAG2,entrega)
                    startActivity(intent)
                }
                else -> {
                    Toast.makeText(this,"No hubo", Toast.LENGTH_SHORT).show()
                }
            }

        }
    }
}