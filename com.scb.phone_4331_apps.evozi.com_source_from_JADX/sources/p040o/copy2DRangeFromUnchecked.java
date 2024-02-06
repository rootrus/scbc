package p040o;

import java.util.HashMap;

/* renamed from: o.copy2DRangeFromUnchecked */
public final class copy2DRangeFromUnchecked extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "PanasonicRaw WbInfo2";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(0, "Num WB Entries");
        read.put(0, "Num WB Entries");
        read.put(1, "WB Type 1");
        read.put(2, "WB RGB Levels 1");
        read.put(5, "WB Type 2");
        read.put(6, "WB RGB Levels 2");
        read.put(9, "WB Type 3");
        read.put(10, "WB RGB Levels 3");
        read.put(13, "WB Type 4");
        read.put(14, "WB RGB Levels 4");
        read.put(17, "WB Type 5");
        read.put(18, "WB RGB Levels 5");
        read.put(21, "WB Type 6");
        read.put(22, "WB RGB Levels 6");
        read.put(25, "WB Type 7");
        read.put(26, "WB RGB Levels 7");
    }

    public copy2DRangeFromUnchecked() {
        read((createCubemapFromCubeFaces) new copy1DRangeFrom(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
