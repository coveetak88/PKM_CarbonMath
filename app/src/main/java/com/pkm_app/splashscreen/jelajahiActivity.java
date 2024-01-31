// INI MENU PAGE

package com.pkm_app.splashscreen;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.navigation.NavigationView;

import java.util.Locale;

public class jelajahiActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;
    Spinner spinner;
    public static final String[] languages = {"Select Language", "English", "Indonesian"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jelajahi);
        getSupportActionBar().hide();
        spinner=findViewById(R.id.action_bar_spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(0);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedLang = parent.getItemAtPosition(position).toString();
                if (selectedLang.equals("English")) {
                    setLocal(jelajahiActivity.this,"en");
                    finish();
                    startActivity(getIntent());
                } else if (selectedLang.equals("Indonesian")) {
                    setLocal(jelajahiActivity.this,"idn");
                    finish();
                    startActivity(getIntent());
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void setLocal(Activity activity, String langCode){
        Locale locale = new Locale(langCode);
        Locale.setDefault(locale);
        Resources resources = activity.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.setLocale(locale);
        resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
    }

    public void openactivity_home(View view) {
        startActivity(new Intent(this,HomeActivity.class));
    }

    public void openactivity_information_page(MenuItem item) {
        startActivity(new Intent(this,information_page.class));
    }

    public void openactivity_olah_data(View view) {
        startActivity(new Intent(this,olah_data.class));
    }
    public void openactivity_panduan(View view){
        startActivity(new Intent(this,panduan.class));
    }

    public void openactivity_panduandari_menu(MenuItem item) {
        startActivity(new Intent(this,panduandariMenu.class));
    }

    public void openactivity_process(View view) {
        startActivity(new Intent(this,process.class));
    }
    public void openactivity_history(MenuItem item) {
        startActivity(new Intent(this,history.class));
    }
}