package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;
import net.p088sf.scuba.smartcards.ISOFileInfo;

final class zzeu extends zzes {
    private final byte[] zzd;
    private final boolean zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private zzeu(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzk = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.zzd = bArr;
        this.zzf = i2 + i;
        this.zzh = i;
        this.zzi = i;
        this.zze = z;
    }

    public final int zza() throws IOException {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int zzv = zzv();
        this.zzj = zzv;
        if ((zzv >>> 3) != 0) {
            return zzv;
        }
        throw zzfw.zzd();
    }

    public final void zza(int i) throws zzfw {
        if (this.zzj != i) {
            throw zzfw.zze();
        }
    }

    public final boolean zzb(int i) throws IOException {
        int zza;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzf - this.zzh >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.zzd;
                    int i4 = this.zzh;
                    this.zzh = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzfw.zzc();
            }
            while (i3 < 10) {
                if (zzaa() < 0) {
                    i3++;
                }
            }
            throw zzfw.zzc();
            return true;
        } else if (i2 == 1) {
            zzf(8);
            return true;
        } else if (i2 == 2) {
            zzf(zzv());
            return true;
        } else if (i2 == 3) {
            do {
                zza = zza();
                if (zza == 0 || !zzb(zza)) {
                    zza(((i >>> 3) << 3) | 4);
                }
                zza = zza();
                break;
            } while (!zzb(zza));
            zza(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                zzf(4);
                return true;
            }
            throw zzfw.zzf();
        }
    }

    public final double zzb() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    public final float zzc() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    public final long zzd() throws IOException {
        return zzw();
    }

    public final long zze() throws IOException {
        return zzw();
    }

    public final int zzf() throws IOException {
        return zzv();
    }

    public final long zzg() throws IOException {
        return zzy();
    }

    public final int zzh() throws IOException {
        return zzx();
    }

    public final boolean zzi() throws IOException {
        return zzw() != 0;
    }

    public final String zzj() throws IOException {
        int zzv = zzv();
        if (zzv > 0 && zzv <= this.zzf - this.zzh) {
            String str = new String(this.zzd, this.zzh, zzv, zzfr.zza);
            this.zzh += zzv;
            return str;
        } else if (zzv == 0) {
            return "";
        } else {
            if (zzv < 0) {
                throw zzfw.zzb();
            }
            throw zzfw.zza();
        }
    }

    public final String zzk() throws IOException {
        int zzv = zzv();
        if (zzv > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zzv <= i - i2) {
                String zzb = zzip.zzb(this.zzd, i2, zzv);
                this.zzh += zzv;
                return zzb;
            }
        }
        if (zzv == 0) {
            return "";
        }
        if (zzv <= 0) {
            throw zzfw.zzb();
        }
        throw zzfw.zza();
    }

    public final zzeg zzl() throws IOException {
        byte[] bArr;
        int zzv = zzv();
        if (zzv > 0) {
            int i = this.zzf;
            int i2 = this.zzh;
            if (zzv <= i - i2) {
                zzeg zza = zzeg.zza(this.zzd, i2, zzv);
                this.zzh += zzv;
                return zza;
            }
        }
        if (zzv == 0) {
            return zzeg.zza;
        }
        if (zzv > 0) {
            int i3 = this.zzf;
            int i4 = this.zzh;
            if (zzv <= i3 - i4) {
                int i5 = zzv + i4;
                this.zzh = i5;
                bArr = Arrays.copyOfRange(this.zzd, i4, i5);
                return zzeg.zza(bArr);
            }
        }
        if (zzv > 0) {
            throw zzfw.zza();
        } else if (zzv == 0) {
            bArr = zzfr.zzb;
            return zzeg.zza(bArr);
        } else {
            throw zzfw.zzb();
        }
    }

    public final int zzm() throws IOException {
        return zzv();
    }

    public final int zzn() throws IOException {
        return zzv();
    }

    public final int zzo() throws IOException {
        return zzx();
    }

    public final long zzp() throws IOException {
        return zzy();
    }

    public final int zzq() throws IOException {
        return zze(zzv());
    }

    public final long zzr() throws IOException {
        return zza(zzw());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzv() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.zzd
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.zzh = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.zzh = r1
            return r0
        L_0x006b:
            long r0 = r5.zzs()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzeu.zzv():int");
    }

    private final long zzw() throws IOException {
        int i;
        long j;
        long j2;
        long j3;
        byte b;
        long j4;
        long j5;
        int i2 = this.zzh;
        int i3 = this.zzf;
        if (i3 != i2) {
            byte[] bArr = this.zzd;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.zzh = i4;
                return (long) b2;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                byte b3 = b2 ^ (bArr[i4] << 7);
                if (b3 < 0) {
                    b = b3 ^ ISOFileInfo.DATA_BYTES1;
                } else {
                    i = i5 + 1;
                    byte b4 = b3 ^ (bArr[i5] << 14);
                    if (b4 >= 0) {
                        j = (long) (b4 ^ ISOFileInfo.DATA_BYTES1);
                    } else {
                        i5 = i + 1;
                        byte b5 = b4 ^ (bArr[i] << Ascii.NAK);
                        if (b5 < 0) {
                            b = b5 ^ ISOFileInfo.DATA_BYTES1;
                        } else {
                            long j6 = (long) b5;
                            int i6 = i5 + 1;
                            long j7 = j6 ^ (((long) bArr[i5]) << 28);
                            if (j7 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i7 = i6 + 1;
                                long j8 = j7 ^ (((long) bArr[i6]) << 35);
                                if (j8 < 0) {
                                    j5 = -34093383808L;
                                } else {
                                    i6 = i7 + 1;
                                    j7 = j8 ^ (((long) bArr[i7]) << 42);
                                    if (j7 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i7 = i6 + 1;
                                        j8 = j7 ^ (((long) bArr[i6]) << 49);
                                        if (j8 < 0) {
                                            j5 = -558586000294016L;
                                        } else {
                                            int i8 = i7 + 1;
                                            long j9 = (j8 ^ (((long) bArr[i7]) << 56)) ^ 71499008037633920L;
                                            if (j9 < 0) {
                                                i7 = i8 + 1;
                                                if (((long) bArr[i8]) >= 0) {
                                                    j2 = j9;
                                                    i = i7;
                                                    j = j2;
                                                }
                                            } else {
                                                j2 = j9;
                                                i = i8;
                                                j = j2;
                                            }
                                        }
                                    }
                                }
                                j3 = j8 ^ j5;
                                j2 = j3;
                                i = i7;
                                j = j2;
                            }
                            long j10 = j4 ^ j7;
                            i = i6;
                            j = j10;
                        }
                    }
                    this.zzh = i;
                    return j;
                }
                j3 = (long) b;
                j2 = j3;
                i = i7;
                j = j2;
                this.zzh = i;
                return j;
            }
        }
        return zzs();
    }

    /* access modifiers changed from: package-private */
    public final long zzs() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte zzaa = zzaa();
            j |= ((long) (zzaa & Ascii.DEL)) << i;
            if ((zzaa & ISOFileInfo.DATA_BYTES1) == 0) {
                return j;
            }
        }
        throw zzfw.zzc();
    }

    private final int zzx() throws IOException {
        int i = this.zzh;
        if (this.zzf - i >= 4) {
            byte[] bArr = this.zzd;
            this.zzh = i + 4;
            return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw zzfw.zza();
    }

    private final long zzy() throws IOException {
        int i = this.zzh;
        if (this.zzf - i >= 8) {
            byte[] bArr = this.zzd;
            this.zzh = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        throw zzfw.zza();
    }

    public final int zzc(int i) throws zzfw {
        if (i >= 0) {
            int zzu = i + zzu();
            int i2 = this.zzk;
            if (zzu <= i2) {
                this.zzk = zzu;
                zzz();
                return i2;
            }
            throw zzfw.zza();
        }
        throw zzfw.zzb();
    }

    private final void zzz() {
        int i = this.zzf + this.zzg;
        this.zzf = i;
        int i2 = i - this.zzi;
        int i3 = this.zzk;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzg = i4;
            this.zzf = i - i4;
            return;
        }
        this.zzg = 0;
    }

    public final void zzd(int i) {
        this.zzk = i;
        zzz();
    }

    public final boolean zzt() throws IOException {
        return this.zzh == this.zzf;
    }

    public final int zzu() {
        return this.zzh - this.zzi;
    }

    private final byte zzaa() throws IOException {
        int i = this.zzh;
        if (i != this.zzf) {
            byte[] bArr = this.zzd;
            this.zzh = i + 1;
            return bArr[i];
        }
        throw zzfw.zza();
    }

    private final void zzf(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.zzf;
            int i3 = this.zzh;
            if (i <= i2 - i3) {
                this.zzh = i3 + i;
                return;
            }
        }
        if (i < 0) {
            throw zzfw.zzb();
        }
        throw zzfw.zza();
    }
}
