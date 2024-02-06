package p040o;

import java.util.HashMap;

/* renamed from: o.I32_3 */
public class I32_3 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Sanyo Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(255, "Makernote Offset");
        write.put(256, "Sanyo Thumbnail");
        write.put(512, "Special Mode");
        write.put(513, "Sanyo Quality");
        write.put(514, "Macro");
        write.put(516, "Digital Zoom");
        write.put(519, "Software Version");
        write.put(520, "Pict Info");
        write.put(521, "Camera ID");
        write.put(526, "Sequential Shot");
        write.put(527, "Wide Range");
        write.put(528, "Color Adjustment Node");
        write.put(531, "Quick Shot");
        write.put(532, "Self Timer");
        write.put(534, "Voice Memo");
        write.put(535, "Record Shutter Release");
        write.put(536, "Flicker Reduce");
        write.put(537, "Optical Zoom On");
        write.put(539, "Digital Zoom On");
        write.put(541, "Light Source Special");
        write.put(542, "Resaved");
        write.put(543, "Scene Select");
        write.put(547, "Manual Focus Distance or Face Info");
        write.put(548, "Sequence Shot Interval");
        write.put(549, "Flash Mode");
        write.put(3584, "Print IM");
        write.put(3840, "Data Dump");
    }

    public I32_3() {
        read((createCubemapFromCubeFaces) new I16_4(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
