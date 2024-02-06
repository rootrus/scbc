package p040o;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: o.setGrRequiredDocuments */
public final class setGrRequiredDocuments extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, BulkTransferDeepLinkActivity {
    private static Object IconCompatParcelizer = new Object();
    private static Object MediaBrowserCompat$CustomActionResultReceiver = new Object();
    private static Object MediaBrowserCompat$ItemReceiver = new Object();
    private static Object read = new Object();
    private Runnable write;

    public setGrRequiredDocuments(Runnable runnable, FacebookBillPaymentDeepLinkActivity facebookBillPaymentDeepLinkActivity) {
        super(3);
        this.write = runnable;
        lazySet(0, facebookBillPaymentDeepLinkActivity);
    }

    public final Object call() {
        run();
        return null;
    }

    public final void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.write.run();
        } catch (Throwable th) {
            lazySet(2, (Object) null);
            Object obj3 = get(0);
            if (!(obj3 == read || !compareAndSet(0, obj3, MediaBrowserCompat$ItemReceiver) || obj3 == null)) {
                ((FacebookBillPaymentDeepLinkActivity) obj3).read(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == IconCompatParcelizer || obj2 == MediaBrowserCompat$CustomActionResultReceiver || compareAndSet(1, obj2, MediaBrowserCompat$ItemReceiver)) {
                    throw th;
                }
                obj2 = get(1);
                break;
            } while (compareAndSet(1, obj2, MediaBrowserCompat$ItemReceiver));
            throw th;
        }
        lazySet(2, (Object) null);
        Object obj4 = get(0);
        if (!(obj4 == read || !compareAndSet(0, obj4, MediaBrowserCompat$ItemReceiver) || obj4 == null)) {
            ((FacebookBillPaymentDeepLinkActivity) obj4).read(this);
        }
        do {
            obj = get(1);
            if (obj == IconCompatParcelizer || obj == MediaBrowserCompat$CustomActionResultReceiver || compareAndSet(1, obj, MediaBrowserCompat$ItemReceiver)) {
            }
            obj = get(1);
            return;
        } while (compareAndSet(1, obj, MediaBrowserCompat$ItemReceiver));
    }

    public final void write(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != MediaBrowserCompat$ItemReceiver) {
                if (obj == IconCompatParcelizer) {
                    future.cancel(false);
                    return;
                } else if (obj == MediaBrowserCompat$CustomActionResultReceiver) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = MediaBrowserCompat$ItemReceiver
            r3 = 0
            if (r1 == r2) goto L_0x0034
            java.lang.Object r2 = IconCompatParcelizer
            if (r1 == r2) goto L_0x0034
            java.lang.Object r2 = MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == r2) goto L_0x0034
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x001f
            r2 = r0
            goto L_0x0020
        L_0x001f:
            r2 = r3
        L_0x0020:
            if (r2 == 0) goto L_0x0025
            java.lang.Object r4 = MediaBrowserCompat$CustomActionResultReceiver
            goto L_0x0027
        L_0x0025:
            java.lang.Object r4 = IconCompatParcelizer
        L_0x0027:
            boolean r0 = r5.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0034
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r2)
        L_0x0034:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = MediaBrowserCompat$ItemReceiver
            if (r0 == r1) goto L_0x004d
            java.lang.Object r1 = read
            if (r0 == r1) goto L_0x004d
            if (r0 == 0) goto L_0x004d
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0034
            o.FacebookBillPaymentDeepLinkActivity r0 = (p040o.FacebookBillPaymentDeepLinkActivity) r0
            r0.read(r5)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setGrRequiredDocuments.dispose():void");
    }

    public final boolean isDisposed() {
        Object obj = get(0);
        if (obj == read || obj == MediaBrowserCompat$ItemReceiver) {
            return true;
        }
        return false;
    }
}
