package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.nContextInitToClient */
public final class nContextInitToClient extends Iterables$3$MediaBrowserCompat$CustomActionResultReceiver {
    public float IconCompatParcelizer;
    public float MediaBrowserCompat$CustomActionResultReceiver;
    public float MediaBrowserCompat$ItemReceiver;
    public float read;
    public float write;

    public nContextInitToClient(float f, float f2, float f3) {
        this.IconCompatParcelizer = f;
        this.read = f2;
        this.MediaBrowserCompat$ItemReceiver = f3;
        if (f3 >= BitmapDescriptorFactory.HUE_RED) {
            this.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(float f, float f2, nIncContextFinish ninccontextfinish) {
        float f3 = f;
        nIncContextFinish ninccontextfinish2 = ninccontextfinish;
        float f4 = this.write;
        if (f4 == BitmapDescriptorFactory.HUE_RED) {
            ninccontextfinish2.read(f3);
            return;
        }
        float f5 = ((this.IconCompatParcelizer * 2.0f) + f4) / 2.0f;
        float f6 = f2 * this.read;
        float f7 = (f3 / 2.0f) + this.MediaBrowserCompat$CustomActionResultReceiver;
        float f8 = (this.MediaBrowserCompat$ItemReceiver * f2) + ((1.0f - f2) * f5);
        if (f8 / f5 >= 1.0f) {
            ninccontextfinish2.read(f3);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) - (f10 * f10)));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f10)));
        float f13 = 90.0f - degrees;
        float f14 = f11 - f6;
        ninccontextfinish2.read(f14);
        float f15 = f6 * 2.0f;
        float f16 = degrees;
        ninccontextfinish.MediaBrowserCompat$CustomActionResultReceiver(f14, BitmapDescriptorFactory.HUE_RED, f11 + f6, f15, 270.0f, degrees);
        ninccontextfinish.MediaBrowserCompat$CustomActionResultReceiver(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        ninccontextfinish.MediaBrowserCompat$CustomActionResultReceiver(f12 - f6, BitmapDescriptorFactory.HUE_RED, f12 + f6, f15, 270.0f - f16, f16);
        ninccontextfinish2.read(f3);
    }
}
