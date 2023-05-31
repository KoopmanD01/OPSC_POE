package com.example.opsc_poe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import com.github.mikephil.charting.data.PieEntry


class Timesheet : AppCompatActivity() {


     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timesheet)

        val addButton =findViewById<Button>(R.id.add_timesheet)
       val tableLayout = findViewById<TableLayout>(R.id.tableLayout)


          //val category = "App Development"
         //val description = "Weather App"
         //val date = "01/02/2023"

        addButton.setOnClickListener{
            val tableRow1 = LayoutInflater.from(this).inflate(R.layout.table_row, null) as TableRow
            tableRow1.findViewById<TextView>(R.id.nameTextView).setText("App Development")
            tableRow1.findViewById<TextView>(R.id.numberTextView).setText("Weather App")
            tableRow1.findViewById<TextView>(R.id.emailTextView).setText("01/02/2023")
            tableLayout.addView(tableRow1)
            val tableRow2 = LayoutInflater.from(this).inflate(R.layout.table_row, null) as TableRow
            tableRow2.findViewById<TextView>(R.id.nameTextView).setText("Database")
            tableRow2.findViewById<TextView>(R.id.numberTextView).setText("Database Management")
            tableRow2.findViewById<TextView>(R.id.emailTextView).setText("03/05/2023")
            tableLayout.addView(tableRow2)
            val tableRow3 = LayoutInflater.from(this).inflate(R.layout.table_row, null) as TableRow
            tableRow3.findViewById<TextView>(R.id.nameTextView).setText("Cloud Development")
            tableRow3.findViewById<TextView>(R.id.numberTextView).setText("Azure Services")
            tableRow3.findViewById<TextView>(R.id.emailTextView).setText("06/07/2023")
            tableLayout.addView(tableRow3)
            val tableRow4 = LayoutInflater.from(this).inflate(R.layout.table_row, null) as TableRow
            tableRow4.findViewById<TextView>(R.id.nameTextView).setText("Cyper Security")
            tableRow4.findViewById<TextView>(R.id.numberTextView).setText("Implement Company Protocols")
            tableRow4.findViewById<TextView>(R.id.emailTextView).setText("05/10/2023")
            tableLayout.addView(tableRow4)
        }





        //val addButton = findViewById<Button>(R.id.addButton)
        //val nameEditText = findViewById<EditText>(R.id.nameEditText)
       // val numberEditText = findViewById<EditText>(R.id.numberEditText)
        //val emailEditText = findViewById<EditText>(R.id.emailEditText)
       // val tableLayout = findViewById<TableLayout>(R.id.tableLayout)


       // addButton.setOnClickListener {
            //val name = nameEditText.text.toString()
           // val number = numberEditText.text.toString()
           // val email = emailEditText.text.toString()

           // val tableRow = LayoutInflater.from(this).inflate(R.layout.table_row, null) as TableRow
           // tableRow.findViewById<TextView>(R.id.nameTextView).setText(number)
           // tableRow.findViewById<TextView>(R.id.numberTextView).setText(name)
           // tableRow.findViewById<TextView>(R.id.emailTextView).setText(email)

          //  val removeButton = tableRow.findViewById<TableRow>(R.id.removeButton)

           // removeButton.setOnClickListener {
              //  tableLayout.removeView(tableRow)
           // }

            //tableLayout.addView(tableRow)

        //}

    }
}