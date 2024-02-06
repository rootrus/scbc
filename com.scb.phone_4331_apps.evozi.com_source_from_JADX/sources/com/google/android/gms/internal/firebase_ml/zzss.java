package com.google.android.gms.internal.firebase_ml;

import com.google.common.base.Ascii;
import java.io.IOException;

final class zzss {
    static int zza(byte[] bArr, int i, zzst zzst) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zza((int) b, bArr, i2, zzst);
        }
        zzst.zzbkg = b;
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, zzst zzst) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzst.zzbkg = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Ascii.DEL) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzst.zzbkg = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Ascii.DEL) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzst.zzbkg = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Ascii.DEL) << Ascii.NAK);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzst.zzbkg = i9 | (b4 << 28);
            return i10;
        }
        while (true) {
            int i11 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzst.zzbkg = i9 | ((b4 & Ascii.DEL) << 28);
                return i11;
            }
            i10 = i11;
        }
    }

    static int zzb(byte[] bArr, int i, zzst zzst) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzst.zzbkh = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Ascii.DEL)) << 7);
        int i4 = 7;
        while (b < 0) {
            b = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b & Ascii.DEL)) << i4;
            i3++;
        }
        zzst.zzbkh = j2;
        return i3;
    }

    static int zza(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static long zzb(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    static double zzc(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzb(bArr, i));
    }

    static float zzd(byte[] bArr, int i) {
        return Float.intBitsToFloat(zza(bArr, i));
    }

    static int zzc(byte[] bArr, int i, zzst zzst) throws zzuo {
        int zza = zza(bArr, i, zzst);
        int i2 = zzst.zzbkg;
        if (i2 < 0) {
            throw zzuo.zzrn();
        } else if (i2 == 0) {
            zzst.zzbki = "";
            return zza;
        } else {
            zzst.zzbki = new String(bArr, zza, i2, zzug.UTF_8);
            return zza + i2;
        }
    }

    static int zzd(byte[] bArr, int i, zzst zzst) throws zzuo {
        int zza = zza(bArr, i, zzst);
        int i2 = zzst.zzbkg;
        if (i2 < 0) {
            throw zzuo.zzrn();
        } else if (i2 == 0) {
            zzst.zzbki = "";
            return zza;
        } else {
            zzst.zzbki = zzxe.zzh(bArr, zza, i2);
            return zza + i2;
        }
    }

    static int zze(byte[] bArr, int i, zzst zzst) throws zzuo {
        int zza = zza(bArr, i, zzst);
        int i2 = zzst.zzbkg;
        if (i2 < 0) {
            throw zzuo.zzrn();
        } else if (i2 > bArr.length - zza) {
            throw zzuo.zzrm();
        } else if (i2 == 0) {
            zzst.zzbki = zzsw.zzbkl;
            return zza;
        } else {
            zzst.zzbki = zzsw.zzc(bArr, zza, i2);
            return zza + i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zza(com.google.android.gms.internal.firebase_ml.zzwe r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.firebase_ml.zzst r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = zza((int) r8, (byte[]) r7, (int) r0, (com.google.android.gms.internal.firebase_ml.zzst) r10)
            int r8 = r10.zzbkg
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.newInstance()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zza(r1, r2, r3, r4, r5)
            r6.zzq(r9)
            r10.zzbki = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.firebase_ml.zzuo r6 = com.google.android.gms.internal.firebase_ml.zzuo.zzrm()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzss.zza(com.google.android.gms.internal.firebase_ml.zzwe, byte[], int, int, com.google.android.gms.internal.firebase_ml.zzst):int");
    }

    static int zza(zzwe zzwe, byte[] bArr, int i, int i2, int i3, zzst zzst) throws IOException {
        zzvs zzvs = (zzvs) zzwe;
        Object newInstance = zzvs.newInstance();
        int zza = zzvs.zza(newInstance, bArr, i, i2, i3, zzst);
        zzvs.zzq(newInstance);
        zzst.zzbki = newInstance;
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzun<?> zzun, zzst zzst) {
        zzuf zzuf = (zzuf) zzun;
        int zza = zza(bArr, i2, zzst);
        zzuf.zzdh(zzst.zzbkg);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzst);
            if (i != zzst.zzbkg) {
                break;
            }
            zza = zza(bArr, zza2, zzst);
            zzuf.zzdh(zzst.zzbkg);
        }
        return zza;
    }

    static int zza(byte[] bArr, int i, zzun<?> zzun, zzst zzst) throws IOException {
        zzuf zzuf = (zzuf) zzun;
        int zza = zza(bArr, i, zzst);
        int i2 = zzst.zzbkg + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzst);
            zzuf.zzdh(zzst.zzbkg);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzuo.zzrm();
    }

    static int zza(zzwe<?> zzwe, int i, byte[] bArr, int i2, int i3, zzun<?> zzun, zzst zzst) throws IOException {
        int zza = zza((zzwe) zzwe, bArr, i2, i3, zzst);
        zzun.add(zzst.zzbki);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzst);
            if (i != zzst.zzbkg) {
                break;
            }
            zza = zza((zzwe) zzwe, bArr, zza2, i3, zzst);
            zzun.add(zzst.zzbki);
        }
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzwx zzwx, zzst zzst) throws zzuo {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzst);
                zzwx.zzb(i, (Object) Long.valueOf(zzst.zzbkh));
                return zzb;
            } else if (i4 == 1) {
                zzwx.zzb(i, (Object) Long.valueOf(zzb(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzst);
                int i5 = zzst.zzbkg;
                if (i5 < 0) {
                    throw zzuo.zzrn();
                } else if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzwx.zzb(i, (Object) zzsw.zzbkl);
                    } else {
                        zzwx.zzb(i, (Object) zzsw.zzc(bArr, zza, i5));
                    }
                    return zza + i5;
                } else {
                    throw zzuo.zzrm();
                }
            } else if (i4 == 3) {
                zzwx zzth = zzwx.zzth();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzst);
                    int i8 = zzst.zzbkg;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = zza2;
                        break;
                    }
                    i7 = i8;
                    i2 = zza(i8, bArr, zza2, i3, zzth, zzst);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzuo.zzrq();
                }
                zzwx.zzb(i, (Object) zzth);
                return i2;
            } else if (i4 == 5) {
                zzwx.zzb(i, (Object) Integer.valueOf(zza(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzuo.zzro();
            }
        } else {
            throw zzuo.zzro();
        }
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzst zzst) throws zzuo {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return zzb(bArr, i2, zzst);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return zza(bArr, i2, zzst) + zzst.zzbkg;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = zza(bArr, i2, zzst);
                    i6 = zzst.zzbkg;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = zza(i6, bArr, i2, i3, zzst);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzuo.zzrq();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzuo.zzro();
            }
        } else {
            throw zzuo.zzro();
        }
    }
}
