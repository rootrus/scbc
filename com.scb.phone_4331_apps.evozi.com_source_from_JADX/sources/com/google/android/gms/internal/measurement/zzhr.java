package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzhr {
    private static final Class<?> zza = zzd();
    private static final zzih<?, ?> zzb = zza(false);
    private static final zzih<?, ?> zzc = zza(true);
    private static final zzih<?, ?> zzd = new zzij();

    public static void zza(Class<?> cls) {
        Class<?> cls2;
        if (!zzfo.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zza(int i, List<Double> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzg(i, list, z);
        }
    }

    public static void zzb(int i, List<Float> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzf(i, list, z);
        }
    }

    public static void zzc(int i, List<Long> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzc(i, list, z);
        }
    }

    public static void zzd(int i, List<Long> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzd(i, list, z);
        }
    }

    public static void zze(int i, List<Long> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzn(i, list, z);
        }
    }

    public static void zzf(int i, List<Long> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zze(i, list, z);
        }
    }

    public static void zzg(int i, List<Long> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzl(i, list, z);
        }
    }

    public static void zzh(int i, List<Integer> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zza(i, list, z);
        }
    }

    public static void zzi(int i, List<Integer> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzj(i, list, z);
        }
    }

    public static void zzj(int i, List<Integer> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzm(i, list, z);
        }
    }

    public static void zzk(int i, List<Integer> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzb(i, list, z);
        }
    }

    public static void zzl(int i, List<Integer> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzk(i, list, z);
        }
    }

    public static void zzm(int i, List<Integer> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzh(i, list, z);
        }
    }

    public static void zzn(int i, List<Boolean> list, zzja zzja, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzi(i, list, z);
        }
    }

    public static void zza(int i, List<String> list, zzja zzja) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zza(i, list);
        }
    }

    public static void zzb(int i, List<zzeg> list, zzja zzja) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzb(i, list);
        }
    }

    public static void zza(int i, List<?> list, zzja zzja, zzhp zzhp) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zza(i, list, zzhp);
        }
    }

    public static void zzb(int i, List<?> list, zzja zzja, zzhp zzhp) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzja.zzb(i, list, zzhp);
        }
    }

    static int zza(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgk) {
            zzgk zzgk = (zzgk) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzev.zzd(zzgk.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzev.zzd(list.get(i3).longValue());
            }
        }
        return i;
    }

    static int zza(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zza(list) + (list.size() * zzev.zze(i));
    }

    static int zzb(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgk) {
            zzgk zzgk = (zzgk) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzev.zze(zzgk.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzev.zze(list.get(i3).longValue());
            }
        }
        return i;
    }

    static int zzb(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzev.zze(i));
    }

    static int zzc(List<Long> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgk) {
            zzgk zzgk = (zzgk) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzev.zzf(zzgk.zzb(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzev.zzf(list.get(i3).longValue());
            }
        }
        return i;
    }

    static int zzc(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzc(list) + (size * zzev.zze(i));
    }

    static int zzd(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfp) {
            zzfp zzfp = (zzfp) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzev.zzk(zzfp.zzc(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzev.zzk(list.get(i3).intValue());
            }
        }
        return i;
    }

    static int zzd(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzd(list) + (size * zzev.zze(i));
    }

    static int zze(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfp) {
            zzfp zzfp = (zzfp) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzev.zzf(zzfp.zzc(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzev.zzf(list.get(i3).intValue());
            }
        }
        return i;
    }

    static int zze(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzev.zze(i));
    }

    static int zzf(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfp) {
            zzfp zzfp = (zzfp) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzev.zzg(zzfp.zzc(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzev.zzg(list.get(i3).intValue());
            }
        }
        return i;
    }

    static int zzf(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzf(list) + (size * zzev.zze(i));
    }

    static int zzg(List<Integer> list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzfp) {
            zzfp zzfp = (zzfp) list;
            for (int i2 = 0; i2 < size; i2++) {
                i += zzev.zzh(zzfp.zzc(i2));
            }
        } else {
            for (int i3 = 0; i3 < size; i3++) {
                i += zzev.zzh(list.get(i3).intValue());
            }
        }
        return i;
    }

    static int zzg(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzev.zze(i));
    }

    static int zzh(List<?> list) {
        return list.size() << 2;
    }

    static int zzh(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzev.zzi(i, 0);
    }

    static int zzi(List<?> list) {
        return list.size() << 3;
    }

    static int zzi(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzev.zzg(i, 0);
    }

    static int zzj(List<?> list) {
        return list.size();
    }

    static int zzj(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzev.zzb(i, true);
    }

    static int zza(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zze = zzev.zze(i) * size;
        if (list instanceof zzgh) {
            zzgh zzgh = (zzgh) list;
            while (i4 < size) {
                Object zzb2 = zzgh.zzb(i4);
                if (zzb2 instanceof zzeg) {
                    i3 = zzev.zzb((zzeg) zzb2);
                } else {
                    i3 = zzev.zzb((String) zzb2);
                }
                zze += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzeg) {
                    i2 = zzev.zzb((zzeg) obj);
                } else {
                    i2 = zzev.zzb((String) obj);
                }
                zze += i2;
                i4++;
            }
        }
        return zze;
    }

    static int zza(int i, Object obj, zzhp zzhp) {
        if (obj instanceof zzgf) {
            return zzev.zza(i, (zzgf) obj);
        }
        return zzev.zzb(i, (zzgw) obj, zzhp);
    }

    static int zza(int i, List<?> list, zzhp zzhp) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = zzev.zze(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzgf) {
                i2 = zzev.zza((zzgf) obj);
            } else {
                i2 = zzev.zza((zzgw) obj, zzhp);
            }
            zze += i2;
        }
        return zze;
    }

    static int zzb(int i, List<zzeg> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zze = size * zzev.zze(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zze += zzev.zzb(list.get(i2));
        }
        return zze;
    }

    static int zzb(int i, List<zzgw> list, zzhp zzhp) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzev.zzc(i, list.get(i3), zzhp);
        }
        return i2;
    }

    public static zzih<?, ?> zza() {
        return zzb;
    }

    public static zzih<?, ?> zzb() {
        return zzc;
    }

    public static zzih<?, ?> zzc() {
        return zzd;
    }

    private static zzih<?, ?> zza(boolean z) {
        try {
            Class<?> zze = zze();
            if (zze == null) {
                return null;
            }
            return (zzih) zze.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zzd() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> zze() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <T> void zza(zzgt zzgt, T t, T t2, long j) {
        zzin.zza((Object) t, j, zzgt.zza(zzin.zzf(t, j), zzin.zzf(t2, j)));
    }

    static <T, FT extends zzfg<FT>> void zza(zzfd<FT> zzfd, T t, T t2) {
        zzfe<FT> zza2 = zzfd.zza((Object) t2);
        if (!zza2.zza.isEmpty()) {
            zzfd.zzb(t).zza(zza2);
        }
    }

    static <T, UT, UB> void zza(zzih<UT, UB> zzih, T t, T t2) {
        zzih.zza((Object) t, zzih.zzc(zzih.zzb(t), zzih.zzb(t2)));
    }

    static <UT, UB> UB zza(int i, List<Integer> list, zzfs zzfs, UB ub, zzih<UT, UB> zzih) {
        if (zzfs == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (zzfs.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = zza(i, intValue, ub, zzih);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzfs.zza(intValue2)) {
                    ub = zza(i, intValue2, ub, zzih);
                    it.remove();
                }
            }
        }
        return ub;
    }

    static <UT, UB> UB zza(int i, int i2, UB ub, zzih<UT, UB> zzih) {
        if (ub == null) {
            ub = zzih.zza();
        }
        zzih.zza(ub, i, (long) i2);
        return ub;
    }
}
