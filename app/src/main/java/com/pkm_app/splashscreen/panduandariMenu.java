package com.pkm_app.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class panduandariMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panduandari_menu);
        getSupportActionBar().hide();

    }

    public void openMenu(View view) {
        startActivity(new Intent(this, jelajahiActivity.class));
    }
}