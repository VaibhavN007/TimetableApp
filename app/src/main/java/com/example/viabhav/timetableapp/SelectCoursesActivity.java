package com.example.viabhav.timetableapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SelectCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_courses);

        String collegeID = getIntent().getExtras().getString("collegeID") ;
        String dept = getIntent().getExtras().getString("dept");
        String year = getIntent().getExtras().getString("year");
        String collegeName = getIntent().getExtras().getString("collegeName");
        String password = getIntent().getExtras().getString("password");

    }
}
