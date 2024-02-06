package p040o;

import java.util.HashMap;

/* renamed from: o.RGBA_5551 */
public final class RGBA_5551 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "GIF Comment";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(1, "Comment");
    }

    public RGBA_5551(createFromBitmap createfrombitmap) {
        read((createCubemapFromCubeFaces) new MATRIX_4X4(this));
        IconCompatParcelizer(1, createfrombitmap);
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
