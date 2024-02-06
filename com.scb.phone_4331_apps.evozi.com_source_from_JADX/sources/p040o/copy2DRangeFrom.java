package p040o;

import java.util.HashMap;

/* renamed from: o.copy2DRangeFrom */
public class copy2DRangeFrom extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "PanasonicRaw Exif IFD0";
    }

    public copy2DRangeFrom() {
        read((createCubemapFromCubeFaces) new copy2DRangeTo(this));
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(1, "Panasonic Raw Version");
        write.put(2, "Sensor Width");
        write.put(3, "Sensor Height");
        write.put(4, "Sensor Top Border");
        write.put(5, "Sensor Left Border");
        write.put(6, "Sensor Bottom Border");
        write.put(7, "Sensor Right Border");
        write.put(8, "Black Level 1");
        write.put(9, "Black Level 2");
        write.put(10, "Black Level 3");
        write.put(14, "Linearity Limit Red");
        write.put(15, "Linearity Limit Green");
        write.put(16, "Linearity Limit Blue");
        write.put(17, "Red Balance");
        write.put(18, "Blue Balance");
        write.put(23, "ISO");
        write.put(24, "High ISO Multiplier Red");
        write.put(25, "High ISO Multiplier Green");
        write.put(26, "High ISO Multiplier Blue");
        write.put(28, "Black Level Red");
        write.put(29, "Black Level Green");
        write.put(30, "Black Level Blue");
        write.put(36, "WB Red Level");
        write.put(37, "WB Green Level");
        write.put(38, "WB Blue Level");
        write.put(46, "Jpg From Raw");
        write.put(47, "Crop Top");
        write.put(48, "Crop Left");
        write.put(49, "Crop Bottom");
        write.put(50, "Crop Right");
        write.put(271, "Make");
        write.put(272, "Model");
        write.put(273, "Strip Offsets");
        write.put(274, "Orientation");
        write.put(278, "Rows Per Strip");
        write.put(279, "Strip Byte Counts");
        write.put(280, "Raw Data Offset");
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
