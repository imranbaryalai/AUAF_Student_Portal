package com.NextGenDevs.auaf;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    AppCompatButton loginBtn;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.usernameInput);
        password = findViewById(R.id.passwordInput);
        loginBtn = findViewById(R.id.loginBtn);
        db = new DatabaseHelper(this);

        loginBtn.setOnClickListener(v -> {
            String usernameData = username.getText().toString();
            String passwordData = password.getText().toString();
            if (usernameData.equals("") | passwordData.equals("")){
                Toast.makeText(LoginActivity.this, "Please Enter All Fields!", Toast.LENGTH_SHORT).show();
            } else {
                Boolean checkuserpass = db.checkUserPass(usernameData, passwordData);
                if (checkuserpass) {
                    Toast.makeText(LoginActivity.this, "Sign in Successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainDashboard.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Invalid Username and/or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void openFB(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(browserIntent);
    }

    public void openInsta(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"));
        startActivity(browserIntent);
    }

    public void openTwitter(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/"));
        startActivity(browserIntent);
    }

    public void openLinkedIn(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
        startActivity(browserIntent);
    }
}