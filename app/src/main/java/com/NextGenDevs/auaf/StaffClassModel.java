package com.NextGenDevs.auaf;

public class StaffClassModel {

    private long staffID;
    private String staffName;
    private String staffPosition;
    private String staffDepartment;

    public StaffClassModel(long staffID, String staffName, String staffPosition, String staffDepartment) {
        this.staffID = staffID;
        this.staffName = staffName;
        this.staffPosition = staffPosition;
        this.staffDepartment = staffDepartment;
    }

    public long getStaffID() {
        return staffID;
    }

    public void setStaffID(long staffID) {
        this.staffID = staffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public String getStaffDepartment() {
        return staffDepartment;
    }

    public void setStaffDepartment(String staffDepartment) {
        this.staffDepartment = staffDepartment;
    }
}
