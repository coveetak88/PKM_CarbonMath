package com.pkm_app.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class process extends AppCompatActivity {
    BottomNavigationView navbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process);
        getSupportActionBar().hide();

        navbar = findViewById(R.id.navbar);

        navbar.setSelectedItemId(R.id.process);

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
                        startActivity(new Intent(getApplicationContext(), history.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.process:
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
}