package com.NextGenDevs.auaf;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String dbName = "AUAFStudentPortal.db";


    List<StaffClassModel> staffClassModelList = new ArrayList<>();


    public DatabaseHelper(Context context) {
        super(context, dbName, null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase myDB) {
        myDB.execSQL("CREATE TABLE users (username TEXT Primary KEY, password TEXT)");
        myDB.execSQL("INSERT INTO users values ('imran.baryalai@auaf.edu.af', 'Shafi4749')");
        myDB.execSQL("INSERT INTO users values ('nasimullah.baryalai@auaf.edu.af', '12345six')");
        myDB.execSQL("INSERT INTO users values ('zahoor.khalil@auaf.edu.af', '12345six')");
        myDB.execSQL("INSERT INTO users values ('baidullah.hazrat@auaf.edu.af', '12345six')");
        myDB.execSQL("INSERT INTO users values ('admin', 'admin')");

        myDB.execSQL("CREATE TABLE staff (staffID INTEGER PRIMARY KEY autoincrement, staffFullName TEXT(50), staffDepartment TEXT(50), staffPosition TEXT(50))");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Dr. Ala Abdulhakim', 'STEM', 'Director and Department Chair')");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Dr. Sami Naji', 'STEM', 'Full-Time Professor')");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Dr. Ahmad Al-Janad', 'STEM', 'Full-Time Professor')");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Prof. Hameeda Hurmat', 'STEM', 'Part-Time and Associate Professor')");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Prof. Ayesha Rawan', 'STEM', 'Part-Time and Associate Professor')");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Prof. Ali Rahman', 'STEM', 'Part-Time and Associate Professor')");
        myDB.execSQL("INSERT INTO staff (staffFullName, staffDepartment, staffPosition) values('Prof. Rahimullah Shinwari', 'STEM', 'Part-Time and Associate Professor')");

    }

    @Override
    public void onUpgrade(SQLiteDatabase myDB, int oldVersion, int newVersion) {
        myDB.execSQL("DROP TABLE IF EXISTS users");
        myDB.execSQL("DROP TABLE IF EXISTS staff");
        onCreate(myDB);
    }

    public Boolean checkUserPass(String username, String password) {
        SQLiteDatabase myDB = this.getWritableDatabase();
        try (Cursor cursor = myDB.rawQuery("SELECT * FROM users WHERE username = ? AND password = ?", new String[]{username, password})) {

            if (cursor.getCount() > 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public List<StaffClassModel> getAllStaff(){

        SQLiteDatabase myDB = this.getWritableDatabase();
        String[] columns = {"staffID", "staffFullName", "staffDepartment", "staffPosition"};
        Cursor cursor = myDB.query("staff", columns, null, null, null,null, null);
        StringBuffer buffer = new StringBuffer();
        while (cursor.moveToNext()){
            int index1 = cursor.getColumnIndex("staffID");
            int staffID = cursor.getInt(index1);
            int index2 = cursor.getColumnIndex("staffFullName");
            String staffName = cursor.getString(index2);
            int index3 = cursor.getColumnIndex("staffDepartment");
            String staffPos = cursor.getString(index3);
            int index4 = cursor.getColumnIndex("staffPosition");
            String staffDept = cursor.getString(index4);

            StaffClassModel staffClassModel = new StaffClassModel(staffID, staffName, staffPos, staffDept);
            staffClassModelList.add(staffClassModel);
        }
        return staffClassModelList;
    }

}
