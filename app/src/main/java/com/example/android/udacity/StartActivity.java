package com.example.android.udacity;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout linearLayout =(LinearLayout) findViewById(R.id.rootView);
        linearLayout.setBackgroundResource(R.drawable.bg);


        Button button1 = (Button) findViewById(R.id.startBtn);
        Button button2 = (Button) findViewById(R.id.logBtn);

        final View view1 =  findViewById(R.id.view_pager_indicator_1);
        final View view2 =  findViewById(R.id.view_pager_indicator_2);
        final View view3 =  findViewById(R.id.view_pager_indicator_3);
        final View view4 =  findViewById(R.id.view_pager_indicator_4);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        CustomPagerAdapter adapter = new CustomPagerAdapter(this);

        viewPager.setAdapter(adapter);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(StartActivity.this,HomeActivity.class);
                startActivity(intent);
                finish();
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),"mamali jagareto bokhoram",Toast.LENGTH_SHORT).show();
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                switch (position){

                    case 0:
                        view1.setBackgroundResource(R.drawable.solid);
                        view2.setBackgroundResource(R.drawable.impty_ring);
                        view3.setBackgroundResource(R.drawable.impty_ring);
                        view4.setBackgroundResource(R.drawable.impty_ring);
                        break;

                    case 1:

                        view1.setBackgroundResource(R.drawable.impty_ring);
                        view2.setBackgroundResource(R.drawable.solid);
                        view3.setBackgroundResource(R.drawable.impty_ring);
                        view4.setBackgroundResource(R.drawable.impty_ring);
                        break;

                    case 2:
                        view1.setBackgroundResource(R.drawable.impty_ring);
                        view2.setBackgroundResource(R.drawable.impty_ring);
                        view3.setBackgroundResource(R.drawable.solid);
                        view4.setBackgroundResource(R.drawable.impty_ring);
                        break;

                    case 3:
                        view1.setBackgroundResource(R.drawable.impty_ring);
                        view2.setBackgroundResource(R.drawable.impty_ring);
                        view3.setBackgroundResource(R.drawable.impty_ring);
                        view4.setBackgroundResource(R.drawable.solid);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
