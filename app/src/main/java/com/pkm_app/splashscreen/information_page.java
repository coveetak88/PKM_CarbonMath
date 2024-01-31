package com.pkm_app.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.LinkAddress;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.net.URL;


public class information_page extends AppCompatActivity {
    BottomNavigationView navbar;
    TextView google1, google2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_page);
        getSupportActionBar().hide();

        navbar = findViewById(R.id.navbar);

        navbar.setSelectedItemId(R.id.information);

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
                        startActivity(new Intent(getApplicationContext(), process.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.information:
                        return true;

                    default:

                }

                return true;
            }
        });


        google1 = findViewById(R.id.google1);
        google1.setMovementMethod(LinkMovementMethod.getInstance());
        google2 = findViewById(R.id.google2);
        google2.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void openMenu(View view) {

        startActivity(new Intent(this, jelajahiActivity.class));
    }


    public void openactivity_panduan_dari_informasi(View view) {
        startActivity(new Intent(this, panduan_dari_informasi.class));
    }
}