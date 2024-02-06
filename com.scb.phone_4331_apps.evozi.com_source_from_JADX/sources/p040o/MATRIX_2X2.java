package p040o;

import java.util.HashMap;

/* renamed from: o.MATRIX_2X2 */
public final class MATRIX_2X2 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "GIF Animation";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(1, "Iteration Count");
    }

    public MATRIX_2X2() {
        read((createCubemapFromCubeFaces) new I8_2(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
