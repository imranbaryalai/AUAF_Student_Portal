package com.NextGenDevs.auaf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class DegreePlanPDFOpener extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree_plan_pdfopener);

        pdfView = findViewById(R.id.pdfViewer);
        String degreePlan = getIntent().getStringExtra("degreePlanName");

        switch (degreePlan) {
            case "IT":
                pdfView.fromAsset("bs-itcs-degree-plan.pdf").load();
                break;

            case "POL":
                pdfView.fromAsset("ba-pol-degree-plan.pdf").load();
                break;

            case "BBA":
                pdfView.fromAsset("bba-degree-plan.pdf").load();
                break;

            case "LAW":
                pdfView.fromAsset("bl-degree-plan.pdf").load();
                break;

            case "MBA":
                pdfView.fromAsset("mba-degree-plan.pdf").load();
                break;
        }

    }
}