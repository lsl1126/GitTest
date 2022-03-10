package com.example.gittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.gittest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());
        initView();
    }

    private void initView() {
        activityMainBinding.btn1.setOnClickListener(view -> Toast.makeText(MainActivity.this, "弹框1", Toast.LENGTH_SHORT).show());
        activityMainBinding.btn2.setOnClickListener(view -> Toast.makeText(MainActivity.this, "弹框2", Toast.LENGTH_SHORT).show());
        activityMainBinding.btn3.setOnClickListener(view -> Toast.makeText(MainActivity.this, "弹框3", Toast.LENGTH_SHORT).show());
    }
}