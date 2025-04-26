package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MineActivity extends AppCompatActivity {

    private ImageView profileImageView;
    private TextView planStatusTextView, loginTextView;
    private TextView completedTasksCountTextView, pendingTasksCountTextView;

    private ImageView menuLists, menuCalendar, menuTasks, menuMine;
    private FloatingActionButton fabAddTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mine); // Your XML layout name

        // Top part
        profileImageView = findViewById(R.id.profileImageView);
        planStatusTextView = findViewById(R.id.planStatusTextView);
        loginTextView = findViewById(R.id.loginTextView);
        completedTasksCountTextView = findViewById(R.id.completedTasksCountTextView);
        pendingTasksCountTextView = findViewById(R.id.pendingTasksCountTextView);

        // Bottom menu
        menuLists = findViewById(R.id.menu_lists);
        menuCalendar = findViewById(R.id.menu_calendar);
        menuTasks = findViewById(R.id.menu_tasks);
        menuMine = findViewById(R.id.menu_mine);
        fabAddTask = findViewById(R.id.fabAddTask);

        // Example dynamic values
        completedTasksCountTextView.setText("5");
        pendingTasksCountTextView.setText("2");

        // Click listeners
        loginTextView.setOnClickListener(v -> {
            Toast.makeText(MineActivity.this, "Login clicked!", Toast.LENGTH_SHORT).show();
            // Intent to LoginActivity if needed
            // startActivity(new Intent(MineActivity.this, LoginActivity.class));
        });

        profileImageView.setOnClickListener(v ->
                Toast.makeText(MineActivity.this, "Profile clicked!", Toast.LENGTH_SHORT).show()
        );

        menuLists.setOnClickListener(v -> {
            Toast.makeText(MineActivity.this, "Lists clicked!", Toast.LENGTH_SHORT).show();
            // You could navigate to ListsActivity
            // startActivity(new Intent(MineActivity.this, ListsActivity.class));
        });

        menuCalendar.setOnClickListener(v -> {
            Toast.makeText(MineActivity.this, "Calendar clicked!", Toast.LENGTH_SHORT).show();
            // startActivity(new Intent(MineActivity.this, CalendarActivity.class));
        });

        menuTasks.setOnClickListener(v -> {
            Toast.makeText(MineActivity.this, "Tasks clicked!", Toast.LENGTH_SHORT).show();
            // startActivity(new Intent(MineActivity.this, TasksActivity.class));
        });

        menuMine.setOnClickListener(v -> {
            Toast.makeText(MineActivity.this, "Already in Mine!", Toast.LENGTH_SHORT).show();
            // You are already in MineActivity
        });

        fabAddTask.setOnClickListener(v -> {
            Toast.makeText(MineActivity.this, "Add Task clicked!", Toast.LENGTH_SHORT).show();
            // startActivity(new Intent(MineActivity.this, AddTaskActivity.class));
        });
    }
}
