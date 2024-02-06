package p040o;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p040o.performDetach;

/* renamed from: o.onPause */
final class onPause implements Runnable {
    private volatile boolean IconCompatParcelizer;
    final Map<isStateSaved, onPause$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$CustomActionResultReceiver;
    performDetach.write MediaBrowserCompat$ItemReceiver;
    private ReferenceQueue<performDetach<?>> MediaBrowserCompat$MediaItem;
    private final boolean read;
    private volatile read write;

    /* renamed from: o.onPause$read */
    public interface read {
        zzvd IconCompatParcelizer();

        zzvg MediaBrowserCompat$CustomActionResultReceiver();

        void write(zzvd zzvd);

        void write(zzvg zzvg);
    }

    onPause(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactory() {
            public final Thread newThread(final Runnable runnable) {
                return new Thread(new Runnable() {
                    public final void run() {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources");
            }
        }));
    }

    private onPause(boolean z, Executor executor) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new HashMap();
        this.MediaBrowserCompat$MediaItem = new ReferenceQueue<>();
        this.read = z;
        executor.execute(this);
    }

    /* access modifiers changed from: package-private */
    public final void read(isStateSaved isstatesaved, performDetach<?> performdetach) {
        synchronized (this) {
            onPause$MediaBrowserCompat$CustomActionResultReceiver put = this.MediaBrowserCompat$CustomActionResultReceiver.put(isstatesaved, new onPause$MediaBrowserCompat$CustomActionResultReceiver(isstatesaved, performdetach, this.MediaBrowserCompat$MediaItem, this.read));
            if (put != null) {
                put.IconCompatParcelizer = null;
                put.clear();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.performDetach<?> MediaBrowserCompat$CustomActionResultReceiver(p040o.isStateSaved r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<o.isStateSaved, o.onPause$MediaBrowserCompat$CustomActionResultReceiver> r0 = r1.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            o.onPause$MediaBrowserCompat$CustomActionResultReceiver r2 = (p040o.onPause$MediaBrowserCompat$CustomActionResultReceiver) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            monitor-exit(r1)
            r2 = 0
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            o.performDetach r0 = (p040o.performDetach) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.IconCompatParcelizer(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onPause.MediaBrowserCompat$CustomActionResultReceiver(o.isStateSaved):o.performDetach");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void IconCompatParcelizer(p040o.onPause$MediaBrowserCompat$CustomActionResultReceiver r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.Map<o.isStateSaved, o.onPause$MediaBrowserCompat$CustomActionResultReceiver> r0 = r7.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x002a }
            o.isStateSaved r1 = r8.write     // Catch:{ all -> 0x002a }
            r0.remove(r1)     // Catch:{ all -> 0x002a }
            boolean r0 = r8.read     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0028
            o.performOptionsMenuClosed<?> r0 = r8.IconCompatParcelizer     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0011
            goto L_0x0028
        L_0x0011:
            monitor-exit(r7)
            o.performDetach r0 = new o.performDetach
            o.performOptionsMenuClosed<?> r2 = r8.IconCompatParcelizer
            r3 = 1
            r4 = 0
            o.isStateSaved r5 = r8.write
            o.performDetach$write r6 = r7.MediaBrowserCompat$ItemReceiver
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            o.performDetach$write r1 = r7.MediaBrowserCompat$ItemReceiver
            o.isStateSaved r8 = r8.write
            r1.MediaBrowserCompat$ItemReceiver(r8, r0)
            return
        L_0x0028:
            monitor-exit(r7)
            return
        L_0x002a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onPause.IconCompatParcelizer(o.onPause$MediaBrowserCompat$CustomActionResultReceiver):void");
    }

    public final void run() {
        while (true) {
            try {
                IconCompatParcelizer((onPause$MediaBrowserCompat$CustomActionResultReceiver) this.MediaBrowserCompat$MediaItem.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
