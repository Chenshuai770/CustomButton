package com.cs.com.test_button;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private CustomButton mBtnTest;
    private CustomButton mBtnTest2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initView();
    }

    private void initView() {
        mBtnTest = (CustomButton) findViewById(R.id.btn_test);

        mBtnTest.setOnClickListener(this);
        mBtnTest2 = (CustomButton) findViewById(R.id.btn_test2);
        mBtnTest2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_test:
                if (mBtnTest.isSelected()) {
                    mBtnTest.setSelected(false);
                }else{
                    mBtnTest.setSelected(true);
                }

                mBtnTest.setSelected(false);
                break;
            case R.id.btn_test2:

                break;
        }
    }
}
