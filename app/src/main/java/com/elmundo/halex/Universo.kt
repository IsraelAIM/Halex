package com.elmundo.halex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Switch
import android.widget.Toast

class Universo : AppCompatActivity() {
    val TAG = "com.elmundo.halex.universo.Entrega";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_universo)

        var entregas: ArrayList<Entrega> = ArrayList()
        entregas.add(Entrega("Halo Combat Evolved", R.drawable.halo1))
        entregas.add(Entrega("Halo 2", R.drawable.halo22))
        entregas.add(Entrega("Halo 3", R.drawable.halo3))
        entregas.add(Entrega("Halo 4", R.drawable.halo4))
        entregas.add(Entrega("Halo 5", R.drawable.halo5))
        entregas.add(Entrega("Halo Infinite", R.drawable.halo5inf))

        entregas.add(Entrega("Halo 3:ODST", R.drawable.haloodst))
        entregas.add(Entrega("Halo Wars I", R.drawable.wars1))
        entregas.add(Entrega("Halo Wars II", R.drawable.wars2))
        entregas.add(Entrega("Halo Reach", R.drawable.halore))

        val lista = findViewById<GridView>(R.id.columnas)
        val adaptador = AdaptusGrid(this, entregas)
        lista.adapter = adaptador
        lista.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            when (entregas.get(position).nombre) {
                "Halo Combat Evolved" -> {
                    val intent = Intent(this, Titulos::class.java)
                    intent.putExtra(TAG, entregas.get(position).nombre)
                    startActivity(intent)
                }
                "Halo 2" -> {
                    val intent = Intent(this, Titulos::class.java)
                    intent.putExtra(TAG, entregas.get(position).nombre)
                    startActivity(intent)
                }
                "Halo 3" -> {
                    val intent = Intent(this, Titulos::class.java)
                    intent.putExtra(TAG, entregas.get(position).nombre)
                    startActivity(intent)
                }
                "Halo 4" -> {
                    val intent = Intent(this, Titulos::class.java)
                    intent.putExtra(TAG, entregas.get(position).nombre)
                    startActivity(intent)
                }
                "Halo 5" -> {
                    val intent = Intent(this, Titulos::class.java)
                    intent.putExtra(TAG, entregas.get(position).nombre)
                    startActivity(intent)
                }
                "Halo Infinite" -> {
                    val intent = Intent(this, Titulos::class.java)
                    intent.putExtra(TAG, entregas.get(position).nombre)
                    startActivity(intent)
                }
                "Halo 3:ODST" -> {
                    val intent = Intent(this, Titulos::class.java)
                    intent.putExtra(TAG, entregas.get(position).nombre)
                    startActivity(intent)
                }
                "Halo Wars I" -> {
                    val intent = Intent(this, Titulos::class.java)
                    intent.putExtra(TAG, entregas.get(position).nombre)
                    startActivity(intent)
                }
                "Halo Wars II" -> {
                    val intent = Intent(this, Titulos::class.java)
                    intent.putExtra(TAG, entregas.get(position).nombre)
                    startActivity(intent)
                }
                "Halo Reach" -> {
                    val intent = Intent(this, Titulos::class.java)
                    intent.putExtra(TAG, entregas.get(position).nombre)
                    startActivity(intent)
                }
                else -> {
                   Toast.makeText(this,"No hubo", Toast.LENGTH_SHORT).show()
                }

                /*val intent= Intent(this,Titulos::class.java)
                startActivity(intent)*/
            }
        }
    }
}