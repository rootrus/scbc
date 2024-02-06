package p040o;

import java.util.HashMap;

/* renamed from: o.copy3DRangeFrom */
public class copy3DRangeFrom extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Apple Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(3, "Run Time");
        write.put(10, "HDR Image Type");
        write.put(11, "Burst UUID");
    }

    public copy3DRangeFrom() {
        read((createCubemapFromCubeFaces) new finalize(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
