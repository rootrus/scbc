package p040o;

import java.io.IOException;
import java.text.DecimalFormat;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.nAllocationSetSurface;

/* renamed from: o.F32_2 */
public final class F32_2 extends createCubemapFromCubeFaces<F32_4> {
    private static final String[] IconCompatParcelizer = {"Normal", "Portrait", "Scenery", "Sports", "Night Portrait", "Program", "Aperture Priority", "Shutter Priority", "Macro", "Spot", "Manual", "Movie Preview", "Panning", "Simple", "Color Effects", "Self Portrait", "Economy", "Fireworks", "Party", "Snow", "Night Scenery", "Food", "Baby", "Soft Skin", "Candlelight", "Starry Night", "High Sensitivity", "Panorama Assist", "Underwater", "Beach", "Aerial Photo", "Sunset", "Pet", "Intelligent ISO", "Clipboard", "High Speed Continuous Shooting", "Intelligent Auto", null, "Multi-aspect", null, "Transform", "Flash Burst", "Pin Hole", "Film Grain", "My Color", "Photo Frame", null, null, null, null, "HDR"};

    public F32_2(F32_4 f32_4) {
        super(f32_4);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        nAllocationSetSurface.RatingCompat ratingCompat;
        nAllocationSetSurface.RatingCompat ratingCompat2;
        switch (i) {
            case 1:
                return write(1, 2, "High", "Normal", null, null, "Very High", "Raw", null, "Motion Picture");
            case 2:
                return IconCompatParcelizer(2, 2);
            case 3:
                return write(3, 1, "Auto", "Daylight", "Cloudy", "Incandescent", "Manual", null, null, "Flash", null, "Black & White", "Manual", "Shade");
            case 7:
                return write(7, 1, "Auto", "Manual", null, "Auto, Focus Button", "Auto, Continuous");
            case 15:
                int[] MediaBrowserCompat$ItemReceiver = ((F32_4) this.write).MediaBrowserCompat$ItemReceiver(15);
                if (MediaBrowserCompat$ItemReceiver == null || MediaBrowserCompat$ItemReceiver.length < 2) {
                    return null;
                }
                int i2 = MediaBrowserCompat$ItemReceiver[0];
                if (i2 == 0) {
                    int i3 = MediaBrowserCompat$ItemReceiver[1];
                    if (i3 == 1) {
                        return "Spot Mode On";
                    }
                    if (i3 == 16) {
                        return "Spot Mode Off";
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown (");
                    sb.append(MediaBrowserCompat$ItemReceiver[0]);
                    sb.append(" ");
                    sb.append(MediaBrowserCompat$ItemReceiver[1]);
                    sb.append(")");
                    return sb.toString();
                } else if (i2 == 1) {
                    int i4 = MediaBrowserCompat$ItemReceiver[1];
                    if (i4 == 0) {
                        return "Spot Focusing";
                    }
                    if (i4 == 1) {
                        return "5-area";
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown (");
                    sb2.append(MediaBrowserCompat$ItemReceiver[0]);
                    sb2.append(" ");
                    sb2.append(MediaBrowserCompat$ItemReceiver[1]);
                    sb2.append(")");
                    return sb2.toString();
                } else if (i2 == 16) {
                    int i5 = MediaBrowserCompat$ItemReceiver[1];
                    if (i5 == 0) {
                        return "1-area";
                    }
                    if (i5 == 16) {
                        return "1-area (high speed)";
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unknown (");
                    sb3.append(MediaBrowserCompat$ItemReceiver[0]);
                    sb3.append(" ");
                    sb3.append(MediaBrowserCompat$ItemReceiver[1]);
                    sb3.append(")");
                    return sb3.toString();
                } else if (i2 == 32) {
                    int i6 = MediaBrowserCompat$ItemReceiver[1];
                    if (i6 == 0) {
                        return "Auto or Face Detect";
                    }
                    if (i6 == 1) {
                        return "3-area (left)";
                    }
                    if (i6 == 2) {
                        return "3-area (center)";
                    }
                    if (i6 == 3) {
                        return "3-area (right)";
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Unknown (");
                    sb4.append(MediaBrowserCompat$ItemReceiver[0]);
                    sb4.append(" ");
                    sb4.append(MediaBrowserCompat$ItemReceiver[1]);
                    sb4.append(")");
                    return sb4.toString();
                } else if (i2 == 64) {
                    return "Face Detect";
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Unknown (");
                    sb5.append(MediaBrowserCompat$ItemReceiver[0]);
                    sb5.append(" ");
                    sb5.append(MediaBrowserCompat$ItemReceiver[1]);
                    sb5.append(")");
                    return sb5.toString();
                }
            case 26:
                return write(26, 2, "On, Mode 1", "Off", "On, Mode 2");
            case 28:
                return write(28, 1, "Off", "On");
            case 31:
                return write(31, 1, IconCompatParcelizer);
            case 32:
                return write(32, 1, "Off", "On");
            case 33:
                return IconCompatParcelizer(33);
            case 37:
                return write();
            case 38:
                return IconCompatParcelizer(38, 2);
            case 40:
                return write(40, 1, "Off", "Warm", "Cool", "Black & White", "Sepia");
            case 41:
                Integer MediaBrowserCompat$CustomActionResultReceiver = ((F32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(41);
                if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                    return null;
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append(((float) MediaBrowserCompat$CustomActionResultReceiver.intValue()) / 100.0f);
                sb6.append(" s");
                return sb6.toString();
            case 42:
                return MediaBrowserCompat$CustomActionResultReceiver(42, "Off", null, "On", "Indefinite", "Unlimited");
            case 44:
                Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((F32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(44);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    return null;
                }
                int intValue = MediaBrowserCompat$CustomActionResultReceiver2.intValue();
                if (intValue == 0) {
                    return "Normal";
                }
                if (intValue == 1) {
                    return "Low";
                }
                if (intValue == 2) {
                    return "High";
                }
                if (intValue == 6) {
                    return "Medium Low";
                }
                if (intValue == 7) {
                    return "Medium High";
                }
                if (intValue == 256) {
                    return "Low";
                }
                if (intValue == 272) {
                    return "Normal";
                }
                if (intValue == 288) {
                    return "High";
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Unknown (");
                sb7.append(MediaBrowserCompat$CustomActionResultReceiver2);
                sb7.append(")");
                return sb7.toString();
            case 45:
                return MediaBrowserCompat$CustomActionResultReceiver(45, "Standard (0)", "Low (-1)", "High (+1)", "Lowest (-2)", "Highest (+2)");
            case 46:
                return write(46, 1, "Off", "10 s", "2 s");
            case 48:
                Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((F32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(48);
                if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                    return null;
                }
                int intValue2 = MediaBrowserCompat$CustomActionResultReceiver3.intValue();
                if (intValue2 == 1) {
                    return "Horizontal";
                }
                if (intValue2 == 3) {
                    return "Rotate 180";
                }
                if (intValue2 == 6) {
                    return "Rotate 90 CW";
                }
                if (intValue2 == 8) {
                    return "Rotate 270 CW";
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append("Unknown (");
                sb8.append(MediaBrowserCompat$CustomActionResultReceiver3);
                sb8.append(")");
                return sb8.toString();
            case 49:
                return write(49, 1, "Fired", "Enabled but not used", "Disabled but required", "Disabled and not required");
            case 50:
                return MediaBrowserCompat$CustomActionResultReceiver(50, "Normal", "Natural", "Vivid");
            case 51:
                String MediaBrowserCompat$SearchResultReceiver = ((F32_4) this.write).MediaBrowserCompat$SearchResultReceiver(51);
                if (MediaBrowserCompat$SearchResultReceiver == null) {
                    ratingCompat = null;
                } else {
                    ratingCompat = nAllocationSetSurface.RatingCompat.write(MediaBrowserCompat$SearchResultReceiver);
                }
                if (ratingCompat == null) {
                    return null;
                }
                return ratingCompat.MediaBrowserCompat$ItemReceiver();
            case 52:
                return write(52, 1, "Standard", "Extended");
            case 53:
                return write(53, 1, "Off", "Wide", "Telephoto", "Macro");
            case 57:
                return MediaBrowserCompat$CustomActionResultReceiver(57, "Normal");
            case 58:
                return write(58, 1, "Home", "Destination");
            case 59:
                return write(59, 1, "Off", "On");
            case 61:
                return write(61, 1, "Normal", "Outdoor/Illuminations/Flower/HDR Art", "Indoor/Architecture/Objects/HDR B&W", "Creative", "Auto", null, "Expressive", "Retro", "Pure", "Elegant", null, "Monochrome", "Dynamic Art", "Silhouette");
            case 62:
                return write(62, 1, "Off", "On");
            case 69:
                return MediaBrowserCompat$CustomActionResultReceiver(69, "No Bracket", "3 Images, Sequence 0/-/+", "3 Images, Sequence -/0/+", "5 Images, Sequence 0/-/+", "5 Images, Sequence -/0/+", "7 Images, Sequence 0/-/+", "7 Images, Sequence -/0/+");
            case 72:
                return MediaBrowserCompat$CustomActionResultReceiver(72, "n/a", "1st", "2nd");
            case 73:
                return write(73, 1, "Off", "On");
            case 78:
                return write(((F32_4) this.write).read());
            case 89:
                return MediaBrowserCompat$MediaItem(89);
            case 93:
                return MediaBrowserCompat$CustomActionResultReceiver(93, "Off", "Low", "Standard", "High");
            case 96:
                return MediaBrowserCompat$SearchResultReceiver();
            case 97:
                return write(((F32_4) this.write).RatingCompat());
            case 98:
                return MediaBrowserCompat$CustomActionResultReceiver(98, "No", "Yes (Flash required but disabled)");
            case 101:
                String read = read(101, setViewCacheExtension.write);
                if (read == null) {
                    return null;
                }
                return read.trim();
            case 102:
                String read2 = read(102, setViewCacheExtension.write);
                if (read2 == null) {
                    return null;
                }
                return read2.trim();
            case 103:
                String read3 = read(103, setViewCacheExtension.write);
                if (read3 == null) {
                    return null;
                }
                return read3.trim();
            case 105:
                String read4 = read(105, setViewCacheExtension.write);
                if (read4 == null) {
                    return null;
                }
                return read4.trim();
            case 107:
                String read5 = read(107, setViewCacheExtension.write);
                if (read5 == null) {
                    return null;
                }
                return read5.trim();
            case 109:
                String read6 = read(109, setViewCacheExtension.write);
                if (read6 == null) {
                    return null;
                }
                return read6.trim();
            case 111:
                String read7 = read(111, setViewCacheExtension.write);
                if (read7 == null) {
                    return null;
                }
                return read7.trim();
            case 112:
                return MediaBrowserCompat$CustomActionResultReceiver(112, "Off", null, "Auto", "On");
            case 121:
                return MediaBrowserCompat$CustomActionResultReceiver(121, "Off", "Low", "Standard", "High");
            case EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE /*124*/:
                return MediaBrowserCompat$CustomActionResultReceiver(EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE, "Off", "On");
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /*137*/:
                return MediaBrowserCompat$CustomActionResultReceiver(CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA, "Auto", "Standard or Custom", "Vivid", "Natural", "Monochrome", "Scenery", "Portrait");
            case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /*138*/:
                return MediaBrowserCompat$CustomActionResultReceiver(CipherSuite.TLS_PSK_WITH_RC4_128_SHA, "Off", "On");
            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA /*140*/:
                Integer MediaBrowserCompat$CustomActionResultReceiver4 = ((F32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
                if (MediaBrowserCompat$CustomActionResultReceiver4 == null) {
                    return null;
                }
                return String.valueOf(MediaBrowserCompat$CustomActionResultReceiver4.shortValue());
            case 141:
                Integer MediaBrowserCompat$CustomActionResultReceiver5 = ((F32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(141);
                if (MediaBrowserCompat$CustomActionResultReceiver5 == null) {
                    return null;
                }
                return String.valueOf(MediaBrowserCompat$CustomActionResultReceiver5.shortValue());
            case 142:
                Integer MediaBrowserCompat$CustomActionResultReceiver6 = ((F32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(142);
                if (MediaBrowserCompat$CustomActionResultReceiver6 == null) {
                    return null;
                }
                return String.valueOf(MediaBrowserCompat$CustomActionResultReceiver6.shortValue());
            case CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA /*143*/:
                return MediaBrowserCompat$CustomActionResultReceiver(CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA, "Normal", "Rotate CW", "Rotate 180", "Rotate CCW", "Tilt Upwards", "Tile Downwards");
            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA /*144*/:
                Integer MediaBrowserCompat$CustomActionResultReceiver7 = ((F32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA);
                if (MediaBrowserCompat$CustomActionResultReceiver7 == null) {
                    return null;
                }
                return new DecimalFormat("0.#").format(((double) MediaBrowserCompat$CustomActionResultReceiver7.shortValue()) / 10.0d);
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /*145*/:
                Integer MediaBrowserCompat$CustomActionResultReceiver8 = ((F32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA);
                if (MediaBrowserCompat$CustomActionResultReceiver8 == null) {
                    return null;
                }
                return new DecimalFormat("0.#").format(((double) (-MediaBrowserCompat$CustomActionResultReceiver8.shortValue())) / 10.0d);
            case CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA /*147*/:
                return MediaBrowserCompat$CustomActionResultReceiver(CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA, "Off", "Left to Right", "Right to Left", "Top to Bottom", "Bottom to Top");
            case CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA /*150*/:
                return MediaBrowserCompat$CustomActionResultReceiver(CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA, "Off", "Time Lapse", "Stop-motion Animation");
            case 158:
                Integer MediaBrowserCompat$CustomActionResultReceiver9 = ((F32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(158);
                if (MediaBrowserCompat$CustomActionResultReceiver9 == null) {
                    return null;
                }
                int intValue3 = MediaBrowserCompat$CustomActionResultReceiver9.intValue();
                if (intValue3 == 0) {
                    return "Off";
                }
                if (intValue3 == 100) {
                    return "1 EV";
                }
                if (intValue3 == 200) {
                    return "2 EV";
                }
                if (intValue3 == 300) {
                    return "3 EV";
                }
                if (intValue3 == 32868) {
                    return "1 EV (Auto)";
                }
                if (intValue3 == 32968) {
                    return "2 EV (Auto)";
                }
                if (intValue3 == 33068) {
                    return "3 EV (Auto)";
                }
                return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver9});
            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 /*159*/:
                return MediaBrowserCompat$CustomActionResultReceiver(CipherSuite.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, "Mechanical", "Electronic", "Hybrid");
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /*171*/:
                return MediaBrowserCompat$CustomActionResultReceiver(CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, "Off", "On");
            case 32768:
                return IconCompatParcelizer(32768, 2);
            case 32769:
                return write(32769, 1, IconCompatParcelizer);
            case 32775:
                return write(32775, 1, "Off", "On");
            case 32776:
                return write(32776, 1, "Off", "On");
            case 32777:
                return write(32777, 1, "Off", "On");
            case 32784:
                String MediaBrowserCompat$SearchResultReceiver2 = ((F32_4) this.write).MediaBrowserCompat$SearchResultReceiver(32784);
                if (MediaBrowserCompat$SearchResultReceiver2 == null) {
                    ratingCompat2 = null;
                } else {
                    ratingCompat2 = nAllocationSetSurface.RatingCompat.write(MediaBrowserCompat$SearchResultReceiver2);
                }
                if (ratingCompat2 == null) {
                    return null;
                }
                return ratingCompat2.MediaBrowserCompat$ItemReceiver();
            case 32786:
                return MediaBrowserCompat$MediaItem(32786);
            default:
                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }

    private String MediaBrowserCompat$MediaItem(int i) {
        byte[] IconCompatParcelizer2 = ((F32_4) this.write).IconCompatParcelizer(i);
        if (IconCompatParcelizer2 == null) {
            return null;
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(IconCompatParcelizer2);
        try {
            int MediaSessionCompat$ResultReceiverWrapper = staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(0);
            int MediaSessionCompat$ResultReceiverWrapper2 = staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(2);
            if (MediaSessionCompat$ResultReceiverWrapper == -1 && MediaSessionCompat$ResultReceiverWrapper2 == 1) {
                return "Slim Low";
            }
            if (MediaSessionCompat$ResultReceiverWrapper == -3 && MediaSessionCompat$ResultReceiverWrapper2 == 2) {
                return "Slim High";
            }
            if (MediaSessionCompat$ResultReceiverWrapper == 0 && MediaSessionCompat$ResultReceiverWrapper2 == 0) {
                return "Off";
            }
            if (MediaSessionCompat$ResultReceiverWrapper == 1 && MediaSessionCompat$ResultReceiverWrapper2 == 1) {
                return "Stretch Low";
            }
            if (MediaSessionCompat$ResultReceiverWrapper == 3 && MediaSessionCompat$ResultReceiverWrapper2 == 2) {
                return "Stretch High";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown (");
            sb.append(MediaSessionCompat$ResultReceiverWrapper);
            sb.append(" ");
            sb.append(MediaSessionCompat$ResultReceiverWrapper2);
            sb.append(")");
            return sb.toString();
        } catch (IOException unused) {
            return null;
        }
    }

    private String MediaBrowserCompat$SearchResultReceiver() {
        byte[] IconCompatParcelizer2 = ((F32_4) this.write).IconCompatParcelizer(96);
        if (IconCompatParcelizer2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < IconCompatParcelizer2.length; i++) {
            sb.append(IconCompatParcelizer2[i]);
            if (i < IconCompatParcelizer2.length - 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

    private static String write(nContextSendMessage[] ncontextsendmessageArr) {
        if (ncontextsendmessageArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < ncontextsendmessageArr.length) {
            sb.append("Face ");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(": ");
            sb.append(ncontextsendmessageArr[i].toString());
            sb.append("\n");
            i = i2;
        }
        if (sb.length() > 0) {
            return sb.substring(0, sb.length() - 1);
        }
        return null;
    }
}
