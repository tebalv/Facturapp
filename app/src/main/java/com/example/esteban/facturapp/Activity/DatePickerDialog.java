package com.example.esteban.facturapp.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;


import com.example.esteban.facturapp.R;

import java.util.Date;

public class CalendarActivity extends AppCompatActivity {

private DatePicker datePickerSimple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        datePickerSimple=findViewById(R.id.datePicker);
    }
    public void launchNewBuildProvider(View view){
        Intent i=new Intent(this,NewBillNProvider.class);
        i.putExtra("date",);
        startActivity(i);
    }

}
