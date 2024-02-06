package p040o;

import java.util.HashMap;

/* renamed from: o.getDataKind */
public final class getDataKind extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "PNG Chromaticities";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(1, "White Point X");
        read.put(2, "White Point Y");
        read.put(3, "Red X");
        read.put(4, "Red Y");
        read.put(5, "Green X");
        read.put(6, "Green Y");
        read.put(7, "Blue X");
        read.put(8, "Blue Y");
    }

    public getDataKind() {
        read(new createCubemapFromCubeFaces(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
