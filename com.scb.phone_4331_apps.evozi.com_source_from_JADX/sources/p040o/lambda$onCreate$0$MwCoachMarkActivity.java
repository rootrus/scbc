package p040o;

import java.util.concurrent.TimeUnit;
import p040o.omGMBSectionClick;

/* renamed from: o.lambda$onCreate$0$MwCoachMarkActivity */
public final class lambda$onCreate$0$MwCoachMarkActivity extends omGMBSectionClick implements Runnable {
    public static final lambda$onCreate$0$MwCoachMarkActivity MediaBrowserCompat$CustomActionResultReceiver;
    private static final long MediaMetadataCompat;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        lambda$onCreate$0$MwCoachMarkActivity lambda_oncreate_0_mwcoachmarkactivity = new lambda$onCreate$0$MwCoachMarkActivity();
        MediaBrowserCompat$CustomActionResultReceiver = lambda_oncreate_0_mwcoachmarkactivity;
        lambda_oncreate_0_mwcoachmarkactivity.IconCompatParcelizer++;
        lambda_oncreate_0_mwcoachmarkactivity.MediaBrowserCompat$ItemReceiver = true;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        onGetStartedClick.IconCompatParcelizer((Object) l, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        MediaMetadataCompat = timeUnit.toNanos(l.longValue());
    }

    private lambda$onCreate$0$MwCoachMarkActivity() {
    }

    /* access modifiers changed from: protected */
    public final Thread write() {
        Thread thread = _thread;
        return thread == null ? MediaSessionCompat$ResultReceiverWrapper() : thread;
    }

    public final MwCurrentUserEwalletActivity MediaBrowserCompat$ItemReceiver(long j, Runnable runnable) {
        onGetStartedClick.write((Object) runnable, "block");
        onGetStartedClick.write((Object) runnable, "block");
        long write = MwEditCreateQrActivity.write(j);
        if (write >= 4611686018427387903L) {
            return MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer;
        }
        long nanoTime = System.nanoTime();
        omGMBSectionClick$MediaBrowserCompat$CustomActionResultReceiver omgmbsectionclick_mediabrowsercompat_customactionresultreceiver = new omGMBSectionClick$MediaBrowserCompat$CustomActionResultReceiver(write + nanoTime, runnable);
        MediaBrowserCompat$ItemReceiver(nanoTime, (omGMBSectionClick.write) omgmbsectionclick_mediabrowsercompat_customactionresultreceiver);
        return omgmbsectionclick_mediabrowsercompat_customactionresultreceiver;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r5 > r10) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            o.handleTextChange r0 = p040o.handleTextChange.write
            r0 = r12
            o.MwCreateQrActivity_ViewBinding r0 = (p040o.MwCreateQrActivity_ViewBinding) r0
            p040o.handleTextChange.MediaBrowserCompat$ItemReceiver(r0)
            r0 = 0
            boolean r1 = r12.MediaSessionCompat$Token()     // Catch:{ all -> 0x0090 }
            if (r1 != 0) goto L_0x0022
            _thread = r0
            r12.MediaSessionCompat$QueueItem()
            boolean r0 = r12.MediaBrowserCompat$CustomActionResultReceiver()
            if (r0 != 0) goto L_0x0021
            java.lang.Thread r0 = _thread
            if (r0 != 0) goto L_0x0021
            r12.MediaSessionCompat$ResultReceiverWrapper()
        L_0x0021:
            return
        L_0x0022:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L_0x0028:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0090 }
            long r5 = r12.MediaMetadataCompat()     // Catch:{ all -> 0x0090 }
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L_0x0068
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 != 0) goto L_0x0061
            long r10 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0090 }
            if (r7 != 0) goto L_0x0042
            long r3 = MediaMetadataCompat     // Catch:{ all -> 0x0090 }
            long r3 = r3 + r10
        L_0x0042:
            long r10 = r3 - r10
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x005b
            _thread = r0
            r12.MediaSessionCompat$QueueItem()
            boolean r0 = r12.MediaBrowserCompat$CustomActionResultReceiver()
            if (r0 != 0) goto L_0x005a
            java.lang.Thread r0 = _thread
            if (r0 != 0) goto L_0x005a
            r12.MediaSessionCompat$ResultReceiverWrapper()
        L_0x005a:
            return
        L_0x005b:
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0068
        L_0x005f:
            r5 = r10
            goto L_0x0068
        L_0x0061:
            long r10 = MediaMetadataCompat     // Catch:{ all -> 0x0090 }
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0068
            goto L_0x005f
        L_0x0068:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0028
            int r7 = debugStatus     // Catch:{ all -> 0x0090 }
            r8 = 2
            if (r7 == r8) goto L_0x0076
            r8 = 3
            if (r7 == r8) goto L_0x0076
            r7 = 0
            goto L_0x0077
        L_0x0076:
            r7 = 1
        L_0x0077:
            if (r7 == 0) goto L_0x008c
            _thread = r0
            r12.MediaSessionCompat$QueueItem()
            boolean r0 = r12.MediaBrowserCompat$CustomActionResultReceiver()
            if (r0 != 0) goto L_0x008b
            java.lang.Thread r0 = _thread
            if (r0 != 0) goto L_0x008b
            r12.MediaSessionCompat$ResultReceiverWrapper()
        L_0x008b:
            return
        L_0x008c:
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch:{ all -> 0x0090 }
            goto L_0x0028
        L_0x0090:
            r1 = move-exception
            _thread = r0
            r12.MediaSessionCompat$QueueItem()
            boolean r0 = r12.MediaBrowserCompat$CustomActionResultReceiver()
            if (r0 != 0) goto L_0x00a3
            java.lang.Thread r0 = _thread
            if (r0 != 0) goto L_0x00a3
            r12.MediaSessionCompat$ResultReceiverWrapper()
        L_0x00a3:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.lambda$onCreate$0$MwCoachMarkActivity.run():void");
    }

    private final Thread MediaSessionCompat$ResultReceiverWrapper() {
        Thread thread;
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "o.lambda$onCreate$0$MwCoachMarkActivity");
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    private final void MediaSessionCompat$QueueItem() {
        synchronized (this) {
            int i = debugStatus;
            if (i == 2 || i == 3) {
                debugStatus = 3;
                MediaBrowserCompat$MediaItem();
                notifyAll();
            }
        }
    }

    private final boolean MediaSessionCompat$Token() {
        synchronized (this) {
            int i = debugStatus;
            if (i == 2 || i == 3) {
                return false;
            }
            debugStatus = 1;
            notifyAll();
            return true;
        }
    }
}
