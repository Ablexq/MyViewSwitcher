package com.xq.myviewswitcher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewSwitcher;

/*
* Android ViewSwitcher简介和使用
*
* https://blog.csdn.net/zhangphil/article/details/48312811
 * */
public class MainActivity extends AppCompatActivity {

    private boolean isFirst = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button buttonPrev = (Button) findViewById(R.id.prev);
        Button buttonNext = (Button) findViewById(R.id.next);

        final ViewSwitcher viewSwitcher = (ViewSwitcher) findViewById(R.id.viewSwitcher);

        Animation slide_in_left = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation slide_out_right = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

        viewSwitcher.setInAnimation(slide_in_left);
        viewSwitcher.setOutAnimation(slide_out_right);

        buttonPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isFirst) {
                    viewSwitcher.setDisplayedChild(0);
                    isFirst = true;
                } else {
                    viewSwitcher.setDisplayedChild(1);
                    isFirst = false;
                }
            }
        });

//        buttonPrev.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // viewSwitcher.showPrevious();切换效果类似
//                viewSwitcher.setDisplayedChild(0);
//            }
//        });
//
//        buttonNext.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // viewSwitcher.showNext();切换效果类似
//                viewSwitcher.setDisplayedChild(1);
//            }
//        });
    }
}
