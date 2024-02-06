package p040o;

import java.util.HashMap;

/* renamed from: o.getIDSafe */
public final class getIDSafe extends createFromBitmapResource {
    private static final HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Adobe JPEG";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(0, "DCT Encode Version");
        read.put(1, "Flags 0");
        read.put(2, "Flags 1");
        read.put(3, "Color Transform");
    }

    public getIDSafe() {
        read((createCubemapFromCubeFaces) new createFromString(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
