package com.google.android.material.floatingactionbutton;

import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.google.android.material.floatingactionbutton.FloatingActionButton$MediaBrowserCompat$CustomActionResultReceiver */
public abstract class C0165x4634a05b implements Interpolator {
    private final float IconCompatParcelizer;
    private final float[] read;

    public C0165x4634a05b() {
    }

    public C0165x4634a05b(float[] fArr) {
        this.read = fArr;
        this.IconCompatParcelizer = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float[] fArr = this.read;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = this.IconCompatParcelizer;
        float f3 = (f - (((float) min) * f2)) / f2;
        float[] fArr2 = this.read;
        return fArr2[min] + (f3 * (fArr2[min + 1] - fArr2[min]));
    }
}
