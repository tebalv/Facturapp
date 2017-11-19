package com.example.esteban.facturapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.esteban.facturapp.Activity.CalendarActivity;
import com.example.esteban.facturapp.Activity.DialogBillsActivity;
import com.example.esteban.facturapp.Activity.NewBillNProvider;

public class ActivityMain extends AppCompatActivity {
private Button btnNvaDeuda;
private Button btnCalendario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        btnNvaDeuda =  findViewById(R.id.btnAgregar);
        btnCalendario =  findViewById(R.id.btnConsultar);
        btnNvaDeuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchDialogBillsActivity(v);
            }
        });
        btnCalendario.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                launchCalendarActivity(v);
            }
        });

    }
    public void launchDialogBillsActivity(View view){
        Intent i= new Intent(this, DialogBillsActivity.class);
        startActivity(i);
    }
    public void launchCalendarActivity(View view){
        Intent i= new Intent(this, CalendarActivity.class);
        startActivity(i);

    }
}
