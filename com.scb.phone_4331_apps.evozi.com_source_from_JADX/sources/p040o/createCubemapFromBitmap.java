package p040o;

import java.util.HashMap;

/* renamed from: o.createCubemapFromBitmap */
public final class createCubemapFromBitmap extends createFromBitmapResource {
    public final String MediaBrowserCompat$ItemReceiver() {
        return "Error";
    }

    public final String MediaMetadataCompat(int i) {
        return "";
    }

    public final boolean ParcelableVolumeInfo(int i) {
        return false;
    }

    public createCubemapFromBitmap() {
    }

    public createCubemapFromBitmap(String str) {
        this.IconCompatParcelizer.add(str);
    }

    /* access modifiers changed from: protected */
    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return new HashMap<>();
    }

    public final void IconCompatParcelizer(int i, Object obj) {
        throw new UnsupportedOperationException(String.format("Cannot add value to %s.", new Object[]{createCubemapFromBitmap.class.getName()}));
    }
}
