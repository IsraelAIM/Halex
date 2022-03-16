package com.elmundo.halex

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptusList(var context: Context, items: ArrayList<Apartado>) : BaseAdapter() {
    var items: ArrayList<Apartado>? = null
    init {
        this.items = items
    }
    override fun getCount(): Int {
        return items?.count()!!
    }
    override fun getItem(p0: Int): Any {
        return items?.get(p0)!!
    }
    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var holder: ViewHolder? = null
        var vista: View? = p1
        if (vista == null) {
            vista = LayoutInflater.from(context).inflate(R.layout.plan_one, null)
            holder = ViewHolder(vista)
            vista.tag = holder
        } else {
            holder = vista.tag as? ViewHolder
        }
        val item = getItem(p0) as Apartado
        holder?.nombre?.text = item.nombre
        holder?.imagen?.setImageResource(item.imagen)
        return vista!!

    }

    private class ViewHolder(vista: View) {
        var nombre: TextView? = null
        var imagen: ImageView? = null

        init {
            nombre = vista.findViewById(R.id.nombre)
            imagen = vista.findViewById(R.id.imagen)
        }


    }
}