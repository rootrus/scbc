package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: androidx.appcompat.widget.ScrollingTabContainerView$MediaBrowserCompat$CustomActionResultReceiver */
public class C5517x149ad733 extends AnimatorListenerAdapter {
    private boolean IconCompatParcelizer = false;
    final /* synthetic */ ScrollingTabContainerView MediaBrowserCompat$CustomActionResultReceiver;

    protected C5517x149ad733(ScrollingTabContainerView scrollingTabContainerView) {
        this.MediaBrowserCompat$CustomActionResultReceiver = scrollingTabContainerView;
    }

    public final void onAnimationStart(Animator animator) {
        this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
        this.IconCompatParcelizer = false;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.IconCompatParcelizer = true;
    }
}
