package p040o;

/* renamed from: o.validateObjectIsPrimitiveArray */
public final class validateObjectIsPrimitiveArray extends createCubemapFromCubeFaces<validateIsInt8> {
    public validateObjectIsPrimitiveArray(validateIsInt8 validateisint8) {
        super(validateisint8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0078, code lost:
        r0 = ((p040o.validateIsInt8) r11.write).RatingCompat(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
        if (r0 == null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0082, code lost:
        r12 = new java.text.DecimalFormat("0.##").format(r0.doubleValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        r12 = ((p040o.validateIsInt8) r11.write).MediaBrowserCompat$SearchResultReceiver(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
        if (r12 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a4, code lost:
        if (r12.trim().length() == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a6, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(r12.trim());
        r0.append(" degrees");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bc, code lost:
        r12 = ((p040o.validateIsInt8) r11.write).MediaBrowserCompat$SearchResultReceiver(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c4, code lost:
        if (r12 != null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c7, code lost:
        r12 = r12.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d1, code lost:
        if ("T".equalsIgnoreCase(r12) == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d3, code lost:
        return "True direction";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00da, code lost:
        if ("M".equalsIgnoreCase(r12) == false) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00dc, code lost:
        return "Magnetic direction";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00df, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("Unknown (");
        r0.append(r12);
        r0.append(")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f1, code lost:
        return r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String MediaBrowserCompat$CustomActionResultReceiver(int r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L_0x023c
            r2 = 2
            r3 = 0
            if (r12 == r2) goto L_0x022a
            java.lang.String r4 = "knots"
            java.lang.String r5 = "N"
            java.lang.String r6 = "K"
            r7 = 12
            java.lang.String r8 = "M"
            java.lang.String r9 = ")"
            java.lang.String r10 = "Unknown ("
            if (r12 == r7) goto L_0x01ef
            r7 = 30
            if (r12 == r7) goto L_0x01e2
            r7 = 4
            if (r12 == r7) goto L_0x01d0
            r7 = 5
            if (r12 == r7) goto L_0x01c3
            r7 = 6
            if (r12 == r7) goto L_0x01a2
            r7 = 7
            if (r12 == r7) goto L_0x0162
            r0 = 9
            if (r12 == r0) goto L_0x012a
            r0 = 10
            if (r12 == r0) goto L_0x00f2
            switch(r12) {
                case 14: goto L_0x00bc;
                case 15: goto L_0x0078;
                case 16: goto L_0x00bc;
                case 17: goto L_0x0078;
                default: goto L_0x0033;
            }
        L_0x0033:
            switch(r12) {
                case 23: goto L_0x00bc;
                case 24: goto L_0x0078;
                case 25: goto L_0x003b;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r12 = super.MediaBrowserCompat$CustomActionResultReceiver((int) r12)
            return r12
        L_0x003b:
            T r12 = r11.write
            o.validateIsInt8 r12 = (p040o.validateIsInt8) r12
            r0 = 25
            java.lang.String r12 = r12.MediaBrowserCompat$SearchResultReceiver(r0)
            if (r12 != 0) goto L_0x0048
            return r3
        L_0x0048:
            java.lang.String r12 = r12.trim()
            boolean r0 = r6.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x0055
            java.lang.String r12 = "kilometers"
            return r12
        L_0x0055:
            boolean r0 = r8.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x005e
            java.lang.String r12 = "miles"
            return r12
        L_0x005e:
            boolean r0 = r5.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x0065
            return r4
        L_0x0065:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r12)
            r0.append(r9)
            java.lang.String r12 = r0.toString()
            return r12
        L_0x0078:
            T r0 = r11.write
            o.validateIsInt8 r0 = (p040o.validateIsInt8) r0
            o.copy3DRangeFromUnchecked r0 = r0.RatingCompat(r12)
            if (r0 == 0) goto L_0x0092
            java.text.DecimalFormat r12 = new java.text.DecimalFormat
            java.lang.String r1 = "0.##"
            r12.<init>(r1)
            double r0 = r0.doubleValue()
            java.lang.String r12 = r12.format(r0)
            goto L_0x009a
        L_0x0092:
            T r0 = r11.write
            o.validateIsInt8 r0 = (p040o.validateIsInt8) r0
            java.lang.String r12 = r0.MediaBrowserCompat$SearchResultReceiver(r12)
        L_0x009a:
            if (r12 == 0) goto L_0x00bb
            java.lang.String r0 = r12.trim()
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00bb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r12 = r12.trim()
            r0.append(r12)
            java.lang.String r12 = " degrees"
            r0.append(r12)
            java.lang.String r3 = r0.toString()
        L_0x00bb:
            return r3
        L_0x00bc:
            T r0 = r11.write
            o.validateIsInt8 r0 = (p040o.validateIsInt8) r0
            java.lang.String r12 = r0.MediaBrowserCompat$SearchResultReceiver(r12)
            if (r12 != 0) goto L_0x00c7
            return r3
        L_0x00c7:
            java.lang.String r12 = r12.trim()
            java.lang.String r0 = "T"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x00d6
            java.lang.String r12 = "True direction"
            return r12
        L_0x00d6:
            boolean r0 = r8.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x00df
            java.lang.String r12 = "Magnetic direction"
            return r12
        L_0x00df:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r12)
            r0.append(r9)
            java.lang.String r12 = r0.toString()
            return r12
        L_0x00f2:
            T r12 = r11.write
            o.validateIsInt8 r12 = (p040o.validateIsInt8) r12
            java.lang.String r12 = r12.MediaBrowserCompat$SearchResultReceiver(r0)
            if (r12 != 0) goto L_0x00fd
            return r3
        L_0x00fd:
            java.lang.String r12 = r12.trim()
            java.lang.String r0 = "2"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x010c
            java.lang.String r12 = "2-dimensional measurement"
            return r12
        L_0x010c:
            java.lang.String r0 = "3"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x0117
            java.lang.String r12 = "3-dimensional measurement"
            return r12
        L_0x0117:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r12)
            r0.append(r9)
            java.lang.String r12 = r0.toString()
            return r12
        L_0x012a:
            T r12 = r11.write
            o.validateIsInt8 r12 = (p040o.validateIsInt8) r12
            java.lang.String r12 = r12.MediaBrowserCompat$SearchResultReceiver(r0)
            if (r12 != 0) goto L_0x0135
            return r3
        L_0x0135:
            java.lang.String r12 = r12.trim()
            java.lang.String r0 = "A"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x0144
            java.lang.String r12 = "Active (Measurement in progress)"
            return r12
        L_0x0144:
            java.lang.String r0 = "V"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x014f
            java.lang.String r12 = "Void (Measurement Interoperability)"
            return r12
        L_0x014f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r12)
            r0.append(r9)
            java.lang.String r12 = r0.toString()
            return r12
        L_0x0162:
            T r12 = r11.write
            o.validateIsInt8 r12 = (p040o.validateIsInt8) r12
            o.copy3DRangeFromUnchecked[] r12 = r12.MediaBrowserCompat$MediaItem(r7)
            java.text.DecimalFormat r4 = new java.text.DecimalFormat
            java.lang.String r5 = "00.000"
            r4.<init>(r5)
            if (r12 != 0) goto L_0x0174
            goto L_0x01a1
        L_0x0174:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r5 = r12[r1]
            int r5 = r5.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r1] = r5
            r1 = r12[r0]
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r0] = r1
            r12 = r12[r2]
            double r0 = r12.doubleValue()
            java.lang.String r12 = r4.format(r0)
            r3[r2] = r12
            java.lang.String r12 = "%02d:%02d:%s UTC"
            java.lang.String r3 = java.lang.String.format(r12, r3)
        L_0x01a1:
            return r3
        L_0x01a2:
            T r12 = r11.write
            o.validateIsInt8 r12 = (p040o.validateIsInt8) r12
            o.copy3DRangeFromUnchecked r12 = r12.RatingCompat(r7)
            if (r12 != 0) goto L_0x01ad
            goto L_0x01c2
        L_0x01ad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r12 = r12.intValue()
            r0.append(r12)
            java.lang.String r12 = " metres"
            r0.append(r12)
            java.lang.String r3 = r0.toString()
        L_0x01c2:
            return r3
        L_0x01c3:
            java.lang.String r12 = "Sea level"
            java.lang.String r0 = "Below sea level"
            java.lang.String[] r12 = new java.lang.String[]{r12, r0}
            java.lang.String r12 = r11.MediaBrowserCompat$CustomActionResultReceiver(r7, r12)
            return r12
        L_0x01d0:
            T r12 = r11.write
            o.validateIsInt8 r12 = (p040o.validateIsInt8) r12
            o.setAnimator r12 = r12.read()
            if (r12 != 0) goto L_0x01db
            goto L_0x01e1
        L_0x01db:
            double r0 = r12.IconCompatParcelizer
            java.lang.String r3 = p040o.setAnimator.write((double) r0)
        L_0x01e1:
            return r3
        L_0x01e2:
            java.lang.String r12 = "No Correction"
            java.lang.String r0 = "Differential Corrected"
            java.lang.String[] r12 = new java.lang.String[]{r12, r0}
            java.lang.String r12 = r11.MediaBrowserCompat$CustomActionResultReceiver(r7, r12)
            return r12
        L_0x01ef:
            T r12 = r11.write
            o.validateIsInt8 r12 = (p040o.validateIsInt8) r12
            java.lang.String r12 = r12.MediaBrowserCompat$SearchResultReceiver(r7)
            if (r12 != 0) goto L_0x01fa
            return r3
        L_0x01fa:
            java.lang.String r12 = r12.trim()
            boolean r0 = r6.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x0207
            java.lang.String r12 = "kph"
            return r12
        L_0x0207:
            boolean r0 = r8.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x0210
            java.lang.String r12 = "mph"
            return r12
        L_0x0210:
            boolean r0 = r5.equalsIgnoreCase(r12)
            if (r0 == 0) goto L_0x0217
            return r4
        L_0x0217:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r12)
            r0.append(r9)
            java.lang.String r12 = r0.toString()
            return r12
        L_0x022a:
            T r12 = r11.write
            o.validateIsInt8 r12 = (p040o.validateIsInt8) r12
            o.setAnimator r12 = r12.read()
            if (r12 != 0) goto L_0x0235
            goto L_0x023b
        L_0x0235:
            double r0 = r12.MediaBrowserCompat$ItemReceiver
            java.lang.String r3 = p040o.setAnimator.write((double) r0)
        L_0x023b:
            return r3
        L_0x023c:
            java.lang.String r12 = r11.IconCompatParcelizer(r1, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.validateObjectIsPrimitiveArray.MediaBrowserCompat$CustomActionResultReceiver(int):java.lang.String");
    }
}
