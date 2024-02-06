package p040o;

import java.util.HashMap;

/* renamed from: o.BaseObj */
public class BaseObj extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Leica Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(771, "Lens Model");
        write.put(1031, "Original File Name");
        write.put(1032, "Original Directory");
        write.put(1037, "Exposure Mode");
        write.put(1040, "Shot Info");
        write.put(1042, "Film Mode");
        write.put(1043, "WB RGB Levels");
    }

    public BaseObj() {
        read((createCubemapFromCubeFaces) new ioSendOutput(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
