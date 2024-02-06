package com.google.android.gms.internal.firebase_ml;

public abstract class zzgu {
    @Deprecated
    private final byte zzxq;
    protected final byte zzxr;
    private final int zzxs;
    private final int zzxt;
    protected final int zzxu;
    private final int zzxv;

    protected zzgu(int i, int i2, int i3, int i4) {
        this(3, 4, i3, i4, (byte) 61);
    }

    /* access modifiers changed from: package-private */
    public abstract void zza(byte[] bArr, int i, int i2, zzgv zzgv);

    /* access modifiers changed from: protected */
    public abstract boolean zza(byte b);

    private zzgu(int i, int i2, int i3, int i4, byte b) {
        this.zzxq = 61;
        this.zzxs = 3;
        this.zzxt = 4;
        this.zzxu = i3 > 0 && i4 > 0 ? (i3 / 4) << 2 : 0;
        this.zzxv = i4;
        this.zzxr = 61;
    }

    /* access modifiers changed from: protected */
    public final byte[] zza(int i, zzgv zzgv) {
        if (zzgv.buffer != null && zzgv.buffer.length >= zzgv.pos + i) {
            return zzgv.buffer;
        }
        if (zzgv.buffer == null) {
            zzgv.buffer = new byte[8192];
            zzgv.pos = 0;
            zzgv.zzxx = 0;
        } else {
            byte[] bArr = new byte[(zzgv.buffer.length << 1)];
            System.arraycopy(zzgv.buffer, 0, bArr, 0, zzgv.buffer.length);
            zzgv.buffer = bArr;
        }
        return zzgv.buffer;
    }

    public final long zzc(byte[] bArr) {
        int length = bArr.length;
        int i = this.zzxs;
        long j = ((long) (((length + i) - 1) / i)) * ((long) this.zzxt);
        int i2 = this.zzxu;
        if (i2 <= 0) {
            return j;
        }
        long j2 = (long) i2;
        return j + ((((j2 + j) - 1) / j2) * ((long) this.zzxv));
    }
}
