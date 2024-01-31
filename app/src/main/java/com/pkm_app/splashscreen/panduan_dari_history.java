package com.pkm_app.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class panduan_dari_history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan_dari_history);
        getSupportActionBar().hide();
    }

    public void openactivity_history(View view) {
        startActivity(new Intent(this,history.class));

    }
}