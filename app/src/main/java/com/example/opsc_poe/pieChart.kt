package com.example.opsc_poe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.utils.ColorTemplate

class pieChart : AppCompatActivity() {

    lateinit var pieChart:PieChart

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_piechart)

        pieChart = findViewById(R.id.pie_chart)

        val list: ArrayList<PieEntry> = ArrayList()

        list.add(PieEntry(100f, "100"))
        list.add(PieEntry(201f, "101"))
        list.add(PieEntry(302f, "102"))
        list.add(PieEntry(403f, "103"))



        val pieDataSet = PieDataSet(list, "Sales")
        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS, 255)

        pieDataSet.valueTextSize = 15f
        pieDataSet.valueTextColor =Color.BLACK
        val pieData = PieData(pieDataSet)
        pieChart.data = pieData

        pieChart.description.text= "pie Chart"
        pieChart.centerText = "List"
        pieChart.animateY(2000)

    }
}