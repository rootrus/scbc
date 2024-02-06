package p040o;

import java.util.HashMap;

/* renamed from: o.copy2DRangeToUnchecked */
public final class copy2DRangeToUnchecked extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "PrintIM";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(0, "PrintIM Version");
    }

    public copy2DRangeToUnchecked() {
        read((createCubemapFromCubeFaces) new copyFrom(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
