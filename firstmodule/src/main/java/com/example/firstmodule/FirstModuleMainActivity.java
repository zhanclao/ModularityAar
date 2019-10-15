package com.example.firstmodule;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class FirstModuleMainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity_main);

        findViewById(R.id.tv_test_navigation_to_B).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (R.id.tv_test_navigation_to_B == view.getId()){
            this.startActivity(new Intent(FirstModuleMainActivity.this, FirstModuleBPageActivity.class));
        }
    }
}
