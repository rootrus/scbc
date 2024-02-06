package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzfe<T extends zzfg<T>> {
    private static final zzfe zzd = new zzfe(true);
    final zzhq<T, Object> zza;
    private boolean zzb;
    private boolean zzc;

    private zzfe() {
        this.zza = zzhq.zza(16);
    }

    private zzfe(boolean z) {
        this(zzhq.zza(0));
        zzb();
    }

    private zzfe(zzhq<T, Object> zzhq) {
        this.zza = zzhq;
        zzb();
    }

    public static <T extends zzfg<T>> zzfe<T> zza() {
        return zzd;
    }

    public final void zzb() {
        if (!this.zzb) {
            this.zza.zza();
            this.zzb = true;
        }
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfe)) {
            return false;
        }
        return this.zza.equals(((zzfe) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zzc) {
            return new zzgc(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> zze() {
        if (this.zzc) {
            return new zzgc(this.zza.zze().iterator());
        }
        return this.zza.zze().iterator();
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (!(obj instanceof zzgb)) {
            return obj;
        }
        zzgb zzgb = (zzgb) obj;
        return zzgb.zza();
    }

    private final void zzb(T t, Object obj) {
        if (!t.zzd()) {
            zza(t.zzb(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(t.zzb(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzgb) {
            this.zzc = true;
        }
        this.zza.put(t, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if ((r2 instanceof byte[]) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r1 == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.zzgb) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ((r2 instanceof com.google.android.gms.internal.measurement.zzfq) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(com.google.android.gms.internal.measurement.zziu r1, java.lang.Object r2) {
        /*
            com.google.android.gms.internal.measurement.zzfr.zza(r2)
            int[] r0 = com.google.android.gms.internal.measurement.zzfh.zza
            com.google.android.gms.internal.measurement.zzjb r1 = r1.zza()
            int r1 = r1.ordinal()
            r1 = r0[r1]
            switch(r1) {
                case 1: goto L_0x003e;
                case 2: goto L_0x003b;
                case 3: goto L_0x0038;
                case 4: goto L_0x0035;
                case 5: goto L_0x0032;
                case 6: goto L_0x002f;
                case 7: goto L_0x0025;
                case 8: goto L_0x001c;
                case 9: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0041
        L_0x0013:
            boolean r1 = r2 instanceof com.google.android.gms.internal.measurement.zzgw
            if (r1 != 0) goto L_0x002d
            boolean r1 = r2 instanceof com.google.android.gms.internal.measurement.zzgb
            if (r1 == 0) goto L_0x0041
            goto L_0x002d
        L_0x001c:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x002d
            boolean r1 = r2 instanceof com.google.android.gms.internal.measurement.zzfq
            if (r1 == 0) goto L_0x0041
            goto L_0x002d
        L_0x0025:
            boolean r1 = r2 instanceof com.google.android.gms.internal.measurement.zzeg
            if (r1 != 0) goto L_0x002d
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L_0x0041
        L_0x002d:
            r1 = 1
            goto L_0x0042
        L_0x002f:
            boolean r1 = r2 instanceof java.lang.String
            goto L_0x0042
        L_0x0032:
            boolean r1 = r2 instanceof java.lang.Boolean
            goto L_0x0042
        L_0x0035:
            boolean r1 = r2 instanceof java.lang.Double
            goto L_0x0042
        L_0x0038:
            boolean r1 = r2 instanceof java.lang.Float
            goto L_0x0042
        L_0x003b:
            boolean r1 = r2 instanceof java.lang.Long
            goto L_0x0042
        L_0x003e:
            boolean r1 = r2 instanceof java.lang.Integer
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            if (r1 == 0) goto L_0x0045
            return
        L_0x0045:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzfe.zza(com.google.android.gms.internal.measurement.zziu, java.lang.Object):void");
    }

    public final boolean zzf() {
        for (int i = 0; i < this.zza.zzc(); i++) {
            if (!zza(this.zza.zzb(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> zza2 : this.zza.zzd()) {
            if (!zza(zza2)) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzfg<T>> boolean zza(Map.Entry<T, Object> entry) {
        zzfg zzfg = (zzfg) entry.getKey();
        if (zzfg.zzc() == zzjb.MESSAGE) {
            if (zzfg.zzd()) {
                for (zzgw g_ : (List) entry.getValue()) {
                    if (!g_.mo5787g_()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzgw) {
                    if (!((zzgw) value).mo5787g_()) {
                        return false;
                    }
                } else if (value instanceof zzgb) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zzfe<T> zzfe) {
        for (int i = 0; i < zzfe.zza.zzc(); i++) {
            zzb(zzfe.zza.zzb(i));
        }
        for (Map.Entry<T, Object> zzb2 : zzfe.zza.zzd()) {
            zzb(zzb2);
        }
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzhf) {
            return ((zzhf) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        Object obj;
        zzfg zzfg = (zzfg) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzgb) {
            zzgb zzgb = (zzgb) value;
            value = zzgb.zza();
        }
        if (zzfg.zzd()) {
            Object zza2 = zza(zzfg);
            if (zza2 == null) {
                zza2 = new ArrayList();
            }
            for (Object zza3 : (List) value) {
                ((List) zza2).add(zza(zza3));
            }
            this.zza.put(zzfg, zza2);
        } else if (zzfg.zzc() == zzjb.MESSAGE) {
            Object zza4 = zza(zzfg);
            if (zza4 == null) {
                this.zza.put(zzfg, zza(value));
                return;
            }
            if (zza4 instanceof zzhf) {
                obj = zzfg.zza((zzhf) zza4, (zzhf) value);
            } else {
                obj = zzfg.zza(((zzgw) zza4).zzbq(), (zzgw) value).zzv();
            }
            this.zza.put(zzfg, obj);
        } else {
            this.zza.put(zzfg, zza(value));
        }
    }

    static void zza(zzev zzev, zziu zziu, int i, Object obj) throws IOException {
        if (zziu == zziu.GROUP) {
            zzgw zzgw = (zzgw) obj;
            zzfr.zza(zzgw);
            zzev.zza(i, 3);
            zzgw.zza(zzev);
            zzev.zza(i, 4);
            return;
        }
        zzev.zza(i, zziu.zzb());
        switch (zzfh.zzb[zziu.ordinal()]) {
            case 1:
                zzev.zza(((Double) obj).doubleValue());
                return;
            case 2:
                zzev.zza(((Float) obj).floatValue());
                return;
            case 3:
                zzev.zza(((Long) obj).longValue());
                return;
            case 4:
                zzev.zza(((Long) obj).longValue());
                return;
            case 5:
                zzev.zza(((Integer) obj).intValue());
                return;
            case 6:
                zzev.zzc(((Long) obj).longValue());
                return;
            case 7:
                zzev.zzd(((Integer) obj).intValue());
                return;
            case 8:
                zzev.zza(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzgw) obj).zza(zzev);
                return;
            case 10:
                zzev.zza((zzgw) obj);
                return;
            case 11:
                if (obj instanceof zzeg) {
                    zzev.zza((zzeg) obj);
                    return;
                } else {
                    zzev.zza((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzeg) {
                    zzev.zza((zzeg) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzev.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzev.zzb(((Integer) obj).intValue());
                return;
            case 14:
                zzev.zzd(((Integer) obj).intValue());
                return;
            case 15:
                zzev.zzc(((Long) obj).longValue());
                return;
            case 16:
                zzev.zzc(((Integer) obj).intValue());
                return;
            case 17:
                zzev.zzb(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzfq) {
                    zzev.zza(((zzfq) obj).zza());
                    return;
                } else {
                    zzev.zza(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzg() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzc(); i2++) {
            i += zzc(this.zza.zzb(i2));
        }
        for (Map.Entry<T, Object> zzc2 : this.zza.zzd()) {
            i += zzc(zzc2);
        }
        return i;
    }

    private static int zzc(Map.Entry<T, Object> entry) {
        zzfg zzfg = (zzfg) entry.getKey();
        Object value = entry.getValue();
        if (zzfg.zzc() != zzjb.MESSAGE || zzfg.zzd() || zzfg.zze()) {
            return zza((zzfg<?>) zzfg, value);
        }
        if (value instanceof zzgb) {
            return zzev.zzb(((zzfg) entry.getKey()).zza(), (zzgf) (zzgb) value);
        }
        return zzev.zzb(((zzfg) entry.getKey()).zza(), (zzgw) value);
    }

    static int zza(zziu zziu, int i, Object obj) {
        int zze = zzev.zze(i);
        if (zziu == zziu.GROUP) {
            zzfr.zza((zzgw) obj);
            zze <<= 1;
        }
        return zze + zzb(zziu, obj);
    }

    private static int zzb(zziu zziu, Object obj) {
        switch (zzfh.zzb[zziu.ordinal()]) {
            case 1:
                return zzev.zzb(((Double) obj).doubleValue());
            case 2:
                return zzev.zzb(((Float) obj).floatValue());
            case 3:
                return zzev.zzd(((Long) obj).longValue());
            case 4:
                return zzev.zze(((Long) obj).longValue());
            case 5:
                return zzev.zzf(((Integer) obj).intValue());
            case 6:
                return zzev.zzg(((Long) obj).longValue());
            case 7:
                return zzev.zzi(((Integer) obj).intValue());
            case 8:
                return zzev.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzev.zzc((zzgw) obj);
            case 10:
                if (obj instanceof zzgb) {
                    return zzev.zza((zzgf) (zzgb) obj);
                }
                return zzev.zzb((zzgw) obj);
            case 11:
                if (obj instanceof zzeg) {
                    return zzev.zzb((zzeg) obj);
                }
                return zzev.zzb((String) obj);
            case 12:
                if (obj instanceof zzeg) {
                    return zzev.zzb((zzeg) obj);
                }
                return zzev.zzb((byte[]) obj);
            case 13:
                return zzev.zzg(((Integer) obj).intValue());
            case 14:
                return zzev.zzj(((Integer) obj).intValue());
            case 15:
                return zzev.zzh(((Long) obj).longValue());
            case 16:
                return zzev.zzh(((Integer) obj).intValue());
            case 17:
                return zzev.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzfq) {
                    return zzev.zzk(((zzfq) obj).zza());
                }
                return zzev.zzk(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zza(zzfg<?> zzfg, Object obj) {
        zziu zzb2 = zzfg.zzb();
        int zza2 = zzfg.zza();
        if (!zzfg.zzd()) {
            return zza(zzb2, zza2, obj);
        }
        int i = 0;
        if (zzfg.zze()) {
            for (Object zzb3 : (List) obj) {
                i += zzb(zzb2, zzb3);
            }
            return zzev.zze(zza2) + i + zzev.zzl(i);
        }
        for (Object zza3 : (List) obj) {
            i += zza(zzb2, zza2, zza3);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzfe zzfe = new zzfe();
        for (int i = 0; i < this.zza.zzc(); i++) {
            Map.Entry<T, Object> zzb2 = this.zza.zzb(i);
            zzfe.zzb((zzfg) zzb2.getKey(), zzb2.getValue());
        }
        for (Map.Entry next : this.zza.zzd()) {
            zzfe.zzb((zzfg) next.getKey(), next.getValue());
        }
        zzfe.zzc = this.zzc;
        return zzfe;
    }
}
