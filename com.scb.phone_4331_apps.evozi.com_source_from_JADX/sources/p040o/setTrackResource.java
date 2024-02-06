package p040o;

import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: o.setTrackResource */
public final class setTrackResource {
    public static Interpolator read(float f, float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new setThumbTintMode(f, f2, f3, f4);
    }
}
