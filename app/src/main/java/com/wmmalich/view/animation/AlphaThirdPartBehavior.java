package com.wmmalich.view.animation;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by grego on 5/11/2017.
 */

public class AlphaThirdPartBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    public AlphaThirdPartBehavior(Context context, AttributeSet attrs) {
        super();
    }

    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, V child, View dependency) {
        return dependency instanceof AppBarLayout;
    }

    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, V child, View dependency) {

        float scale = (dependency.getHeight() + dependency.getY() * 3f) / dependency.getHeight();
        child.setAlpha(scale + 0.5f);
        child.setTranslationY(dependency.getY());
        return super.onDependentViewChanged(parent, child, dependency);
    }


    //
//    @Override
//    public boolean onDependentViewChanged(CoordinatorLayout parent, FrameLayout child, View dependency) {
////        float translationY = Math.min(0, );
////        Log.d("getHeight" + dependency.getHeight());
////        Log.d("getY" + dependency.getY());
//        float scale = (dependency.getHeight() + dependency.getY() * 3f) / dependency.getHeight();
//
////        Log.d("scale" + scale);
//        child.setAlpha(scale + 0.5f);
//        child.setTranslationY(dependency.getY());
//        return super.onDependentViewChanged(parent, child, dependency);
//    }
}
