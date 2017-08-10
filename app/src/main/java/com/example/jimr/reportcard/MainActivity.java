package com.example.jimr.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public int chemistryGrade;
    public String mathGrade;
    public int historyGrade;
    public double biologyGrade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public int getChemistrygrade() {
        return chemistryGrade;
    }
    public void setChemistryGrade(int grade){
        chemistryGrade = grade;
    }

    public ReportCard() {
        

    }
}
