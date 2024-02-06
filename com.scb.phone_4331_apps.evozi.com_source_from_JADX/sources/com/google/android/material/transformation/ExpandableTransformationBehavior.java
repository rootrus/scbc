package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    AnimatorSet MediaBrowserCompat$ItemReceiver;

    /* access modifiers changed from: protected */
    public abstract AnimatorSet IconCompatParcelizer(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public boolean MediaBrowserCompat$CustomActionResultReceiver(View view, View view2, boolean z, boolean z2) {
        boolean z3 = this.MediaBrowserCompat$ItemReceiver != null;
        if (z3) {
            this.MediaBrowserCompat$ItemReceiver.cancel();
        }
        AnimatorSet IconCompatParcelizer = IconCompatParcelizer(view, view2, z, z3);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.MediaBrowserCompat$ItemReceiver = null;
            }
        });
        this.MediaBrowserCompat$ItemReceiver.start();
        if (!z2) {
            this.MediaBrowserCompat$ItemReceiver.end();
        }
        return true;
    }
}
