package p040o;

import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.CHERK */
public final class CHERK extends CHER2 {
    /* access modifiers changed from: protected */
    public final float read(BNNM bnnm, BNNM bnnm2) {
        if (bnnm.read <= 0 || bnnm.IconCompatParcelizer <= 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = ((float) bnnm.read) / ((float) bnnm2.read);
        if (f < 1.0f) {
            f = 1.0f / f;
        }
        float f2 = ((float) bnnm.IconCompatParcelizer) / ((float) bnnm2.IconCompatParcelizer);
        if (f2 < 1.0f) {
            f2 = 1.0f / f2;
        }
        float f3 = (1.0f / f) / f2;
        float f4 = (((float) bnnm.read) / ((float) bnnm.IconCompatParcelizer)) / (((float) bnnm2.read) / ((float) bnnm2.IconCompatParcelizer));
        if (f4 < 1.0f) {
            f4 = 1.0f / f4;
        }
        return f3 * (((1.0f / f4) / f4) / f4);
    }

    public final Rect MediaBrowserCompat$ItemReceiver(BNNM bnnm, BNNM bnnm2) {
        return new Rect(0, 0, bnnm2.read, bnnm2.IconCompatParcelizer);
    }
}
