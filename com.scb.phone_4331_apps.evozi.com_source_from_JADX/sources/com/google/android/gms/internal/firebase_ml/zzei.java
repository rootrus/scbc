package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzei implements zzfd, zzfj {
    private final boolean zzsj;

    public zzei() {
        this(false);
    }

    private zzei(boolean z) {
        this.zzsj = false;
    }

    public final void zza(zzfh zzfh) {
        zzfh.zza((zzfd) this);
    }

    public final void zzb(zzfh zzfh) throws IOException {
        String requestMethod = zzfh.getRequestMethod();
        if (!requestMethod.equals("POST") && ((requestMethod.equals("GET") && zzfh.zzfa().zzew().length() > 2048) || !zzfh.zzez().zzaj(requestMethod))) {
            String requestMethod2 = zzfh.getRequestMethod();
            zzfh.zzag("POST");
            zzfh.zzfe().zzb("X-HTTP-Method-Override", requestMethod2);
            if (requestMethod2.equals("GET")) {
                zzfh.zza((zzfa) new zzft((zzez) zzfh.zzfa().clone()));
                zzfh.zzfa().clear();
            } else if (zzfh.zzfb() == null) {
                zzfh.zza((zzfa) new zzew());
            }
        }
    }
}
