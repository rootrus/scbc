package com.kofax.mobile.sdk.p081u;

import bolts.CancellationToken;
import com.kofax.mobile.sdk.p075e.C8341b;
import com.kofax.mobile.sdk.p075e.C8342c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.kofax.mobile.sdk.u.e */
public class C8482e implements C8341b {

    /* renamed from: Ov */
    private List<C8342c> f5094Ov = new ArrayList();

    /* renamed from: a */
    public void mo55142a(C8342c... cVarArr) {
        Collections.addAll(this.f5094Ov, cVarArr);
    }

    /* renamed from: a */
    public void mo55143a(Object obj, CancellationToken cancellationToken) {
        for (C8342c next : this.f5094Ov) {
            if (cancellationToken == null || !cancellationToken.isCancellationRequested()) {
                next.mo55143a(obj, cancellationToken);
            } else {
                return;
            }
        }
    }
}
