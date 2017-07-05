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

        switch (position){

            case 0:
                imageView.setImageResource(R.drawable.images0);
                textView.setText("page 0");
                break;

            case 1:
                imageView.setImageResource(R.drawable.images1);
                textView.setText("page 1");
                break;

            case 2:
                imageView.setImageResource(R.drawable.images2);
                textView.setText("page 2");
                break;

            case 3:
                imageView.setImageResource(R.drawable.images3);
                textView.setText("page 3");
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
