package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.zzlz;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver<V> {
    private int MediaBrowserCompat$ItemReceiver = 2;
    private int read = 0;
    ViewPropertyAnimator write;

    public final boolean MediaBrowserCompat$ItemReceiver(int i) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.read = v.getMeasuredHeight();
        return super.IconCompatParcelizer(coordinatorLayout, v, i);
    }

    public final void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (this.MediaBrowserCompat$ItemReceiver != 1 && i2 > 0) {
            MediaBrowserCompat$ItemReceiver(v);
        } else if (this.MediaBrowserCompat$ItemReceiver != 2 && i2 < 0) {
            write(v);
        }
    }

    public void write(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.write;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.MediaBrowserCompat$ItemReceiver = 2;
        MediaBrowserCompat$CustomActionResultReceiver(v, 0, 225, zzlz.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void MediaBrowserCompat$ItemReceiver(V v) {
        ViewPropertyAnimator viewPropertyAnimator = this.write;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.MediaBrowserCompat$ItemReceiver = 1;
        MediaBrowserCompat$CustomActionResultReceiver(v, this.read, 175, zzlz.MediaBrowserCompat$ItemReceiver);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.write = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.write = null;
            }
        });
    }
}
