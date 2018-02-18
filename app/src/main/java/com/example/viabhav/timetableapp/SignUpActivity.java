package com.example.viabhav.timetableapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class SignUpActivity extends AppCompatActivity {

    final EditText collegeIdEditText = (EditText) findViewById(R.id.collegeIdEditText);
    final Spinner deptSpinner = (Spinner) findViewById(R.id.deptSpinner);
    final Spinner yearSpinner = (Spinner) findViewById(R.id.yearOfStudySpinner);
    final EditText collegeNameEditText = (EditText) findViewById(R.id.collegeNameEditText);
    final EditText password = (EditText) findViewById(R.id.passwordEditText);
    final Button nextBtn = (Button) findViewById(R.id.nextBtn);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), SelectCoursesActivity.class);
                intent.putExtra("collegeID", collegeIdEditText.getText().toString());
                intent.putExtra("dept", deptSpinner.getSelectedItem().toString());
                intent.putExtra("year", yearSpinner.getSelectedItem().toString());
                intent.putExtra("collegeName", collegeNameEditText.getText().toString());
                intent.putExtra("password", password.getText().toString());
                startActivity(intent);
            }
        });
    }
}
