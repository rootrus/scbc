package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.nio.charset.Charset;

class zztg extends zztf {
    protected final byte[] bytes;

    zztg(byte[] bArr) {
        if (bArr != null) {
            this.bytes = bArr;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public int zzqa() {
        return 0;
    }

    public byte zzcl(int i) {
        return this.bytes[i];
    }

    /* access modifiers changed from: package-private */
    public byte zzcm(int i) {
        return this.bytes[i];
    }

    public int size() {
        return this.bytes.length;
    }

    public final zzsw zzf(int i, int i2) {
        int zzc = zzc(0, i2, size());
        if (zzc == 0) {
            return zzsw.zzbkl;
        }
        return new zztb(this.bytes, zzqa(), zzc);
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzsv zzsv) throws IOException {
        zzsv.zzb(this.bytes, zzqa(), size());
    }

    /* access modifiers changed from: protected */
    public final String zzb(Charset charset) {
        return new String(this.bytes, zzqa(), size(), charset);
    }

    public final boolean zzpy() {
        int zzqa = zzqa();
        return zzxe.zzf(this.bytes, zzqa, size() + zzqa);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzsw) || size() != ((zzsw) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof zztg)) {
            return obj.equals(this);
        }
        zztg zztg = (zztg) obj;
        int zzpz = zzpz();
        int zzpz2 = zztg.zzpz();
        if (zzpz == 0 || zzpz2 == 0 || zzpz == zzpz2) {
            return zza(zztg, 0, size());
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzsw zzsw, int i, int i2) {
        if (i2 > zzsw.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > zzsw.size()) {
            int size2 = zzsw.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!(zzsw instanceof zztg)) {
            return zzsw.zzf(0, i2).equals(zzf(0, i2));
        } else {
            zztg zztg = (zztg) zzsw;
            byte[] bArr = this.bytes;
            byte[] bArr2 = zztg.bytes;
            int zzqa = zzqa();
            int zzqa2 = zzqa();
            int zzqa3 = zztg.zzqa();
            while (zzqa2 < zzqa + i2) {
                if (bArr[zzqa2] != bArr2[zzqa3]) {
                    return false;
                }
                zzqa2++;
                zzqa3++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final int zzb(int i, int i2, int i3) {
        return zzug.zza(i, this.bytes, zzqa(), i3);
    }
}
