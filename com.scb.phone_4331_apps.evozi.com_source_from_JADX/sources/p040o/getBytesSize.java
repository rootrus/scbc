package p040o;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import java.text.DecimalFormat;
import java.util.HashMap;
import okhttp3.internal.http2.Settings;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.math.Primes;
import org.jmrtd.PassportService;
import org.jmrtd.cbeff.ISO781611;

/* renamed from: o.getBytesSize */
public final class getBytesSize extends createCubemapFromCubeFaces<generateMipmaps> {
    private static final HashMap<Integer, String> read;

    private static double MediaBrowserCompat$MediaItem(int i) {
        int i2;
        if (i < 0) {
            i = -i;
            i2 = -1;
        } else {
            i2 = 1;
        }
        int i3 = i & 31;
        return ((double) (i2 * ((i - i3) + (i3 == 12 ? 10 : i3 == 20 ? 21 : i3)))) / 32.0d;
    }

    public getBytesSize(generateMipmaps generatemipmaps) {
        super(generatemipmaps);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        boolean z = false;
        switch (i) {
            case 12:
                Integer MediaBrowserCompat$CustomActionResultReceiver = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(12);
                if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                    return null;
                }
                return String.format("%04X%05d", new Object[]{Integer.valueOf((MediaBrowserCompat$CustomActionResultReceiver.intValue() >> 8) & 255), Integer.valueOf(MediaBrowserCompat$CustomActionResultReceiver.intValue() & 255)});
            case 49415:
                return MediaBrowserCompat$CustomActionResultReceiver(49415, "One-shot", "AI Servo", "AI Focus", "Manual Focus", "Single", "Continuous", "Manual Focus");
            case 49449:
                Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49449);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    return null;
                }
                if (MediaBrowserCompat$CustomActionResultReceiver2.intValue() == 32767) {
                    return "n/a";
                }
                return MediaBrowserCompat$CustomActionResultReceiver2.toString();
            case 49453:
                return write(49453, 0, "n/a", "sRAW1 (mRAW)", "sRAW2 (sRAW)");
            case 49671:
                return MediaBrowserCompat$CustomActionResultReceiver(49671, "Auto", "Sunny", "Cloudy", "Tungsten", "Florescent", "Flash", "Custom");
            case 53770:
                return MediaMetadataCompat();
            default:
                switch (i) {
                    case 49409:
                        return write(49409, 1, "Macro", "Normal");
                    case 49410:
                        Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49410);
                        if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                            return null;
                        }
                        if (MediaBrowserCompat$CustomActionResultReceiver3.intValue() == 0) {
                            return "Self timer not used";
                        }
                        DecimalFormat decimalFormat = new DecimalFormat("0.##");
                        StringBuilder sb = new StringBuilder();
                        sb.append(decimalFormat.format(((double) MediaBrowserCompat$CustomActionResultReceiver3.intValue()) * 0.1d));
                        sb.append(" sec");
                        return sb.toString();
                    case 49411:
                        return write(49411, 2, "Normal", "Fine", null, "Superfine");
                    case 49412:
                        Integer MediaBrowserCompat$CustomActionResultReceiver4 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49412);
                        if (MediaBrowserCompat$CustomActionResultReceiver4 == null) {
                            return null;
                        }
                        int intValue = MediaBrowserCompat$CustomActionResultReceiver4.intValue();
                        if (intValue == 16) {
                            return "External flash";
                        }
                        switch (intValue) {
                            case 0:
                                return "No flash fired";
                            case 1:
                                return "Auto";
                            case 2:
                                return "On";
                            case 3:
                                return "Red-eye reduction";
                            case 4:
                                return "Slow-synchro";
                            case 5:
                                return "Auto and red-eye reduction";
                            case 6:
                                return "On and red-eye reduction";
                            default:
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Unknown (");
                                sb2.append(MediaBrowserCompat$CustomActionResultReceiver4);
                                sb2.append(")");
                                return sb2.toString();
                        }
                    case 49413:
                        Integer MediaBrowserCompat$CustomActionResultReceiver5 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49413);
                        if (MediaBrowserCompat$CustomActionResultReceiver5 == null) {
                            return null;
                        }
                        int intValue2 = MediaBrowserCompat$CustomActionResultReceiver5.intValue();
                        if (intValue2 == 0) {
                            Integer MediaBrowserCompat$CustomActionResultReceiver6 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49410);
                            if (MediaBrowserCompat$CustomActionResultReceiver6 != null) {
                                return MediaBrowserCompat$CustomActionResultReceiver6.intValue() == 0 ? "Single shot" : "Single shot with self-timer";
                            }
                            return "Continuous";
                        } else if (intValue2 == 1) {
                            return "Continuous";
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Unknown (");
                            sb3.append(MediaBrowserCompat$CustomActionResultReceiver5);
                            sb3.append(")");
                            return sb3.toString();
                        }
                    default:
                        switch (i) {
                            case 49417:
                                return write(49417, 1, "JPEG", "CRW+THM", "AVI+THM", "TIF", "TIF+JPEG", "CR2", "CR2+JPEG", null, "MOV", "MP4");
                            case 49418:
                                return MediaBrowserCompat$CustomActionResultReceiver(49418, "Large", "Medium", "Small");
                            case 49419:
                                return MediaBrowserCompat$CustomActionResultReceiver(49419, "Full auto", "Manual", "Landscape", "Fast shutter", "Slow shutter", "Night", "B&W", "Sepia", "Portrait", "Sports", "Macro / Closeup", "Pan focus");
                            case 49420:
                                return MediaBrowserCompat$CustomActionResultReceiver(49420, "No digital zoom", "2x", "4x");
                            case 49421:
                                Integer MediaBrowserCompat$CustomActionResultReceiver7 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49421);
                                if (MediaBrowserCompat$CustomActionResultReceiver7 == null) {
                                    return null;
                                }
                                int intValue3 = MediaBrowserCompat$CustomActionResultReceiver7.intValue();
                                if (intValue3 == 0) {
                                    return "Normal";
                                }
                                if (intValue3 == 1) {
                                    return "High";
                                }
                                if (intValue3 == 65535) {
                                    return "Low";
                                }
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Unknown (");
                                sb4.append(MediaBrowserCompat$CustomActionResultReceiver7);
                                sb4.append(")");
                                return sb4.toString();
                            case 49422:
                                Integer MediaBrowserCompat$CustomActionResultReceiver8 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49422);
                                if (MediaBrowserCompat$CustomActionResultReceiver8 == null) {
                                    return null;
                                }
                                int intValue4 = MediaBrowserCompat$CustomActionResultReceiver8.intValue();
                                if (intValue4 == 0) {
                                    return "Normal";
                                }
                                if (intValue4 == 1) {
                                    return "High";
                                }
                                if (intValue4 == 65535) {
                                    return "Low";
                                }
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Unknown (");
                                sb5.append(MediaBrowserCompat$CustomActionResultReceiver8);
                                sb5.append(")");
                                return sb5.toString();
                            case 49423:
                                Integer MediaBrowserCompat$CustomActionResultReceiver9 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49423);
                                if (MediaBrowserCompat$CustomActionResultReceiver9 == null) {
                                    return null;
                                }
                                int intValue5 = MediaBrowserCompat$CustomActionResultReceiver9.intValue();
                                if (intValue5 == 0) {
                                    return "Normal";
                                }
                                if (intValue5 == 1) {
                                    return "High";
                                }
                                if (intValue5 == 65535) {
                                    return "Low";
                                }
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("Unknown (");
                                sb6.append(MediaBrowserCompat$CustomActionResultReceiver9);
                                sb6.append(")");
                                return sb6.toString();
                            case 49424:
                                Integer MediaBrowserCompat$CustomActionResultReceiver10 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49424);
                                if (MediaBrowserCompat$CustomActionResultReceiver10 == null) {
                                    return null;
                                }
                                if ((MediaBrowserCompat$CustomActionResultReceiver10.intValue() & 16384) != 0) {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append(MediaBrowserCompat$CustomActionResultReceiver10.intValue() & -16385);
                                    return sb7.toString();
                                }
                                int intValue6 = MediaBrowserCompat$CustomActionResultReceiver10.intValue();
                                if (intValue6 == 0) {
                                    return "Not specified (see ISOSpeedRatings tag)";
                                }
                                switch (intValue6) {
                                    case 15:
                                        return "Auto";
                                    case 16:
                                        return "50";
                                    case 17:
                                        return "100";
                                    case 18:
                                        return "200";
                                    case 19:
                                        return "400";
                                    default:
                                        StringBuilder sb8 = new StringBuilder();
                                        sb8.append("Unknown (");
                                        sb8.append(MediaBrowserCompat$CustomActionResultReceiver10);
                                        sb8.append(")");
                                        return sb8.toString();
                                }
                            case 49425:
                                return write(49425, 3, "Evaluative", "Partial", "Centre weighted");
                            case 49426:
                                Integer MediaBrowserCompat$CustomActionResultReceiver11 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49426);
                                if (MediaBrowserCompat$CustomActionResultReceiver11 == null) {
                                    return null;
                                }
                                int intValue7 = MediaBrowserCompat$CustomActionResultReceiver11.intValue();
                                if (intValue7 == 0) {
                                    return "Manual";
                                }
                                if (intValue7 == 1) {
                                    return "Auto";
                                }
                                if (intValue7 == 3) {
                                    return "Close-up (Macro)";
                                }
                                if (intValue7 == 8) {
                                    return "Locked (Pan Mode)";
                                }
                                StringBuilder sb9 = new StringBuilder();
                                sb9.append("Unknown (");
                                sb9.append(MediaBrowserCompat$CustomActionResultReceiver11);
                                sb9.append(")");
                                return sb9.toString();
                            case 49427:
                                return write(49427, C7887a.f3647sL, "None (MF)", "Auto selected", "Right", "Centre", "Left");
                            case 49428:
                                return MediaBrowserCompat$CustomActionResultReceiver(49428, "Easy shooting", "Program", "Tv-priority", "Av-priority", "Manual", "A-DEP");
                            default:
                                switch (i) {
                                    case 49430:
                                        Integer MediaBrowserCompat$CustomActionResultReceiver12 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49430);
                                        if (MediaBrowserCompat$CustomActionResultReceiver12 == null) {
                                            return null;
                                        }
                                        if (read.containsKey(MediaBrowserCompat$CustomActionResultReceiver12)) {
                                            return read.get(MediaBrowserCompat$CustomActionResultReceiver12);
                                        }
                                        return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver12});
                                    case 49431:
                                        Integer MediaBrowserCompat$CustomActionResultReceiver13 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49431);
                                        if (MediaBrowserCompat$CustomActionResultReceiver13 == null) {
                                            return null;
                                        }
                                        String MediaDescriptionCompat = MediaDescriptionCompat();
                                        StringBuilder sb10 = new StringBuilder();
                                        sb10.append(Integer.toString(MediaBrowserCompat$CustomActionResultReceiver13.intValue()));
                                        sb10.append(" ");
                                        sb10.append(MediaDescriptionCompat);
                                        return sb10.toString();
                                    case 49432:
                                        Integer MediaBrowserCompat$CustomActionResultReceiver14 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49432);
                                        if (MediaBrowserCompat$CustomActionResultReceiver14 == null) {
                                            return null;
                                        }
                                        String MediaDescriptionCompat2 = MediaDescriptionCompat();
                                        StringBuilder sb11 = new StringBuilder();
                                        sb11.append(Integer.toString(MediaBrowserCompat$CustomActionResultReceiver14.intValue()));
                                        sb11.append(" ");
                                        sb11.append(MediaDescriptionCompat2);
                                        return sb11.toString();
                                    case 49433:
                                        return MediaDescriptionCompat();
                                    case 49434:
                                        Integer MediaBrowserCompat$CustomActionResultReceiver15 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49434);
                                        if (MediaBrowserCompat$CustomActionResultReceiver15 == null) {
                                            return null;
                                        }
                                        if (MediaBrowserCompat$CustomActionResultReceiver15.intValue() <= 512) {
                                            return write(Math.exp((MediaBrowserCompat$MediaItem(MediaBrowserCompat$CustomActionResultReceiver15.intValue()) * Math.log(2.0d)) / 2.0d));
                                        }
                                        return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver15});
                                    case 49435:
                                        Integer MediaBrowserCompat$CustomActionResultReceiver16 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49435);
                                        if (MediaBrowserCompat$CustomActionResultReceiver16 == null) {
                                            return null;
                                        }
                                        if (MediaBrowserCompat$CustomActionResultReceiver16.intValue() <= 512) {
                                            return write(Math.exp((MediaBrowserCompat$MediaItem(MediaBrowserCompat$CustomActionResultReceiver16.intValue()) * Math.log(2.0d)) / 2.0d));
                                        }
                                        return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver16});
                                    case 49436:
                                        return MediaBrowserCompat$CustomActionResultReceiver(49436, "Flash did not fire", "Flash fired");
                                    case 49437:
                                        Integer MediaBrowserCompat$CustomActionResultReceiver17 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49437);
                                        if (MediaBrowserCompat$CustomActionResultReceiver17 == null) {
                                            return null;
                                        }
                                        if (((MediaBrowserCompat$CustomActionResultReceiver17.intValue() >> 14) & 1) != 0) {
                                            return "External E-TTL";
                                        }
                                        if (((MediaBrowserCompat$CustomActionResultReceiver17.intValue() >> 13) & 1) != 0) {
                                            return "Internal flash";
                                        }
                                        if (((MediaBrowserCompat$CustomActionResultReceiver17.intValue() >> 11) & 1) != 0) {
                                            return "FP sync used";
                                        }
                                        if (((MediaBrowserCompat$CustomActionResultReceiver17.intValue() >> 4) & 1) != 0) {
                                            return "FP sync enabled";
                                        }
                                        StringBuilder sb12 = new StringBuilder();
                                        sb12.append("Unknown (");
                                        sb12.append(MediaBrowserCompat$CustomActionResultReceiver17);
                                        sb12.append(")");
                                        return sb12.toString();
                                    case 49438:
                                        return write(49438, 0, "Single", "Continuous", null, null, null, null, null, null, "Manual");
                                    case 49439:
                                        return write(49439, 0, "Normal AE", "Exposure Compensation", "AE Lock", "AE Lock + Exposure Comp.", "No AE");
                                    case 49440:
                                        return MediaBrowserCompat$CustomActionResultReceiver(49440, "Single", "Continuous");
                                    case 49441:
                                        Integer MediaBrowserCompat$CustomActionResultReceiver18 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49441);
                                        if (MediaBrowserCompat$CustomActionResultReceiver18 == null) {
                                            return null;
                                        }
                                        if (MediaBrowserCompat$CustomActionResultReceiver18.intValue() == 65535) {
                                            return MediaBrowserCompat$CustomActionResultReceiver18.toString();
                                        }
                                        return write((double) (((float) MediaBrowserCompat$CustomActionResultReceiver18.intValue()) / 10.0f));
                                    default:
                                        switch (i) {
                                            case 49445:
                                                return write(49445, 0, "Center", "AF Point");
                                            case 49446:
                                                Integer MediaBrowserCompat$CustomActionResultReceiver19 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49446);
                                                if (MediaBrowserCompat$CustomActionResultReceiver19 == null) {
                                                    return null;
                                                }
                                                int intValue8 = MediaBrowserCompat$CustomActionResultReceiver19.intValue();
                                                if (intValue8 == 100) {
                                                    return "My Color Data";
                                                }
                                                switch (intValue8) {
                                                    case 0:
                                                        return "Off";
                                                    case 1:
                                                        return "Vivid";
                                                    case 2:
                                                        return "Neutral";
                                                    case 3:
                                                        return "Smooth";
                                                    case 4:
                                                        return "Sepia";
                                                    case 5:
                                                        return "B&W";
                                                    case 6:
                                                        return "Custom";
                                                    default:
                                                        StringBuilder sb13 = new StringBuilder();
                                                        sb13.append("Unknown (");
                                                        sb13.append(MediaBrowserCompat$CustomActionResultReceiver19);
                                                        sb13.append(")");
                                                        return sb13.toString();
                                                }
                                            case 49447:
                                                Integer MediaBrowserCompat$CustomActionResultReceiver20 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49447);
                                                if (MediaBrowserCompat$CustomActionResultReceiver20 == null) {
                                                    return null;
                                                }
                                                int intValue9 = MediaBrowserCompat$CustomActionResultReceiver20.intValue();
                                                if (intValue9 == 0) {
                                                    return "n/a";
                                                }
                                                if (intValue9 == 1280) {
                                                    return "Full";
                                                }
                                                if (intValue9 == 1282) {
                                                    return "Medium";
                                                }
                                                if (intValue9 == 1284) {
                                                    return "Low";
                                                }
                                                if (intValue9 == 32767) {
                                                    return "n/a";
                                                }
                                                StringBuilder sb14 = new StringBuilder();
                                                sb14.append("Unknown (");
                                                sb14.append(MediaBrowserCompat$CustomActionResultReceiver20);
                                                sb14.append(")");
                                                return sb14.toString();
                                            default:
                                                switch (i) {
                                                    case 49678:
                                                        Integer MediaBrowserCompat$CustomActionResultReceiver21 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49678);
                                                        if (MediaBrowserCompat$CustomActionResultReceiver21 == null) {
                                                            return null;
                                                        }
                                                        if ((MediaBrowserCompat$CustomActionResultReceiver21.intValue() & 7) == 0) {
                                                            return "Right";
                                                        }
                                                        if ((MediaBrowserCompat$CustomActionResultReceiver21.intValue() & 7) == 1) {
                                                            return "Centre";
                                                        }
                                                        if ((MediaBrowserCompat$CustomActionResultReceiver21.intValue() & 7) == 2) {
                                                            return "Left";
                                                        }
                                                        StringBuilder sb15 = new StringBuilder();
                                                        sb15.append("Unknown (");
                                                        sb15.append(MediaBrowserCompat$CustomActionResultReceiver21);
                                                        sb15.append(")");
                                                        return sb15.toString();
                                                    case 49679:
                                                        Integer MediaBrowserCompat$CustomActionResultReceiver22 = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49679);
                                                        if (MediaBrowserCompat$CustomActionResultReceiver22 == null) {
                                                            return null;
                                                        }
                                                        if (MediaBrowserCompat$CustomActionResultReceiver22.intValue() > 61440) {
                                                            MediaBrowserCompat$CustomActionResultReceiver22 = Integer.valueOf((Settings.DEFAULT_INITIAL_WINDOW_SIZE - MediaBrowserCompat$CustomActionResultReceiver22.intValue()) + 1);
                                                            z = true;
                                                        }
                                                        StringBuilder sb16 = new StringBuilder();
                                                        sb16.append(z ? "-" : "");
                                                        sb16.append(Float.toString(((float) MediaBrowserCompat$CustomActionResultReceiver22.intValue()) / 32.0f));
                                                        sb16.append(" EV");
                                                        return sb16.toString();
                                                    default:
                                                        return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                                                }
                                        }
                                }
                        }
                }
        }
    }

    private String MediaMetadataCompat() {
        Integer MediaBrowserCompat$CustomActionResultReceiver = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(53770);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            if ((MediaBrowserCompat$CustomActionResultReceiver.intValue() & (1 << i)) != 0) {
                if (sb.length() != 0) {
                    sb.append(',');
                }
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "None" : sb.toString();
    }

    private String MediaDescriptionCompat() {
        Integer MediaBrowserCompat$CustomActionResultReceiver = ((generateMipmaps) this.write).MediaBrowserCompat$CustomActionResultReceiver(49433);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return MediaBrowserCompat$CustomActionResultReceiver.intValue() != 0 ? Integer.toString(MediaBrowserCompat$CustomActionResultReceiver.intValue()) : "";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(1, "Canon EF 50mm f/1.8");
        read.put(2, "Canon EF 28mm f/2.8");
        read.put(3, "Canon EF 135mm f/2.8 Soft");
        read.put(4, "Canon EF 35-105mm f/3.5-4.5 or Sigma Lens");
        read.put(5, "Canon EF 35-70mm f/3.5-4.5");
        read.put(6, "Canon EF 28-70mm f/3.5-4.5 or Sigma or Tokina Lens");
        read.put(7, "Canon EF 100-300mm f/5.6L");
        read.put(8, "Canon EF 100-300mm f/5.6 or Sigma or Tokina Lens");
        read.put(9, "Canon EF 70-210mm f/4");
        read.put(10, "Canon EF 50mm f/2.5 Macro or Sigma Lens");
        read.put(11, "Canon EF 35mm f/2");
        read.put(13, "Canon EF 15mm f/2.8 Fisheye");
        read.put(14, "Canon EF 50-200mm f/3.5-4.5L");
        read.put(15, "Canon EF 50-200mm f/3.5-4.5");
        read.put(16, "Canon EF 35-135mm f/3.5-4.5");
        read.put(17, "Canon EF 35-70mm f/3.5-4.5A");
        read.put(18, "Canon EF 28-70mm f/3.5-4.5");
        read.put(20, "Canon EF 100-200mm f/4.5A");
        read.put(21, "Canon EF 80-200mm f/2.8L");
        read.put(22, "Canon EF 20-35mm f/2.8L or Tokina Lens");
        read.put(23, "Canon EF 35-105mm f/3.5-4.5");
        read.put(24, "Canon EF 35-80mm f/4-5.6 Power Zoom");
        read.put(25, "Canon EF 35-80mm f/4-5.6 Power Zoom");
        read.put(26, "Canon EF 100mm f/2.8 Macro or Other Lens");
        read.put(27, "Canon EF 35-80mm f/4-5.6");
        read.put(28, "Canon EF 80-200mm f/4.5-5.6 or Tamron Lens");
        read.put(29, "Canon EF 50mm f/1.8 II");
        read.put(30, "Canon EF 35-105mm f/4.5-5.6");
        read.put(31, "Canon EF 75-300mm f/4-5.6 or Tamron Lens");
        read.put(32, "Canon EF 24mm f/2.8 or Sigma Lens");
        read.put(33, "Voigtlander or Carl Zeiss Lens");
        read.put(35, "Canon EF 35-80mm f/4-5.6");
        read.put(36, "Canon EF 38-76mm f/4.5-5.6");
        read.put(37, "Canon EF 35-80mm f/4-5.6 or Tamron Lens");
        read.put(38, "Canon EF 80-200mm f/4.5-5.6");
        read.put(39, "Canon EF 75-300mm f/4-5.6");
        read.put(40, "Canon EF 28-80mm f/3.5-5.6");
        read.put(41, "Canon EF 28-90mm f/4-5.6");
        read.put(42, "Canon EF 28-200mm f/3.5-5.6 or Tamron Lens");
        read.put(43, "Canon EF 28-105mm f/4-5.6");
        read.put(44, "Canon EF 90-300mm f/4.5-5.6");
        read.put(45, "Canon EF-S 18-55mm f/3.5-5.6 [II]");
        read.put(46, "Canon EF 28-90mm f/4-5.6");
        read.put(47, "Zeiss Milvus 35mm f/2 or 50mm f/2");
        read.put(48, "Canon EF-S 18-55mm f/3.5-5.6 IS");
        read.put(49, "Canon EF-S 55-250mm f/4-5.6 IS");
        read.put(50, "Canon EF-S 18-200mm f/3.5-5.6 IS");
        read.put(51, "Canon EF-S 18-135mm f/3.5-5.6 IS");
        read.put(52, "Canon EF-S 18-55mm f/3.5-5.6 IS II");
        read.put(53, "Canon EF-S 18-55mm f/3.5-5.6 III");
        read.put(54, "Canon EF-S 55-250mm f/4-5.6 IS II");
        read.put(94, "Canon TS-E 17mm f/4L");
        read.put(95, "Canon TS-E 24.0mm f/3.5 L II");
        read.put(Integer.valueOf(EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE), "Canon MP-E 65mm f/2.8 1-5x Macro Photo");
        read.put(125, "Canon TS-E 24mm f/3.5L");
        read.put(126, "Canon TS-E 45mm f/2.8");
        read.put(127, "Canon TS-E 90mm f/2.8");
        read.put(129, "Canon EF 300mm f/2.8L");
        read.put(Integer.valueOf(ISO781611.BIOMETRIC_SUBTYPE_TAG), "Canon EF 50mm f/1.0L");
        read.put(131, "Canon EF 28-80mm f/2.8-4L or Sigma Lens");
        read.put(132, "Canon EF 1200mm f/5.6L");
        read.put(134, "Canon EF 600mm f/4L IS");
        read.put(135, "Canon EF 200mm f/1.8L");
        read.put(136, "Canon EF 300mm f/2.8L");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA), "Canon EF 85mm f/1.2L or Sigma or Tamron Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_RC4_128_SHA), "Canon EF 28-80mm f/2.8-4L");
        read.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA), "Canon EF 400mm f/2.8L");
        read.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA), "Canon EF 500mm f/4.5L");
        read.put(141, "Canon EF 500mm f/4.5L");
        read.put(142, "Canon EF 300mm f/2.8L IS");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA), "Canon EF 500mm f/4L IS or Sigma Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA), "Canon EF 35-135mm f/4-5.6 USM");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA), "Canon EF 100-300mm f/4.5-5.6 USM");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA), "Canon EF 70-210mm f/3.5-4.5 USM");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA), "Canon EF 35-135mm f/4-5.6 USM");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA), "Canon EF 28-80mm f/3.5-5.6 USM");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA), "Canon EF 100mm f/2 USM");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA), "Canon EF 14mm f/2.8L or Sigma Lens");
        read.put(151, "Canon EF 200mm f/2.8L");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA), "Canon EF 300mm f/4L IS or Sigma Lens");
        read.put(153, "Canon EF 35-350mm f/3.5-5.6L or Sigma or Tamron Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_RSA_WITH_SEED_CBC_SHA), "Canon EF 20mm f/2.8 USM or Zeiss Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA), "Canon EF 85mm f/1.8 USM");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256), "Canon EF 28-105mm f/3.5-4.5 USM or Tamron Lens");
        read.put(160, "Canon EF 20-35mm f/3.5-4.5 USM or Tamron or Tokina Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384), "Canon EF 28-70mm f/2.8L or Sigma or Tamron Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256), "Canon EF 200mm f/2.8L");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384), "Canon EF 300mm f/4L");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256), "Canon EF 400mm f/5.6L");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384), "Canon EF 70-200mm f/2.8 L");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_anon_WITH_AES_128_GCM_SHA256), "Canon EF 70-200mm f/2.8 L + 1.4x");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384), "Canon EF 70-200mm f/2.8 L + 2x");
        read.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256), "Canon EF 28mm f/1.8 USM or Sigma Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384), "Canon EF 17-35mm f/2.8L or Sigma Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256), "Canon EF 200mm f/2.8L II");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384), "Canon EF 300mm f/4L");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256), "Canon EF 400mm f/5.6L or Sigma Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384), "Canon EF 180mm Macro f/3.5L or Sigma Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256), "Canon EF 135mm f/2L or Other Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384), "Canon EF 400mm f/2.8L");
        read.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_NULL_SHA256), "Canon EF 24-85mm f/3.5-4.5 USM");
        read.put(Integer.valueOf(CipherSuite.TLS_PSK_WITH_NULL_SHA384), "Canon EF 300mm f/4L IS");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256), "Canon EF 28-135mm f/3.5-5.6 IS");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384), "Canon EF 24mm f/1.4L");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256), "Canon EF 35mm f/1.4L or Other Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384), "Canon EF 100-400mm f/4.5-5.6L IS + 1.4x or Sigma Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256), "Canon EF 100-400mm f/4.5-5.6L IS + 2x or Sigma Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384), "Canon EF 100-400mm f/4.5-5.6L IS or Sigma Lens");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256), "Canon EF 400mm f/2.8L + 2x");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384), "Canon EF 600mm f/4L IS");
        read.put(Integer.valueOf(CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256), "Canon EF 70-200mm f/4L");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256), "Canon EF 70-200mm f/4L + 1.4x");
        read.put(188, "Canon EF 70-200mm f/4L + 2x");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256), "Canon EF 70-200mm f/4L + 2.8x");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256), "Canon EF 100mm f/2.8 Macro USM");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256), "Canon EF 400mm f/4 DO IS");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256), "Canon EF 35-80mm f/4-5.6 USM");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256), "Canon EF 80-200mm f/4.5-5.6 USM");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256), "Canon EF 35-105mm f/4.5-5.6 USM");
        read.put(Integer.valueOf(CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256), "Canon EF 75-300mm f/4-5.6 USM");
        read.put(Integer.valueOf(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256), "Canon EF 75-300mm f/4-5.6 IS USM");
        read.put(198, "Canon EF 50mm f/1.4 USM or Zeiss Lens");
        read.put(199, "Canon EF 28-80mm f/3.5-5.6 USM");
        read.put(Integer.valueOf(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE), "Canon EF 75-300mm f/4-5.6 USM");
        read.put(201, "Canon EF 28-80mm f/3.5-5.6 USM");
        read.put(202, "Canon EF 28-80mm f/3.5-5.6 USM IV");
        read.put(208, "Canon EF 22-55mm f/4-5.6 USM");
        read.put(209, "Canon EF 55-200mm f/4.5-5.6");
        read.put(210, "Canon EF 28-90mm f/4-5.6 USM");
        read.put(Integer.valueOf(Primes.SMALL_FACTOR_LIMIT), "Canon EF 28-200mm f/3.5-5.6 USM");
        read.put(212, "Canon EF 28-105mm f/4-5.6 USM");
        read.put(213, "Canon EF 90-300mm f/4.5-5.6 USM or Tamron Lens");
        read.put(Integer.valueOf(ModuleDescriptor.MODULE_VERSION), "Canon EF-S 18-55mm f/3.5-5.6 USM");
        read.put(215, "Canon EF 55-200mm f/4.5-5.6 II USM");
        read.put(217, "Tamron AF 18-270mm f/3.5-6.3 Di II VC PZD");
        read.put(Integer.valueOf(PassportService.DEFAULT_MAX_BLOCKSIZE), "Canon EF 70-200mm f/2.8L IS");
        read.put(225, "Canon EF 70-200mm f/2.8L IS + 1.4x");
        read.put(226, "Canon EF 70-200mm f/2.8L IS + 2x");
        read.put(227, "Canon EF 70-200mm f/2.8L IS + 2.8x");
        read.put(228, "Canon EF 28-105mm f/3.5-4.5 USM");
        read.put(229, "Canon EF 16-35mm f/2.8L");
        read.put(230, "Canon EF 24-70mm f/2.8L");
        read.put(231, "Canon EF 17-40mm f/4L");
        read.put(232, "Canon EF 70-300mm f/4.5-5.6 DO IS USM");
        read.put(233, "Canon EF 28-300mm f/3.5-5.6L IS");
        read.put(234, "Canon EF-S 17-85mm f/4-5.6 IS USM or Tokina Lens");
        read.put(235, "Canon EF-S 10-22mm f/3.5-4.5 USM");
        read.put(236, "Canon EF-S 60mm f/2.8 Macro USM");
        read.put(237, "Canon EF 24-105mm f/4L IS");
        read.put(238, "Canon EF 70-300mm f/4-5.6 IS USM");
        read.put(239, "Canon EF 85mm f/1.2L II");
        read.put(240, "Canon EF-S 17-55mm f/2.8 IS USM");
        read.put(241, "Canon EF 50mm f/1.2L");
        read.put(242, "Canon EF 70-200mm f/4L IS");
        read.put(243, "Canon EF 70-200mm f/4L IS + 1.4x");
        read.put(244, "Canon EF 70-200mm f/4L IS + 2x");
        read.put(245, "Canon EF 70-200mm f/4L IS + 2.8x");
        read.put(246, "Canon EF 16-35mm f/2.8L II");
        read.put(247, "Canon EF 14mm f/2.8L II USM");
        read.put(248, "Canon EF 200mm f/2L IS or Sigma Lens");
        read.put(249, "Canon EF 800mm f/5.6L IS");
        read.put(250, "Canon EF 24mm f/1.4L II or Sigma Lens");
        read.put(251, "Canon EF 70-200mm f/2.8L IS II USM");
        read.put(252, "Canon EF 70-200mm f/2.8L IS II USM + 1.4x");
        read.put(253, "Canon EF 70-200mm f/2.8L IS II USM + 2x");
        read.put(254, "Canon EF 100mm f/2.8L Macro IS USM");
        read.put(255, "Sigma 24-105mm f/4 DG OS HSM | A or Other Sigma Lens");
        read.put(488, "Canon EF-S 15-85mm f/3.5-5.6 IS USM");
        read.put(489, "Canon EF 70-300mm f/4-5.6L IS USM");
        read.put(490, "Canon EF 8-15mm f/4L Fisheye USM");
        read.put(491, "Canon EF 300mm f/2.8L IS II USM");
        read.put(492, "Canon EF 400mm f/2.8L IS II USM");
        read.put(493, "Canon EF 500mm f/4L IS II USM or EF 24-105mm f4L IS USM");
        read.put(494, "Canon EF 600mm f/4.0L IS II USM");
        read.put(495, "Canon EF 24-70mm f/2.8L II USM");
        read.put(496, "Canon EF 200-400mm f/4L IS USM");
        read.put(499, "Canon EF 200-400mm f/4L IS USM + 1.4x");
        read.put(502, "Canon EF 28mm f/2.8 IS USM");
        read.put(503, "Canon EF 24mm f/2.8 IS USM");
        read.put(504, "Canon EF 24-70mm f/4L IS USM");
        read.put(505, "Canon EF 35mm f/2 IS USM");
        read.put(506, "Canon EF 400mm f/4 DO IS II USM");
        read.put(507, "Canon EF 16-35mm f/4L IS USM");
        read.put(508, "Canon EF 11-24mm f/4L USM");
        read.put(747, "Canon EF 100-400mm f/4.5-5.6L IS II USM");
        read.put(750, "Canon EF 35mm f/1.4L II USM");
        read.put(4142, "Canon EF-S 18-135mm f/3.5-5.6 IS STM");
        read.put(4143, "Canon EF-M 18-55mm f/3.5-5.6 IS STM or Tamron Lens");
        read.put(4144, "Canon EF 40mm f/2.8 STM");
        read.put(4145, "Canon EF-M 22mm f/2 STM");
        read.put(4146, "Canon EF-S 18-55mm f/3.5-5.6 IS STM");
        read.put(4147, "Canon EF-M 11-22mm f/4-5.6 IS STM");
        read.put(4148, "Canon EF-S 55-250mm f/4-5.6 IS STM");
        read.put(4149, "Canon EF-M 55-200mm f/4.5-6.3 IS STM");
        read.put(4150, "Canon EF-S 10-18mm f/4.5-5.6 IS STM");
        read.put(4152, "Canon EF 24-105mm f/3.5-5.6 IS STM");
        read.put(4153, "Canon EF-M 15-45mm f/3.5-6.3 IS STM");
        read.put(4154, "Canon EF-S 24mm f/2.8 STM");
        read.put(4156, "Canon EF 50mm f/1.8 STM");
        read.put(36912, "Canon EF-S 18-135mm f/3.5-5.6 IS USM");
        read.put(Integer.valueOf(Settings.DEFAULT_INITIAL_WINDOW_SIZE), "N/A");
    }
}
