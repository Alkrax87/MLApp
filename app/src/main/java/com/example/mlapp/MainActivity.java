package com.example.mlapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bnb(View view) {
        Intent intent = new Intent(this,MotionLayour.class);
        intent.putExtra("name","BNB");
        startActivity(intent);
    }

    public void avax(View view) {
        Intent intent = new Intent(this,MotionLayour.class);
        intent.putExtra("name","AVAX");
        startActivity(intent);
    }

    public void atom(View view) {
        Intent intent = new Intent(this,MotionLayour.class);
        intent.putExtra("name","ATOM");
        startActivity(intent);
    }

    public void ada(View view) {
        Intent intent = new Intent(this,MotionLayour.class);
        intent.putExtra("name","ADA");
        startActivity(intent);
    }

    public void btc(View view) {
        Intent intent = new Intent(this,MotionLayour.class);
        intent.putExtra("name","BTC");
        startActivity(intent);
    }

    public void eth(View view) {
        Intent intent = new Intent(this,MotionLayour.class);
        intent.putExtra("name","ETH");
        startActivity(intent);
    }

    public void rune(View view) {
        Intent intent = new Intent(this,MotionLayour.class);
        intent.putExtra("name","RUNE");
        startActivity(intent);
    }
}