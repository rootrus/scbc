package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;

class zzeq extends zzen {
    protected final byte[] zzb;

    zzeq(byte[] bArr) {
        if (bArr != null) {
            this.zzb = bArr;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public int zze() {
        return 0;
    }

    public byte zza(int i) {
        return this.zzb[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i) {
        return this.zzb[i];
    }

    public int zza() {
        return this.zzb.length;
    }

    public final zzeg zza(int i, int i2) {
        int zzb2 = zzb(0, i2, zza());
        if (zzb2 == 0) {
            return zzeg.zza;
        }
        return new zzej(this.zzb, zze(), zzb2);
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzed zzed) throws IOException {
        zzed.zza(this.zzb, zze(), zza());
    }

    /* access modifiers changed from: protected */
    public final String zza(Charset charset) {
        return new String(this.zzb, zze(), zza(), charset);
    }

    public final boolean zzc() {
        int zze = zze();
        return zzip.zza(this.zzb, zze, zza() + zze);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzeg) || zza() != ((zzeg) obj).zza()) {
            return false;
        }
        if (zza() == 0) {
            return true;
        }
        if (!(obj instanceof zzeq)) {
            return obj.equals(this);
        }
        zzeq zzeq = (zzeq) obj;
        int zzd = zzd();
        int zzd2 = zzeq.zzd();
        if (zzd == 0 || zzd2 == 0 || zzd == zzd2) {
            return zza(zzeq, 0, zza());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzeg zzeg, int i, int i2) {
        if (i2 > zzeg.zza()) {
            int zza = zza();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(zza);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzeg.zza()) {
            int zza2 = zzeg.zza();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(zza2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzeg instanceof zzeq)) {
            return zzeg.zza(0, i2).equals(zza(0, i2));
        } else {
            zzeq zzeq = (zzeq) zzeg;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzeq.zzb;
            int zze = zze();
            int zze2 = zze();
            int zze3 = zzeq.zze();
            while (zze2 < zze + i2) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final int zza(int i, int i2, int i3) {
        return zzfr.zza(i, this.zzb, zze(), i3);
    }
}
