package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractMap;
import java.util.Set;

final class zzhg extends AbstractMap<String, Object> {
    final Object object;
    final zzhd zztx;

    zzhg(Object obj, boolean z) {
        this.object = obj;
        zzhd zza = zzhd.zza(obj.getClass(), z);
        this.zztx = zza;
        zzks.checkArgument(!zza.isEnum());
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final Object get(Object obj) {
        zzhl zzao;
        if ((obj instanceof String) && (zzao = this.zztx.zzao((String) obj)) != null) {
            return zzao.zzh(this.object);
        }
        return null;
    }

    public final /* synthetic */ Set entrySet() {
        return new zzhj(this);
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        zzhl zzao = this.zztx.zzao(str);
        String valueOf = String.valueOf(str);
        zzks.checkNotNull(zzao, valueOf.length() != 0 ? "no field of key ".concat(valueOf) : new String("no field of key "));
        Object zzh = zzao.zzh(this.object);
        zzao.zzb(this.object, zzks.checkNotNull(obj2));
        return zzh;
    }
}
