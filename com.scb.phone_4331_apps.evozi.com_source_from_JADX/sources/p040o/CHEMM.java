package p040o;

import android.graphics.Rect;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.CHEMM */
public class CHEMM extends CHER2 {
    private static final String MediaBrowserCompat$CustomActionResultReceiver = CHEMM.class.getSimpleName();

    /* access modifiers changed from: protected */
    public final float read(BNNM bnnm, BNNM bnnm2) {
        if (bnnm.read <= 0 || bnnm.IconCompatParcelizer <= 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        BNNM IconCompatParcelizer = bnnm.IconCompatParcelizer(bnnm2);
        float f = ((float) IconCompatParcelizer.read) / ((float) bnnm.read);
        if (f > 1.0f) {
            f = (float) Math.pow((double) (1.0f / f), 1.1d);
        }
        float f2 = (((float) IconCompatParcelizer.read) / ((float) bnnm2.read)) + (((float) IconCompatParcelizer.IconCompatParcelizer) / ((float) bnnm2.IconCompatParcelizer));
        return f * ((1.0f / f2) / f2);
    }

    public final Rect MediaBrowserCompat$ItemReceiver(BNNM bnnm, BNNM bnnm2) {
        BNNM IconCompatParcelizer = bnnm.IconCompatParcelizer(bnnm2);
        String str = MediaBrowserCompat$CustomActionResultReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append("Preview: ");
        sb.append(bnnm);
        sb.append("; Scaled: ");
        sb.append(IconCompatParcelizer);
        sb.append("; Want: ");
        sb.append(bnnm2);
        Log.i(str, sb.toString());
        int i = (IconCompatParcelizer.read - bnnm2.read) / 2;
        int i2 = (IconCompatParcelizer.IconCompatParcelizer - bnnm2.IconCompatParcelizer) / 2;
        return new Rect(-i, -i2, IconCompatParcelizer.read - i, IconCompatParcelizer.IconCompatParcelizer - i2);
    }
}
