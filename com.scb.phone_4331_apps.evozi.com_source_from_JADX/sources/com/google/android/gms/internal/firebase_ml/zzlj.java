package com.google.android.gms.internal.firebase_ml;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzlj<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] zzacz = new Map.Entry[0];
    private transient zzll<Map.Entry<K, V>> zzada;
    private transient zzll<K> zzadb;
    private transient zzlf<V> zzadc;

    zzlj() {
    }

    public abstract V get(@NullableDecl Object obj);

    /* access modifiers changed from: package-private */
    public abstract zzll<Map.Entry<K, V>> zziq();

    /* access modifiers changed from: package-private */
    public abstract zzll<K> zzir();

    /* access modifiers changed from: package-private */
    public abstract zzlf<V> zzis();

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((zzlf) values()).contains(obj);
    }

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public int hashCode() {
        return zzls.zzb((zzll) entrySet());
    }

    public String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
            sb.append('{');
            boolean z = true;
            for (Map.Entry entry : entrySet()) {
                if (!z) {
                    sb.append(", ");
                }
                z = false;
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
            }
            sb.append('}');
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("size");
        sb2.append(" cannot be negative but was: ");
        sb2.append(size);
        throw new IllegalArgumentException(sb2.toString());
    }

    public /* synthetic */ Set entrySet() {
        zzll<Map.Entry<K, V>> zzll = this.zzada;
        if (zzll != null) {
            return zzll;
        }
        zzll<Map.Entry<K, V>> zziq = zziq();
        this.zzada = zziq;
        return zziq;
    }

    public /* synthetic */ Collection values() {
        zzlf<V> zzlf = this.zzadc;
        if (zzlf != null) {
            return zzlf;
        }
        zzlf<V> zzis = zzis();
        this.zzadc = zzis;
        return zzis;
    }

    public /* synthetic */ Set keySet() {
        zzll<K> zzll = this.zzadb;
        if (zzll != null) {
            return zzll;
        }
        zzll<K> zzir = zzir();
        this.zzadb = zzir;
        return zzir;
    }
}
