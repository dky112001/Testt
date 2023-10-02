package com.example.testt

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class CustomAdapter(val context: Context,val ListArray:ArrayList<Listmodel>):BaseAdapter(){
    override fun getCount(): Int {
        return ListArray.size
    }

    override fun getItem(p0: Int): Any {
        return ListArray[p0]
    }

    override fun getItemId(p0: Int): Long {
       return p0.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
       val layout=LayoutInflater.from(context).inflate(R.layout.listkotlin,null,false)
        val image=layout.findViewById<ImageView>(R.id.image1)
        val text11 = layout. findViewById<TextView>(R.id.text1)
       val address = layout. findViewById<TextView>(R.id.addres1)

        image.setImageResource(ListArray[p0].image)
        text11.text=ListArray[p0].name
        address.text=ListArray[p0].address



        return layout
    }

}

//
//class CustomAdapter (val context: Context, val ListArray:ArrayList<Listmodel>): BaseAdapter() {
//    override fun getCount(): Int {
//        return ListArray.size
//    }
//
//    override fun getItem(p0: Int): Any {
//        return ListArray [p0]
//    }
//
//    override fun getItemId(p0: Int): Long {
//        return p0.toLong()
//    }
//
//    @SuppressLint("ViewHolder")
//    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
//
//        val layout= LayoutInflater.from(context).inflate(R.layout.listkotlin,null,false)
//        val image = layout.findViewById<ImageView>(R.id.image1)
//        val text11 = layout. findViewById<TextView>(R.id.text1)
//        val address = layout. findViewById<TextView>(R.id.addres1)
//
//        image.setImageResource(ListArray[p0].image)
//        text11.text = ListArray[p0].name
//        address.text = ListArray[p0].address
//        return  layout
//
//
//    }
//}