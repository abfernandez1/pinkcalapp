package com.example.pinkcal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

     new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent=new Intent(Splash_screen.this, Login.class);
            startActivity(intent);
            finish();
        }
    },4000);

}
}