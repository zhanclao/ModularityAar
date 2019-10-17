package com.example.modularityaar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.firstmodule.Constance;

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
//                startActivity(new Intent(MainActivity.this, FirstModuleMainActivity.class));
                ARouter.getInstance().build(Constance.ACTIVITY_URL_FIRSTMODULE_MAIN).navigation();

                break;
            case R.id.btn_test_second:
                ARouter.getInstance().build(com.example.secondmodule.Constance.ACTIVITY_URL_SECONDMODULE_MAIN).navigation();
//                startActivity(new Intent(MainActivity.this, SecondModuleMainActivity.class));
                break;
        }
    }
}
