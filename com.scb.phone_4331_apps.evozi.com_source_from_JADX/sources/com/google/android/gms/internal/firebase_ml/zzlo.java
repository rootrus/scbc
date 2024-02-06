package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;

final class zzlo<K, V> extends zzll<Map.Entry<K, V>> {
    /* access modifiers changed from: private */
    public final transient int size;
    /* access modifiers changed from: private */
    public final transient Object[] zzadd;
    private final transient zzlj<K, V> zzadk;
    private final transient int zzadl = 0;

    zzlo(zzlj<K, V> zzlj, Object[] objArr, int i, int i2) {
        this.zzadk = zzlj;
        this.zzadd = objArr;
        this.size = i2;
    }

    /* access modifiers changed from: package-private */
    public final boolean zzio() {
        return true;
    }

    public final zzlt<Map.Entry<K, V>> zzij() {
        return (zzlt) zzin().iterator();
    }

    /* access modifiers changed from: package-private */
    public final int zza(Object[] objArr, int i) {
        return zzin().zza(objArr, i);
    }

    /* access modifiers changed from: package-private */
    public final zzlg<Map.Entry<K, V>> zziu() {
        return new zzlp(this);
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        return value != null && value.equals(this.zzadk.get(key));
    }

    public final int size() {
        return this.size;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
