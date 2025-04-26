package com.example.todolist;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TopMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);  // Ensure 'home' layout contains iconManageCategory

        // Find the ImageView by ID
        ImageView manageCategoryIcon = findViewById(R.id.ManageCategory);  // Use the correct ID for the ImageView

        // Check if the ImageView is found
        if (manageCategoryIcon != null) {
            manageCategoryIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Create a PopupMenu
                    PopupMenu popupMenu = new PopupMenu(TopMenuActivity.this, v);
                    popupMenu.getMenuInflater().inflate(R.menu.top_menu, popupMenu.getMenu());

                    // Set a listener for menu item clicks
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            int id = item.getItemId();
                            if (id == R.id.menu_manage_category) {
                                // Handle the "Manage Category" action
                                Toast.makeText(TopMenuActivity.this, "Manage Category clicked", Toast.LENGTH_SHORT).show();
                                return true;
                            } else if (id == R.id.menu_search) {
                                // Handle the "Search" action
                                Toast.makeText(TopMenuActivity.this, "Search clicked", Toast.LENGTH_SHORT).show();
                                return true;
                            }
                            return false;
                        }
                    });

                    // Show the popup menu
                    popupMenu.show();
                }
            });
        } else {
            // Log error or handle gracefully if ImageView is not found
            Toast.makeText(this, "Icon not found", Toast.LENGTH_SHORT).show();
        }
    }
}
