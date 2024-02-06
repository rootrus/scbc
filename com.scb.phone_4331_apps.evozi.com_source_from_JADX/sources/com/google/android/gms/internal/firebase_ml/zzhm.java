package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class zzhm extends AbstractMap<String, Object> implements Cloneable {
    final zzhd zztx;
    Map<String, Object> zzzr;

    public enum zzc {
        IGNORE_CASE
    }

    public zzhm() {
        this(EnumSet.noneOf(zzc.class));
    }

    final class zzb extends AbstractSet<Map.Entry<String, Object>> {
        private final zzhj zzzv;

        zzb() {
            this.zzzv = (zzhj) new zzhg(zzhm.this, zzhm.this.zztx.zzhc()).entrySet();
        }

        public final Iterator<Map.Entry<String, Object>> iterator() {
            return new zza(zzhm.this, this.zzzv);
        }

        public final int size() {
            return zzhm.this.zzzr.size() + this.zzzv.size();
        }

        public final void clear() {
            zzhm.this.zzzr.clear();
            this.zzzv.clear();
        }
    }

    public zzhm(EnumSet<zzc> enumSet) {
        this.zzzr = new zzgx();
        this.zztx = zzhd.zza(getClass(), enumSet.contains(zzc.IGNORE_CASE));
    }

    final class zza implements Iterator<Map.Entry<String, Object>> {
        private boolean zzzs;
        private final Iterator<Map.Entry<String, Object>> zzzt;
        private final Iterator<Map.Entry<String, Object>> zzzu;

        zza(zzhm zzhm, zzhj zzhj) {
            this.zzzt = (zzhi) zzhj.iterator();
            this.zzzu = zzhm.zzzr.entrySet().iterator();
        }

        public final boolean hasNext() {
            return this.zzzt.hasNext() || this.zzzu.hasNext();
        }

        public final void remove() {
            if (this.zzzs) {
                this.zzzu.remove();
            }
            this.zzzt.remove();
        }

        public final /* synthetic */ Object next() {
            if (!this.zzzs) {
                if (this.zzzt.hasNext()) {
                    return this.zzzt.next();
                }
                this.zzzs = true;
            }
            return this.zzzu.next();
        }
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        zzhl zzao = this.zztx.zzao(str);
        if (zzao != null) {
            return zzao.zzh(this);
        }
        if (this.zztx.zzhc()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.zzzr.get(str);
    }

    /* renamed from: zzf */
    public final Object put(String str, Object obj) {
        zzhl zzao = this.zztx.zzao(str);
        if (zzao != null) {
            Object zzh = zzao.zzh(this);
            zzao.zzb(this, obj);
            return zzh;
        }
        if (this.zztx.zzhc()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.zzzr.put(str, obj);
    }

    public zzhm zzb(String str, Object obj) {
        zzhl zzao = this.zztx.zzao(str);
        if (zzao != null) {
            zzao.zzb(this, obj);
        } else {
            if (this.zztx.zzhc()) {
                str = str.toLowerCase(Locale.US);
            }
            this.zzzr.put(str, obj);
        }
        return this;
    }

    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry next : map.entrySet()) {
            zzb((String) next.getKey(), next.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.zztx.zzao(str) == null) {
            if (this.zztx.zzhc()) {
                str = str.toLowerCase(Locale.US);
            }
            return this.zzzr.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return new zzb();
    }

    /* renamed from: zzeh */
    public zzhm clone() {
        try {
            zzhm zzhm = (zzhm) super.clone();
            zzhf.zza((Object) this, (Object) zzhm);
            zzhm.zzzr = (Map) zzhf.clone(this.zzzr);
            return zzhm;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final zzhd zzhi() {
        return this.zztx;
    }
}
