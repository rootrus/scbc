package com.kofax.mobile.sdk.p081u;

import bolts.CancellationToken;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk.p083w.C8546j;

/* renamed from: com.kofax.mobile.sdk.u.c */
public class C8479c extends C8482e {

    /* renamed from: wq */
    private static boolean f5068wq;

    /* renamed from: NY */
    private final C8546j f5069NY;

    public C8479c(C8546j jVar) {
        this.f5069NY = jVar;
    }

    /* renamed from: a */
    public void mo55143a(final Object obj, final CancellationToken cancellationToken) {
        synchronized (this) {
            synchronized (C8479c.class) {
                if (!f5068wq) {
                    f5068wq = true;
                } else {
                    throw new KmcRuntimeException(ErrorInfo.KMC_EV_PROCESS_PAGE_BUSY);
                }
            }
            new Thread() {
                public void run() {
                    C8479c.this.m5125b(obj, cancellationToken);
                }
            }.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5125b(Object obj, CancellationToken cancellationToken) {
        Class<C8479c> cls = C8479c.class;
        try {
            super.mo55143a(obj, cancellationToken);
            synchronized (cls) {
                this.f5069NY.mo55143a(obj, cancellationToken);
                f5068wq = false;
            }
        } catch (Throwable th) {
            synchronized (cls) {
                this.f5069NY.mo55143a(obj, cancellationToken);
                f5068wq = false;
                throw th;
            }
        }
    }
}
