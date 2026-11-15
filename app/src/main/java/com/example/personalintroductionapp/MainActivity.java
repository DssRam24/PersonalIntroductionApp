package com.example.personalintroductionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imgProfile;
    TextView tvStudentName, tvRollNumber, tvBranch, tvSection, tvCgpa, tvLanguage, tvCareerGoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgProfile = findViewById(R.id.imgProfile);
        tvStudentName = findViewById(R.id.tvStudentName);
        tvRollNumber = findViewById(R.id.tvRollNumber);
        tvBranch = findViewById(R.id.tvBranch);
        tvSection = findViewById(R.id.tvSection);
        tvCgpa = findViewById(R.id.tvCgpa);
        tvLanguage = findViewById(R.id.tvLanguage);
        tvCareerGoal = findViewById(R.id.tvCareerGoal);

        // the values come from strings.xml (see the text attribute in the layout)
    }
}
