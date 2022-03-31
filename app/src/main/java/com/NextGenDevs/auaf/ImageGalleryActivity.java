package com.NextGenDevs.auaf;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ImageGalleryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerViewAdapter recyclerViewAdapter;

    int[] imageArray = {R.drawable.auaf0, R.drawable.auaf1, R.drawable.auaf2, R.drawable.auaf3, R.drawable.auaf4, R.drawable.auaf5, R.drawable.auaf6, R.drawable.auaf7, R.drawable.auaf8, R.drawable.auaf9, R.drawable.auaf10, R.drawable.auaf11, R.drawable.auaf12, R.drawable.auaf13, R.drawable.auaf14, R.drawable.auaf15, R.drawable.auaf16, R.drawable.auaf17, R.drawable.auaf18, R.drawable.auaf19, R.drawable.auaf20, R.drawable.auaf21};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_gallery);

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerViewAdapter = new RecyclerViewAdapter(imageArray);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setHasFixedSize(true);
    }
}