package com.NextGenDevs.auaf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class StaffActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    RecyclerView recyclerView;
    StaffAdapter staffAdapter;
    RecyclerView.LayoutManager layoutManager;
    List<StaffClassModel> staffClassModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);

        databaseHelper = new DatabaseHelper(this);
        staffClassModelList = databaseHelper.getAllStaff();
        recyclerView = findViewById(R.id.staffRecyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        staffAdapter = new StaffAdapter(this, staffClassModelList, recyclerView);
        recyclerView.setAdapter(staffAdapter);
    }
}