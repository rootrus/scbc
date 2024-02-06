package p040o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: o.nIncDeviceDestroy */
public final class nIncDeviceDestroy {
    public read IconCompatParcelizer = null;
    public final ArrayList<read> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList<>();
    public final Animator.AnimatorListener MediaBrowserCompat$ItemReceiver = new AnimatorListenerAdapter() {
        public final void onAnimationEnd(Animator animator) {
            if (nIncDeviceDestroy.this.write == animator) {
                nIncDeviceDestroy.this.write = null;
            }
        }
    };
    public ValueAnimator write = null;

    /* renamed from: o.nIncDeviceDestroy$read */
    public static class read {
        public final ValueAnimator IconCompatParcelizer;
        public final int[] read;

        public read(int[] iArr, ValueAnimator valueAnimator) {
            this.read = iArr;
            this.IconCompatParcelizer = valueAnimator;
        }
    }
}
