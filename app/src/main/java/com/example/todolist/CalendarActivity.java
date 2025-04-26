package com.example.todolist;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class CalendarActivity extends AppCompatActivity {

    private TextView textViewMonthYear;
    private GridView gridViewCalendar;
    private ImageButton buttonPreviousMonth, buttonNextMonth;
    private Calendar calendar;
    private int currentMonth, currentYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

        textViewMonthYear = findViewById(R.id.textViewMonthYear);
        gridViewCalendar = findViewById(R.id.calendarGridView);
        buttonPreviousMonth = findViewById(R.id.buttonPreviousMonth);
        buttonNextMonth = findViewById(R.id.buttonNextMonth);

        // Initialize the calendar instance
        calendar = Calendar.getInstance();
        currentMonth = calendar.get(Calendar.MONTH);
        currentYear = calendar.get(Calendar.YEAR);

        // Set the current month and year on the TextView
        updateMonthYear();

        // Button to navigate to the previous month
        buttonPreviousMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Decrease the current month
                calendar.add(Calendar.MONTH, -1);
                currentMonth = calendar.get(Calendar.MONTH);
                currentYear = calendar.get(Calendar.YEAR);
                updateMonthYear();
                updateCalendar();
            }
        });

        // Button to navigate to the next month
        buttonNextMonth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Increase the current month
                calendar.add(Calendar.MONTH, 1);
                currentMonth = calendar.get(Calendar.MONTH);
                currentYear = calendar.get(Calendar.YEAR);
                updateMonthYear();
                updateCalendar();
            }
        });

        // Initially populate the calendar
        updateCalendar();
    }

    // Method to update the Month and Year TextView
    private void updateMonthYear() {
        String month = getMonthName(currentMonth);
        textViewMonthYear.setText(month + " " + currentYear);
    }

    // Get the month name from the calendar month index
    private String getMonthName(int monthIndex) {
        String[] months = getResources().getStringArray(R.array.months);
        return months[monthIndex];
    }

    // Method to populate the calendar GridView with dates
    private void updateCalendar() {
        // Get the first day of the month
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        // Get the day of the week for the first day of the month
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Get the total number of days in the current month
        int totalDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        // Calculate the number of empty spaces before the first day
        int emptySpaces = firstDayOfWeek - 1;

        // Create a grid of dates
        String[] dates = new String[42]; // 6 weeks (7 days in a week)
        for (int i = 0; i < emptySpaces; i++) {
            dates[i] = ""; // Empty spaces
        }
        for (int i = 0; i < totalDaysInMonth; i++) {
            dates[emptySpaces + i] = String.valueOf(i + 1); // Days of the month
        }

        // Set the grid adapter
        CalendarAdapter adapter = new CalendarAdapter(this, dates);
        gridViewCalendar.setAdapter(adapter);
    }
}
