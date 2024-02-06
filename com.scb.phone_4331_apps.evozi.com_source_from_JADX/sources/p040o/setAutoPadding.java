package p040o;

import java.util.HashMap;

/* renamed from: o.setAutoPadding */
public class setAutoPadding extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Kyocera/Contax Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(1, "Proprietary Thumbnail Format Data");
        write.put(3584, "Print Image Matching (PIM) Info");
    }

    public setAutoPadding() {
        read((createCubemapFromCubeFaces) new setIncAllocID(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
