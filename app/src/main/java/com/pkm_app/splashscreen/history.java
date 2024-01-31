package com.pkm_app.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class history extends AppCompatActivity {
    BottomNavigationView navbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        getSupportActionBar().hide();

        navbar = findViewById(R.id.navbar);

        navbar.setSelectedItemId(R.id.History);

        navbar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.calculator:
                        startActivity(new Intent(getApplicationContext(), calculator.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.History:
                        return true;

                    case R.id.process:
                        startActivity(new Intent(getApplicationContext(), process.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.information:
                        startActivity(new Intent(getApplicationContext(), information_page.class));
                        overridePendingTransition(0,0);
                        return true;

                    default:
                }

                return true;
            }
        });
    }
    public void openMenu(View view) {

        startActivity(new Intent(this,jelajahiActivity.class));
    }

    public void openactivity_panduan_dari_history(View view) {
        startActivity(new Intent(this,panduan_dari_history.class));

    }
}