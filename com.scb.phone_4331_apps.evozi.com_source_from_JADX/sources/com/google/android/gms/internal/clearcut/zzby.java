package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzca;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzby<FieldDescriptorType extends zzca<FieldDescriptorType>> {
    private static final zzby zzgw = new zzby(true);
    private final zzei<FieldDescriptorType, Object> zzgt = zzei.zzaj(16);
    private boolean zzgu;
    private boolean zzgv = false;

    private zzby() {
    }

    private zzby(boolean z) {
        zzv();
    }

    static int zza(zzfl zzfl, int i, Object obj) {
        int zzr = zzbn.zzr(i);
        if (zzfl == zzfl.GROUP) {
            zzci.zzf((zzdo) obj);
            zzr <<= 1;
        }
        return zzr + zzb(zzfl, obj);
    }

    private final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zzgt.get(fielddescriptortype);
        return obj instanceof zzcr ? zzcr.zzbr() : obj;
    }

    static void zza(zzbn zzbn, zzfl zzfl, int i, Object obj) throws IOException {
        if (zzfl == zzfl.GROUP) {
            zzdo zzdo = (zzdo) obj;
            zzci.zzf(zzdo);
            zzbn.zzb(i, 3);
            zzdo.zzb(zzbn);
            zzbn.zzb(i, 4);
            return;
        }
        zzbn.zzb(i, zzfl.zzel());
        switch (zzbz.zzgq[zzfl.ordinal()]) {
            case 1:
                zzbn.zza(((Double) obj).doubleValue());
                return;
            case 2:
                zzbn.zza(((Float) obj).floatValue());
                return;
            case 3:
                zzbn.zzb(((Long) obj).longValue());
                return;
            case 4:
                zzbn.zzb(((Long) obj).longValue());
                return;
            case 5:
                zzbn.zzn(((Integer) obj).intValue());
                return;
            case 6:
                zzbn.zzd(((Long) obj).longValue());
                return;
            case 7:
                zzbn.zzq(((Integer) obj).intValue());
                return;
            case 8:
                zzbn.zza(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzdo) obj).zzb(zzbn);
                return;
            case 10:
                zzbn.zzb((zzdo) obj);
                return;
            case 11:
                if (obj instanceof zzbb) {
                    zzbn.zza((zzbb) obj);
                    return;
                } else {
                    zzbn.zzg((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzbb) {
                    zzbn.zza((zzbb) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzbn.zzd(bArr, 0, bArr.length);
                return;
            case 13:
                zzbn.zzo(((Integer) obj).intValue());
                return;
            case 14:
                zzbn.zzq(((Integer) obj).intValue());
                return;
            case 15:
                zzbn.zzd(((Long) obj).longValue());
                return;
            case 16:
                zzbn.zzp(((Integer) obj).intValue());
                return;
            case 17:
                zzbn.zzc(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzcj) {
                    zzbn.zzn(((zzcj) obj).zzc());
                    return;
                } else {
                    zzbn.zzn(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zzaw()) {
            zza(fielddescriptortype.zzau(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fielddescriptortype.zzau(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzcr) {
            this.zzgv = true;
        }
        this.zzgt.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if ((r2 instanceof byte[]) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if ((r2 instanceof com.google.android.gms.internal.clearcut.zzcr) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if ((r2 instanceof com.google.android.gms.internal.clearcut.zzcj) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(com.google.android.gms.internal.clearcut.zzfl r1, java.lang.Object r2) {
        /*
            com.google.android.gms.internal.clearcut.zzci.checkNotNull(r2)
            int[] r0 = com.google.android.gms.internal.clearcut.zzbz.zzgx
            com.google.android.gms.internal.clearcut.zzfq r1 = r1.zzek()
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 0
            switch(r1) {
                case 1: goto L_0x003f;
                case 2: goto L_0x003c;
                case 3: goto L_0x0039;
                case 4: goto L_0x0036;
                case 5: goto L_0x0033;
                case 6: goto L_0x0030;
                case 7: goto L_0x0026;
                case 8: goto L_0x001d;
                case 9: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0041
        L_0x0014:
            boolean r1 = r2 instanceof com.google.android.gms.internal.clearcut.zzdo
            if (r1 != 0) goto L_0x002e
            boolean r1 = r2 instanceof com.google.android.gms.internal.clearcut.zzcr
            if (r1 == 0) goto L_0x0041
            goto L_0x002e
        L_0x001d:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x002e
            boolean r1 = r2 instanceof com.google.android.gms.internal.clearcut.zzcj
            if (r1 == 0) goto L_0x0041
            goto L_0x002e
        L_0x0026:
            boolean r1 = r2 instanceof com.google.android.gms.internal.clearcut.zzbb
            if (r1 != 0) goto L_0x002e
            boolean r1 = r2 instanceof byte[]
            if (r1 == 0) goto L_0x0041
        L_0x002e:
            r0 = 1
            goto L_0x0041
        L_0x0030:
            boolean r0 = r2 instanceof java.lang.String
            goto L_0x0041
        L_0x0033:
            boolean r0 = r2 instanceof java.lang.Boolean
            goto L_0x0041
        L_0x0036:
            boolean r0 = r2 instanceof java.lang.Double
            goto L_0x0041
        L_0x0039:
            boolean r0 = r2 instanceof java.lang.Float
            goto L_0x0041
        L_0x003c:
            boolean r0 = r2 instanceof java.lang.Long
            goto L_0x0041
        L_0x003f:
            boolean r0 = r2 instanceof java.lang.Integer
        L_0x0041:
            if (r0 == 0) goto L_0x0044
            return
        L_0x0044:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Wrong object type used with protocol message reflection."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzby.zza(com.google.android.gms.internal.clearcut.zzfl, java.lang.Object):void");
    }

    public static <T extends zzca<T>> zzby<T> zzar() {
        return zzgw;
    }

    private static int zzb(zzca<?> zzca, Object obj) {
        zzfl zzau = zzca.zzau();
        int zzc = zzca.zzc();
        if (!zzca.zzaw()) {
            return zza(zzau, zzc, obj);
        }
        List<Object> list = (List) obj;
        int i = 0;
        if (zzca.zzax()) {
            for (Object zzb : list) {
                i += zzb(zzau, zzb);
            }
            return zzbn.zzr(zzc) + i + zzbn.zzz(i);
        }
        for (Object zza : list) {
            i += zza(zzau, zzc, zza);
        }
        return i;
    }

    private static int zzb(zzfl zzfl, Object obj) {
        switch (zzbz.zzgq[zzfl.ordinal()]) {
            case 1:
                return zzbn.zzb(((Double) obj).doubleValue());
            case 2:
                return zzbn.zzb(((Float) obj).floatValue());
            case 3:
                return zzbn.zze(((Long) obj).longValue());
            case 4:
                return zzbn.zzf(((Long) obj).longValue());
            case 5:
                return zzbn.zzs(((Integer) obj).intValue());
            case 6:
                return zzbn.zzh(((Long) obj).longValue());
            case 7:
                return zzbn.zzv(((Integer) obj).intValue());
            case 8:
                return zzbn.zzb(((Boolean) obj).booleanValue());
            case 9:
                return zzbn.zzd((zzdo) obj);
            case 10:
                return obj instanceof zzcr ? zzbn.zza((zzcv) (zzcr) obj) : zzbn.zzc((zzdo) obj);
            case 11:
                return obj instanceof zzbb ? zzbn.zzb((zzbb) obj) : zzbn.zzh((String) obj);
            case 12:
                return obj instanceof zzbb ? zzbn.zzb((zzbb) obj) : zzbn.zzd((byte[]) obj);
            case 13:
                return zzbn.zzt(((Integer) obj).intValue());
            case 14:
                return zzbn.zzw(((Integer) obj).intValue());
            case 15:
                return zzbn.zzi(((Long) obj).longValue());
            case 16:
                return zzbn.zzu(((Integer) obj).intValue());
            case 17:
                return zzbn.zzg(((Long) obj).longValue());
            case 18:
                return obj instanceof zzcj ? zzbn.zzx(((zzcj) obj).zzc()) : zzbn.zzx(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        zzca zzca = (zzca) entry.getKey();
        if (zzca.zzav() == zzfq.MESSAGE) {
            boolean zzaw = zzca.zzaw();
            Object value = entry.getValue();
            if (zzaw) {
                for (zzdo isInitialized : (List) value) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else if (value instanceof zzdo) {
                if (!((zzdo) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof zzcr) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        zzca zzca = (zzca) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzcr) {
            value = zzcr.zzbr();
        }
        if (zzca.zzaw()) {
            Object zza = zza(zzca);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object zzd : (List) value) {
                ((List) zza).add(zzd(zzd));
            }
            this.zzgt.put(zzca, zza);
        } else if (zzca.zzav() == zzfq.MESSAGE) {
            Object zza2 = zza(zzca);
            if (zza2 == null) {
                this.zzgt.put(zzca, zzd(value));
            } else {
                this.zzgt.put(zzca, zza2 instanceof zzdv ? zzca.zza((zzdv) zza2, (zzdv) value) : zzca.zza(((zzdo) zza2).zzbc(), (zzdo) value).zzbj());
            }
        } else {
            this.zzgt.put(zzca, zzd(value));
        }
    }

    private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        zzca zzca = (zzca) entry.getKey();
        Object value = entry.getValue();
        if (zzca.zzav() != zzfq.MESSAGE || zzca.zzaw() || zzca.zzax()) {
            return zzb((zzca<?>) zzca, value);
        }
        boolean z = value instanceof zzcr;
        int zzc = ((zzca) entry.getKey()).zzc();
        return z ? zzbn.zzb(zzc, (zzcv) (zzcr) value) : zzbn.zzd(zzc, (zzdo) value);
    }

    private static Object zzd(Object obj) {
        if (obj instanceof zzdv) {
            return ((zzdv) obj).zzci();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzby zzby = new zzby();
        for (int i = 0; i < this.zzgt.zzdr(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzak = this.zzgt.zzak(i);
            zzby.zza((zzca) zzak.getKey(), zzak.getValue());
        }
        for (Map.Entry next : this.zzgt.zzds()) {
            zzby.zza((zzca) next.getKey(), next.getValue());
        }
        zzby.zzgv = this.zzgv;
        return zzby;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        return this.zzgv ? new zzcu(this.zzgt.zzdt().iterator()) : this.zzgt.zzdt().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzby)) {
            return false;
        }
        return this.zzgt.equals(((zzby) obj).zzgt);
    }

    public final int hashCode() {
        return this.zzgt.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final boolean isEmpty() {
        return this.zzgt.isEmpty();
    }

    public final boolean isImmutable() {
        return this.zzgu;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzgt.zzdr(); i++) {
            if (!zzb(this.zzgt.zzak(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> zzb : this.zzgt.zzds()) {
            if (!zzb(zzb)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzgv ? new zzcu(this.zzgt.entrySet().iterator()) : this.zzgt.entrySet().iterator();
    }

    public final void zza(zzby<FieldDescriptorType> zzby) {
        for (int i = 0; i < zzby.zzgt.zzdr(); i++) {
            zzc(zzby.zzgt.zzak(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> zzc : zzby.zzgt.zzds()) {
            zzc(zzc);
        }
    }

    public final int zzas() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzgt.zzdr(); i2++) {
            Map.Entry<FieldDescriptorType, Object> zzak = this.zzgt.zzak(i2);
            i += zzb((zzca<?>) (zzca) zzak.getKey(), zzak.getValue());
        }
        for (Map.Entry next : this.zzgt.zzds()) {
            i += zzb((zzca<?>) (zzca) next.getKey(), next.getValue());
        }
        return i;
    }

    public final int zzat() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzgt.zzdr(); i2++) {
            i += zzd(this.zzgt.zzak(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> zzd : this.zzgt.zzds()) {
            i += zzd(zzd);
        }
        return i;
    }

    public final void zzv() {
        if (!this.zzgu) {
            this.zzgt.zzv();
            this.zzgu = true;
        }
    }
}
