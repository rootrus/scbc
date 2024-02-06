package p040o;

import java.util.HashMap;

/* renamed from: o.A_8 */
public class A_8 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Olympus Raw Development";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(0, "Raw Dev Version");
        write.put(256, "Raw Dev Exposure Bias Value");
        write.put(257, "Raw Dev White Balance Value");
        write.put(258, "Raw Dev WB Fine Adjustment");
        write.put(259, "Raw Dev Gray Point");
        write.put(260, "Raw Dev Saturation Emphasis");
        write.put(261, "Raw Dev Memory Color Emphasis");
        write.put(262, "Raw Dev Contrast Value");
        write.put(263, "Raw Dev Sharpness Value");
        write.put(264, "Raw Dev Color Space");
        write.put(265, "Raw Dev Engine");
        write.put(266, "Raw Dev Noise Reduction");
        write.put(267, "Raw Dev Edit Status");
        write.put(268, "Raw Dev Settings");
    }

    public A_8() {
        read((createCubemapFromCubeFaces) new C10821Element(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
