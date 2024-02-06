package p040o;

import java.util.HashMap;

/* renamed from: o.ioReceive */
public class ioReceive extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Casio Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(2, "Thumbnail Dimensions");
        read.put(3, "Thumbnail Size");
        read.put(4, "Thumbnail Offset");
        read.put(8, "Quality Mode");
        read.put(9, "Image Size");
        read.put(13, "Focus Mode");
        read.put(20, "ISO Sensitivity");
        read.put(25, "White Balance");
        read.put(29, "Focal Length");
        read.put(31, "Saturation");
        read.put(32, "Contrast");
        read.put(33, "Sharpness");
        read.put(3584, "Print Image Matching (PIM) Info");
        read.put(8192, "Casio Preview Thumbnail");
        read.put(8209, "White Balance Bias");
        read.put(8210, "White Balance");
        read.put(8226, "Object Distance");
        read.put(8244, "Flash Distance");
        read.put(Integer.valueOf(C7887a.f3647sL), "Record Mode");
        read.put(12289, "Self Timer");
        read.put(12290, "Quality");
        read.put(12291, "Focus Mode");
        read.put(12294, "Time Zone");
        read.put(12295, "BestShot Mode");
        read.put(12308, "CCD ISO Sensitivity");
        read.put(12309, "Colour Mode");
        read.put(12310, "Enhancement");
        read.put(12311, "Filter");
    }

    public ioReceive() {
        read((createCubemapFromCubeFaces) new getElement(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
