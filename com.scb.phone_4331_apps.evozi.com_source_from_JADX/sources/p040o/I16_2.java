package p040o;

import java.util.HashMap;

/* renamed from: o.I16_2 */
public final class I16_2 extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Reconyx HyperFire Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(0, "Makernote Version");
        read.put(2, "Firmware Version");
        read.put(12, "Trigger Mode");
        read.put(14, "Sequence");
        read.put(18, "Event Number");
        read.put(22, "Date/Time Original");
        read.put(36, "Moon Phase");
        read.put(38, "Ambient Temperature Fahrenheit");
        read.put(40, "Ambient Temperature");
        read.put(42, "Serial Number");
        read.put(72, "Contrast");
        read.put(74, "Brightness");
        read.put(76, "Sharpness");
        read.put(78, "Saturation");
        read.put(80, "Infrared Illuminator");
        read.put(82, "Motion Sensitivity");
        read.put(84, "Battery Voltage");
        read.put(86, "User Label");
    }

    public I16_2() {
        read((createCubemapFromCubeFaces) new F64_4(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
