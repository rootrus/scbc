package p040o;

import java.util.HashMap;

/* renamed from: o.isCompatible */
public final class isCompatible extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "WebP";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(1, "Image Height");
        write.put(2, "Image Width");
        write.put(3, "Has Alpha");
        write.put(4, "Is Animation");
    }

    public isCompatible() {
        read((createCubemapFromCubeFaces) new getDummyElement(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
