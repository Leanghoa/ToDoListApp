package com.example.todolist;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list); // Create this layout if not done yet
    }
}
