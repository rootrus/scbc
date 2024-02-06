package com.google.android.gms.internal.firebase_ml;

import com.google.common.base.Ascii;
import net.p088sf.scuba.smartcards.ISO7816;

final class zzxf {
    /* access modifiers changed from: private */
    public static boolean zze(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    public static boolean zzf(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    public static boolean zzg(byte b) {
        return b < -16;
    }

    private static boolean zzh(byte b) {
        return b > -65;
    }

    /* access modifiers changed from: private */
    public static void zza(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    public static void zza(byte b, byte b2, char[] cArr, int i) throws zzuo {
        if (b < -62 || zzh(b2)) {
            throw zzuo.zzrr();
        }
        cArr[i] = (char) (((b & Ascii.f3259US) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    public static void zza(byte b, byte b2, byte b3, char[] cArr, int i) throws zzuo {
        if (zzh(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || zzh(b3)))) {
            throw zzuo.zzrr();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    public static void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzuo {
        if (zzh(b2) || (((b << 28) + (b2 + ISO7816.INS_MANAGE_CHANNEL)) >> 30) != 0 || zzh(b3) || zzh(b4)) {
            throw zzuo.zzrr();
        }
        byte b5 = ((b & 7) << Ascii.DC2) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }
}
