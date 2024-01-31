package com.pkm_app.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class calculator extends AppCompatActivity {
    BottomNavigationView navbar;
    EditText heightinput, distanceinput;
    TextView resulttext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getSupportActionBar().hide();

        heightinput = findViewById(R.id.heightinput);
        distanceinput = findViewById(R.id.distanceinput);


        navbar = findViewById(R.id.navbar);

        navbar.setSelectedItemId(R.id.calculator);

        navbar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.calculator:
                        return true;

                    case R.id.History:
                        startActivity(new Intent(getApplicationContext(), history.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.process:
                        startActivity(new Intent(getApplicationContext(), process.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.information:
                        startActivity(new Intent(getApplicationContext(), information_page.class));
                        overridePendingTransition(0, 0);
                        return true;

                    default:
                }

                return true;

            }
        });
    }

    public void calculatetan(View view) {
        String s1 = heightinput.getText().toString();
        String s2 = distanceinput.getText().toString();

        float heighinputValue = Float.parseFloat(s1);
        float distanctinputValue = Float.parseFloat(s2);

    }

    public void openactivity_panduan(View view) {
        startActivity(new Intent(this,panduan.class));
    }

    public void openactivity_panduan_dari_kalku(View view) {
        startActivity(new Intent(this,panduan_dari_kalku.class));
    }

    public void opencalculate_tan(View view) {
        startActivity(new Intent(this,calculate_tan.class));
    }
    public void openMenu(View view) {
        startActivity(new Intent(this,jelajahiActivity.class));
    }

}