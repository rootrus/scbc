package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzwj implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzbse;
    private final /* synthetic */ zzwh zzbsf;

    private zzwj(zzwh zzwh) {
        this.zzbsf = zzwh;
        this.pos = this.zzbsf.zzbrz.size();
    }

    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzbsf.zzbrz.size()) || zztc().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Map.Entry<K, V>> zztc() {
        if (this.zzbse == null) {
            this.zzbse = this.zzbsf.zzbsc.entrySet().iterator();
        }
        return this.zzbse;
    }

    public final /* synthetic */ Object next() {
        if (zztc().hasNext()) {
            return (Map.Entry) zztc().next();
        }
        List zzb = this.zzbsf.zzbrz;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) zzb.get(i);
    }

    /* synthetic */ zzwj(zzwh zzwh, zzwi zzwi) {
        this(zzwh);
    }
}
