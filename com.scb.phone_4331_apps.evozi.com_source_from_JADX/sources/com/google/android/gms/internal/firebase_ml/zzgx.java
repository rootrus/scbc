package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class zzgx<K, V> extends AbstractMap<K, V> implements Cloneable {
    int size;
    private Object[] zzya;

    final class zzb implements Iterator<Map.Entry<K, V>> {
        private boolean zzyc;
        private int zzyd;

        zzb() {
        }

        public final boolean hasNext() {
            return this.zzyd < zzgx.this.size;
        }

        public final void remove() {
            int i = this.zzyd - 1;
            if (this.zzyc || i < 0) {
                throw new IllegalArgumentException();
            }
            zzgx.this.remove(i);
            this.zzyd--;
            this.zzyc = true;
        }

        public final /* synthetic */ Object next() {
            int i = this.zzyd;
            if (i != zzgx.this.size) {
                this.zzyd++;
                this.zzyc = false;
                return new zza(i);
            }
            throw new NoSuchElementException();
        }
    }

    final class zzc extends AbstractSet<Map.Entry<K, V>> {
        zzc() {
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new zzb();
        }

        public final int size() {
            return zzgx.this.size;
        }
    }

    public final int size() {
        return this.size;
    }

    final class zza implements Map.Entry<K, V> {
        private int index;

        zza(int i) {
            this.index = i;
        }

        public final K getKey() {
            return zzgx.this.zzae(this.index);
        }

        public final V getValue() {
            return zzgx.this.zzaf(this.index);
        }

        public final V setValue(V v) {
            return zzgx.this.set(this.index, v);
        }

        public final int hashCode() {
            Object key = getKey();
            Object value = getValue();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return zzkn.equal(getKey(), entry.getKey()) && zzkn.equal(getValue(), entry.getValue());
        }
    }

    public final K zzae(int i) {
        if (i < 0 || i >= this.size) {
            return null;
        }
        return this.zzya[i << 1];
    }

    public final V zzaf(int i) {
        if (i < 0 || i >= this.size) {
            return null;
        }
        return zzag((i << 1) + 1);
    }

    public final V set(int i, V v) {
        int i2 = this.size;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (i << 1) + 1;
        V zzag = zzag(i3);
        this.zzya[i3] = v;
        return zzag;
    }

    public final V remove(int i) {
        return zzah(i << 1);
    }

    public final boolean containsKey(Object obj) {
        return -2 != zze(obj);
    }

    public final V get(Object obj) {
        return zzag(zze(obj) + 1);
    }

    public final V put(K k, V v) {
        int i;
        int zze = zze(k) >> 1;
        if (zze == -1) {
            zze = this.size;
        }
        if (zze >= 0) {
            int i2 = zze + 1;
            if (i2 >= 0) {
                Object[] objArr = this.zzya;
                int i3 = i2 << 1;
                if (objArr == null) {
                    i = 0;
                } else {
                    i = objArr.length;
                }
                if (i3 > i) {
                    int i4 = ((i / 2) * 3) + 1;
                    if (i4 % 2 != 0) {
                        i4++;
                    }
                    if (i4 >= i3) {
                        i3 = i4;
                    }
                    if (i3 == 0) {
                        this.zzya = null;
                    } else {
                        int i5 = this.size;
                        Object[] objArr2 = this.zzya;
                        if (i5 == 0 || i3 != objArr2.length) {
                            Object[] objArr3 = new Object[i3];
                            this.zzya = objArr3;
                            if (i5 != 0) {
                                System.arraycopy(objArr2, 0, objArr3, 0, i5 << 1);
                            }
                        }
                    }
                }
                int i6 = zze << 1;
                V zzag = zzag(i6 + 1);
                zzb(i6, k, v);
                if (i2 > this.size) {
                    this.size = i2;
                }
                return zzag;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    public final V remove(Object obj) {
        return zzah(zze(obj));
    }

    private final void zzb(int i, K k, V v) {
        Object[] objArr = this.zzya;
        objArr[i] = k;
        objArr[i + 1] = v;
    }

    private final V zzag(int i) {
        if (i < 0) {
            return null;
        }
        return this.zzya[i];
    }

    private final int zze(Object obj) {
        int i = this.size;
        Object[] objArr = this.zzya;
        int i2 = 0;
        while (i2 < (i << 1)) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return i2;
        }
        return -2;
    }

    private final V zzah(int i) {
        int i2 = this.size << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        V zzag = zzag(i + 1);
        Object[] objArr = this.zzya;
        int i3 = (i2 - i) - 2;
        if (i3 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i3);
        }
        this.size--;
        zzb(i2 - 2, (Object) null, (Object) null);
        return zzag;
    }

    public void clear() {
        this.size = 0;
        this.zzya = null;
    }

    public final boolean containsValue(Object obj) {
        int i = this.size;
        Object[] objArr = this.zzya;
        int i2 = 1;
        while (i2 < (i << 1)) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return true;
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return new zzc();
    }

    /* access modifiers changed from: private */
    /* renamed from: zzgz */
    public final zzgx<K, V> clone() {
        try {
            zzgx<K, V> zzgx = (zzgx) super.clone();
            Object[] objArr = this.zzya;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                zzgx.zzya = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return zzgx;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
