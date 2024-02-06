package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.io.IOException;

final class zzec {
    static int zza(byte[] bArr, int i, zzeb zzeb) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zza((int) b, bArr, i2, zzeb);
        }
        zzeb.zza = b;
        return i2;
    }

    static int zza(int i, byte[] bArr, int i2, zzeb zzeb) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzeb.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Ascii.DEL) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzeb.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Ascii.DEL) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzeb.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Ascii.DEL) << Ascii.NAK);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzeb.zza = i9 | (b4 << 28);
            return i10;
        }
        while (true) {
            int i11 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzeb.zza = i9 | ((b4 & Ascii.DEL) << 28);
                return i11;
            }
            i10 = i11;
        }
    }

    static int zzb(byte[] bArr, int i, zzeb zzeb) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzeb.zzb = j;
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
        zzeb.zzb = j2;
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

    static int zzc(byte[] bArr, int i, zzeb zzeb) throws zzfw {
        int zza = zza(bArr, i, zzeb);
        int i2 = zzeb.zza;
        if (i2 < 0) {
            throw zzfw.zzb();
        } else if (i2 == 0) {
            zzeb.zzc = "";
            return zza;
        } else {
            zzeb.zzc = new String(bArr, zza, i2, zzfr.zza);
            return zza + i2;
        }
    }

    static int zzd(byte[] bArr, int i, zzeb zzeb) throws zzfw {
        int zza = zza(bArr, i, zzeb);
        int i2 = zzeb.zza;
        if (i2 < 0) {
            throw zzfw.zzb();
        } else if (i2 == 0) {
            zzeb.zzc = "";
            return zza;
        } else {
            zzeb.zzc = zzip.zzb(bArr, zza, i2);
            return zza + i2;
        }
    }

    static int zze(byte[] bArr, int i, zzeb zzeb) throws zzfw {
        int zza = zza(bArr, i, zzeb);
        int i2 = zzeb.zza;
        if (i2 < 0) {
            throw zzfw.zzb();
        } else if (i2 > bArr.length - zza) {
            throw zzfw.zza();
        } else if (i2 == 0) {
            zzeb.zzc = zzeg.zza;
            return zza;
        } else {
            zzeb.zzc = zzeg.zza(bArr, zza, i2);
            return zza + i2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zza(com.google.android.gms.internal.measurement.zzhp r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.measurement.zzeb r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = zza((int) r8, (byte[]) r7, (int) r0, (com.google.android.gms.internal.measurement.zzeb) r10)
            int r8 = r10.zza
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zza()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zza(r1, r2, r3, r4, r5)
            r6.zzc(r9)
            r10.zzc = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.measurement.zzfw r6 = com.google.android.gms.internal.measurement.zzfw.zza()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzec.zza(com.google.android.gms.internal.measurement.zzhp, byte[], int, int, com.google.android.gms.internal.measurement.zzeb):int");
    }

    static int zza(zzhp zzhp, byte[] bArr, int i, int i2, int i3, zzeb zzeb) throws IOException {
        zzha zzha = (zzha) zzhp;
        Object zza = zzha.zza();
        int zza2 = zzha.zza(zza, bArr, i, i2, i3, zzeb);
        zzha.zzc(zza);
        zzeb.zzc = zza;
        return zza2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzfx<?> zzfx, zzeb zzeb) {
        zzfp zzfp = (zzfp) zzfx;
        int zza = zza(bArr, i2, zzeb);
        zzfp.zzd(zzeb.zza);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzeb);
            if (i != zzeb.zza) {
                break;
            }
            zza = zza(bArr, zza2, zzeb);
            zzfp.zzd(zzeb.zza);
        }
        return zza;
    }

    static int zza(byte[] bArr, int i, zzfx<?> zzfx, zzeb zzeb) throws IOException {
        zzfp zzfp = (zzfp) zzfx;
        int zza = zza(bArr, i, zzeb);
        int i2 = zzeb.zza + zza;
        while (zza < i2) {
            zza = zza(bArr, zza, zzeb);
            zzfp.zzd(zzeb.zza);
        }
        if (zza == i2) {
            return zza;
        }
        throw zzfw.zza();
    }

    static int zza(zzhp<?> zzhp, int i, byte[] bArr, int i2, int i3, zzfx<?> zzfx, zzeb zzeb) throws IOException {
        int zza = zza((zzhp) zzhp, bArr, i2, i3, zzeb);
        zzfx.add(zzeb.zzc);
        while (zza < i3) {
            int zza2 = zza(bArr, zza, zzeb);
            if (i != zzeb.zza) {
                break;
            }
            zza = zza((zzhp) zzhp, bArr, zza2, i3, zzeb);
            zzfx.add(zzeb.zzc);
        }
        return zza;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzig zzig, zzeb zzeb) throws zzfw {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzb = zzb(bArr, i2, zzeb);
                zzig.zza(i, (Object) Long.valueOf(zzeb.zzb));
                return zzb;
            } else if (i4 == 1) {
                zzig.zza(i, (Object) Long.valueOf(zzb(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zza = zza(bArr, i2, zzeb);
                int i5 = zzeb.zza;
                if (i5 < 0) {
                    throw zzfw.zzb();
                } else if (i5 <= bArr.length - zza) {
                    if (i5 == 0) {
                        zzig.zza(i, (Object) zzeg.zza);
                    } else {
                        zzig.zza(i, (Object) zzeg.zza(bArr, zza, i5));
                    }
                    return zza + i5;
                } else {
                    throw zzfw.zza();
                }
            } else if (i4 == 3) {
                zzig zzb2 = zzig.zzb();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zza2 = zza(bArr, i2, zzeb);
                    int i8 = zzeb.zza;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = zza2;
                        break;
                    }
                    i7 = i8;
                    i2 = zza(i8, bArr, zza2, i3, zzb2, zzeb);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzfw.zzg();
                }
                zzig.zza(i, (Object) zzb2);
                return i2;
            } else if (i4 == 5) {
                zzig.zza(i, (Object) Integer.valueOf(zza(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzfw.zzd();
            }
        } else {
            throw zzfw.zzd();
        }
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzeb zzeb) throws zzfw {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return zzb(bArr, i2, zzeb);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return zza(bArr, i2, zzeb) + zzeb.zza;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = zza(bArr, i2, zzeb);
                    i6 = zzeb.zza;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = zza(i6, bArr, i2, i3, zzeb);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzfw.zzg();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzfw.zzd();
            }
        } else {
            throw zzfw.zzd();
        }
    }
}
