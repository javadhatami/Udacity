package com.example.android.udacity;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by javad on 7/5/2017 AD.
 */
public class CustomPagerAdapter extends PagerAdapter {

    Context mContext;

    public CustomPagerAdapter(Context context) {

        mContext = context;

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = LayoutInflater.from(mContext);

        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.view_pager_item,container,false);
        ImageView imageView = (ImageView) layout.findViewById(R.id.image_view);
        TextView textView = (TextView) layout.findViewById(R.id.text_view);
        TextView textView2 = (TextView) layout.findViewById(R.id.text_view2);




        switch (position){

            case 0:
                imageView.setImageResource(R.drawable.onboarding_image_0);
                textView2.setText("Jobs of Tomorrow Start Here");
                imageView.setMaxWidth(100);

                break;

            case 1:
                imageView.setImageResource(R.drawable.onboarding_image_1);
                textView.setText("LifeLong Learning");
                textView2.setText("Wherever you are,the Udacity App makes it" +
                        " easy for you to complate your learning goals");
                break;

            case 2:
                imageView.setImageResource(R.drawable.onboarding_image_2);
                textView.setText("Built by Expert Companies");
                textView2.setText("Learn from the industry expertsas they walk" +
                        "yoy though real world examples");
                break;

            case 3:
                imageView.setImageResource(R.drawable.onboarding_image_3);
                textView.setText("Results that Matter");
                textView2.setText("Graduate,get a Nanodegree,and get a job with" +
                        "the industry'sleading companies ");
                break;
        }

        container.addView(layout);
        return layout;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
