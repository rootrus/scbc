package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzku {
    /* access modifiers changed from: private */
    public final int limit;
    /* access modifiers changed from: private */
    public final zzkc zzabj;
    private final boolean zzabk;
    private final zzky zzabl;

    private zzku(zzky zzky) {
        this(zzky, false, zzkg.zzabc, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    private zzku(zzky zzky, boolean z, zzkc zzkc, int i) {
        this.zzabl = zzky;
        this.zzabk = false;
        this.zzabj = zzkc;
        this.limit = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static zzku zza(zzkc zzkc) {
        zzks.checkNotNull(zzkc);
        return new zzku(new zzkv(zzkc));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzks.checkNotNull(charSequence);
        Iterator<String> zza = this.zzabl.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add(zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
