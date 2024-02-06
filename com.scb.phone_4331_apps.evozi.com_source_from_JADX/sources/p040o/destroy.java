package p040o;

import java.util.HashMap;

/* renamed from: o.destroy */
public final class destroy extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "PanasonicRaw WbInfo";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(0, "Num WB Entries");
        write.put(1, "WB Type 1");
        write.put(2, "WB RGB Levels 1");
        write.put(4, "WB Type 2");
        write.put(5, "WB RGB Levels 2");
        write.put(7, "WB Type 3");
        write.put(8, "WB RGB Levels 3");
        write.put(10, "WB Type 4");
        write.put(11, "WB RGB Levels 4");
        write.put(13, "WB Type 5");
        write.put(14, "WB RGB Levels 5");
        write.put(16, "WB Type 6");
        write.put(17, "WB RGB Levels 6");
        write.put(19, "WB Type 7");
        write.put(20, "WB RGB Levels 7");
    }

    public destroy() {
        read((createCubemapFromCubeFaces) new copy1DRangeTo(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
