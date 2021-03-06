package com.example.nanjing.zy_java.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.nanjing.R;

/**
 * Created by 昭阳 on 2019/3/30.
 */
public class GlideView extends LinearLayout {
    public GlideView(Context context) {
        super(context);
    }

    public GlideView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public void setIndex(int index, Context context) {
        removeAllViews();
        for (int i = 0; i < count; i++) {
            ImageView imageView = new ImageView(context);
            if (i == index) {
                imageView.setImageResource(R.drawable.yuan_on);
            } else {
                imageView.setImageResource(R.drawable.yuan_off);
            }
            addView(imageView);

            LayoutParams layoutParams = (LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = 10;
            layoutParams.rightMargin = 10;
            imageView.setLayoutParams(layoutParams);

        }


    }
}
