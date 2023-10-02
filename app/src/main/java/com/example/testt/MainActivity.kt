package com.example.testt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listv = findViewById<ListView>(R.id.Listview)

        val stlist = arrayListOf(
            Listmodel(R.drawable.depk1, "Deepak Kumar","paharpur"),
            Listmodel(R.drawable.deepak22, "Ravi Kumar", "Dighwara"),
            Listmodel(R.drawable.depk1, "Amit Kumar", "Amnour"),
            Listmodel(R.drawable.depk1, "Deepak Kumar", "Sekhpura"),
            Listmodel(R.drawable.deepak22, "Ravi Kumar", "Dighwara"),
            Listmodel(R.drawable.depk1, "Amit Kumar", "Amnour"),
            Listmodel(R.drawable.depk1, "Deepak Kumar", "Sekhpura"),
            Listmodel(R.drawable.deepak22, "Ravi Kumar", "Dighwara"),
            Listmodel(R.drawable.depk1, "Amit Kumar", "Amnour"),
            Listmodel(R.drawable.depk1, "Deepak Kumar", "Sekhpura"),
            Listmodel(R.drawable.deepak22, "Ravi Kumar", "Dighwara"),
            Listmodel(R.drawable.depk1, "Amit Kumar", "Amnour"),
            Listmodel(R.drawable.depk1, "Deepak Kumar", "Sekhpura"),
            Listmodel(R.drawable.deepak22, "Ravi Kumar", "Dighwara"),
            Listmodel(R.drawable.depk1, "Amit Kumar", "Amnour"),
            Listmodel(R.drawable.depk1, "Deepak Kumar", "Sekhpura"),
            Listmodel(R.drawable.deepak22, "Ravi Kumar", "Dighwara"),
            Listmodel(R.drawable.depk1, "Amit Kumar", "Amnour"),
            Listmodel(R.drawable.depk1, "Deepak Kumar", "Sekhpura"),
            Listmodel(R.drawable.deepak22, "Ravi Kumar", "Dighwara"),
            Listmodel(R.drawable.depk1, "Amit Kumar", "Amnour")


        )
        val customAdapter = CustomAdapter(this, stlist)
        listv.adapter = customAdapter

    }
}