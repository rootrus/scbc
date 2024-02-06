package p040o;

/* renamed from: o.Byte4 */
public final class Byte4 extends createCubemapFromCubeFaces<Double4> {
    public Byte4(Double4 double4) {
        super(double4);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            return IconCompatParcelizer(0, 4);
        }
        if (i == 512) {
            return MediaDescriptionCompat();
        }
        if (i == 4124) {
            int[] MediaBrowserCompat$ItemReceiver = ((Double4) this.write).MediaBrowserCompat$ItemReceiver(4124);
            if (MediaBrowserCompat$ItemReceiver == null) {
                Integer MediaBrowserCompat$CustomActionResultReceiver = ((Double4) this.write).MediaBrowserCompat$CustomActionResultReceiver(4124);
                if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                    return null;
                }
                MediaBrowserCompat$ItemReceiver = new int[]{MediaBrowserCompat$CustomActionResultReceiver.intValue()};
            }
            if (MediaBrowserCompat$ItemReceiver.length == 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            short s = (short) MediaBrowserCompat$ItemReceiver[0];
            if (s == 0) {
                sb.append("Off");
            } else if (s == 2) {
                sb.append("On (2 frames)");
            } else if (s != 3) {
                sb.append("Unknown (");
                sb.append((short) MediaBrowserCompat$ItemReceiver[0]);
                sb.append(")");
            } else {
                sb.append("On (3 frames)");
            }
            if (MediaBrowserCompat$ItemReceiver.length > 1) {
                sb.append("; ");
                sb.append((short) MediaBrowserCompat$ItemReceiver[1]);
            }
            return sb.toString();
        } else if (i == 4370) {
            byte[] IconCompatParcelizer = ((Double4) this.write).IconCompatParcelizer(4370);
            if (IconCompatParcelizer == null || IconCompatParcelizer.length < 2) {
                return null;
            }
            String format = String.format("%d %d", new Object[]{Byte.valueOf(IconCompatParcelizer[0]), Byte.valueOf(IconCompatParcelizer[1])});
            if (format.equals("1 1")) {
                return "4:3";
            }
            if (format.equals("1 4")) {
                return "1:1";
            }
            if (format.equals("2 1")) {
                return "3:2 (RAW)";
            }
            if (format.equals("2 2")) {
                return "3:2";
            }
            if (format.equals("3 1")) {
                return "16:9 (RAW)";
            }
            if (format.equals("3 3")) {
                return "16:9";
            }
            if (format.equals("4 1")) {
                return "1:1 (RAW)";
            }
            if (format.equals("4 4")) {
                return "6:6";
            }
            if (format.equals("5 5")) {
                return "5:4";
            }
            if (format.equals("6 6")) {
                return "7:6";
            }
            if (format.equals("7 7")) {
                return "6:5";
            }
            if (format.equals("8 8")) {
                return "7:5";
            }
            if (format.equals("9 1")) {
                return "3:4 (RAW)";
            }
            if (format.equals("9 9")) {
                return "3:4";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown (");
            sb2.append(format);
            sb2.append(")");
            return sb2.toString();
        } else if (i == 6400) {
            byte[] IconCompatParcelizer2 = ((Double4) this.write).IconCompatParcelizer(6400);
            if (IconCompatParcelizer2 == null || IconCompatParcelizer2.length < 2) {
                return null;
            }
            String format2 = String.format("%d %d", new Object[]{Byte.valueOf(IconCompatParcelizer2[0]), Byte.valueOf(IconCompatParcelizer2[1])});
            if (format2.equals("0 0")) {
                return "Off";
            }
            if (format2.equals("0 1")) {
                return "On";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown (");
            sb3.append(format2);
            sb3.append(")");
            return sb3.toString();
        } else if (i == 6401) {
            return MediaBrowserCompat$CustomActionResultReceiver(6401, "Vertical", "Horizontal");
        } else {
            switch (i) {
                case 4112:
                    Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((Double4) this.write).MediaBrowserCompat$CustomActionResultReceiver(4112);
                    if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                        return null;
                    }
                    if (MediaBrowserCompat$CustomActionResultReceiver2.intValue() == 0) {
                        return "(none)";
                    }
                    StringBuilder sb4 = new StringBuilder();
                    short shortValue = MediaBrowserCompat$CustomActionResultReceiver2.shortValue();
                    if ((shortValue & 1) != 0) {
                        sb4.append("Noise Reduction, ");
                    }
                    if (((shortValue >> 1) & 1) != 0) {
                        sb4.append("Noise Filter, ");
                    }
                    if (((shortValue >> 2) & 1) != 0) {
                        sb4.append("Noise Filter (ISO Boost), ");
                    }
                    return sb4.substring(0, sb4.length() - 2);
                case 4113:
                    return MediaBrowserCompat$CustomActionResultReceiver(4113, "Off", "On");
                case 4114:
                    return MediaBrowserCompat$CustomActionResultReceiver(4114, "Off", "On");
                default:
                    return super.MediaBrowserCompat$CustomActionResultReceiver(i);
            }
        }
    }

    private String MediaDescriptionCompat() {
        int[] MediaBrowserCompat$ItemReceiver = ((Double4) this.write).MediaBrowserCompat$ItemReceiver(512);
        if (MediaBrowserCompat$ItemReceiver == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            sb.append((short) MediaBrowserCompat$ItemReceiver[i]);
        }
        return sb.toString();
    }
}
