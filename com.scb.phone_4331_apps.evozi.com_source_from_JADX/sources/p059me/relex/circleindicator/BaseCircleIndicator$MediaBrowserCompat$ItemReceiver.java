package p059me.relex.circleindicator;

import android.view.animation.Interpolator;

/* renamed from: me.relex.circleindicator.BaseCircleIndicator$MediaBrowserCompat$ItemReceiver */
public class BaseCircleIndicator$MediaBrowserCompat$ItemReceiver implements Interpolator {
    protected BaseCircleIndicator$MediaBrowserCompat$ItemReceiver() {
    }

    public final float getInterpolation(float f) {
        return Math.abs(1.0f - f);
    }
}
