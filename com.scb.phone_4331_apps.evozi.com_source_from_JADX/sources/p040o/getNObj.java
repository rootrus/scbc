package p040o;

import com.google.android.gms.location.places.Place;
import java.util.HashMap;

/* renamed from: o.getNObj */
public class getNObj extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Olympus Camera Settings";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(0, "Camera Settings Version");
        write.put(256, "Preview Image Valid");
        write.put(257, "Preview Image Start");
        write.put(258, "Preview Image Length");
        write.put(512, "Exposure Mode");
        write.put(513, "AE Lock");
        write.put(514, "Metering Mode");
        write.put(515, "Exposure Shift");
        write.put(516, "ND Filter");
        write.put(768, "Macro Mode");
        write.put(769, "Focus Mode");
        write.put(770, "Focus Process");
        write.put(771, "AF Search");
        write.put(772, "AF Areas");
        write.put(773, "AF Point Selected");
        write.put(774, "AF Fine Tune");
        write.put(775, "AF Fine Tune Adj");
        write.put(1024, "Flash Mode");
        write.put(Integer.valueOf(Place.TYPE_SUBLOCALITY_LEVEL_3), "Flash Exposure Comp");
        write.put(Integer.valueOf(Place.TYPE_SUBLOCALITY_LEVEL_5), "Flash Remote Control");
        write.put(Integer.valueOf(Place.TYPE_SUBPREMISE), "Flash Control Mode");
        write.put(Integer.valueOf(Place.TYPE_SYNTHETIC_GEOCODE), "Flash Intensity");
        write.put(Integer.valueOf(Place.TYPE_TRANSIT_STATION), "Manual Flash Strength");
        write.put(1280, "White Balance 2");
        write.put(1281, "White Balance Temperature");
        write.put(1282, "White Balance Bracket");
        write.put(1283, "Custom Saturation");
        write.put(1284, "Modified Saturation");
        write.put(1285, "Contrast Setting");
        write.put(1286, "Sharpness Setting");
        write.put(1287, "Color Space");
        write.put(1289, "Scene Mode");
        write.put(1290, "Noise Reduction");
        write.put(1291, "Distortion Correction");
        write.put(1292, "Shading Compensation");
        write.put(1293, "Compression Factor");
        write.put(1295, "Gradation");
        write.put(1312, "Picture Mode");
        write.put(1313, "Picture Mode Saturation");
        write.put(1314, "Picture Mode Hue");
        write.put(1315, "Picture Mode Contrast");
        write.put(1316, "Picture Mode Sharpness");
        write.put(1317, "Picture Mode BW Filter");
        write.put(1318, "Picture Mode Tone");
        write.put(1319, "Noise Filter");
        write.put(1321, "Art Filter");
        write.put(1324, "Magic Filter");
        write.put(1325, "Picture Mode Effect");
        write.put(1326, "Tone Level");
        write.put(1327, "Art Filter Effect");
        write.put(1330, "Color Creator Effect");
        write.put(1536, "Drive Mode");
        write.put(1537, "Panorama Mode");
        write.put(1539, "Image Quality 2");
        write.put(1540, "Image Stabilization");
        write.put(2052, "Stacked Image");
        write.put(2304, "Manometer Pressure");
        write.put(2305, "Manometer Reading");
        write.put(2306, "Extended WB Detect");
        write.put(2307, "Roll Angle");
        write.put(2308, "Pitch Angle");
        write.put(2312, "Date Time UTC");
    }

    public getNObj() {
        read((createCubemapFromCubeFaces) new getID(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
