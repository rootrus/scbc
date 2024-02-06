package p040o;

import java.math.BigDecimal;
import p040o.zzdy;

/* renamed from: o.setBoundsBias */
public final class setBoundsBias extends zzdy.zze {
    public final BigDecimal MediaBrowserCompat$MediaItem;
    private final BigDecimal MediaDescriptionCompat;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public setBoundsBias(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.math.BigDecimal r12, java.math.BigDecimal r13, java.math.BigDecimal r14) {
        /*
            r8 = this;
            java.math.BigDecimal r6 = java.math.BigDecimal.ZERO
            java.math.BigDecimal r7 = java.math.BigDecimal.ZERO
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.MediaDescriptionCompat = r13
            r8.MediaBrowserCompat$MediaItem = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setBoundsBias.<init>(java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        setBoundsBias setboundsbias = (setBoundsBias) obj;
        BigDecimal bigDecimal = this.MediaDescriptionCompat;
        if (bigDecimal == null ? setboundsbias.MediaDescriptionCompat != null : !bigDecimal.equals(setboundsbias.MediaDescriptionCompat)) {
            return false;
        }
        BigDecimal bigDecimal2 = this.MediaBrowserCompat$MediaItem;
        BigDecimal bigDecimal3 = setboundsbias.MediaBrowserCompat$MediaItem;
        if (bigDecimal2 != null) {
            return bigDecimal2.equals(bigDecimal3);
        }
        if (bigDecimal3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = super.hashCode();
        BigDecimal bigDecimal = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode2 = bigDecimal != null ? bigDecimal.hashCode() : 0;
        BigDecimal bigDecimal2 = this.MediaBrowserCompat$MediaItem;
        if (bigDecimal2 != null) {
            i = bigDecimal2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}
