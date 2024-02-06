package p040o;

import com.kofax.mobile.sdk.capture.check.KtaCheckExtractor;
import java.io.IOException;
import java.util.HashMap;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.nAllocationSetSurface;

/* renamed from: o.F32_4 */
public class F32_4 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Panasonic Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(1, "Quality Mode");
        write.put(2, "Version");
        write.put(3, "White Balance");
        write.put(7, "Focus Mode");
        write.put(15, "AF Area Mode");
        write.put(26, "Image Stabilization");
        write.put(28, "Macro Mode");
        write.put(31, "Record Mode");
        write.put(32, "Audio");
        write.put(37, "Internal Serial Number");
        write.put(33, "Unknown Data Dump");
        write.put(34, "Easy Mode");
        write.put(35, "White Balance Bias");
        write.put(36, "Flash Bias");
        write.put(38, "Exif Version");
        write.put(40, "Color Effect");
        write.put(41, "Camera Uptime");
        write.put(42, "Burst Mode");
        write.put(43, "Sequence Number");
        write.put(44, "Contrast Mode");
        write.put(45, "Noise Reduction");
        write.put(46, "Self Timer");
        write.put(48, "Rotation");
        write.put(49, "AF Assist Lamp");
        write.put(50, "Color Mode");
        write.put(51, "Baby Age");
        write.put(52, "Optical Zoom Mode");
        write.put(53, "Conversion Lens");
        write.put(54, "Travel Day");
        write.put(57, "Contrast");
        write.put(58, "World Time Location");
        write.put(59, "Text Stamp");
        write.put(60, "Program ISO");
        write.put(61, "Advanced Scene Mode");
        write.put(3584, "Print Image Matching (PIM) Info");
        write.put(63, "Number of Detected Faces");
        write.put(64, "Saturation");
        write.put(65, "Sharpness");
        write.put(66, "Film Mode");
        write.put(68, "Color Temp Kelvin");
        write.put(69, "Bracket Settings");
        write.put(70, "White Balance Adjust (AB)");
        write.put(71, "White Balance Adjust (GM)");
        write.put(72, "Flash Curtain");
        write.put(73, "Long Exposure Noise Reduction");
        write.put(75, "Panasonic Image Width");
        write.put(76, "Panasonic Image Height");
        write.put(77, "Af Point Position");
        write.put(78, "Face Detection Info");
        write.put(81, "Lens Type");
        write.put(82, "Lens Serial Number");
        write.put(83, "Accessory Type");
        write.put(84, "Accessory Serial Number");
        write.put(89, "Transform");
        write.put(93, "Intelligent Exposure");
        write.put(96, "Lens Firmware Version");
        write.put(97, "Face Recognition Info");
        write.put(98, "Flash Warning");
        write.put(99, "Recognized Face Flags");
        write.put(101, "Title");
        write.put(102, "Baby Name");
        write.put(103, "Location");
        write.put(105, KtaCheckExtractor.COUNTRY);
        write.put(107, "State");
        write.put(109, "City");
        write.put(111, "Landmark");
        write.put(112, "Intelligent Resolution");
        write.put(119, "Burst Speed");
        write.put(121, "Intelligent D-Range");
        write.put(Integer.valueOf(EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE), "Clear Retouch");
        write.put(128, "City 2");
        write.put(Integer.valueOf(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA), "Photo Style");
        write.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_RC4_128_SHA), "Shading Compensation");
        write.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA), "Accelerometer Z");
        write.put(141, "Accelerometer X");
        write.put(142, "Accelerometer Y");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA), "Camera Orientation");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA), "Roll Angle");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA), "Pitch Angle");
        write.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA), "Sweep Panorama Direction");
        write.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA), "Sweep Panorama Field Of View");
        write.put(Integer.valueOf(CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA), "Timer Recording");
        write.put(Integer.valueOf(CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384), "Internal ND Filter");
        write.put(158, "HDR");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384), "Shutter Type");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384), "Clear Retouch Value");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384), "Touch AE");
        write.put(32768, "Makernote Version");
        write.put(32769, "Scene Mode");
        write.put(32772, "White Balance (Red)");
        write.put(32773, "White Balance (Green)");
        write.put(32774, "White Balance (Blue)");
        write.put(32775, "Flash Fired");
        write.put(62, "Text Stamp 1");
        write.put(32776, "Text Stamp 2");
        write.put(32777, "Text Stamp 3");
        write.put(32784, "Baby Age 1");
        write.put(32786, "Transform 1");
    }

    public F32_4() {
        read((createCubemapFromCubeFaces) new F32_2(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }

    public final nContextSendMessage[] read() {
        byte[] IconCompatParcelizer = IconCompatParcelizer(78);
        if (IconCompatParcelizer == null) {
            return null;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(IconCompatParcelizer);
        staggeredGridLayoutManager.MediaBrowserCompat$CustomActionResultReceiver = false;
        try {
            int MediaSessionCompat$ResultReceiverWrapper = staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(0);
            if (MediaSessionCompat$ResultReceiverWrapper == 0) {
                return null;
            }
            nContextSendMessage[] ncontextsendmessageArr = new nContextSendMessage[MediaSessionCompat$ResultReceiverWrapper];
            for (int i = 0; i < MediaSessionCompat$ResultReceiverWrapper; i++) {
                int i2 = (i << 3) + 2;
                ncontextsendmessageArr[i] = new nContextSendMessage(staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(i2), staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(i2 + 2), staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(i2 + 4), staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(i2 + 6), (String) null, (nAllocationSetSurface.RatingCompat) null);
            }
            return ncontextsendmessageArr;
        } catch (IOException unused) {
            return null;
        }
    }

    public final nContextSendMessage[] RatingCompat() {
        byte[] IconCompatParcelizer = IconCompatParcelizer(97);
        if (IconCompatParcelizer == null) {
            return null;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(IconCompatParcelizer);
        staggeredGridLayoutManager.MediaBrowserCompat$CustomActionResultReceiver = false;
        try {
            int MediaSessionCompat$ResultReceiverWrapper = staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(0);
            if (MediaSessionCompat$ResultReceiverWrapper == 0) {
                return null;
            }
            nContextSendMessage[] ncontextsendmessageArr = new nContextSendMessage[MediaSessionCompat$ResultReceiverWrapper];
            for (int i = 0; i < MediaSessionCompat$ResultReceiverWrapper; i++) {
                int i2 = (i * 44) + 4;
                ncontextsendmessageArr[i] = new nContextSendMessage(staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(i2 + 20), staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(i2 + 22), staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(i2 + 24), staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(i2 + 26), staggeredGridLayoutManager.MediaBrowserCompat$ItemReceiver(i2, 20, "ASCII").trim(), nAllocationSetSurface.RatingCompat.write(staggeredGridLayoutManager.MediaBrowserCompat$ItemReceiver(i2 + 28, 20, "ASCII").trim()));
            }
            return ncontextsendmessageArr;
        } catch (IOException unused) {
            return null;
        }
    }
}
