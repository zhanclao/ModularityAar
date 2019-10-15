package com.example.secondmodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.firstmodule.FirstModuleMainActivity;

public class SecondModuleMainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_main);

        findViewById(R.id.btn_navigation_to_first_module).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (R.id.btn_navigation_to_first_module == view.getId()) {
            startActivity(new Intent(SecondModuleMainActivity.this, FirstModuleMainActivity.class));
        }
    }
}
