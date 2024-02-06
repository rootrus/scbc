package p040o;

import java.util.HashMap;

/* renamed from: o.F64 */
public class F64 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Olympus Raw Info";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(0, "Raw Info Version");
        write.put(256, "WB RB Levels Used");
        write.put(272, "WB RB Levels Auto");
        write.put(288, "WB RB Levels Shade");
        write.put(289, "WB RB Levels Cloudy");
        write.put(290, "WB RB Levels Fine Weather");
        write.put(291, "WB RB Levels Tungsten");
        write.put(292, "WB RB Levels Evening Sunlight");
        write.put(304, "WB RB Levels Daylight Fluor");
        write.put(305, "WB RB Levels Day White Fluor");
        write.put(306, "WB RB Levels Cool White Fluor");
        write.put(307, "WB RB Levels White Fluorescent");
        write.put(512, "Color Matrix 2");
        write.put(784, "Coring Filter");
        write.put(785, "Coring Values");
        write.put(1536, "Black Level 2");
        write.put(1537, "YCbCrCoefficients");
        write.put(1553, "Valid Pixel Depth");
        write.put(1554, "Crop Left");
        write.put(1555, "Crop Top");
        write.put(1556, "Crop Width");
        write.put(1557, "Crop Height");
        write.put(4096, "Light Source");
        write.put(4097, "White Balance Comp");
        write.put(4112, "Saturation Setting");
        write.put(4113, "Hue Setting");
        write.put(4114, "Contrast Setting");
        write.put(4115, "Sharpness Setting");
        write.put(8192, "CM Exposure Compensation");
        write.put(8193, "CM White Balance");
        write.put(8194, "CM White Balance Comp");
        write.put(8208, "CM White Balance Gray Point");
        write.put(8224, "CM Saturation");
        write.put(8225, "CM Hue");
        write.put(8226, "CM Contrast");
        write.put(8227, "CM Sharpness");
    }

    public F64() {
        read((createCubemapFromCubeFaces) new ELEMENT(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
