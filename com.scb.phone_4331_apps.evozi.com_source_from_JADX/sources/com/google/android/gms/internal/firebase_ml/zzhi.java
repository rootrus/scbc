package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

final class zzhi implements Iterator<Map.Entry<String, Object>> {
    private final /* synthetic */ zzhg zzzf;
    private int zzzg = -1;
    private zzhl zzzh;
    private Object zzzi;
    private boolean zzzj;
    private boolean zzzk;
    private zzhl zzzl;

    zzhi(zzhg zzhg) {
        this.zzzf = zzhg;
    }

    public final boolean hasNext() {
        if (!this.zzzk) {
            this.zzzk = true;
            this.zzzi = null;
            while (this.zzzi == null) {
                int i = this.zzzg + 1;
                this.zzzg = i;
                if (i >= this.zzzf.zztx.zzyp.size()) {
                    break;
                }
                zzhl zzao = this.zzzf.zztx.zzao(this.zzzf.zztx.zzyp.get(this.zzzg));
                this.zzzh = zzao;
                this.zzzi = zzao.zzh(this.zzzf.object);
            }
        }
        if (this.zzzi != null) {
            return true;
        }
        return false;
    }

    public final void remove() {
        zzks.checkState(this.zzzl != null && !this.zzzj);
        this.zzzj = true;
        this.zzzl.zzb(this.zzzf.object, (Object) null);
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            zzhl zzhl = this.zzzh;
            this.zzzl = zzhl;
            Object obj = this.zzzi;
            this.zzzk = false;
            this.zzzj = false;
            this.zzzh = null;
            this.zzzi = null;
            return new zzhh(this.zzzf, zzhl, obj);
        }
        throw new NoSuchElementException();
    }
}
