package com.shaby.dynamictablelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by shaby on 3/7/2017.
 */

public class VerticalScroll extends ScrollView {

    private ScrollViewListener scrollViewListener = null;
    public interface ScrollViewListener {

        void onScrollChanged(VerticalScroll scrollView, int x, int y, int oldx, int oldy);

    }

    public VerticalScroll(Context context) {
        super(context);
    }

    public VerticalScroll(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public VerticalScroll(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setScrollViewListener(ScrollViewListener scrollViewListener) {
        this.scrollViewListener = scrollViewListener;
    }

    @Override
    protected void onScrollChanged(int x, int y, int oldx, int oldy) {
        super.onScrollChanged(x, y, oldx, oldy);
        if(scrollViewListener != null) {
            scrollViewListener.onScrollChanged(this, x, y, oldx, oldy);
        }
    }

}
