package p040o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.Constraints$MediaBrowserCompat$CustomActionResultReceiver */
class Constraints$MediaBrowserCompat$CustomActionResultReceiver extends AnimatorListenerAdapter {
    private boolean IconCompatParcelizer = false;
    final /* synthetic */ Constraints write;

    Constraints$MediaBrowserCompat$CustomActionResultReceiver(Constraints constraints) {
        this.write = constraints;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.IconCompatParcelizer) {
            this.IconCompatParcelizer = false;
        } else if (((Float) this.write.MediaBrowserCompat$SearchResultReceiver.getAnimatedValue()).floatValue() == BitmapDescriptorFactory.HUE_RED) {
            this.write.write = 0;
            this.write.read(0);
        } else {
            this.write.write = 2;
            this.write.MediaBrowserCompat$MediaItem.invalidate();
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.IconCompatParcelizer = true;
    }
}
