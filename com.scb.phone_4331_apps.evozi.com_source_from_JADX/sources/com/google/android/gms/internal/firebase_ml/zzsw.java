package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;

public abstract class zzsw implements Serializable, Iterable<Byte> {
    public static final zzsw zzbkl = new zztg(zzug.zzbpe);
    private static final zztc zzbkm = (zzsr.zzpv() ? new zzth((zzsx) null) : new zzta((zzsx) null));
    private static final Comparator<zzsw> zzbkn = new zzsy();
    private int zzadu = 0;

    zzsw() {
    }

    /* access modifiers changed from: private */
    public static int zzb(byte b) {
        return b & 255;
    }

    public abstract boolean equals(Object obj);

    public abstract int size();

    /* access modifiers changed from: package-private */
    public abstract void zza(zzsv zzsv) throws IOException;

    /* access modifiers changed from: protected */
    public abstract int zzb(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract String zzb(Charset charset);

    public abstract byte zzcl(int i);

    /* access modifiers changed from: package-private */
    public abstract byte zzcm(int i);

    public abstract zzsw zzf(int i, int i2);

    public abstract boolean zzpy();

    public static zzsw zzc(byte[] bArr, int i, int i2) {
        zzc(i, i + i2, bArr.length);
        return new zztg(zzbkm.zzd(bArr, i, i2));
    }

    public static zzsw zzcn(String str) {
        return new zztg(str.getBytes(zzug.UTF_8));
    }

    public final String zzpx() {
        return size() == 0 ? "" : zzb(zzug.UTF_8);
    }

    public final int hashCode() {
        int i = this.zzadu;
        if (i == 0) {
            int size = size();
            i = zzb(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.zzadu = i;
        }
        return i;
    }

    static zzte zzcn(int i) {
        return new zzte(i, (zzsx) null);
    }

    /* access modifiers changed from: protected */
    public final int zzpz() {
        return this.zzadu;
    }

    static int zzc(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public /* synthetic */ Iterator iterator() {
        return new zzsx(this);
    }
}
