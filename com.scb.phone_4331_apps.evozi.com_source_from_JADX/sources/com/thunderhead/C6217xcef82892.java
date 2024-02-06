package com.thunderhead;

import android.animation.Animator;

/* renamed from: com.thunderhead.MiniOptimizationViewController$MediaBrowserCompat$CustomActionResultReceiver */
class C6217xcef82892 implements Animator.AnimatorListener {
    private /* synthetic */ MiniOptimizationViewController IconCompatParcelizer;

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    private C6217xcef82892(MiniOptimizationViewController miniOptimizationViewController) {
        this.IconCompatParcelizer = miniOptimizationViewController;
    }

    /* synthetic */ C6217xcef82892(MiniOptimizationViewController miniOptimizationViewController, byte b) {
        this(miniOptimizationViewController);
    }

    public final void onAnimationEnd(Animator animator) {
        this.IconCompatParcelizer.read.removeView(this.IconCompatParcelizer);
    }
}
