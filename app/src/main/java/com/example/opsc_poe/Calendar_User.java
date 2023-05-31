package com.example.opsc_poe;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.CalendarView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import android.os.Bundle;
import java.time.LocalDate;
import java.util.Calendar;

public class Calendar_User extends AppCompatActivity {

    CalendarView calendarView;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendarView = findViewById(R.id.calendarView);
        calendar = Calendar.getInstance();

        int c_day = LocalDate.now().getDayOfMonth();
        int c_mont=LocalDate.now().getMonthValue();
        int c_year= LocalDate.now().getYear();
        setDate(c_day,c_mont,c_year);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                Toast.makeText(Calendar_User.this, day + "/" + month + "/" + year, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setDate(int day, int month, int year)
    {
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH,day);
        long milli = calendar.getTimeInMillis();
        calendarView.setDate(milli);


    }
}