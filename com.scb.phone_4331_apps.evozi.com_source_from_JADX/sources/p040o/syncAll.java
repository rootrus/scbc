package p040o;

import java.util.HashMap;

/* renamed from: o.syncAll */
public class syncAll extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Nikon Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(6, "CCD Sensitivity");
        write.put(4, "Color Mode");
        write.put(10, "Digital Zoom");
        write.put(11, "Fisheye Converter");
        write.put(8, "Focus");
        write.put(5, "Image Adjustment");
        write.put(3, "Quality");
        write.put(2, "Makernote Unknown 1");
        write.put(9, "Makernote Unknown 2");
        write.put(3840, "Makernote Unknown 3");
        write.put(7, "White Balance");
    }

    public syncAll() {
        read((createCubemapFromCubeFaces) new helpDestroy(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
