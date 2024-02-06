package p040o;

import java.util.HashMap;

/* renamed from: o.Double2 */
public class Double2 extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Olympus Focus Info";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(0, "Focus Info Version");
        read.put(521, "Auto Focus");
        read.put(528, "Scene Detect");
        read.put(529, "Scene Area");
        read.put(530, "Scene Detect Data");
        read.put(768, "Zoom Step Count");
        read.put(769, "Focus Step Count");
        read.put(771, "Focus Step Infinity");
        read.put(772, "Focus Step Near");
        read.put(773, "Focus Distance");
        read.put(776, "AF Point");
        read.put(808, "AF Info");
        read.put(4609, "External Flash");
        read.put(4611, "External Flash Guide Number");
        read.put(4612, "External Flash Bounce");
        read.put(4613, "External Flash Zoom");
        read.put(4616, "Internal Flash");
        read.put(4617, "Manual Flash");
        read.put(4618, "Macro LED");
        read.put(5376, "Sensor Temperature");
        read.put(5632, "Image Stabilization");
    }

    public Double2() {
        read((createCubemapFromCubeFaces) new Byte2(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
