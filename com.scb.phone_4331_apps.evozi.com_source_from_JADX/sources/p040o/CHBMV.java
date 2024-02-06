package p040o;

import android.graphics.Rect;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.CHBMV */
public class CHBMV extends CHER2 {
    private static final String MediaBrowserCompat$CustomActionResultReceiver = CHBMV.class.getSimpleName();

    /* access modifiers changed from: protected */
    public final float read(BNNM bnnm, BNNM bnnm2) {
        if (bnnm.read <= 0 || bnnm.IconCompatParcelizer <= 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        BNNM MediaBrowserCompat$ItemReceiver = bnnm.MediaBrowserCompat$ItemReceiver(bnnm2);
        float f = ((float) MediaBrowserCompat$ItemReceiver.read) / ((float) bnnm.read);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = (((float) bnnm2.read) / ((float) MediaBrowserCompat$ItemReceiver.read)) * (((float) bnnm2.IconCompatParcelizer) / ((float) MediaBrowserCompat$ItemReceiver.IconCompatParcelizer));
        return f * (((1.0f / f2) / f2) / f2);
    }

    public final Rect MediaBrowserCompat$ItemReceiver(BNNM bnnm, BNNM bnnm2) {
        BNNM MediaBrowserCompat$ItemReceiver = bnnm.MediaBrowserCompat$ItemReceiver(bnnm2);
        String str = MediaBrowserCompat$CustomActionResultReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append("Preview: ");
        sb.append(bnnm);
        sb.append("; Scaled: ");
        sb.append(MediaBrowserCompat$ItemReceiver);
        sb.append("; Want: ");
        sb.append(bnnm2);
        Log.i(str, sb.toString());
        int i = (MediaBrowserCompat$ItemReceiver.read - bnnm2.read) / 2;
        int i2 = (MediaBrowserCompat$ItemReceiver.IconCompatParcelizer - bnnm2.IconCompatParcelizer) / 2;
        return new Rect(-i, -i2, MediaBrowserCompat$ItemReceiver.read - i, MediaBrowserCompat$ItemReceiver.IconCompatParcelizer - i2);
    }
}
