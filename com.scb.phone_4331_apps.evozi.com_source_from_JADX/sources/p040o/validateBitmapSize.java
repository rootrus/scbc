package p040o;

import java.util.HashMap;

/* renamed from: o.validateBitmapSize */
public class validateBitmapSize extends elementFromBitmap {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Exif Thumbnail";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        write(hashMap);
        read.put(513, "Thumbnail Offset");
        read.put(514, "Thumbnail Length");
    }

    public validateBitmapSize() {
        read((createCubemapFromCubeFaces) new validateIsFloat64(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
