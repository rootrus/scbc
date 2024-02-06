package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.Serializable;

/* renamed from: o.copy3DRangeFromUnchecked */
public final class copy3DRangeFromUnchecked extends Number implements Comparable<copy3DRangeFromUnchecked>, Serializable {
    public final long IconCompatParcelizer;
    public final long MediaBrowserCompat$ItemReceiver;

    public final /* synthetic */ int compareTo(Object obj) {
        return Double.compare(doubleValue(), ((copy3DRangeFromUnchecked) obj).doubleValue());
    }

    public copy3DRangeFromUnchecked(long j, long j2) {
        this.IconCompatParcelizer = j;
        this.MediaBrowserCompat$ItemReceiver = j2;
    }

    public final double doubleValue() {
        long j = this.IconCompatParcelizer;
        if (j == 0) {
            return 0.0d;
        }
        return ((double) j) / ((double) this.MediaBrowserCompat$ItemReceiver);
    }

    public final float floatValue() {
        long j = this.IconCompatParcelizer;
        return j == 0 ? BitmapDescriptorFactory.HUE_RED : ((float) j) / ((float) this.MediaBrowserCompat$ItemReceiver);
    }

    public final byte byteValue() {
        return (byte) ((int) doubleValue());
    }

    public final int intValue() {
        return (int) doubleValue();
    }

    public final long longValue() {
        return (long) doubleValue();
    }

    public final short shortValue() {
        return (short) ((int) doubleValue());
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        long j = this.MediaBrowserCompat$ItemReceiver;
        return j == 1 || (j != 0 && this.IconCompatParcelizer % j == 0) || (this.MediaBrowserCompat$ItemReceiver == 0 && this.IconCompatParcelizer == 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer);
        sb.append("/");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String IconCompatParcelizer(boolean r12) {
        /*
            r11 = this;
            r0 = r11
        L_0x0001:
            long r1 = r0.MediaBrowserCompat$ItemReceiver
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0014
            long r1 = r0.IconCompatParcelizer
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0014
            java.lang.String r12 = r0.toString()
            return r12
        L_0x0014:
            boolean r1 = r0.MediaBrowserCompat$ItemReceiver()
            if (r1 == 0) goto L_0x0023
            int r12 = r0.intValue()
            java.lang.String r12 = java.lang.Integer.toString(r12)
            return r12
        L_0x0023:
            long r1 = r0.IconCompatParcelizer
            r5 = 1
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x003a
            long r7 = r0.MediaBrowserCompat$ItemReceiver
            long r9 = r7 % r1
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L_0x003a
            long r7 = r7 / r1
            o.copy3DRangeFromUnchecked r0 = new o.copy3DRangeFromUnchecked
            r0.<init>(r5, r7)
            goto L_0x0001
        L_0x003a:
            long r1 = r0.IconCompatParcelizer
            long r5 = r0.MediaBrowserCompat$ItemReceiver
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0043
            long r1 = -r1
        L_0x0043:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0048
            long r5 = -r5
        L_0x0048:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0058
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 == 0) goto L_0x0058
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0056
            long r1 = r1 % r5
            goto L_0x0048
        L_0x0056:
            long r5 = r5 % r1
            goto L_0x0048
        L_0x0058:
            if (r7 != 0) goto L_0x005b
            r1 = r5
        L_0x005b:
            o.copy3DRangeFromUnchecked r3 = new o.copy3DRangeFromUnchecked
            long r4 = r0.IconCompatParcelizer
            long r4 = r4 / r1
            long r6 = r0.MediaBrowserCompat$ItemReceiver
            long r6 = r6 / r1
            r3.<init>(r4, r6)
            if (r12 == 0) goto L_0x0078
            double r0 = r3.doubleValue()
            java.lang.String r12 = java.lang.Double.toString(r0)
            int r0 = r12.length()
            r1 = 5
            if (r0 >= r1) goto L_0x0078
            return r12
        L_0x0078:
            java.lang.String r12 = r3.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.copy3DRangeFromUnchecked.IconCompatParcelizer(boolean):java.lang.String");
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof copy3DRangeFromUnchecked) || doubleValue() != ((copy3DRangeFromUnchecked) obj).doubleValue()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((int) this.MediaBrowserCompat$ItemReceiver) * 23) + ((int) this.IconCompatParcelizer);
    }
}
