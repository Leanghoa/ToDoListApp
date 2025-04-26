package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        Button signInBtn = findViewById(R.id.signInBtn);
        TextView signUpLink = findViewById(R.id.signUpLink);
        TextView skip = findViewById(R.id.skip); // Make sure this ID exists in your signin.xml

        signInBtn.setOnClickListener(v -> {
            Toast.makeText(this, "Signed In Successfully!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });

        signUpLink.setOnClickListener(v -> {
            Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
            startActivity(intent);
        });

        skip.setOnClickListener(v -> {
            Toast.makeText(this, "Skipping sign in", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
