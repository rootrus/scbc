package p040o;

import java.io.IOException;

/* renamed from: o.TYPE */
public final class TYPE extends createCubemapFromCubeFaces<SCRIPT> {
    public TYPE(SCRIPT script) {
        super(script);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 8) {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((SCRIPT) this.write).MediaBrowserCompat$CustomActionResultReceiver(8);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            return String.format("%d.%d.%d", new Object[]{Integer.valueOf(MediaBrowserCompat$CustomActionResultReceiver.intValue() >> 24), Integer.valueOf((MediaBrowserCompat$CustomActionResultReceiver.intValue() & 15728640) >> 20), Integer.valueOf((MediaBrowserCompat$CustomActionResultReceiver.intValue() & 983040) >> 16)});
        } else if (i == 12) {
            return MediaMetadataCompat();
        } else {
            if (i == 40) {
                return MediaBrowserCompat$MediaItem();
            }
            if (i == 64) {
                return MediaBrowserCompat$CustomActionResultReceiver(64, "Perceptual", "Media-Relative Colorimetric", "Saturation", "ICC-Absolute Colorimetric");
            }
            if (i <= 538976288 || i >= 2054847098) {
                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
            }
            return MediaMetadataCompat(i);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:12|13|14) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|20|21|22|23|80|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0049, code lost:
        return new java.lang.String(r2, 8, (r2.length - 8) - 1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0041 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0080 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0080=Splitter:B:22:0x0080, B:12:0x0041=Splitter:B:12:0x0041} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String MediaMetadataCompat(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            T r2 = r0.write     // Catch:{ IOException -> 0x0209 }
            o.SCRIPT r2 = (p040o.SCRIPT) r2     // Catch:{ IOException -> 0x0209 }
            byte[] r2 = r2.IconCompatParcelizer(r1)     // Catch:{ IOException -> 0x0209 }
            if (r2 != 0) goto L_0x0017
            T r2 = r0.write     // Catch:{ IOException -> 0x0209 }
            o.SCRIPT r2 = (p040o.SCRIPT) r2     // Catch:{ IOException -> 0x0209 }
            java.lang.String r1 = r2.MediaBrowserCompat$SearchResultReceiver(r1)     // Catch:{ IOException -> 0x0209 }
            return r1
        L_0x0017:
            o.StaggeredGridLayoutManager r1 = new o.StaggeredGridLayoutManager     // Catch:{ IOException -> 0x0209 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0209 }
            r3 = 0
            int r4 = r1.MediaBrowserCompat$MediaItem(r3)     // Catch:{ IOException -> 0x0209 }
            java.lang.String r5 = ")"
            java.lang.String r6 = "("
            r7 = 7
            r8 = 16
            r9 = 3
            r10 = 2
            java.lang.String r11 = ", "
            r12 = 12
            r13 = 8
            r14 = 1
            switch(r4) {
                case 1482250784: goto L_0x0198;
                case 1668641398: goto L_0x016a;
                case 1684370275: goto L_0x015f;
                case 1835360627: goto L_0x009e;
                case 1835824483: goto L_0x0053;
                case 1936287520: goto L_0x004a;
                case 1952807028: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x01ed
        L_0x0036:
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0041 }
            int r3 = r2.length     // Catch:{ UnsupportedEncodingException -> 0x0041 }
            int r3 = r3 - r13
            int r3 = r3 - r14
            java.lang.String r4 = "ASCII"
            r1.<init>(r2, r13, r3, r4)     // Catch:{ UnsupportedEncodingException -> 0x0041 }
            return r1
        L_0x0041:
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x0209 }
            int r3 = r2.length     // Catch:{ IOException -> 0x0209 }
            int r3 = r3 - r13
            int r3 = r3 - r14
            r1.<init>(r2, r13, r3)     // Catch:{ IOException -> 0x0209 }
            return r1
        L_0x004a:
            int r1 = r1.MediaBrowserCompat$MediaItem(r13)     // Catch:{ IOException -> 0x0209 }
            java.lang.String r1 = p040o.nAllocationSetSurface.MediaBrowserCompat$CustomActionResultReceiver(r1)     // Catch:{ IOException -> 0x0209 }
            return r1
        L_0x0053:
            int r4 = r1.MediaBrowserCompat$MediaItem(r13)     // Catch:{ IOException -> 0x0209 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0209 }
            r7.<init>()     // Catch:{ IOException -> 0x0209 }
            r7.append(r4)     // Catch:{ IOException -> 0x0209 }
        L_0x005f:
            if (r3 >= r4) goto L_0x0099
            int r9 = r3 * 12
            int r9 = r9 + r8
            int r10 = r1.MediaBrowserCompat$MediaItem(r9)     // Catch:{ IOException -> 0x0209 }
            java.lang.String r10 = p040o.nAllocationSetSurface.MediaBrowserCompat$CustomActionResultReceiver(r10)     // Catch:{ IOException -> 0x0209 }
            int r11 = r9 + 4
            int r11 = r1.MediaBrowserCompat$MediaItem(r11)     // Catch:{ IOException -> 0x0209 }
            int r9 = r9 + 8
            int r9 = r1.MediaBrowserCompat$MediaItem(r9)     // Catch:{ IOException -> 0x0209 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0080 }
            java.lang.String r13 = "UTF-16BE"
            r12.<init>(r2, r9, r11, r13)     // Catch:{ UnsupportedEncodingException -> 0x0080 }
            goto L_0x0085
        L_0x0080:
            java.lang.String r12 = new java.lang.String     // Catch:{ IOException -> 0x0209 }
            r12.<init>(r2, r9, r11)     // Catch:{ IOException -> 0x0209 }
        L_0x0085:
            java.lang.String r9 = " "
            r7.append(r9)     // Catch:{ IOException -> 0x0209 }
            r7.append(r10)     // Catch:{ IOException -> 0x0209 }
            r7.append(r6)     // Catch:{ IOException -> 0x0209 }
            r7.append(r12)     // Catch:{ IOException -> 0x0209 }
            r7.append(r5)     // Catch:{ IOException -> 0x0209 }
            int r3 = r3 + 1
            goto L_0x005f
        L_0x0099:
            java.lang.String r1 = r7.toString()     // Catch:{ IOException -> 0x0209 }
            return r1
        L_0x009e:
            int r2 = r1.MediaBrowserCompat$MediaItem(r13)     // Catch:{ IOException -> 0x0209 }
            float r4 = r1.MediaMetadataCompat(r12)     // Catch:{ IOException -> 0x0209 }
            float r5 = r1.MediaMetadataCompat(r8)     // Catch:{ IOException -> 0x0209 }
            r6 = 20
            float r6 = r1.MediaMetadataCompat(r6)     // Catch:{ IOException -> 0x0209 }
            r8 = 24
            int r8 = r1.MediaBrowserCompat$MediaItem(r8)     // Catch:{ IOException -> 0x0209 }
            r11 = 28
            float r11 = r1.MediaMetadataCompat(r11)     // Catch:{ IOException -> 0x0209 }
            r12 = 32
            int r1 = r1.MediaBrowserCompat$MediaItem(r12)     // Catch:{ IOException -> 0x0209 }
            java.lang.String r12 = "Unknown"
            java.lang.String r13 = "Unknown %d"
            if (r2 == 0) goto L_0x00df
            if (r2 == r14) goto L_0x00dc
            if (r2 == r10) goto L_0x00d9
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ IOException -> 0x0209 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0209 }
            r15[r3] = r16     // Catch:{ IOException -> 0x0209 }
            java.lang.String r15 = java.lang.String.format(r13, r15)     // Catch:{ IOException -> 0x0209 }
            goto L_0x00e0
        L_0x00d9:
            java.lang.String r15 = "1964 10°"
            goto L_0x00e0
        L_0x00dc:
            java.lang.String r15 = "1931 2°"
            goto L_0x00e0
        L_0x00df:
            r15 = r12
        L_0x00e0:
            if (r8 == 0) goto L_0x00f8
            if (r8 == r14) goto L_0x00f6
            if (r8 == r10) goto L_0x00f3
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ IOException -> 0x0209 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0209 }
            r8[r3] = r2     // Catch:{ IOException -> 0x0209 }
            java.lang.String r12 = java.lang.String.format(r13, r8)     // Catch:{ IOException -> 0x0209 }
            goto L_0x00f8
        L_0x00f3:
            java.lang.String r12 = "0/d or d/0"
            goto L_0x00f8
        L_0x00f6:
            java.lang.String r12 = "0/45 or 45/0"
        L_0x00f8:
            switch(r1) {
                case 0: goto L_0x0114;
                case 1: goto L_0x0111;
                case 2: goto L_0x010e;
                case 3: goto L_0x010b;
                case 4: goto L_0x0108;
                case 5: goto L_0x0105;
                case 6: goto L_0x0102;
                case 7: goto L_0x00ff;
                case 8: goto L_0x00fc;
                default: goto L_0x00fb;
            }
        L_0x00fb:
            goto L_0x0118
        L_0x00fc:
            java.lang.String r1 = "F8"
            goto L_0x0124
        L_0x00ff:
            java.lang.String r1 = "Equi-Power (E)"
            goto L_0x0124
        L_0x0102:
            java.lang.String r1 = "A"
            goto L_0x0124
        L_0x0105:
            java.lang.String r1 = "D55"
            goto L_0x0124
        L_0x0108:
            java.lang.String r1 = "F2"
            goto L_0x0124
        L_0x010b:
            java.lang.String r1 = "D93"
            goto L_0x0124
        L_0x010e:
            java.lang.String r1 = "D65"
            goto L_0x0124
        L_0x0111:
            java.lang.String r1 = "D50"
            goto L_0x0124
        L_0x0114:
            java.lang.String r1 = "unknown"
            goto L_0x0124
        L_0x0118:
            java.lang.Object[] r2 = new java.lang.Object[r14]     // Catch:{ IOException -> 0x0209 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0209 }
            r2[r3] = r1     // Catch:{ IOException -> 0x0209 }
            java.lang.String r1 = java.lang.String.format(r13, r2)     // Catch:{ IOException -> 0x0209 }
        L_0x0124:
            java.text.DecimalFormat r2 = new java.text.DecimalFormat     // Catch:{ IOException -> 0x0209 }
            java.lang.String r8 = "0.###"
            r2.<init>(r8)     // Catch:{ IOException -> 0x0209 }
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0209 }
            r7[r3] = r15     // Catch:{ IOException -> 0x0209 }
            double r3 = (double) r4     // Catch:{ IOException -> 0x0209 }
            java.lang.String r3 = r2.format(r3)     // Catch:{ IOException -> 0x0209 }
            r7[r14] = r3     // Catch:{ IOException -> 0x0209 }
            double r3 = (double) r5     // Catch:{ IOException -> 0x0209 }
            java.lang.String r3 = r2.format(r3)     // Catch:{ IOException -> 0x0209 }
            r7[r10] = r3     // Catch:{ IOException -> 0x0209 }
            double r3 = (double) r6     // Catch:{ IOException -> 0x0209 }
            java.lang.String r2 = r2.format(r3)     // Catch:{ IOException -> 0x0209 }
            r7[r9] = r2     // Catch:{ IOException -> 0x0209 }
            r2 = 4
            r7[r2] = r12     // Catch:{ IOException -> 0x0209 }
            r2 = 5
            r3 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 * r3
            int r3 = java.lang.Math.round(r11)     // Catch:{ IOException -> 0x0209 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0209 }
            r7[r2] = r3     // Catch:{ IOException -> 0x0209 }
            r2 = 6
            r7[r2] = r1     // Catch:{ IOException -> 0x0209 }
            java.lang.String r1 = "%s Observer, Backing (%s, %s, %s), Geometry %s, Flare %d%%, Illuminant %s"
            java.lang.String r1 = java.lang.String.format(r1, r7)     // Catch:{ IOException -> 0x0209 }
            return r1
        L_0x015f:
            int r1 = r1.MediaBrowserCompat$MediaItem(r13)     // Catch:{ IOException -> 0x0209 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0209 }
            int r1 = r1 - r14
            r3.<init>(r2, r12, r1)     // Catch:{ IOException -> 0x0209 }
            return r3
        L_0x016a:
            int r2 = r1.MediaBrowserCompat$MediaItem(r13)     // Catch:{ IOException -> 0x0209 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0209 }
            r4.<init>()     // Catch:{ IOException -> 0x0209 }
        L_0x0173:
            if (r3 >= r2) goto L_0x0193
            if (r3 == 0) goto L_0x017a
            r4.append(r11)     // Catch:{ IOException -> 0x0209 }
        L_0x017a:
            int r5 = r3 << 1
            int r5 = r5 + r12
            int r5 = r1.MediaSessionCompat$ResultReceiverWrapper(r5)     // Catch:{ IOException -> 0x0209 }
            float r5 = (float) r5     // Catch:{ IOException -> 0x0209 }
            double r5 = (double) r5     // Catch:{ IOException -> 0x0209 }
            r8 = 4679239875398991872(0x40efffe000000000, double:65535.0)
            double r5 = r5 / r8
            java.lang.String r5 = IconCompatParcelizer(r5, r7)     // Catch:{ IOException -> 0x0209 }
            r4.append(r5)     // Catch:{ IOException -> 0x0209 }
            int r3 = r3 + 1
            goto L_0x0173
        L_0x0193:
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x0209 }
            return r1
        L_0x0198:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0209 }
            r4.<init>()     // Catch:{ IOException -> 0x0209 }
            java.text.DecimalFormat r7 = new java.text.DecimalFormat     // Catch:{ IOException -> 0x0209 }
            java.lang.String r8 = "0.####"
            r7.<init>(r8)     // Catch:{ IOException -> 0x0209 }
            int r2 = r2.length     // Catch:{ IOException -> 0x0209 }
            int r2 = r2 - r13
            int r2 = r2 / r12
        L_0x01a7:
            if (r3 >= r2) goto L_0x01e8
            int r8 = r3 * 12
            int r8 = r8 + r13
            float r9 = r1.MediaMetadataCompat(r8)     // Catch:{ IOException -> 0x0209 }
            int r10 = r8 + 4
            float r10 = r1.MediaMetadataCompat(r10)     // Catch:{ IOException -> 0x0209 }
            int r8 = r8 + 8
            float r8 = r1.MediaMetadataCompat(r8)     // Catch:{ IOException -> 0x0209 }
            if (r3 <= 0) goto L_0x01c1
            r4.append(r11)     // Catch:{ IOException -> 0x0209 }
        L_0x01c1:
            r4.append(r6)     // Catch:{ IOException -> 0x0209 }
            double r14 = (double) r9     // Catch:{ IOException -> 0x0209 }
            java.lang.String r9 = r7.format(r14)     // Catch:{ IOException -> 0x0209 }
            r4.append(r9)     // Catch:{ IOException -> 0x0209 }
            r4.append(r11)     // Catch:{ IOException -> 0x0209 }
            double r9 = (double) r10     // Catch:{ IOException -> 0x0209 }
            java.lang.String r9 = r7.format(r9)     // Catch:{ IOException -> 0x0209 }
            r4.append(r9)     // Catch:{ IOException -> 0x0209 }
            r4.append(r11)     // Catch:{ IOException -> 0x0209 }
            double r8 = (double) r8     // Catch:{ IOException -> 0x0209 }
            java.lang.String r8 = r7.format(r8)     // Catch:{ IOException -> 0x0209 }
            r4.append(r8)     // Catch:{ IOException -> 0x0209 }
            r4.append(r5)     // Catch:{ IOException -> 0x0209 }
            int r3 = r3 + 1
            goto L_0x01a7
        L_0x01e8:
            java.lang.String r1 = r4.toString()     // Catch:{ IOException -> 0x0209 }
            return r1
        L_0x01ed:
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x0209 }
            java.lang.String r5 = p040o.nAllocationSetSurface.MediaBrowserCompat$CustomActionResultReceiver(r4)     // Catch:{ IOException -> 0x0209 }
            r1[r3] = r5     // Catch:{ IOException -> 0x0209 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0209 }
            r1[r14] = r3     // Catch:{ IOException -> 0x0209 }
            int r2 = r2.length     // Catch:{ IOException -> 0x0209 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0209 }
            r1[r10] = r2     // Catch:{ IOException -> 0x0209 }
            java.lang.String r2 = "%s (0x%08X): %d bytes"
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch:{ IOException -> 0x0209 }
            return r1
        L_0x0209:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.TYPE.MediaMetadataCompat(int):java.lang.String");
    }

    private static String IconCompatParcelizer(double d, int i) {
        boolean z;
        long abs = Math.abs((long) d);
        long round = (long) ((int) Math.round((Math.abs(d) - ((double) abs)) * Math.pow(10.0d, 7.0d)));
        String str = "";
        long j = round;
        String str2 = str;
        while (true) {
            z = true;
            if (i <= 0) {
                break;
            }
            byte abs2 = (byte) ((int) Math.abs(j % 10));
            j /= 10;
            if (str2.length() > 0 || abs2 != 0 || i == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(abs2);
                sb.append(str2);
                str2 = sb.toString();
            }
            i--;
        }
        long j2 = abs + j;
        if (d >= 0.0d || (j2 == 0 && round == 0)) {
            z = false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            str = "-";
        }
        sb2.append(str);
        sb2.append(j2);
        sb2.append(".");
        sb2.append(str2);
        return sb2.toString();
    }

    private String MediaBrowserCompat$MediaItem() {
        String MediaBrowserCompat$SearchResultReceiver = ((SCRIPT) this.write).MediaBrowserCompat$SearchResultReceiver(40);
        if (MediaBrowserCompat$SearchResultReceiver == null) {
            return null;
        }
        try {
            switch (new StaggeredGridLayoutManager(MediaBrowserCompat$SearchResultReceiver.getBytes()).MediaBrowserCompat$MediaItem(0)) {
                case 1095782476:
                    return "Apple Computer, Inc.";
                case 1297303124:
                    return "Microsoft Corporation";
                case 1397180704:
                    return "Silicon Graphics, Inc.";
                case 1398099543:
                    return "Sun Microsystems, Inc.";
                case 1413959252:
                    return "Taligent, Inc.";
                default:
                    return String.format("Unknown (%s)", new Object[]{MediaBrowserCompat$SearchResultReceiver});
            }
        } catch (IOException unused) {
            return MediaBrowserCompat$SearchResultReceiver;
        }
    }

    private String MediaMetadataCompat() {
        String MediaBrowserCompat$SearchResultReceiver = ((SCRIPT) this.write).MediaBrowserCompat$SearchResultReceiver(12);
        if (MediaBrowserCompat$SearchResultReceiver == null) {
            return null;
        }
        try {
            switch (new StaggeredGridLayoutManager(MediaBrowserCompat$SearchResultReceiver.getBytes()).MediaBrowserCompat$MediaItem(0)) {
                case 1633842036:
                    return "Abstract";
                case 1818848875:
                    return "DeviceLink";
                case 1835955314:
                    return "Display Device";
                case 1852662636:
                    return "Named Color";
                case 1886549106:
                    return "Output Device";
                case 1935896178:
                    return "Input Device";
                case 1936744803:
                    return "ColorSpace Conversion";
                default:
                    return String.format("Unknown (%s)", new Object[]{MediaBrowserCompat$SearchResultReceiver});
            }
        } catch (IOException unused) {
            return MediaBrowserCompat$SearchResultReceiver;
        }
    }
}
