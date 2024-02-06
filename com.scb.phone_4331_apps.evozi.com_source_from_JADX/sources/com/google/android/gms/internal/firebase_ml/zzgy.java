package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.util.Map;

public final class zzgy {
    private final Map<String, zzgz> zzye = new zzgx();
    private final Map<Field, zzgz> zzyf = new zzgx();
    private final Object zzyg;

    public zzgy(Object obj) {
        this.zzyg = obj;
    }

    public final void zzha() {
        for (Map.Entry next : this.zzye.entrySet()) {
            ((Map) this.zzyg).put((String) next.getKey(), ((zzgz) next.getValue()).zzhb());
        }
        for (Map.Entry next2 : this.zzyf.entrySet()) {
            zzhl.zza((Field) next2.getKey(), this.zzyg, ((zzgz) next2.getValue()).zzhb());
        }
    }

    public final void zza(Field field, Class<?> cls, Object obj) {
        zzgz zzgz = this.zzyf.get(field);
        if (zzgz == null) {
            zzgz = new zzgz(cls);
            this.zzyf.put(field, zzgz);
        }
        zzks.checkArgument(cls == zzgz.zzyh);
        zzgz.zzyi.add(obj);
    }
}
