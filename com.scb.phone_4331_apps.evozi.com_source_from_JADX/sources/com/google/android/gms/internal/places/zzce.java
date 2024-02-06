package com.google.android.gms.internal.places;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class zzce<K, V> extends LinkedHashMap<K, V> {
    private static final zzce zzkn;
    private boolean zzdy = true;

    private zzce() {
    }

    private zzce(Map<K, V> map) {
        super(map);
    }

    public static <K, V> zzce<K, V> zzcd() {
        return zzkn;
    }

    public final void zzb(zzce<K, V> zzce) {
        zzcf();
        if (!zzce.isEmpty()) {
            putAll(zzce);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        zzcf();
        super.clear();
    }

    public final V put(K k, V v) {
        zzcf();
        zzbd.checkNotNull(k);
        zzbd.checkNotNull(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        zzcf();
        for (Object next : map.keySet()) {
            zzbd.checkNotNull(next);
            zzbd.checkNotNull(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        zzcf();
        return super.remove(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0015
            goto L_0x0057
        L_0x0015:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0034
            goto L_0x0057
        L_0x0034:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0051
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0051
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0055
        L_0x0051:
            boolean r3 = r4.equals(r3)
        L_0x0055:
            if (r3 != 0) goto L_0x001d
        L_0x0057:
            r7 = r1
            goto L_0x005a
        L_0x0059:
            r7 = r0
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzce.equals(java.lang.Object):boolean");
    }

    private static int zzm(Object obj) {
        if (obj instanceof byte[]) {
            return zzbd.hashCode((byte[]) obj);
        }
        if (!(obj instanceof zzbg)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += zzm(entry.getValue()) ^ zzm(entry.getKey());
        }
        return i;
    }

    public final zzce<K, V> zzce() {
        return isEmpty() ? new zzce<>() : new zzce<>(this);
    }

    public final void zzab() {
        this.zzdy = false;
    }

    public final boolean isMutable() {
        return this.zzdy;
    }

    private final void zzcf() {
        if (!this.zzdy) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        zzce zzce = new zzce();
        zzkn = zzce;
        zzce.zzdy = false;
    }
}
