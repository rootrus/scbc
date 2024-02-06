package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzcb;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzki;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p040o.setTextAppearance;

final class zzq {
    private String zza;
    private boolean zzb;
    private zzcb.zzi zzc;
    /* access modifiers changed from: private */
    public BitSet zzd;
    private BitSet zze;
    private Map<Integer, Long> zzf;
    private Map<Integer, List<Long>> zzg;
    private final /* synthetic */ zzo zzh;

    private zzq(zzo zzo, String str) {
        this.zzh = zzo;
        this.zza = str;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new setTextAppearance();
        this.zzg = new setTextAppearance();
    }

    private zzq(zzo zzo, String str, zzcb.zzi zzi, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.zzh = zzo;
        this.zza = str;
        this.zzd = bitSet;
        this.zze = bitSet2;
        this.zzf = map;
        this.zzg = new setTextAppearance();
        if (map2 != null) {
            for (Integer next : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(next));
                this.zzg.put(next, arrayList);
            }
        }
        this.zzb = false;
        this.zzc = zzi;
    }

    /* access modifiers changed from: package-private */
    public final void zza(zzv zzv) {
        int zza2 = zzv.zza();
        if (zzv.zzc != null) {
            this.zze.set(zza2, zzv.zzc.booleanValue());
        }
        if (zzv.zzd != null) {
            this.zzd.set(zza2, zzv.zzd.booleanValue());
        }
        if (zzv.zze != null) {
            Long l = this.zzf.get(Integer.valueOf(zza2));
            long longValue = zzv.zze.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.zzf.put(Integer.valueOf(zza2), Long.valueOf(longValue));
            }
        }
        if (zzv.zzf != null) {
            List list = this.zzg.get(Integer.valueOf(zza2));
            if (list == null) {
                list = new ArrayList();
                this.zzg.put(Integer.valueOf(zza2), list);
            }
            if (zzv.zzb()) {
                list.clear();
            }
            if (zzki.zzb() && this.zzh.zzt().zzd(this.zza, zzaq.zzbf) && zzv.zzc()) {
                list.clear();
            }
            if (!zzki.zzb() || !this.zzh.zzt().zzd(this.zza, zzaq.zzbf)) {
                list.add(Long.valueOf(zzv.zzf.longValue() / 1000));
                return;
            }
            long longValue2 = zzv.zzf.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final zzcb.zza zza(int i) {
        ArrayList arrayList;
        List list;
        zzcb.zza.C10569zza zzh2 = zzcb.zza.zzh();
        zzh2.zza(i);
        zzh2.zza(this.zzb);
        zzcb.zzi zzi = this.zzc;
        if (zzi != null) {
            zzh2.zza(zzi);
        }
        zzcb.zzi.zza zza2 = zzcb.zzi.zzi().zzb((Iterable<? extends Long>) zzkn.zza(this.zzd)).zza((Iterable<? extends Long>) zzkn.zza(this.zze));
        Map<Integer, Long> map = this.zzf;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer intValue : this.zzf.keySet()) {
                int intValue2 = intValue.intValue();
                arrayList2.add((zzcb.zzb) ((zzfo) zzcb.zzb.zze().zza(intValue2).zza(this.zzf.get(Integer.valueOf(intValue2)).longValue()).zzv()));
            }
            arrayList = arrayList2;
        }
        zza2.zzc(arrayList);
        Map<Integer, List<Long>> map2 = this.zzg;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer next : this.zzg.keySet()) {
                zzcb.zzj.zza zza3 = zzcb.zzj.zze().zza(next.intValue());
                List list2 = this.zzg.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    zza3.zza((Iterable<? extends Long>) list2);
                }
                arrayList3.add((zzcb.zzj) ((zzfo) zza3.zzv()));
            }
            list = arrayList3;
        }
        zza2.zzd(list);
        zzh2.zza(zza2);
        return (zzcb.zza) ((zzfo) zzh2.zzv());
    }

    /* synthetic */ zzq(zzo zzo, String str, zzcb.zzi zzi, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzr zzr) {
        this(zzo, str, zzi, bitSet, bitSet2, map, map2);
    }

    /* synthetic */ zzq(zzo zzo, String str, zzr zzr) {
        this(zzo, str);
    }
}
