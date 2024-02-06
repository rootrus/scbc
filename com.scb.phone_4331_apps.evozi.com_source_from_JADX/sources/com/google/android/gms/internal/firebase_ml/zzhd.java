package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.WeakHashMap;

public final class zzhd {
    private static final Map<Class<?>, zzhd> zzyk = new WeakHashMap();
    private static final Map<Class<?>, zzhd> zzyl = new WeakHashMap();
    private final Class<?> zzym;
    private final boolean zzyn;
    private final IdentityHashMap<String, zzhl> zzyo = new IdentityHashMap<>();
    final List<String> zzyp;

    public static zzhd zzc(Class<?> cls) {
        return zza(cls, false);
    }

    public static zzhd zza(Class<?> cls, boolean z) {
        zzhd zzhd;
        if (cls == null) {
            return null;
        }
        Map<Class<?>, zzhd> map = z ? zzyl : zzyk;
        synchronized (map) {
            zzhd = map.get(cls);
            if (zzhd == null) {
                zzhd = new zzhd(cls, z);
                map.put(cls, zzhd);
            }
        }
        return zzhd;
    }

    public final boolean zzhc() {
        return this.zzyn;
    }

    public final zzhl zzao(String str) {
        if (str != null) {
            if (this.zzyn) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.zzyo.get(str);
    }

    public final boolean isEnum() {
        return this.zzym.isEnum();
    }

    private zzhd(Class<?> cls, boolean z) {
        Field field;
        this.zzym = cls;
        this.zzyn = z;
        boolean z2 = !z || !cls.isEnum();
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31);
        sb.append("cannot ignore case on an enum: ");
        sb.append(valueOf);
        zzks.checkArgument(z2, sb.toString());
        TreeSet treeSet = new TreeSet(new zzhe(this));
        for (Field field2 : cls.getDeclaredFields()) {
            zzhl zza = zzhl.zza(field2);
            if (zza != null) {
                String name = zza.getName();
                name = z ? name.toLowerCase(Locale.US).intern() : name;
                zzhl zzhl = this.zzyo.get(name);
                boolean z3 = zzhl == null;
                Object[] objArr = new Object[4];
                objArr[0] = z ? "case-insensitive " : "";
                objArr[1] = name;
                objArr[2] = field2;
                if (zzhl == null) {
                    field = null;
                } else {
                    field = zzhl.zzhf();
                }
                objArr[3] = field;
                if (z3) {
                    this.zzyo.put(name, zza);
                    treeSet.add(name);
                } else {
                    throw new IllegalArgumentException(zzla.zzb("two fields have the same %sname <%s>: %s and %s", objArr));
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            zzhd zza2 = zza(superclass, z);
            treeSet.addAll(zza2.zzyp);
            for (Map.Entry next : zza2.zzyo.entrySet()) {
                String str = (String) next.getKey();
                if (!this.zzyo.containsKey(str)) {
                    this.zzyo.put(str, (zzhl) next.getValue());
                }
            }
        }
        this.zzyp = treeSet.isEmpty() ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(treeSet));
    }

    public final Collection<zzhl> zzhd() {
        return Collections.unmodifiableCollection(this.zzyo.values());
    }
}
