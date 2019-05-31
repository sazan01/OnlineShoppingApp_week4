package com.example.onlineshoppingapp_week4;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.onlineshoppingapp_week4.Views.Dashboard;

public class SplashScreen extends AppCompatActivity {
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Boolean checklogin;
        sharedPreferences = getSharedPreferences("APP", Context.MODE_PRIVATE);
        checklogin = sharedPreferences.getBoolean("loginchecker", false);

        if (checklogin == true) {
            final Intent intent = new Intent(SplashScreen.this, Dashboard.class);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(intent);
                    finish();
                }
            }, 2000);
        } else {
            final Intent intent=new Intent(SplashScreen.this,MainActivity.class);


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(intent);
                    finish();
                }
            }, 2000);


        }
    }
}


