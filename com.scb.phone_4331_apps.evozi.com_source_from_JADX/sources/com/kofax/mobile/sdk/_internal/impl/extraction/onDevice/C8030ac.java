package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7917o;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ac */
public class C8030ac implements C7917o {
    /* renamed from: p */
    public double mo54323p(String str, String str2) {
        int i;
        int i2;
        String str3;
        String str4;
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int length = str.length();
        int length2 = str2.length();
        if (length == 0) {
            length = length2;
        } else if (length2 != 0) {
            if (length > length2) {
                i = str.length();
                i2 = length2;
                str4 = str;
                str3 = str2;
            } else {
                i2 = length;
                i = length2;
                str3 = str;
                str4 = str2;
            }
            int[] iArr = new int[(i2 + 1)];
            for (int i3 = 0; i3 <= i2; i3++) {
                iArr[i3] = i3;
            }
            for (int i4 = 1; i4 <= i; i4++) {
                int i5 = iArr[0];
                char charAt = str4.charAt(i4 - 1);
                iArr[0] = i4;
                int i6 = 1;
                while (i6 <= i2) {
                    int i7 = iArr[i6];
                    int i8 = i6 - 1;
                    iArr[i6] = Math.min(Math.min(iArr[i8] + 1, iArr[i6] + 1), i5 + (str3.charAt(i8) == charAt ? 0 : 1));
                    i6++;
                    i5 = i7;
                }
            }
            length = iArr[i2];
        }
        return (double) length;
    }
}
