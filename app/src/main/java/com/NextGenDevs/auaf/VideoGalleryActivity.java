package com.NextGenDevs.auaf;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class VideoGalleryActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    VideoGalleryAdapter videoGalleryAdapter;

    String videoPath1 = "android.resource://com.NextGenDevs.auaf/" + R.raw.auaf1;
    String videoPath2 = "android.resource://com.NextGenDevs.auaf/" + R.raw.auaf2;
    String videoPath3 = "android.resource://com.NextGenDevs.auaf/" + R.raw.auaf3;

    String[] videoArray = {videoPath1, videoPath2, videoPath3};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_gallery);

        recyclerView = findViewById(R.id.videoRecyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        videoGalleryAdapter = new VideoGalleryAdapter(this, videoArray);

        recyclerView.setAdapter(videoGalleryAdapter);
        recyclerView.setHasFixedSize(true);

        MediaController mediaController = new MediaController(this);



    }

}