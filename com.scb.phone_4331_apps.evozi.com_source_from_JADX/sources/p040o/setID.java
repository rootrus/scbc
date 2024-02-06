package p040o;

import com.google.android.gms.location.places.Place;
import java.util.HashMap;

/* renamed from: o.setID */
public class setID extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Olympus Equipment";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(0, "Equipment Version");
        write.put(256, "Camera Type 2");
        write.put(257, "Serial Number");
        write.put(258, "Internal Serial Number");
        write.put(259, "Focal Plane Diagonal");
        write.put(260, "Body Firmware Version");
        write.put(513, "Lens Type");
        write.put(514, "Lens Serial Number");
        write.put(515, "Lens Model");
        write.put(516, "Lens Firmware Version");
        write.put(517, "Max Aperture At Min Focal");
        write.put(518, "Max Aperture At Max Focal");
        write.put(519, "Min Focal Length");
        write.put(520, "Max Focal Length");
        write.put(522, "Max Aperture");
        write.put(523, "Lens Properties");
        write.put(769, "Extender");
        write.put(770, "Extender Serial Number");
        write.put(771, "Extender Model");
        write.put(772, "Extender Firmware Version");
        write.put(Integer.valueOf(Place.TYPE_SUBLOCALITY_LEVEL_5), "Conversion Lens");
        write.put(4096, "Flash Type");
        write.put(4097, "Flash Model");
        write.put(4098, "Flash Firmware Version");
        write.put(4099, "Flash Serial Number");
    }

    public setID() {
        read((createCubemapFromCubeFaces) new checkValid(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
