package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzgg implements zzhu {
    private final zzge zzwf;
    private final Set<String> zzwh;

    protected zzgg(zzgh zzgh) {
        this.zzwf = zzgh.zzwf;
        this.zzwh = new HashSet(zzgh.zzwi);
    }

    public final <T> T zza(InputStream inputStream, Charset charset, Class<T> cls) throws IOException {
        zzgi zza = this.zzwf.zza(inputStream, charset);
        if (!this.zzwh.isEmpty()) {
            try {
                boolean z = (zza.zza(this.zzwh) == null || zza.zzgi() == zzgm.END_OBJECT) ? false : true;
                Object[] objArr = {this.zzwh};
                if (!z) {
                    throw new IllegalArgumentException(zzla.zzb("wrapper key(s) not found: %s", objArr));
                }
            } catch (Throwable th) {
                zza.close();
                throw th;
            }
        }
        return zza.zza(cls, true, (zzgc) null);
    }

    public final zzge zzes() {
        return this.zzwf;
    }

    public final Set<String> zzge() {
        return Collections.unmodifiableSet(this.zzwh);
    }
}
