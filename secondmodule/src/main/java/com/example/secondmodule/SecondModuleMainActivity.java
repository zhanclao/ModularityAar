package com.example.secondmodule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.firstmodule.Constance;

@Route(path = com.example.secondmodule.Constance.ACTIVITY_URL_SECONDMODULE_MAIN)
public class SecondModuleMainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        setContentView(R.layout.second_activity_main);

        findViewById(R.id.btn_navigation_to_first_module).setOnClickListener(this);
        findViewById(R.id.btn_navigation_to_first_module_b_page).setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if (R.id.btn_navigation_to_first_module == view.getId()) {
            ARouter.getInstance().build(Constance.ACTIVITY_URL_FIRSTMODULE_MAIN).navigation();
//            startActivity(new Intent(SecondModuleMainActivity.this, FirstModuleMainActivity.class));
        } else if (R.id.btn_navigation_to_first_module_b_page == view.getId()){
            ARouter.getInstance().build(Constance.ACTIVITY_URL_FIRSTMODULE_B_PAGE).navigation();
        }
    }
}
