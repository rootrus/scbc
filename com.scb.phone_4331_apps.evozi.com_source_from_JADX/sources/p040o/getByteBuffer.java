package p040o;

import java.util.HashMap;

/* renamed from: o.getByteBuffer */
public class getByteBuffer extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Casio Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(20, "CCD Sensitivity");
        write.put(12, "Contrast");
        write.put(10, "Digital Zoom");
        write.put(5, "Flash Intensity");
        write.put(4, "Flash Mode");
        write.put(3, "Focusing Mode");
        write.put(6, "Object Distance");
        write.put(2, "Quality");
        write.put(1, "Recording Mode");
        write.put(13, "Saturation");
        write.put(11, "Sharpness");
        write.put(8, "Makernote Unknown 1");
        write.put(9, "Makernote Unknown 2");
        write.put(14, "Makernote Unknown 3");
        write.put(15, "Makernote Unknown 4");
        write.put(16, "Makernote Unknown 5");
        write.put(17, "Makernote Unknown 6");
        write.put(18, "Makernote Unknown 7");
        write.put(19, "Makernote Unknown 8");
        write.put(7, "White Balance");
    }

    public getByteBuffer() {
        read((createCubemapFromCubeFaces) new getIncAllocID(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
