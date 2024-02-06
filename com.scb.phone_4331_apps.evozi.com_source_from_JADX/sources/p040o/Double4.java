package p040o;

import java.util.HashMap;

/* renamed from: o.Double4 */
public class Double4 extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Olympus Image Processing";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(0, "Image Processing Version");
        read.put(256, "WB RB Levels");
        read.put(258, "WB RB Levels 3000K");
        read.put(259, "WB RB Levels 3300K");
        read.put(260, "WB RB Levels 3600K");
        read.put(261, "WB RB Levels 3900K");
        read.put(262, "WB RB Levels 4000K");
        read.put(263, "WB RB Levels 4300K");
        read.put(264, "WB RB Levels 4500K");
        read.put(265, "WB RB Levels 4800K");
        read.put(266, "WB RB Levels 5300K");
        read.put(267, "WB RB Levels 6000K");
        read.put(268, "WB RB Levels 6600K");
        read.put(269, "WB RB Levels 7500K");
        read.put(270, "WB RB Levels CWB1");
        read.put(271, "WB RB Levels CWB2");
        read.put(272, "WB RB Levels CWB3");
        read.put(273, "WB RB Levels CWB4");
        read.put(275, "WB G Level 3000K");
        read.put(276, "WB G Level 3300K");
        read.put(277, "WB G Level 3600K");
        read.put(278, "WB G Level 3900K");
        read.put(279, "WB G Level 4000K");
        read.put(280, "WB G Level 4300K");
        read.put(281, "WB G Level 4500K");
        read.put(282, "WB G Level 4800K");
        read.put(283, "WB G Level 5300K");
        read.put(284, "WB G Level 6000K");
        read.put(285, "WB G Level 6600K");
        read.put(286, "WB G Level 7500K");
        read.put(287, "WB G Level");
        read.put(512, "Color Matrix");
        read.put(768, "Enhancer");
        read.put(769, "Enhancer Values");
        read.put(784, "Coring Filter");
        read.put(785, "Coring Values");
        read.put(1536, "Black Level 2");
        read.put(1552, "Gain Base");
        read.put(1553, "Valid Bits");
        read.put(1554, "Crop Left");
        read.put(1555, "Crop Top");
        read.put(1556, "Crop Width");
        read.put(1557, "Crop Height");
        read.put(1589, "Unknown Block 1");
        read.put(1590, "Unknown Block 2");
        read.put(2053, "Sensor Calibration");
        read.put(4112, "Noise Reduction 2");
        read.put(4113, "Distortion Correction 2");
        read.put(4114, "Shading Compensation 2");
        read.put(4124, "Multiple Exposure Mode");
        read.put(4355, "Unknown Block 3");
        read.put(4356, "Unknown Block 4");
        read.put(4370, "Aspect Ratio");
        read.put(4371, "Aspect Frame");
        read.put(4608, "Faces Detected");
        read.put(4609, "Face Detect Area");
        read.put(4610, "Max Faces");
        read.put(4611, "Face Detect Frame Size");
        read.put(4615, "Face Detect Frame Crop");
        read.put(4870, "Camera Temperature");
        read.put(6400, "Keystone Compensation");
        read.put(6401, "Keystone Direction");
        read.put(6406, "Keystone Value");
    }

    public Double4() {
        read((createCubemapFromCubeFaces) new Byte4(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
