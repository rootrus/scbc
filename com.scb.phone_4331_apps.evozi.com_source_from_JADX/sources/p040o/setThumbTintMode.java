package p040o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.setThumbTintMode */
class setThumbTintMode implements Interpolator {
    private final float[] MediaBrowserCompat$ItemReceiver;
    private final float[] read;

    setThumbTintMode(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 0.002f)) + 1;
        this.read = new float[i];
        this.MediaBrowserCompat$ItemReceiver = new float[i];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((((float) i2) * length) / ((float) (i - 1)), fArr, (float[]) null);
            this.read[i2] = fArr[0];
            this.MediaBrowserCompat$ItemReceiver[i2] = fArr[1];
        }
    }

    setThumbTintMode(float f, float f2, float f3, float f4) {
        this(read(f, f2, f3, f4));
    }

    public float getInterpolation(float f) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.read.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.read[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.read;
        float f2 = fArr[length] - fArr[i];
        if (f2 == BitmapDescriptorFactory.HUE_RED) {
            return this.MediaBrowserCompat$ItemReceiver[i];
        }
        float[] fArr2 = this.MediaBrowserCompat$ItemReceiver;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }

    private static Path read(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        return path;
    }
}
