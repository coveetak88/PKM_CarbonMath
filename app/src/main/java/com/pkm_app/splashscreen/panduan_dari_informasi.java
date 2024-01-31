package com.pkm_app.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class panduan_dari_informasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduan_dari_informasi);
        getSupportActionBar().hide();
    }

    public void openactivity_infomation_page(View view) {
        startActivity(new Intent(this, information_page.class));
    }
}