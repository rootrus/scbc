package com.kofax.mobile.sdk.p010af;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.kofax.mobile.sdk.p014aj.C0856b;
import net.p088sf.scuba.smartcards.ISOFileInfo;

/* renamed from: com.kofax.mobile.sdk.af.i */
public class C8251i implements C0856b {
    /* renamed from: d */
    public int mo11975d(byte[] bArr, int i, int i2) {
        int i3 = i;
        int i4 = i2;
        int i5 = i3 * i4;
        double d = 0.0d;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < i3) {
                byte b = bArr[(i7 * i3) + i9] & 255;
                int i10 = ((i7 >> 1) * i3) + i5 + (i9 & -2);
                byte b2 = bArr[i10];
                byte b3 = bArr[i10 + 1];
                if (b < 16) {
                    b = 16;
                }
                float f = ((float) (b - 16)) * 1.164f;
                float f2 = (float) ((b2 & 255) + ISOFileInfo.DATA_BYTES1);
                float f3 = (1.596f * f2) + f;
                float f4 = (float) ((b3 & 255) + ISOFileInfo.DATA_BYTES1);
                float f5 = (f - (f2 * 0.813f)) - (0.391f * f4);
                float f6 = f + (f4 * 2.018f);
                if (f3 < BitmapDescriptorFactory.HUE_RED) {
                    f3 = 0.0f;
                } else if (f3 > 255.0f) {
                    f3 = 255.0f;
                }
                if (f5 < BitmapDescriptorFactory.HUE_RED) {
                    f5 = 0.0f;
                } else if (f5 > 255.0f) {
                    f5 = 255.0f;
                }
                if (f6 < BitmapDescriptorFactory.HUE_RED) {
                    f6 = 0.0f;
                } else if (f6 > 255.0f) {
                    f6 = 255.0f;
                }
                d += (((double) f3) * 0.114d) + (((double) f5) * 0.587d) + (((double) f6) * 0.299d);
                i8++;
                i9++;
            }
            i6++;
            i7++;
        }
        return (int) (d / ((double) i5));
    }
}
