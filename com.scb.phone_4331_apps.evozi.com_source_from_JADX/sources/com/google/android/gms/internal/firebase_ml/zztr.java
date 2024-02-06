package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zztr {
    private static volatile boolean zzble = false;
    private static final Class<?> zzblf = zzqk();
    static final zztr zzblg = new zztr(true);
    private final Map<zzts, zzue.zze<?, ?>> zzblh;

    private static Class<?> zzqk() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static zztr zzql() {
        return zztq.zzqj();
    }

    public final <ContainingType extends zzvo> zzue.zze<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return this.zzblh.get(new zzts(containingtype, i));
    }

    zztr() {
        this.zzblh = new HashMap();
    }

    private zztr(boolean z) {
        this.zzblh = Collections.emptyMap();
    }
}
