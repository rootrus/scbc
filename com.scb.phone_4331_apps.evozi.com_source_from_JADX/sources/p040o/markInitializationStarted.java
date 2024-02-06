package p040o;

import java.util.Objects;
import p040o.Iterables;

/* renamed from: o.markInitializationStarted */
public final class markInitializationStarted {
    public String IconCompatParcelizer;
    public Integer MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public static int write(String str) {
        if ("NEAR CASH".equals(str)) {
            return Iterables.C35273.read.in_light_green;
        }
        if ("MIXED ASSETS".equals(str)) {
            return Iterables.C35273.read.in_light_blue;
        }
        if ("EQUITY".equals(str)) {
            return Iterables.C35273.read.in_dark_blue;
        }
        if ("FIXED INCOME".equals(str)) {
            return Iterables.C35273.read.in_yellow;
        }
        if ("COMMODITIES".equals(str)) {
            return Iterables.C35273.read.in_red;
        }
        return Iterables.C35273.read.black;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int MediaBrowserCompat$ItemReceiver(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 2
            r2 = 1
            r3 = 3
            r4 = 4
            switch(r0) {
                case -48864149: goto L_0x0034;
                case 684702763: goto L_0x002a;
                case 890169333: goto L_0x0020;
                case 1569800040: goto L_0x0016;
                case 2052821701: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x003e
        L_0x000c:
            java.lang.String r0 = "EQUITY"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r1
            goto L_0x003f
        L_0x0016:
            java.lang.String r0 = "MIXED ASSETS"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r2
            goto L_0x003f
        L_0x0020:
            java.lang.String r0 = "FIXED INCOME"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r3
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "NEAR CASH"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = 0
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "COMMODITIES"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x003e
            r5 = r4
            goto L_0x003f
        L_0x003e:
            r5 = -1
        L_0x003f:
            if (r5 == 0) goto L_0x0058
            if (r5 == r2) goto L_0x0055
            if (r5 == r1) goto L_0x0052
            if (r5 == r3) goto L_0x004f
            if (r5 == r4) goto L_0x004c
            int r5 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.empty
            goto L_0x005a
        L_0x004c:
            int r5 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.commodities
            goto L_0x005a
        L_0x004f:
            int r5 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.fixed_income
            goto L_0x005a
        L_0x0052:
            int r5 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.equity
            goto L_0x005a
        L_0x0055:
            int r5 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.mixed_asset
            goto L_0x005a
        L_0x0058:
            int r5 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.near_case
        L_0x005a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.markInitializationStarted.MediaBrowserCompat$ItemReceiver(java.lang.String):int");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        markInitializationStarted markinitializationstarted = (markInitializationStarted) obj;
        if (Objects.equals(this.MediaBrowserCompat$CustomActionResultReceiver, markinitializationstarted.MediaBrowserCompat$CustomActionResultReceiver) && Objects.equals(this.write, markinitializationstarted.write) && Objects.equals(this.MediaBrowserCompat$ItemReceiver, markinitializationstarted.MediaBrowserCompat$ItemReceiver) && Objects.equals(this.read, markinitializationstarted.read)) {
            return Objects.equals(this.IconCompatParcelizer, markinitializationstarted.IconCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.write;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvestmentDetailsSummaryAssetGroupDisplay{sortSequence=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", percent='");
        sb.append(this.write);
        sb.append('\'');
        sb.append(", percentLegend='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", assetTypeDescription='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", assetTypeCode='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
