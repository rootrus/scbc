package p040o;

import java.util.HashMap;

/* renamed from: o.ALLOCATION */
public final class ALLOCATION extends createCubemapFromCubeFaces<BOOLEAN> {
    private static final HashMap<Integer, String> read;

    public ALLOCATION(BOOLEAN booleanR) {
        super(booleanR);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            return IconCompatParcelizer(0, 4);
        }
        if (i == 256) {
            return write(256, 1, "Color Temperature", "Gray Point");
        }
        if (i == 289) {
            return MediaDescriptionCompat();
        }
        if (i == 272) {
            return MediaBrowserCompat$CustomActionResultReceiver(272, "Neutral", "Yellow", "Orange", "Red", "Green");
        }
        if (i == 273) {
            return MediaBrowserCompat$CustomActionResultReceiver(273, "Neutral", "Sepia", "Blue", "Purple", "Green");
        }
        switch (i) {
            case 265:
                return MediaBrowserCompat$CustomActionResultReceiver(265, "sRGB", "Adobe RGB", "Pro Photo RGB");
            case 266:
                Integer MediaBrowserCompat$CustomActionResultReceiver = ((BOOLEAN) this.write).MediaBrowserCompat$CustomActionResultReceiver(266);
                if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                    return null;
                }
                if (MediaBrowserCompat$CustomActionResultReceiver.intValue() == 0) {
                    return "(none)";
                }
                StringBuilder sb = new StringBuilder();
                int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
                if ((intValue & 1) != 0) {
                    sb.append("Noise Reduction, ");
                }
                if (((intValue >> 1) & 1) != 0) {
                    sb.append("Noise Filter, ");
                }
                if (((intValue >> 2) & 1) != 0) {
                    sb.append("Noise Filter (ISO Boost), ");
                }
                return sb.substring(0, sb.length() - 2);
            case 267:
                return MediaBrowserCompat$CustomActionResultReceiver(267, "High Speed", "High Function", "Advanced High Speed", "Advanced High Function");
            case 268:
                Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((BOOLEAN) this.write).MediaBrowserCompat$CustomActionResultReceiver(268);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    return null;
                }
                int intValue2 = MediaBrowserCompat$CustomActionResultReceiver2.intValue();
                if (intValue2 == 1) {
                    return "Vivid";
                }
                if (intValue2 == 2) {
                    return "Natural";
                }
                if (intValue2 == 3) {
                    return "Muted";
                }
                if (intValue2 == 256) {
                    return "Monotone";
                }
                if (intValue2 == 512) {
                    return "Sepia";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown (");
                sb2.append(MediaBrowserCompat$CustomActionResultReceiver2);
                sb2.append(")");
                return sb2.toString();
            default:
                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }

    private String MediaDescriptionCompat() {
        int[] MediaBrowserCompat$ItemReceiver = ((BOOLEAN) this.write).MediaBrowserCompat$ItemReceiver(289);
        if (MediaBrowserCompat$ItemReceiver == null || MediaBrowserCompat$ItemReceiver.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver.length; i++) {
            if (i == 0) {
                sb.append(read.containsKey(Integer.valueOf(MediaBrowserCompat$ItemReceiver[i])) ? read.get(Integer.valueOf(MediaBrowserCompat$ItemReceiver[i])) : "[unknown]");
            } else {
                sb.append(MediaBrowserCompat$ItemReceiver[i]);
                sb.append("; ");
            }
            sb.append("; ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(0, "Off");
        read.put(1, "Soft Focus");
        read.put(2, "Pop Art");
        read.put(3, "Pale & Light Color");
        read.put(4, "Light Tone");
        read.put(5, "Pin Hole");
        read.put(6, "Grainy Film");
        read.put(9, "Diorama");
        read.put(10, "Cross Process");
        read.put(12, "Fish Eye");
        read.put(13, "Drawing");
        read.put(14, "Gentle Sepia");
        read.put(15, "Pale & Light Color II");
        read.put(16, "Pop Art II");
        read.put(17, "Pin Hole II");
        read.put(18, "Pin Hole III");
        read.put(19, "Grainy Film II");
        read.put(20, "Dramatic Tone");
        read.put(21, "Punk");
        read.put(22, "Soft Focus 2");
        read.put(23, "Sparkle");
        read.put(24, "Watercolor");
        read.put(25, "Key Line");
        read.put(26, "Key Line II");
        read.put(27, "Miniature");
        read.put(28, "Reflection");
        read.put(29, "Fragmented");
        read.put(31, "Cross Process II");
        read.put(32, "Dramatic Tone II");
        read.put(33, "Watercolor I");
        read.put(34, "Watercolor II");
        read.put(35, "Diorama II");
        read.put(36, "Vintage");
        read.put(37, "Vintage II");
        read.put(38, "Vintage III");
        read.put(39, "Partial Color");
        read.put(40, "Partial Color II");
        read.put(41, "Partial Color III");
    }
}
