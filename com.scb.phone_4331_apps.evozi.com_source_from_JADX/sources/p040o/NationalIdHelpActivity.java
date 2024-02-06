package p040o;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: o.NationalIdHelpActivity */
final class NationalIdHelpActivity extends MwCurrentUserEwalletActivity_ViewBinding implements NationalIdActivity_ViewBinding, Executor {
    private static final AtomicIntegerFieldUpdater read = AtomicIntegerFieldUpdater.newUpdater(NationalIdHelpActivity.class, "inFlightTasks");
    private final ReviewInfoResultActivity IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final ConcurrentLinkedQueue<Runnable> MediaBrowserCompat$ItemReceiver = new ConcurrentLinkedQueue<>();
    private final FatcaErrorActivity MediaBrowserCompat$MediaItem;
    private volatile int inFlightTasks = 0;

    public final FatcaErrorActivity IconCompatParcelizer() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public NationalIdHelpActivity(ReviewInfoResultActivity reviewInfoResultActivity, int i, FatcaErrorActivity fatcaErrorActivity) {
        onGetStartedClick.write((Object) reviewInfoResultActivity, "dispatcher");
        onGetStartedClick.write((Object) fatcaErrorActivity, "taskMode");
        this.IconCompatParcelizer = reviewInfoResultActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.MediaBrowserCompat$MediaItem = fatcaErrorActivity;
    }

    public final void execute(Runnable runnable) {
        onGetStartedClick.write((Object) runnable, "command");
        MediaBrowserCompat$ItemReceiver(runnable, false);
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public final void IconCompatParcelizer(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Runnable runnable) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) runnable, "block");
        MediaBrowserCompat$ItemReceiver(runnable, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void MediaBrowserCompat$ItemReceiver(java.lang.Runnable r3, boolean r4) {
        /*
            r2 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = read
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 > r1) goto L_0x0013
            o.ReviewInfoResultActivity r0 = r2.IconCompatParcelizer
            r1 = r2
            o.NationalIdActivity_ViewBinding r1 = (p040o.NationalIdActivity_ViewBinding) r1
            r0.IconCompatParcelizer(r3, r1, r4)
            return
        L_0x0013:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r2.MediaBrowserCompat$ItemReceiver
            r0.add(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = read
            int r3 = r3.decrementAndGet(r2)
            int r0 = r2.MediaBrowserCompat$CustomActionResultReceiver
            if (r3 < r0) goto L_0x0023
            return
        L_0x0023:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r3 = r2.MediaBrowserCompat$ItemReceiver
            java.lang.Object r3 = r3.poll()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.NationalIdHelpActivity.MediaBrowserCompat$ItemReceiver(java.lang.Runnable, boolean):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[dispatcher = ");
        sb.append(this.IconCompatParcelizer);
        sb.append(']');
        return sb.toString();
    }

    public final void read() {
        Runnable poll = this.MediaBrowserCompat$ItemReceiver.poll();
        if (poll != null) {
            this.IconCompatParcelizer.IconCompatParcelizer(poll, this, true);
            return;
        }
        read.decrementAndGet(this);
        Runnable poll2 = this.MediaBrowserCompat$ItemReceiver.poll();
        if (poll2 != null) {
            MediaBrowserCompat$ItemReceiver(poll2, true);
        }
    }
}
