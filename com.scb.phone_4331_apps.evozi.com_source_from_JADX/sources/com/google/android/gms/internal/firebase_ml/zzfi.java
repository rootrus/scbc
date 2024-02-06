package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzfi {
    private final zzfo zzsu;
    private final zzfj zzuw;

    zzfi(zzfo zzfo, zzfj zzfj) {
        this.zzsu = zzfo;
        this.zzuw = zzfj;
    }

    public final zzfh zza(String str, zzez zzez, zzfa zzfa) throws IOException {
        zzfh zzfh = new zzfh(this.zzsu, (String) null);
        zzfj zzfj = this.zzuw;
        if (zzfj != null) {
            zzfj.zza(zzfh);
        }
        zzfh.zzag(str);
        zzfh.zza(zzez);
        if (zzfa != null) {
            zzfh.zza(zzfa);
        }
        return zzfh;
    }
}
