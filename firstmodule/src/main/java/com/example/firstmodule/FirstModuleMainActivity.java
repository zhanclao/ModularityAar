package com.example.firstmodule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

@Route(path = Constance.ACTIVITY_URL_FIRSTMODULE_MAIN)
public class FirstModuleMainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        setContentView(R.layout.first_activity_main);

        findViewById(R.id.tv_test_navigation_to_B).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (R.id.tv_test_navigation_to_B == view.getId()) {
//            this.startActivity(new Intent(FirstModuleMainActivity.this, FirstModuleBPageActivity.class));
            ARouter.getInstance().build(Constance.ACTIVITY_URL_FIRSTMODULE_B_PAGE).navigation();
        }
    }
}
