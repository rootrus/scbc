package p040o;

import java.util.HashMap;

/* renamed from: o.createUser */
public final class createUser extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Ducky";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(1, "Quality");
        read.put(2, "Comment");
        read.put(3, "Copyright");
    }

    public createUser() {
        read(new createCubemapFromCubeFaces(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
