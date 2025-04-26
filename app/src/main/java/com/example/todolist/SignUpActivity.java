package com.example.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    EditText fullName, email, password, confirmPassword;
    Button signUpBtn;
    TextView signInLink, skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        fullName = findViewById(R.id.fullName);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confirmPassword = findViewById(R.id.confirmPassword);
        signUpBtn = findViewById(R.id.signUpBtn);
        signInLink = findViewById(R.id.signInLink);
        skip = findViewById(R.id.skip);

        signUpBtn.setOnClickListener(v -> {
            String name = fullName.getText().toString().trim();
            String mail = email.getText().toString().trim();
            String pass = password.getText().toString();
            String confirmPass = confirmPassword.getText().toString();

            if (name.isEmpty() || mail.isEmpty() || pass.isEmpty() || confirmPass.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else if (!pass.equals(confirmPass)) {
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Signed Up Successfully!", Toast.LENGTH_SHORT).show();

                // Go to HomeActivity
                Intent intent = new Intent(SignUpActivity.this, HomeActivity.class);
                startActivity(intent);
                finish(); // Optional: close the sign up screen
            }
        });

        signInLink.setOnClickListener(v -> {
            Toast.makeText(this, "Go to Sign In screen", Toast.LENGTH_SHORT).show();
            // Intent to SignInActivity
        });

        skip.setOnClickListener(v -> {
            Toast.makeText(this, "Skipping sign-up", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(SignUpActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        });

        signInLink.setOnClickListener(v -> {
            Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
            startActivity(intent);
        });

    }
}
