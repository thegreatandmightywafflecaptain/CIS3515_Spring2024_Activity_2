package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        /* TODO Step 1: Populate this array */
        var numberArray = Array(50, {0})
        var counter : Int = 0
        for(i in 2..100){
            if(i % 2 == 0){
                Log.d("Number", i.toString())
                numberArray[counter] = i
                counter = counter + 1
            }
        }

        //Log.d("Output", numberArray.toString())

        /* TODO Step 2: Create adapter to display items from array in Spinner */
        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, numberArray)
        spinner.adapter = adapter


        // TODO Step 3: Change TextView's text size to the number selected in the Spinner */
        //spinner.onItemSelectedListener = object: ...

    }
}