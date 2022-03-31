package com.NextGenDevs.auaf;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StaffAdapter extends RecyclerView.Adapter<StaffAdapter.ViewHolder> {

    Context context;
    List<StaffClassModel> staffClassModelList;
    RecyclerView recyclerView;
    final View.OnClickListener onClickListener = new MyOnClickListener();

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView staffID;
        TextView staffName;
        TextView staffPos;
        TextView staffDept;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            staffID = itemView.findViewById(R.id.staffIDTV);
            staffName = itemView.findViewById(R.id.staffNameTV);
            staffPos = itemView.findViewById(R.id.staffPosTV);
            staffDept = itemView.findViewById(R.id.staffDeptTV);

        }
    }

    public StaffAdapter(Context context, List<StaffClassModel> staffClassModelList, RecyclerView recyclerView){
        this.context = context;
        this.staffClassModelList = staffClassModelList;
        this.recyclerView = recyclerView;
    }

    @NonNull
    @Override
    public StaffAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_staff_single_view, parent, false);
        view.setOnClickListener(onClickListener);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        StaffClassModel staffClassModel = staffClassModelList.get(position);
        viewHolder.staffID.setText(""+ staffClassModel.getStaffID());
        viewHolder.staffName.setText(staffClassModel.getStaffName());
        viewHolder.staffPos.setText(staffClassModel.getStaffPosition());
        viewHolder.staffDept.setText(staffClassModel.getStaffDepartment());
    }

    @Override
    public int getItemCount() {
        return staffClassModelList.size();
    }


    public static class StaffViewHolder extends RecyclerView.ViewHolder {

        public StaffViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

    private class MyOnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            int itemPosition = recyclerView.getChildLayoutPosition(v);
            String item = staffClassModelList.get(itemPosition).getStaffName();
            Toast.makeText(context, item, Toast.LENGTH_SHORT).show();



        }
    }

}


