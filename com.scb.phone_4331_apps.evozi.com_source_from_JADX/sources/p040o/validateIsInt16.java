package p040o;

import java.util.HashMap;

/* renamed from: o.validateIsInt16 */
public class validateIsInt16 extends elementFromBitmap {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Exif SubIFD";
    }

    public validateIsInt16() {
        read((createCubemapFromCubeFaces) new validateBitmapFormat(this));
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        write(hashMap);
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
