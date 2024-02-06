package com.drew.lang;

import java.io.IOException;

public final class BufferBoundsException extends IOException {
    public BufferBoundsException(String str) {
        super(str);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BufferBoundsException(int r9, int r10, long r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 >= 0) goto L_0x0013
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10[r0] = r9
            java.lang.String r9 = "Attempt to read from buffer using a negative index (%d)"
            java.lang.String r9 = java.lang.String.format(r9, r10)
            goto L_0x0063
        L_0x0013:
            if (r10 >= 0) goto L_0x0024
            java.lang.Object[] r9 = new java.lang.Object[r1]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r0] = r10
            java.lang.String r10 = "Number of requested bytes cannot be negative (%d)"
            java.lang.String r9 = java.lang.String.format(r10, r9)
            goto L_0x0063
        L_0x0024:
            long r2 = (long) r9
            long r4 = (long) r10
            long r2 = r2 + r4
            r4 = 1
            long r2 = r2 - r4
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r3 = 2
            if (r2 <= 0) goto L_0x0047
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11[r0] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r11[r1] = r9
            java.lang.String r9 = "Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)"
            java.lang.String r9 = java.lang.String.format(r9, r11)
            goto L_0x0063
        L_0x0047:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r0] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r2[r1] = r9
            long r11 = r11 - r4
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r2[r3] = r9
            java.lang.String r9 = "Attempt to read from beyond end of underlying data source (requested index: %d, requested count: %d, max index: %d)"
            java.lang.String r9 = java.lang.String.format(r9, r2)
        L_0x0063:
            r8.<init>(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.drew.lang.BufferBoundsException.<init>(int, int, long):void");
    }
}
