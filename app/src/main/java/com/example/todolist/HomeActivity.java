package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home); // Make sure home.xml is your layout

        // Find the Lists icon by its ID
        ImageView menuLists = findViewById(R.id.menu_lists);
        menuLists.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, ListActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        // ✅ Find the Calendar icon by its ID
        ImageView menuCalendar = findViewById(R.id.menu_calendar);
        menuCalendar.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, CalendarActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

        // ✅ Find the Mine icon by its ID
        ImageView menuMine = findViewById(R.id.menu_mine);
        menuMine.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, MineActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
        });

    }
}
