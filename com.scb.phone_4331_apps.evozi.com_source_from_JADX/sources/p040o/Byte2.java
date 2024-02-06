package p040o;

import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.Byte2 */
public final class Byte2 extends createCubemapFromCubeFaces<Double2> {
    public Byte2(Double2 double2) {
        super(double2);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            return IconCompatParcelizer(0, 4);
        }
        if (i == 521) {
            return MediaBrowserCompat$CustomActionResultReceiver(521, "Off", "On");
        }
        if (i == 773) {
            copy3DRangeFromUnchecked RatingCompat = ((Double2) this.write).RatingCompat(773);
            if (RatingCompat == null || RatingCompat.IconCompatParcelizer == 4294967295L || RatingCompat.IconCompatParcelizer == 0) {
                return "inf";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(((double) RatingCompat.IconCompatParcelizer) / 1000.0d);
            sb.append(" m");
            return sb.toString();
        } else if (i == 776) {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((Double2) this.write).MediaBrowserCompat$CustomActionResultReceiver(776);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            return MediaBrowserCompat$CustomActionResultReceiver.toString();
        } else if (i == 4609) {
            int[] MediaBrowserCompat$ItemReceiver = ((Double2) this.write).MediaBrowserCompat$ItemReceiver(4609);
            if (MediaBrowserCompat$ItemReceiver == null || MediaBrowserCompat$ItemReceiver.length < 2) {
                return null;
            }
            String format = String.format("%d %d", new Object[]{Short.valueOf((short) MediaBrowserCompat$ItemReceiver[0]), Short.valueOf((short) MediaBrowserCompat$ItemReceiver[1])});
            if (format.equals("0 0")) {
                return "Off";
            }
            if (format.equals("1 0")) {
                return "On";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown (");
            sb2.append(format);
            sb2.append(")");
            return sb2.toString();
        } else if (i == 5376) {
            return ((Double2) this.write).MediaBrowserCompat$SearchResultReceiver(5376);
        } else {
            if (i == 5632) {
                byte[] IconCompatParcelizer = ((Double2) this.write).IconCompatParcelizer(5632);
                if (IconCompatParcelizer == null) {
                    return null;
                }
                if ((IconCompatParcelizer[0] | IconCompatParcelizer[1] | IconCompatParcelizer[2] | IconCompatParcelizer[3]) == 0) {
                    return "Off";
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("On, ");
                sb3.append((IconCompatParcelizer[43] & 1) > 0 ? "Mode 1" : "Mode 2");
                return sb3.toString();
            } else if (i == 4612) {
                return MediaBrowserCompat$CustomActionResultReceiver(4612, "Bounce or Off", "Direct");
            } else {
                if (i == 4613) {
                    int[] MediaBrowserCompat$ItemReceiver2 = ((Double2) this.write).MediaBrowserCompat$ItemReceiver(4613);
                    if (MediaBrowserCompat$ItemReceiver2 == null) {
                        Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((Double2) this.write).MediaBrowserCompat$CustomActionResultReceiver(4613);
                        if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                            return null;
                        }
                        MediaBrowserCompat$ItemReceiver2 = new int[]{MediaBrowserCompat$CustomActionResultReceiver2.intValue()};
                    }
                    if (MediaBrowserCompat$ItemReceiver2.length == 0) {
                        return null;
                    }
                    String format2 = String.format("%d", new Object[]{Short.valueOf((short) MediaBrowserCompat$ItemReceiver2[0])});
                    if (MediaBrowserCompat$ItemReceiver2.length > 1) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(format2);
                        sb4.append(" ");
                        sb4.append(String.format("%d", new Object[]{Short.valueOf((short) MediaBrowserCompat$ItemReceiver2[1])}));
                        format2 = sb4.toString();
                    }
                    if (format2.equals("0")) {
                        return "Off";
                    }
                    if (format2.equals(DiskLruCache.VERSION_1)) {
                        return "On";
                    }
                    if (format2.equals("0 0")) {
                        return "Off";
                    }
                    if (format2.equals("1 0")) {
                        return "On";
                    }
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Unknown (");
                    sb5.append(format2);
                    sb5.append(")");
                    return sb5.toString();
                } else if (i == 4617) {
                    int[] MediaBrowserCompat$ItemReceiver3 = ((Double2) this.write).MediaBrowserCompat$ItemReceiver(4617);
                    if (MediaBrowserCompat$ItemReceiver3 == null) {
                        return null;
                    }
                    if (((short) MediaBrowserCompat$ItemReceiver3[0]) == 0) {
                        return "Off";
                    }
                    if (((short) MediaBrowserCompat$ItemReceiver3[1]) == 1) {
                        return "Full";
                    }
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("On (1/");
                    sb6.append((short) MediaBrowserCompat$ItemReceiver3[1]);
                    sb6.append(" strength)");
                    return sb6.toString();
                } else if (i != 4618) {
                    return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                } else {
                    return MediaBrowserCompat$CustomActionResultReceiver(4618, "Off", "On");
                }
            }
        }
    }
}
