package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk.p075e.C8342c;

/* renamed from: com.kofax.mobile.sdk.w.i */
public class C8543i implements C8342c {
    /* access modifiers changed from: private */

    /* renamed from: PN */
    public final C8342c f5221PN;
    /* access modifiers changed from: private */

    /* renamed from: PO */
    public final C8342c f5222PO;

    public C8543i(C8342c cVar, C8342c cVar2) {
        this.f5221PN = cVar;
        this.f5222PO = cVar2;
    }

    /* renamed from: a */
    public void mo55143a(final Object obj, final CancellationToken cancellationToken) {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                C8543i.this.f5221PN.mo55143a(obj, cancellationToken);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                C8543i.this.f5222PO.mo55143a(obj, cancellationToken);
            }
        });
        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
