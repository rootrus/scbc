package p040o;

import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import p040o.setLayoutResource;

/* renamed from: o.setLayoutResource$MediaBrowserCompat$CustomActionResultReceiver */
class setLayoutResource$MediaBrowserCompat$CustomActionResultReceiver extends setLayoutResource.write implements Runnable {
    private View IconCompatParcelizer;

    setLayoutResource$MediaBrowserCompat$CustomActionResultReceiver(View view, Animation.AnimationListener animationListener) {
        super(animationListener);
        this.IconCompatParcelizer = view;
    }

    public final void onAnimationEnd(Animation animation) {
        if (SwitchCompat.setExpandedFormat(this.IconCompatParcelizer) || Build.VERSION.SDK_INT >= 24) {
            this.IconCompatParcelizer.post(this);
        } else {
            this.IconCompatParcelizer.setLayerType(0, (Paint) null);
        }
        super.onAnimationEnd(animation);
    }

    public final void run() {
        this.IconCompatParcelizer.setLayerType(0, (Paint) null);
    }
}
