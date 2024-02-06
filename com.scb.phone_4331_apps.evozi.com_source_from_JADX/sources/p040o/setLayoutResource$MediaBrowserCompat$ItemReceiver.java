package p040o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: o.setLayoutResource$MediaBrowserCompat$ItemReceiver */
class setLayoutResource$MediaBrowserCompat$ItemReceiver extends AnimatorListenerAdapter {
    private View read;

    setLayoutResource$MediaBrowserCompat$ItemReceiver(View view) {
        this.read = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.read.setLayerType(2, (Paint) null);
    }

    public final void onAnimationEnd(Animator animator) {
        this.read.setLayerType(0, (Paint) null);
        animator.removeListener(this);
    }
}
