package p040o;

import java.util.HashMap;
import okhttp3.internal.http2.Settings;

/* renamed from: o.I32_4 */
public class I32_4 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Sony Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(16, "Camera Info");
        write.put(32, "Focus Info");
        write.put(258, "Image Quality");
        write.put(260, "Flash Exposure Compensation");
        write.put(261, "Teleconverter Model");
        write.put(274, "White Balance Fine Tune Value");
        write.put(276, "Camera Settings");
        write.put(277, "White Balance");
        write.put(278, "Extra Info");
        write.put(3584, "Print Image Matching (PIM) Info");
        write.put(4096, "Multi Burst Mode");
        write.put(4097, "Multi Burst Image Width");
        write.put(4098, "Multi Burst Image Height");
        write.put(4099, "Panorama");
        write.put(8193, "Preview Image");
        write.put(8194, "Rating");
        write.put(8196, "Contrast");
        write.put(8197, "Saturation");
        write.put(8198, "Sharpness");
        write.put(8199, "Brightness");
        write.put(8200, "Long Exposure Noise Reduction");
        write.put(8201, "High ISO Noise Reduction");
        write.put(8202, "HDR");
        write.put(8203, "Multi Frame Noise Reduction");
        write.put(8206, "Picture Effect");
        write.put(8207, "Soft Skin Effect");
        write.put(8209, "Vignetting Correction");
        write.put(8210, "Lateral Chromatic Aberration");
        write.put(8211, "Distortion Correction");
        write.put(8212, "WB Shift Amber/Magenta");
        write.put(8214, "Auto Portrait Framing");
        write.put(8219, "Focus Mode");
        write.put(8222, "AF Point Selected");
        write.put(Integer.valueOf(C7887a.f3647sL), "Shot Info");
        write.put(Integer.valueOf(C7887a.f3652sQ), "File Format");
        write.put(45057, "Sony Model ID");
        write.put(45088, "Color Mode Setting");
        write.put(45089, "Color Temperature");
        write.put(45090, "Color Compensation Filter");
        write.put(45091, "Scene Mode");
        write.put(45092, "Zone Matching");
        write.put(45093, "Dynamic Range Optimizer");
        write.put(45094, "Image Stabilisation");
        write.put(45095, "Lens ID");
        write.put(45096, "Minolta Makernote");
        write.put(45097, "Color Mode");
        write.put(45098, "Lens Spec");
        write.put(45099, "Full Image Size");
        write.put(45100, "Preview Image Size");
        write.put(45120, "Macro");
        write.put(45121, "Exposure Mode");
        write.put(45122, "Focus Mode");
        write.put(45123, "AF Mode");
        write.put(45124, "AF Illuminator");
        write.put(45127, "Quality");
        write.put(45128, "Flash Level");
        write.put(45129, "Release Mode");
        write.put(45130, "Sequence Number");
        write.put(45131, "Anti Blur");
        write.put(45134, "Long Exposure Noise Reduction");
        write.put(45135, "Dynamic Range Optimizer");
        write.put(45136, "High ISO Noise Reduction");
        write.put(45138, "Intelligent Auto");
        write.put(45140, "White Balance 2");
        write.put(Integer.valueOf(Settings.DEFAULT_INITIAL_WINDOW_SIZE), "No Print");
    }

    public I32_4() {
        read((createCubemapFromCubeFaces) new I64(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
