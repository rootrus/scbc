package com.google.android.gms.internal.firebase_ml;

final class zztb extends zztg {
    private final int zzbkp;
    private final int zzbkq;

    zztb(byte[] bArr, int i, int i2) {
        super(bArr);
        zzc(i, i + i2, bArr.length);
        this.zzbkp = i;
        this.zzbkq = i2;
    }

    public final byte zzcl(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.bytes[this.zzbkp + i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(size);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* access modifiers changed from: package-private */
    public final byte zzcm(int i) {
        return this.bytes[this.zzbkp + i];
    }

    public final int size() {
        return this.zzbkq;
    }

    /* access modifiers changed from: protected */
    public final int zzqa() {
        return this.zzbkp;
    }
}
