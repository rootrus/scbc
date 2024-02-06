package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

final class zzff {
    final zzgy zztv;
    final StringBuilder zztw;
    final zzhd zztx;
    final List<Type> zzty;

    public zzff(zzfe zzfe, StringBuilder sb) {
        Class<?> cls = zzfe.getClass();
        this.zzty = Arrays.asList(new Type[]{cls});
        this.zztx = zzhd.zza(cls, true);
        this.zztw = sb;
        this.zztv = new zzgy(zzfe);
    }
}
