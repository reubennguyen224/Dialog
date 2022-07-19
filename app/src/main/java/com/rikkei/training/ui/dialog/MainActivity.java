package com.rikkei.training.ui.dialog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnalert, btnarrange, btnmultichoice, btnlimit, btndate, btntime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnalert = findViewById(R.id.btn_alert);
        btnarrange = findViewById(R.id.btn_arrange);
        btnmultichoice = findViewById(R.id.btn_multichoice);
        btnlimit = findViewById(R.id.btn_scroll);
        btntime = findViewById(R.id.btn_time);
        btndate = findViewById(R.id.btn_date);

        btnarrange.setOnClickListener(view -> {
            DialogFragment dialogFragment = new DialogArrange();
            dialogFragment.show(getSupportFragmentManager(), "Arrange dialog");
        });

        btnalert.setOnClickListener(view -> {
            DialogFragment dialogFragment = new DialogAlert();
            dialogFragment.show(getSupportFragmentManager(), "Alert dialog");
        });

        btnmultichoice.setOnClickListener(view -> {
            DialogFragment dialogFragment = new DialogMultichoice();
            dialogFragment.show(getSupportFragmentManager(), "Multichoice Dialog");
        });

        btnlimit.setOnClickListener(view -> {
            DialogFragment dialogFragment = new DialogPickNum();
            dialogFragment.show(getSupportFragmentManager(), "Limit Dialog");
        });

        btntime.setOnClickListener(view -> {
            DialogTimePicker dialogFragment = new DialogTimePicker();
            dialogFragment.show(getFragmentManager(), "timepicker dialog");
        });

        btndate.setOnClickListener(view -> {
            DialogFragment dialogFragment = new DialogDatePicker();
            dialogFragment.show(getSupportFragmentManager(), "datepicker dialog");
        });
    }
}