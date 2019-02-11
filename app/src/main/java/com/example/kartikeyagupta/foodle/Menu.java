package com.example.kartikeyagupta.foodle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.EditText;
public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu); }
    public void monday (View v ) {
        startActivity(new Intent(Menu.this, monday.class));
    }
    public void tuesday (View v ) {
        startActivity(new Intent(Menu.this, tueday.class));
    }
    public void wednesday (View v ) {
        startActivity(new Intent(Menu.this, wednesday.class));
    }
    public void thursday (View v ) {
        startActivity(new Intent(Menu.this, thursday.class));
    }
    public void friday (View v ) {
        startActivity(new Intent(Menu.this, friday.class));
    }
    public void saturday (View v ) {
        startActivity(new Intent(Menu.this, saturday.class));
    }
    public void sunday (View v ) {
        startActivity(new Intent(Menu.this, sunday.class));
    }
}

