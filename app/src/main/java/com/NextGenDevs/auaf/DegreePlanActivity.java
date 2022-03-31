package com.NextGenDevs.auaf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DegreePlanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree_plan);
    }

    public void itDegreePlanBtn(View view) {

        Intent intent = new Intent(this, DegreePlanPDFOpener.class);
        intent.putExtra("degreePlanName", "IT");
        startActivity(intent);

    }

    public void polDegreePlanBtn(View view) {
        Intent intent = new Intent(this, DegreePlanPDFOpener.class);
        intent.putExtra("degreePlanName", "POL");
        startActivity(intent);
    }

    public void lawDegreePlan(View view) {
        Intent intent = new Intent(this, DegreePlanPDFOpener.class);
        intent.putExtra("degreePlanName", "LAW");
        startActivity(intent);
    }

    public void bbaDegreePlanBtn(View view) {
        Intent intent = new Intent(this, DegreePlanPDFOpener.class);
        intent.putExtra("degreePlanName", "BBA");
        startActivity(intent);
    }

    public void mbaDegreePlanBtn(View view) {
        Intent intent = new Intent(this, DegreePlanPDFOpener.class);
        intent.putExtra("degreePlanName", "MBA");
        startActivity(intent);
    }
}