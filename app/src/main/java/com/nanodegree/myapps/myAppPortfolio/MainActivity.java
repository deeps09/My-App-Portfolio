package com.nanodegree.myapps.myAppPortfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button poplarMovies;
    Button stockHawk;
    Button buildItBigger;
    Button makeAppMaterial;
    Button goUbiquitous;
    Button capstone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        poplarMovies = (Button) findViewById(R.id.btnPopularMovies);
        stockHawk = (Button) findViewById(R.id.btnStockHawk);
        buildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        makeAppMaterial = (Button) findViewById(R.id.btnMakeYourAppMat);
        goUbiquitous = (Button) findViewById(R.id.btnGoUbiquitous);
        capstone = (Button) findViewById(R.id.btnCapstone);

        poplarMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("popular movies app");
            }
        });

        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("StockHawk app");
            }
        });

        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("Build it Bigger app");
            }
        });

        makeAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("Make App Material app");
            }
        });

        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("Go Ubiquitous app");
            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("Capstone app");
            }
        });
    }

    private void makeToast(String message) {
        Toast.makeText(MainActivity.this, "This button will launch my " + message, Toast.LENGTH_SHORT).show();
    }
}
