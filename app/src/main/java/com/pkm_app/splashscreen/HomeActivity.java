package com.pkm_app.splashscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView navbar;
    Button button1;
    private ImageSlider imageSlider;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        navbar = findViewById(R.id.navbar);

        navbar.setSelectedItemId(R.id.home);

        navbar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.home:
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
                        startActivity(new Intent(getApplicationContext(), information_page.class));
                        overridePendingTransition(0,0);
                        return true;

                    default:
                }

                return true;
            }
        });

        imageSlider = findViewById(R.id.image_slider);
        ArrayList<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.imageslider1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.imageslider2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.imageslider3, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);


    }

    public void openMenu(View view) {

        startActivity(new Intent(this,jelajahiActivity.class));
    }

    public void openactivity_panduan(View view) {

        startActivity(new Intent(this,panduan.class));
    }


}