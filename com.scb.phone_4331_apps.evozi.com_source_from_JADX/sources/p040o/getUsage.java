package p040o;

import java.util.HashMap;

/* renamed from: o.getUsage */
public final class getUsage extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Kodak Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(0, "Kodak Model");
        write.put(9, "Quality");
        write.put(10, "Burst Mode");
        write.put(12, "Image Width");
        write.put(14, "Image Height");
        write.put(16, "Year Created");
        write.put(18, "Month/Day Created");
        write.put(20, "Time Created");
        write.put(24, "Burst Mode 2");
        write.put(27, "Shutter Speed");
        write.put(28, "Metering Mode");
        write.put(29, "Sequence Number");
        write.put(30, "F Number");
        write.put(32, "Exposure Time");
        write.put(36, "Exposure Compensation");
        write.put(56, "Focus Mode");
        write.put(64, "White Balance");
        write.put(92, "Flash Mode");
        write.put(93, "Flash Fired");
        write.put(94, "ISO Setting");
        write.put(96, "ISO");
        write.put(98, "Total Zoom");
        write.put(100, "Date/Time Stamp");
        write.put(102, "Color Mode");
        write.put(104, "Digital Zoom");
        write.put(107, "Sharpness");
    }

    public getUsage() {
        read((createCubemapFromCubeFaces) new ioSend(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
