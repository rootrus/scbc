package p040o;

import java.util.HashMap;

/* renamed from: o.I16 */
public final class I16 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Reconyx UltraFire Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(0, "Makernote Label");
        write.put(10, "Makernote ID");
        write.put(14, "Makernote Size");
        write.put(18, "Makernote Public ID");
        write.put(22, "Makernote Public Size");
        write.put(24, "Camera Version");
        write.put(31, "Uib Version");
        write.put(38, "Btl Version");
        write.put(45, "Pex Version");
        write.put(52, "Event Type");
        write.put(53, "Sequence");
        write.put(55, "Event Number");
        write.put(59, "Date/Time Original");
        write.put(66, "Day of Week");
        write.put(67, "Moon Phase");
        write.put(68, "Ambient Temperature Fahrenheit");
        write.put(70, "Ambient Temperature");
        write.put(72, "Flash");
        write.put(73, "Battery Voltage");
        write.put(75, "Serial Number");
        write.put(80, "User Label");
    }

    public I16() {
        read((createCubemapFromCubeFaces) new F64_2(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
