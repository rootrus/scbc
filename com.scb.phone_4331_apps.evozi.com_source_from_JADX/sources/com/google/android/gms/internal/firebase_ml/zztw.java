package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zztw<FieldDescriptorType extends zzty<FieldDescriptorType>> {
    private static final zztw zzbln = new zztw(true);
    final zzwh<FieldDescriptorType, Object> zzblk = zzwh.zzdo(16);
    private boolean zzbll;
    private boolean zzblm = false;

    private zztw() {
    }

    private zztw(boolean z) {
        zzpt();
    }

    public static <T extends zzty<T>> zztw<T> zzqp() {
        return zzbln;
    }

    public final void zzpt() {
        if (!this.zzbll) {
            this.zzblk.zzpt();
            this.zzbll = true;
        }
    }

    public final boolean isImmutable() {
        return this.zzbll;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zztw)) {
            return false;
        }
        return this.zzblk.equals(((zztw) obj).zzblk);
    }

    public final int hashCode() {
        return this.zzblk.hashCode();
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        if (this.zzblm) {
            return new zzuu(this.zzblk.entrySet().iterator());
        }
        return this.zzblk.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        if (this.zzblm) {
            return new zzuu(this.zzblk.zzsz().iterator());
        }
        return this.zzblk.zzsz().iterator();
    }

    private final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zzblk.get(fielddescriptortype);
        return obj instanceof zzur ? zzur.zzrt() : obj;
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zzqt()) {
            zza(fielddescriptortype.zzqr(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fielddescriptortype.zzqr(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzur) {
            this.zzblm = true;
        }
        this.zzblk.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if ((r2 instanceof byte[]) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if ((r2 instanceof com.google.android.gms.internal.firebase_ml.zzur) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if ((r2 instanceof com.google.android.gms.internal.firebase_ml.zzuh) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zza(com.google.android.gms.internal.firebase_ml.zzxl r1, java.lang.Object r2) {
        /*
            com.google.android.gms.internal.firebase_ml.zzug.checkNotNull(r2)
            int[] r0 = com.google.android.gms.internal.firebase_ml.zztx.zzblo
            com.google.android.gms.internal.firebase_ml.zzxq r1 = r1.zztp()
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
            boolean r1 = r2 instanceof com.google.android.gms.internal.firebase_ml.zzvo
            if (r1 != 0) goto L_0x002e
            boolean r1 = r2 instanceof com.google.android.gms.internal.firebase_ml.zzur
            if (r1 == 0) goto L_0x0041
            goto L_0x002e
        L_0x001d:
            boolean r1 = r2 instanceof java.lang.Integer
            if (r1 != 0) goto L_0x002e
            boolean r1 = r2 instanceof com.google.android.gms.internal.firebase_ml.zzuh
            if (r1 == 0) goto L_0x0041
            goto L_0x002e
        L_0x0026:
            boolean r1 = r2 instanceof com.google.android.gms.internal.firebase_ml.zzsw
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zztw.zza(com.google.android.gms.internal.firebase_ml.zzxl, java.lang.Object):void");
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzblk.zzsx(); i++) {
            if (!zzb(this.zzblk.zzdp(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> zzb : this.zzblk.zzsy()) {
            if (!zzb(zzb)) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        zzty zzty = (zzty) entry.getKey();
        if (zzty.zzqs() == zzxq.MESSAGE) {
            if (zzty.zzqt()) {
                for (zzvo isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof zzvo) {
                    if (!((zzvo) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof zzur) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(zztw<FieldDescriptorType> zztw) {
        for (int i = 0; i < zztw.zzblk.zzsx(); i++) {
            zzc(zztw.zzblk.zzdp(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> zzc : zztw.zzblk.zzsy()) {
            zzc(zzc);
        }
    }

    private static Object zzr(Object obj) {
        if (obj instanceof zzvv) {
            return ((zzvv) obj).zzsk();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        zzty zzty = (zzty) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzur) {
            value = zzur.zzrt();
        }
        if (zzty.zzqt()) {
            Object zza = zza(zzty);
            if (zza == null) {
                zza = new ArrayList();
            }
            for (Object zzr : (List) value) {
                ((List) zza).add(zzr(zzr));
            }
            this.zzblk.put(zzty, zza);
        } else if (zzty.zzqs() == zzxq.MESSAGE) {
            Object zza2 = zza(zzty);
            if (zza2 == null) {
                this.zzblk.put(zzty, zzr(value));
                return;
            }
            if (zza2 instanceof zzvv) {
                obj = zzty.zza((zzvv) zza2, (zzvv) value);
            } else {
                obj = zzty.zza(((zzvo) zza2).zzrc(), (zzvo) value).zzrj();
            }
            this.zzblk.put(zzty, obj);
        } else {
            this.zzblk.put(zzty, zzr(value));
        }
    }

    static void zza(zztl zztl, zzxl zzxl, int i, Object obj) throws IOException {
        if (zzxl == zzxl.GROUP) {
            zzvo zzvo = (zzvo) obj;
            zzug.zzf(zzvo);
            zztl.zzg(i, 3);
            zzvo.zzb(zztl);
            zztl.zzg(i, 4);
            return;
        }
        zztl.zzg(i, zzxl.zztq());
        switch (zztx.zzblp[zzxl.ordinal()]) {
            case 1:
                zztl.zzc(((Double) obj).doubleValue());
                return;
            case 2:
                zztl.zzt(((Float) obj).floatValue());
                return;
            case 3:
                zztl.zzq(((Long) obj).longValue());
                return;
            case 4:
                zztl.zzq(((Long) obj).longValue());
                return;
            case 5:
                zztl.zzcq(((Integer) obj).intValue());
                return;
            case 6:
                zztl.zzs(((Long) obj).longValue());
                return;
            case 7:
                zztl.zzct(((Integer) obj).intValue());
                return;
            case 8:
                zztl.zzah(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzvo) obj).zzb(zztl);
                return;
            case 10:
                zztl.zzb((zzvo) obj);
                return;
            case 11:
                if (obj instanceof zzsw) {
                    zztl.zza((zzsw) obj);
                    return;
                } else {
                    zztl.zzco((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzsw) {
                    zztl.zza((zzsw) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zztl.zze(bArr, 0, bArr.length);
                return;
            case 13:
                zztl.zzcr(((Integer) obj).intValue());
                return;
            case 14:
                zztl.zzct(((Integer) obj).intValue());
                return;
            case 15:
                zztl.zzs(((Long) obj).longValue());
                return;
            case 16:
                zztl.zzcs(((Integer) obj).intValue());
                return;
            case 17:
                zztl.zzr(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzuh) {
                    zztl.zzcq(((zzuh) obj).zzo());
                    return;
                } else {
                    zztl.zzcq(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    public final int zzqq() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzblk.zzsx(); i2++) {
            i += zzd(this.zzblk.zzdp(i2));
        }
        for (Map.Entry<FieldDescriptorType, Object> zzd : this.zzblk.zzsy()) {
            i += zzd(zzd);
        }
        return i;
    }

    private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        zzty zzty = (zzty) entry.getKey();
        Object value = entry.getValue();
        if (zzty.zzqs() != zzxq.MESSAGE || zzty.zzqt() || zzty.zzqu()) {
            return zzb((zzty<?>) zzty, value);
        }
        if (value instanceof zzur) {
            return zztl.zzb(((zzty) entry.getKey()).zzo(), (zzuv) (zzur) value);
        }
        return zztl.zzb(((zzty) entry.getKey()).zzo(), (zzvo) value);
    }

    static int zza(zzxl zzxl, int i, Object obj) {
        int zzcu = zztl.zzcu(i);
        if (zzxl == zzxl.GROUP) {
            zzug.zzf((zzvo) obj);
            zzcu <<= 1;
        }
        return zzcu + zzb(zzxl, obj);
    }

    private static int zzb(zzxl zzxl, Object obj) {
        switch (zztx.zzblp[zzxl.ordinal()]) {
            case 1:
                return zztl.zzd(((Double) obj).doubleValue());
            case 2:
                return zztl.zzu(((Float) obj).floatValue());
            case 3:
                return zztl.zzt(((Long) obj).longValue());
            case 4:
                return zztl.zzu(((Long) obj).longValue());
            case 5:
                return zztl.zzcv(((Integer) obj).intValue());
            case 6:
                return zztl.zzw(((Long) obj).longValue());
            case 7:
                return zztl.zzcy(((Integer) obj).intValue());
            case 8:
                return zztl.zzai(((Boolean) obj).booleanValue());
            case 9:
                return zztl.zzd((zzvo) obj);
            case 10:
                if (obj instanceof zzur) {
                    return zztl.zza((zzuv) (zzur) obj);
                }
                return zztl.zzc((zzvo) obj);
            case 11:
                if (obj instanceof zzsw) {
                    return zztl.zzb((zzsw) obj);
                }
                return zztl.zzcp((String) obj);
            case 12:
                if (obj instanceof zzsw) {
                    return zztl.zzb((zzsw) obj);
                }
                return zztl.zzh((byte[]) obj);
            case 13:
                return zztl.zzcw(((Integer) obj).intValue());
            case 14:
                return zztl.zzcz(((Integer) obj).intValue());
            case 15:
                return zztl.zzx(((Long) obj).longValue());
            case 16:
                return zztl.zzcx(((Integer) obj).intValue());
            case 17:
                return zztl.zzv(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzuh) {
                    return zztl.zzda(((zzuh) obj).zzo());
                }
                return zztl.zzda(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(zzty<?> zzty, Object obj) {
        zzxl zzqr = zzty.zzqr();
        int zzo = zzty.zzo();
        if (!zzty.zzqt()) {
            return zza(zzqr, zzo, obj);
        }
        int i = 0;
        if (zzty.zzqu()) {
            for (Object zzb : (List) obj) {
                i += zzb(zzqr, zzb);
            }
            return zztl.zzcu(zzo) + i + zztl.zzdd(i);
        }
        for (Object zza : (List) obj) {
            i += zza(zzqr, zzo, zza);
        }
        return i;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zztw zztw = new zztw();
        for (int i = 0; i < this.zzblk.zzsx(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzdp = this.zzblk.zzdp(i);
            zztw.zza((zzty) zzdp.getKey(), zzdp.getValue());
        }
        for (Map.Entry next : this.zzblk.zzsy()) {
            zztw.zza((zzty) next.getKey(), next.getValue());
        }
        zztw.zzblm = this.zzblm;
        return zztw;
    }
}
