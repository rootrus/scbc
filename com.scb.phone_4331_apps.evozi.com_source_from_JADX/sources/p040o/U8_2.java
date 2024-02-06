package p040o;

import p040o.rsnAllocationRead1D;

/* renamed from: o.U8_2 */
public final class U8_2 extends createCubemapFromCubeFaces<C1293U8> {
    public U8_2(C1293U8 u8) {
        super(u8);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int i2 = i;
        if (i2 == -3) {
            return MediaBrowserCompat$CustomActionResultReceiver(-3, "Baseline", "Extended sequential, Huffman", "Progressive, Huffman", "Lossless, Huffman", null, "Differential sequential, Huffman", "Differential progressive, Huffman", "Differential lossless, Huffman", "Reserved for JPEG extensions", "Extended sequential, arithmetic", "Progressive, arithmetic", "Lossless, arithmetic", null, "Differential sequential, arithmetic", "Differential progressive, arithmetic", "Differential lossless, arithmetic");
        }
        if (i2 == 3) {
            String MediaBrowserCompat$SearchResultReceiver = ((C1293U8) this.write).MediaBrowserCompat$SearchResultReceiver(3);
            if (MediaBrowserCompat$SearchResultReceiver == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(MediaBrowserCompat$SearchResultReceiver);
            sb.append(" pixels");
            return sb.toString();
        } else if (i2 == 0) {
            String MediaBrowserCompat$SearchResultReceiver2 = ((C1293U8) this.write).MediaBrowserCompat$SearchResultReceiver(0);
            if (MediaBrowserCompat$SearchResultReceiver2 == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(MediaBrowserCompat$SearchResultReceiver2);
            sb2.append(" bits");
            return sb2.toString();
        } else if (i2 != 1) {
            switch (i2) {
                case 6:
                    return MediaBrowserCompat$SearchResultReceiver(0);
                case 7:
                    return MediaBrowserCompat$SearchResultReceiver(1);
                case 8:
                    return MediaBrowserCompat$SearchResultReceiver(2);
                case 9:
                    return MediaBrowserCompat$SearchResultReceiver(3);
                default:
                    return super.MediaBrowserCompat$CustomActionResultReceiver(i);
            }
        } else {
            String MediaBrowserCompat$SearchResultReceiver3 = ((C1293U8) this.write).MediaBrowserCompat$SearchResultReceiver(1);
            if (MediaBrowserCompat$SearchResultReceiver3 == null) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(MediaBrowserCompat$SearchResultReceiver3);
            sb3.append(" pixels");
            return sb3.toString();
        }
    }

    private String MediaBrowserCompat$SearchResultReceiver(int i) {
        String str;
        rsnAllocationRead1D.IconCompatParcelizer iconCompatParcelizer = (rsnAllocationRead1D.IconCompatParcelizer) ((C1293U8) this.write).MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(i + 6));
        if (iconCompatParcelizer == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = iconCompatParcelizer.write;
        if (i2 == 1) {
            str = "Y";
        } else if (i2 == 2) {
            str = "Cb";
        } else if (i2 == 3) {
            str = "Cr";
        } else if (i2 == 4) {
            str = "I";
        } else if (i2 != 5) {
            str = String.format("Unknown (%s)", new Object[]{Integer.valueOf(i2)});
        } else {
            str = "Q";
        }
        sb.append(str);
        sb.append(" component: ");
        sb.append(iconCompatParcelizer);
        return sb.toString();
    }
}
