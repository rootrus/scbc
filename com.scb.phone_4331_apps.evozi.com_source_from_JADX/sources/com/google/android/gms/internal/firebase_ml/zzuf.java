package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.api.Api;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzuf extends zzsq<Integer> implements zzul, zzwa, RandomAccess {
    private static final zzuf zzbpc;
    private int size;
    private int[] zzbpd;

    public static zzuf zzrl() {
        return zzbpc;
    }

    zzuf() {
        this(new int[10], 0);
    }

    private zzuf(int[] iArr, int i) {
        this.zzbpd = iArr;
        this.size = i;
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        zzpu();
        if (i2 >= i) {
            int[] iArr = this.zzbpd;
            System.arraycopy(iArr, i2, iArr, i, this.size - i2);
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
        if (!(obj instanceof zzuf)) {
            return super.equals(obj);
        }
        zzuf zzuf = (zzuf) obj;
        if (this.size != zzuf.size) {
            return false;
        }
        int[] iArr = zzuf.zzbpd;
        for (int i = 0; i < this.size; i++) {
            if (this.zzbpd[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.size; i2++) {
            i = (i * 31) + this.zzbpd[i2];
        }
        return i;
    }

    /* renamed from: zzdg */
    public final zzul zzck(int i) {
        if (i >= this.size) {
            return new zzuf(Arrays.copyOf(this.zzbpd, i), this.size);
        }
        throw new IllegalArgumentException();
    }

    public final int getInt(int i) {
        zzci(i);
        return this.zzbpd[i];
    }

    public final int size() {
        return this.size;
    }

    public final void zzdh(int i) {
        zzt(this.size, i);
    }

    private final void zzt(int i, int i2) {
        int i3;
        zzpu();
        if (i < 0 || i > (i3 = this.size)) {
            throw new IndexOutOfBoundsException(zzcj(i));
        }
        int[] iArr = this.zzbpd;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.zzbpd, i, iArr2, i + 1, this.size - i);
            this.zzbpd = iArr2;
        }
        this.zzbpd[i] = i2;
        this.size++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        zzpu();
        zzug.checkNotNull(collection);
        if (!(collection instanceof zzuf)) {
            return super.addAll(collection);
        }
        zzuf zzuf = (zzuf) collection;
        int i = zzuf.size;
        if (i == 0) {
            return false;
        }
        int i2 = this.size;
        if (Api.BaseClientBuilder.API_PRIORITY_OTHER - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.zzbpd;
            if (i3 > iArr.length) {
                this.zzbpd = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zzuf.zzbpd, 0, this.zzbpd, this.size, zzuf.size);
            this.size = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        zzpu();
        for (int i = 0; i < this.size; i++) {
            if (obj.equals(Integer.valueOf(this.zzbpd[i]))) {
                int[] iArr = this.zzbpd;
                System.arraycopy(iArr, i + 1, iArr, i, (this.size - i) - 1);
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
        int intValue = ((Integer) obj).intValue();
        zzpu();
        zzci(i);
        int[] iArr = this.zzbpd;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ Object remove(int i) {
        zzpu();
        zzci(i);
        int[] iArr = this.zzbpd;
        int i2 = iArr[i];
        int i3 = this.size;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.size--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        zzt(i, ((Integer) obj).intValue());
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(getInt(i));
    }

    static {
        zzuf zzuf = new zzuf(new int[0], 0);
        zzbpc = zzuf;
        zzuf.zzpt();
    }
}
