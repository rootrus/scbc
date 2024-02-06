package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzto extends zzsq<Double> implements zzun<Double>, zzwa, RandomAccess {
    private static final zzto zzblb;
    private int size;
    private double[] zzblc;

    zzto() {
        this(new double[10], 0);
    }

    private zzto(double[] dArr, int i) {
        this.zzblc = dArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzpu();
        if (i2 >= i) {
            double[] dArr = this.zzblc;
            System.arraycopy(dArr, i2, dArr, i, this.size - i2);
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
        if (!(obj instanceof zzto)) {
            return super.equals(obj);
        }
        zzto zzto = (zzto) obj;
        if (this.size != zzto.size) {
            return false;
        }
        double[] dArr = zzto.zzblc;
        for (int i = 0; i < this.size; i++) {
            if (Double.doubleToLongBits(this.zzblc[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + zzug.zzz(Double.doubleToLongBits(this.zzblc[i2]));
        }
        return i;
    }

    public final int size() {
        return this.size;
    }

    public final void zze(double d) {
        zzc(this.size, d);
    }

    private final void zzc(int i, double d) {
        int i2;
        zzpu();
        if (i < 0 || i > (i2 = this.size)) {
            throw new IndexOutOfBoundsException(zzcj(i));
        }
        double[] dArr = this.zzblc;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.zzblc, i, dArr2, i + 1, this.size - i);
            this.zzblc = dArr2;
        }
        this.zzblc[i] = d;
        this.size++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        zzpu();
        zzug.checkNotNull(collection);
        if (!(collection instanceof zzto)) {
            return super.addAll(collection);
        }
        zzto zzto = (zzto) collection;
        int i = zzto.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.zzblc;
            if (i3 > dArr.length) {
                this.zzblc = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zzto.zzblc, 0, this.zzblc, this.size, zzto.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzpu();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Double.valueOf(this.zzblc[i]))) {
                double[] dArr = this.zzblc;
                System.arraycopy(dArr, i + 1, dArr, i, (this.size - i) - 1);
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
        double doubleValue = ((Double) obj).doubleValue();
        zzpu();
        zzci(i);
        double[] dArr = this.zzblc;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ Object remove(int i) {
        zzpu();
        zzci(i);
        double[] dArr = this.zzblc;
        double d = dArr[i];
        int i2 = this.size;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzc(i, ((Double) obj).doubleValue());
    }

    public final /* synthetic */ zzun zzck(int i) {
        if (i >= this.size) {
            return new zzto(Arrays.copyOf(this.zzblc, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        zzci(i);
        return Double.valueOf(this.zzblc[i]);
    }

    static {
        zzto zzto = new zzto(new double[0], 0);
        zzblb = zzto;
        zzto.zzpt();
    }
}
