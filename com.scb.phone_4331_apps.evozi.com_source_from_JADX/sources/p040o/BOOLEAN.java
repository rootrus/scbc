package p040o;

import java.util.HashMap;

/* renamed from: o.BOOLEAN */
public class BOOLEAN extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Olympus Raw Development 2";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(0, "Raw Dev Version");
        write.put(256, "Raw Dev Exposure Bias Value");
        write.put(257, "Raw Dev White Balance");
        write.put(258, "Raw Dev White Balance Value");
        write.put(259, "Raw Dev WB Fine Adjustment");
        write.put(260, "Raw Dev Gray Point");
        write.put(261, "Raw Dev Contrast Value");
        write.put(262, "Raw Dev Sharpness Value");
        write.put(263, "Raw Dev Saturation Emphasis");
        write.put(264, "Raw Dev Memory Color Emphasis");
        write.put(265, "Raw Dev Color Space");
        write.put(266, "Raw Dev Noise Reduction");
        write.put(267, "Raw Dev Engine");
        write.put(268, "Raw Dev Picture Mode");
        write.put(269, "Raw Dev PM Saturation");
        write.put(270, "Raw Dev PM Contrast");
        write.put(271, "Raw Dev PM Sharpness");
        write.put(272, "Raw Dev PM BW Filter");
        write.put(273, "Raw Dev PM Picture Tone");
        write.put(274, "Raw Dev Gradation");
        write.put(275, "Raw Dev Saturation 3");
        write.put(281, "Raw Dev Auto Gradation");
        write.put(288, "Raw Dev PM Noise Filter");
        write.put(289, "Raw Dev Art Filter");
    }

    public BOOLEAN() {
        read((createCubemapFromCubeFaces) new ALLOCATION(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
