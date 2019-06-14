package com.xq.myviewswitcher;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(IndexActivity.this, MainActivity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(IndexActivity.this, ViewSwitcherActivity.class));
                break;
        }
    }
}
