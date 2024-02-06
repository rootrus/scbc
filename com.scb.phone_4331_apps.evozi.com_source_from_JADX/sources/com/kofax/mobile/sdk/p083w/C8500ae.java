package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p075e.C8342c;

/* renamed from: com.kofax.mobile.sdk.w.ae */
abstract class C8500ae implements C8342c {
    /* renamed from: a */
    public abstract void mo55390a(C8340a aVar);

    C8500ae() {
    }

    /* renamed from: a */
    public void mo55143a(Object obj, CancellationToken cancellationToken) {
        if (cancellationToken == null || !cancellationToken.isCancellationRequested()) {
            mo55390a((C8340a) obj);
        }
    }
}
