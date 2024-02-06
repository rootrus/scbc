package p040o;

import java.util.HashMap;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.jmrtd.PassportService;

/* renamed from: o.generateMipmaps */
public class generateMipmaps extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Canon Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(7, "Firmware Version");
        write.put(8, "Image Number");
        write.put(6, "Image Type");
        write.put(9, "Owner Name");
        write.put(12, "Camera Serial Number");
        write.put(13, "Camera Info Array");
        write.put(14, "File Length");
        write.put(15, "Custom Functions");
        write.put(16, "Canon Model ID");
        write.put(17, "Movie Info Array");
        write.put(49427, "AF Point Selected");
        write.put(49413, "Continuous Drive Mode");
        write.put(49421, "Contrast");
        write.put(49419, "Easy Shooting Mode");
        write.put(49428, "Exposure Mode");
        write.put(49437, "Flash Details");
        write.put(49412, "Flash Mode");
        write.put(49433, "Focal Units per mm");
        write.put(49415, "Focus Mode");
        write.put(49440, "Focus Mode");
        write.put(49418, "Image Size");
        write.put(49424, "Iso");
        write.put(49431, "Long Focal Length");
        write.put(49409, "Macro Mode");
        write.put(49425, "Metering Mode");
        write.put(49422, "Saturation");
        write.put(49410, "Self Timer Delay");
        write.put(49423, "Sharpness");
        write.put(49432, "Short Focal Length");
        write.put(49411, "Quality");
        write.put(49414, "Unknown Camera Setting 2");
        write.put(49416, "Unknown Camera Setting 3");
        write.put(49417, "Record Mode");
        write.put(49420, "Digital Zoom");
        write.put(49426, "Focus Type");
        write.put(49429, "Unknown Camera Setting 7");
        write.put(49430, "Lens Type");
        write.put(49434, "Max Aperture");
        write.put(49435, "Min Aperture");
        write.put(49436, "Flash Activity");
        write.put(49438, "Focus Continuous");
        write.put(49439, "AE Setting");
        write.put(49441, "Display Aperture");
        write.put(49442, "Zoom Source Width");
        write.put(49443, "Zoom Target Width");
        write.put(49445, "Spot Metering Mode");
        write.put(49446, "Photo Effect");
        write.put(49447, "Manual Flash Output");
        write.put(49449, "Color Tone");
        write.put(49453, "SRAW Quality");
        write.put(49671, "White Balance");
        write.put(49673, "Sequence Number");
        write.put(49678, "AF Point Used");
        write.put(49679, "Flash Bias");
        write.put(49680, "Auto Exposure Bracketing");
        write.put(49681, "AEB Bracket Value");
        write.put(49683, "Subject Distance");
        write.put(50177, "Auto ISO");
        write.put(50178, "Base ISO");
        write.put(50179, "Measured EV");
        write.put(50180, "Target Aperture");
        write.put(50181, "Target Exposure Time");
        write.put(50182, "Exposure Compensation");
        write.put(50183, "White Balance");
        write.put(50184, "Slow Shutter");
        write.put(50185, "Sequence Number");
        write.put(50186, "Optical Zoom Code");
        write.put(50188, "Camera Temperature");
        write.put(50189, "Flash Guide Number");
        write.put(50190, "AF Points in Focus");
        write.put(50191, "Flash Exposure Compensation");
        write.put(50192, "Auto Exposure Bracketing");
        write.put(50193, "AEB Bracket Value");
        write.put(50194, "Control Mode");
        write.put(50195, "Focus Distance Upper");
        write.put(50196, "Focus Distance Lower");
        write.put(50197, "F Number");
        write.put(50198, "Exposure Time");
        write.put(50199, "Measured EV 2");
        write.put(50200, "Bulb Duration");
        write.put(50202, "Camera Type");
        write.put(50203, "Auto Rotate");
        write.put(50204, "ND Filter");
        write.put(50205, "Self Timer 2");
        write.put(50209, "Flash Output");
        write.put(50434, "Panorama Frame Number");
        write.put(50437, "Panorama Direction");
        write.put(53760, "AF Point Count");
        write.put(53761, "Valid AF Point Count");
        write.put(53762, "Image Width");
        write.put(53763, "Image Height");
        write.put(53764, "AF Image Width");
        write.put(53765, "AF Image Height");
        write.put(53766, "AF Area Width");
        write.put(53767, "AF Area Height");
        write.put(53768, "AF Area X Positions");
        write.put(53769, "AF Area Y Positions");
        write.put(53770, "AF Points in Focus");
        write.put(53771, "Primary AF Point 1");
        write.put(53772, "Primary AF Point 2");
        write.put(19, "Thumbnail Image Valid Area");
        write.put(21, "Serial Number Format");
        write.put(26, "Super Macro");
        write.put(28, "Date Stamp Mode");
        write.put(29, "My Colors");
        write.put(30, "Firmware Revision");
        write.put(35, "Categories");
        write.put(36, "Face Detect Array 1");
        write.put(37, "Face Detect Array 2");
        write.put(38, "AF Info Array 2");
        write.put(40, "Image Unique ID");
        write.put(129, "Raw Data Offset");
        write.put(131, "Original Decision Data Offset");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA), "Custom Functions (1D) Array");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA), "Personal Functions Array");
        write.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA), "Personal Function Values Array");
        write.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA), "File Info Array");
        write.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA), "AF Points in Focus (1D)");
        write.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA), "Lens Model");
        write.put(Integer.valueOf(CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA), "Serial Info Array");
        write.put(151, "Dust Removal Data");
        write.put(Integer.valueOf(CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA), "Crop Info");
        write.put(153, "Custom Functions Array 2");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA), "Aspect Information Array");
        write.put(160, "Processing Information Array");
        write.put(Integer.valueOf(CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384), "Tone Curve Table");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256), "Sharpness Table");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384), "Sharpness Frequency Table");
        write.put(Integer.valueOf(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256), "White Balance Table");
        write.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384), "Color Balance Array");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256), "Measured Color Array");
        write.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256), "Color Temperature");
        write.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_NULL_SHA256), "Canon Flags Array");
        write.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_NULL_SHA384), "Modified Information Array");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256), "Tone Curve Matching");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384), "White Balance Matching");
        write.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256), "Color Space");
        write.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256), "Preview Image Info Array");
        write.put(208, "VRD Offset");
        write.put(Integer.valueOf(PassportService.DEFAULT_MAX_BLOCKSIZE), "Sensor Information Array");
        write.put(16385, "Color Data Array 1");
        write.put(16386, "CRW Parameters");
        write.put(16387, "Color Data Array 2");
        write.put(16392, "Black Level");
        write.put(16400, "Custom Picture Style File Name");
        write.put(16403, "Color Info Array");
        write.put(16405, "Vignetting Correction Array 1");
        write.put(16406, "Vignetting Correction Array 2");
        write.put(16408, "Lighting Optimizer Array");
        write.put(16409, "Lens Info Array");
        write.put(16416, "Ambiance Info Array");
        write.put(16420, "Filter Info Array");
    }

    public generateMipmaps() {
        read((createCubemapFromCubeFaces) new getBytesSize(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, Object obj) {
        if (!(obj instanceof int[])) {
            super.MediaBrowserCompat$ItemReceiver(i, obj);
            return;
        }
        int i2 = 0;
        if (i == 1) {
            int[] iArr = (int[]) obj;
            while (i2 < iArr.length) {
                IconCompatParcelizer(49408 + i2, Integer.valueOf(iArr[i2]));
                i2++;
            }
        } else if (i == 2) {
            int[] iArr2 = (int[]) obj;
            while (i2 < iArr2.length) {
                IconCompatParcelizer(49664 + i2, Integer.valueOf(iArr2[i2]));
                i2++;
            }
        } else if (i == 4) {
            int[] iArr3 = (int[]) obj;
            while (i2 < iArr3.length) {
                IconCompatParcelizer(50176 + i2, Integer.valueOf(iArr3[i2]));
                i2++;
            }
        } else if (i == 5) {
            int[] iArr4 = (int[]) obj;
            while (i2 < iArr4.length) {
                IconCompatParcelizer(50432 + i2, Integer.valueOf(iArr4[i2]));
                i2++;
            }
        } else if (i != 18) {
            super.MediaBrowserCompat$ItemReceiver(i, obj);
        } else {
            int[] iArr5 = (int[]) obj;
            int i3 = iArr5[0];
            int i4 = 0;
            int i5 = 0;
            while (i4 < iArr5.length) {
                int i6 = 53760 + i5;
                if (i6 == 53768 || i6 == 53769) {
                    if (iArr5.length - 1 >= i4 + i3) {
                        short[] sArr = new short[i3];
                        for (int i7 = 0; i7 < i3; i7++) {
                            sArr[i7] = (short) iArr5[i4 + i7];
                        }
                        super.MediaBrowserCompat$ItemReceiver(i6, (Object) sArr);
                    }
                    i4 += i3 - 1;
                } else if (i6 == 53770) {
                    int i8 = (i3 + 15) / 16;
                    short[] sArr2 = new short[i8];
                    if (iArr5.length - 1 >= i4 + i8) {
                        for (int i9 = 0; i9 < i8; i9++) {
                            sArr2[i9] = (short) iArr5[i4 + i9];
                        }
                        super.MediaBrowserCompat$ItemReceiver(i6, (Object) sArr2);
                    }
                    i4 += i8 - 1;
                } else {
                    super.MediaBrowserCompat$ItemReceiver(i6, (Object) Integer.valueOf(iArr5[i4]));
                }
                i5++;
                i4++;
            }
        }
    }
}
