package com.pkm_app.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class panduan_dari_kalku extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan_dari_kalku);
        getSupportActionBar().hide();
    }

    public void openactivity_panduan(View view) {
        startActivity(new Intent(this,panduan.class));
    }

    public void openactivity_calculator(View view) {
        startActivity(new Intent(this,calculator.class));
    }
}