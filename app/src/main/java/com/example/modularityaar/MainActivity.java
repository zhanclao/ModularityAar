package com.example.modularityaar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.firstmodule.FirstModuleMainActivity;
import com.example.secondmodule.SecondModuleMainActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_test_first).setOnClickListener(this);
        findViewById(R.id.btn_test_second).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_test_first:
                startActivity(new Intent(MainActivity.this, FirstModuleMainActivity.class));
                break;
            case R.id.btn_test_second:
                startActivity(new Intent(MainActivity.this, SecondModuleMainActivity.class));
                break;
        }
    }
}
