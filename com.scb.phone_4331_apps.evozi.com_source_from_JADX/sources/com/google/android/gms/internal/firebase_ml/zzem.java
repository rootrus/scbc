package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public class zzem<T> extends zzhm {
    private final zzel zzsw;
    private final String zzsx;
    private final String zzsy;
    private final zzfa zzsz;
    private zzfe zzta = new zzfe();
    private zzfe zztb;
    private int zztc = -1;
    private String zztd;
    private Class<T> zzte;

    protected zzem(zzel zzel, String str, String str2, zzfa zzfa, Class<T> cls) {
        this.zzte = (Class) zzks.checkNotNull(cls);
        this.zzsw = (zzel) zzks.checkNotNull(zzel);
        this.zzsx = (String) zzks.checkNotNull(str);
        this.zzsy = (String) zzks.checkNotNull(str2);
        this.zzsz = zzfa;
        String zzek = zzel.zzek();
        if (zzek != null) {
            zzfe zzfe = this.zzta;
            StringBuilder sb = new StringBuilder(String.valueOf(zzek).length() + 23);
            sb.append(zzek);
            sb.append(" Google-API-Java-Client");
            zzfe.zzae(sb.toString());
        } else {
            this.zzta.zzae("Google-API-Java-Client");
        }
        this.zzta.zzb("X-Goog-Api-Client", zzeo.zzeq().zzo(zzel.getClass().getSimpleName()));
    }

    public zzel zzen() {
        return this.zzsw;
    }

    public final zzfe zzeo() {
        return this.zzta;
    }

    /* access modifiers changed from: protected */
    public IOException zza(zzfk zzfk) {
        return new zzfl(zzfk);
    }

    public final T zzep() throws IOException {
        zzks.checkArgument(true);
        zzks.checkArgument(true);
        zzfh zza = zzen().zzel().zza(this.zzsx, new zzez(zzfr.zza(this.zzsw.zzej(), this.zzsy, (Object) this, true)), this.zzsz);
        new zzei().zzb(zza);
        zza.zza(zzen().zzem());
        if (this.zzsz == null && (this.zzsx.equals("POST") || this.zzsx.equals("PUT") || this.zzsx.equals("PATCH"))) {
            zza.zza((zzfa) new zzew());
        }
        zza.zzfe().putAll(this.zzta);
        zza.zza((zzfb) new zzex());
        zza.zza((zzfn) new zzen(this, zza.zzfg(), zza));
        zzfk zzfj = zza.zzfj();
        this.zztb = zzfj.zzfe();
        this.zztc = zzfj.getStatusCode();
        this.zztd = zzfj.getStatusMessage();
        return zzfj.zza(this.zzte);
    }

    /* renamed from: zzc */
    public zzem<T> zzb(String str, Object obj) {
        return (zzem) super.zzb(str, obj);
    }
}
