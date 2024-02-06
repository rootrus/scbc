package p040o;

import java.util.HashMap;

/* renamed from: o.getType */
public class getType extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Fujifilm Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(0, "Makernote Version");
        read.put(16, "Serial Number");
        read.put(4096, "Quality");
        read.put(4097, "Sharpness");
        read.put(4098, "White Balance");
        read.put(4099, "Color Saturation");
        read.put(4100, "Tone (Contrast)");
        read.put(4101, "Color Temperature");
        read.put(4102, "Contrast");
        read.put(4106, "White Balance Fine Tune");
        read.put(4107, "Noise Reduction");
        read.put(4110, "High ISO Noise Reduction");
        read.put(4112, "Flash Mode");
        read.put(4113, "Flash Strength");
        read.put(4128, "Macro");
        read.put(4129, "Focus Mode");
        read.put(4131, "Focus Pixel");
        read.put(4144, "Slow Sync");
        read.put(4145, "Picture Mode");
        read.put(4147, "EXR Auto");
        read.put(4148, "EXR Mode");
        read.put(4352, "Auto Bracketing");
        read.put(4353, "Sequence Number");
        read.put(4624, "FinePix Color Setting");
        read.put(4864, "Blur Warning");
        read.put(4865, "Focus Warning");
        read.put(4866, "AE Warning");
        read.put(4868, "GE Image Size");
        read.put(5120, "Dynamic Range");
        read.put(5121, "Film Mode");
        read.put(5122, "Dynamic Range Setting");
        read.put(5123, "Development Dynamic Range");
        read.put(5124, "Minimum Focal Length");
        read.put(5125, "Maximum Focal Length");
        read.put(5126, "Maximum Aperture at Minimum Focal Length");
        read.put(5127, "Maximum Aperture at Maximum Focal Length");
        read.put(5131, "Auto Dynamic Range");
        read.put(16640, "Faces Detected");
        read.put(16643, "Face Positions");
        read.put(17026, "Face Detection Data");
        read.put(32768, "File Source");
        read.put(32770, "Order Number");
        read.put(32771, "Frame Number");
        read.put(45585, "Parallax");
    }

    public getType() {
        read((createCubemapFromCubeFaces) new getStride(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
