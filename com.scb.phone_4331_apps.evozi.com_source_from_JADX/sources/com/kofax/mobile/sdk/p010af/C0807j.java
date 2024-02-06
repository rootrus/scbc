package com.kofax.mobile.sdk.p010af;

import com.kofax.mobile.sdk.p014aj.C0856b;

/* renamed from: com.kofax.mobile.sdk.af.j */
public class C0807j implements C0856b {
    /* renamed from: d */
    public int mo11975d(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        long j = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j += (long) (bArr[i4] & 255);
        }
        return (int) (j / ((long) i3));
    }
}
