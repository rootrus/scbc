package p040o;

import java.util.HashMap;

/* renamed from: o.validateIsObject */
public final class validateIsObject extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "PanasonicRaw DistortionInfo";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(2, "Distortion Param 2");
        write.put(4, "Distortion Param 4");
        write.put(5, "Distortion Scale");
        write.put(7, "Distortion Correction");
        write.put(8, "Distortion Param 8");
        write.put(9, "Distortion Param 9");
        write.put(11, "Distortion Param 11");
        write.put(12, "Distortion N");
    }

    public validateIsObject() {
        read((createCubemapFromCubeFaces) new validateIsInt64(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
