package com.shaby.dynamictablelayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/**
 * Created by shaby on 3/7/2017.
 */

public class HorizontalScroll extends HorizontalScrollView {

    private ScrollViewListener scrollViewListener = null;
    public interface ScrollViewListener {

        void onScrollChanged(HorizontalScroll scrollView, int x, int y, int oldx, int oldy);

    }
    public HorizontalScroll(Context context) {
        super(context);
    }

    public HorizontalScroll(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public HorizontalScroll(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
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
