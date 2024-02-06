package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzuc extends zzsq<Float> implements zzun<Float>, zzwa, RandomAccess {
    private static final zzuc zzboe;
    private int size;
    private float[] zzbof;

    public static zzuc zzqv() {
        return zzboe;
    }

    zzuc() {
        this(new float[10], 0);
    }

    private zzuc(float[] fArr, int i) {
        this.zzbof = fArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzpu();
        if (i2 >= i) {
            float[] fArr = this.zzbof;
            System.arraycopy(fArr, i2, fArr, i, this.size - i2);
            this.size -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuc)) {
            return super.equals(obj);
        }
        zzuc zzuc = (zzuc) obj;
        if (this.size != zzuc.size) {
            return false;
        }
        float[] fArr = zzuc.zzbof;
        for (int i = 0; i < this.size; i++) {
            if (Float.floatToIntBits(this.zzbof[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.zzbof[i2]);
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void zzv(float f) {
        zzc(this.size, f);
    }

    private final void zzc(int i, float f) {
        int i2;
        zzpu();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzcj(i));
        }
        float[] fArr = this.zzbof;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.zzbof, i, fArr2, i + 1, this.size - i);
            this.zzbof = fArr2;
        }
        this.zzbof[i] = f;
        this.size++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        zzpu();
        zzug.checkNotNull(collection);
        if (!(collection instanceof zzuc)) {
            return super.addAll(collection);
        }
        zzuc zzuc = (zzuc) collection;
        int i = zzuc.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.zzbof;
            if (i3 > fArr.length) {
                this.zzbof = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(zzuc.zzbof, 0, this.zzbof, this.size, zzuc.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzpu();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Float.valueOf(this.zzbof[i]))) {
                float[] fArr = this.zzbof;
                System.arraycopy(fArr, i + 1, fArr, i, (this.size - i) - 1);
                this.size--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void zzci(int i) {
        if (i < 0 || i >= this.size) {
            throw new IndexOutOfBoundsException(zzcj(i));
        }
    }

    private final String zzcj(int i) {
        int i2 = this.size;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        zzpu();
        zzci(i);
        float[] fArr = this.zzbof;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ Object remove(int i) {
        zzpu();
        zzci(i);
        float[] fArr = this.zzbof;
        float f = fArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzc(i, ((Float) obj).floatValue());
    }

    public final /* synthetic */ zzun zzck(int i) {
        if (i >= this.size) {
            return new zzuc(Arrays.copyOf(this.zzbof, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        zzci(i);
        return Float.valueOf(this.zzbof[i]);
    }

    static {
        zzuc zzuc = new zzuc(new float[0], 0);
        zzboe = zzuc;
        zzuc.zzpt();
    }
}
