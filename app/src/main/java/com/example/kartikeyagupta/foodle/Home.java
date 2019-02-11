package com.example.kartikeyagupta.foodle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.EditText;
public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); }
    public void Dues (View v ) {
        startActivity(new Intent( Home.this, Dues.class));
    }
    public void Menu (View v ) {
        startActivity(new Intent( Home.this, Menu.class));
    }
}

