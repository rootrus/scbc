package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.isComplex;

/* renamed from: o.addMatrix */
public final class addMatrix extends addF64<subFloat2> {
    public addMatrix() {
    }

    public addMatrix(subFloat2 subfloat2) {
        super(subfloat2);
    }

    public final subFloat2 MediaDescriptionCompat() {
        return (subFloat2) this.IconCompatParcelizer.get(0);
    }

    public final /* synthetic */ subByte2 write(int i) {
        if (i == 0) {
            return (subFloat2) this.IconCompatParcelizer.get(0);
        }
        return null;
    }

    public final subFloat2 MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            return (subFloat2) this.IconCompatParcelizer.get(0);
        }
        return null;
    }

    public final addI8 MediaBrowserCompat$ItemReceiver(isComplex.C13709 r3) {
        return ((subFloat2) this.IconCompatParcelizer.get(0)).MediaBrowserCompat$ItemReceiver((int) r3.MediaBrowserCompat$SearchResultReceiver);
    }

    public final float RatingCompat() {
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < ((subFloat2) this.IconCompatParcelizer.get(0)).PlaybackStateCompat$CustomAction(); i++) {
            f += ((addI64) ((subFloat2) this.IconCompatParcelizer.get(0)).MediaBrowserCompat$ItemReceiver(i)).IconCompatParcelizer;
        }
        return f;
    }
}
