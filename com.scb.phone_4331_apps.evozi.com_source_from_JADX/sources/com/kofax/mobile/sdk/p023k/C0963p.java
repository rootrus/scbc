package com.kofax.mobile.sdk.p023k;

import com.kofax.kmc.kui.uicontrols.PreviewFrameEvent;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.capture.C0514c;
import com.kofax.mobile.sdk._internal.capture.C0515d;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: com.kofax.mobile.sdk.k.p */
class C0963p implements C0514c {
    /* access modifiers changed from: private */

    /* renamed from: Fk */
    public final C0514c f2340Fk;

    /* renamed from: gt */
    private final ExecutorService f2341gt = Executors.newSingleThreadExecutor();

    C0963p(C0514c cVar) {
        this.f2340Fk = cVar;
    }

    /* renamed from: a */
    public void mo11301a(C0513a aVar) {
        this.f2340Fk.mo11301a(aVar);
    }

    /* renamed from: a */
    public C0515d mo11300a(final PreviewFrameEvent previewFrameEvent) {
        return (C0515d) call(new Callable<C0515d>() {
            /* renamed from: lD */
            public C0515d call() {
                return C0963p.this.f2340Fk.mo11300a(previewFrameEvent);
            }
        });
    }

    public void doCleanUp() {
        call(new Callable<Void>() {
            public Void call() {
                C0963p.this.f2340Fk.doCleanUp();
                return null;
            }
        });
        this.f2341gt.shutdown();
        try {
            this.f2341gt.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException unused) {
            throw new RuntimeException("Interrupted");
        }
    }

    public double getMaxFillFraction() {
        return this.f2340Fk.getMaxFillFraction();
    }

    /* renamed from: bt */
    public C0962o mo11302bt() {
        return this.f2340Fk.mo11302bt();
    }

    private <T> T call(Callable<T> callable) {
        try {
            return this.f2341gt.submit(callable).get();
        } catch (ExecutionException e) {
            throwIfUnchecked(e.getCause());
            throw new RuntimeException("Unexpected exception");
        } catch (InterruptedException unused) {
            throw new RuntimeException("Interrupted");
        }
    }

    private static void throwIfUnchecked(Throwable th) {
        throwIfInstanceOf(th, RuntimeException.class);
        throwIfInstanceOf(th, Error.class);
    }

    private static <T extends Throwable> void throwIfInstanceOf(Throwable th, Class<T> cls) throws Throwable {
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }
}
