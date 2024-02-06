package p040o;

/* renamed from: o.U32 */
public final class U32 extends createCubemapFromCubeFaces<U64> {
    public U32(U64 u64) {
        super(u64);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != 5) {
            String str = "";
            if (i == 10) {
                Integer MediaBrowserCompat$CustomActionResultReceiver = ((U64) this.write).MediaBrowserCompat$CustomActionResultReceiver(10);
                if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                    return null;
                }
                Object[] objArr = new Object[2];
                objArr[0] = MediaBrowserCompat$CustomActionResultReceiver;
                if (MediaBrowserCompat$CustomActionResultReceiver.intValue() != 1) {
                    str = "s";
                }
                objArr[1] = str;
                return String.format("%d dot%s", objArr);
            } else if (i == 7) {
                Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((U64) this.write).MediaBrowserCompat$CustomActionResultReceiver(7);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    return null;
                }
                int intValue = MediaBrowserCompat$CustomActionResultReceiver2.intValue();
                if (intValue == 0) {
                    return "none";
                }
                if (intValue != 1) {
                    return intValue != 2 ? "unit" : "centimetre";
                }
                return "inch";
            } else if (i != 8) {
                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
            } else {
                Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((U64) this.write).MediaBrowserCompat$CustomActionResultReceiver(8);
                if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                    return null;
                }
                Object[] objArr2 = new Object[2];
                objArr2[0] = MediaBrowserCompat$CustomActionResultReceiver3;
                if (MediaBrowserCompat$CustomActionResultReceiver3.intValue() != 1) {
                    str = "s";
                }
                objArr2[1] = str;
                return String.format("%d dot%s", objArr2);
            }
        } else {
            Integer MediaBrowserCompat$CustomActionResultReceiver4 = ((U64) this.write).MediaBrowserCompat$CustomActionResultReceiver(5);
            if (MediaBrowserCompat$CustomActionResultReceiver4 == null) {
                return null;
            }
            return String.format("%d.%d", new Object[]{Integer.valueOf((MediaBrowserCompat$CustomActionResultReceiver4.intValue() >> 8) & 255), Integer.valueOf(MediaBrowserCompat$CustomActionResultReceiver4.intValue() & 255)});
        }
    }
}
