package com.NextGenDevs.auaf;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);


    }

    public void photoGalleryOnclick(View view) {
        Intent intent = new Intent(MainDashboard.this, ImageGalleryActivity.class);
        startActivity(intent);
    }

    public void videoGalleryOnClick(View view) {
        Intent intent = new Intent(MainDashboard.this, VideoGalleryActivity.class);
        startActivity(intent);
    }

    public void degreePlanOnClick(View view) {

        Intent intent = new Intent(MainDashboard.this, DegreePlanActivity.class);
        startActivity(intent);

    }

    public void staffOnClick(View view) {
        Intent intent = new Intent(MainDashboard.this, StaffActivity.class);
        startActivity(intent);
    }

    public void findUsOnClick(View view) {
        Intent intent = new Intent(MainDashboard.this, followActivity.class);
        startActivity(intent);
    }

    public void logoutOnClick(View view) {
        Intent intent = new Intent(MainDashboard.this, LoginActivity.class);
        startActivity(intent);
    }
}