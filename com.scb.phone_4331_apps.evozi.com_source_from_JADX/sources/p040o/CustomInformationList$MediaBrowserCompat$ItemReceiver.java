package p040o;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.CustomInformationList$MediaBrowserCompat$ItemReceiver */
final class CustomInformationList$MediaBrowserCompat$ItemReceiver extends AtomicBoolean implements CustomDoubleCircleBorderView {
    private DraggableFloatingActionButton MediaBrowserCompat$ItemReceiver;
    private CustomInformationList read;

    public CustomInformationList$MediaBrowserCompat$ItemReceiver(CustomInformationList customInformationList, DraggableFloatingActionButton draggableFloatingActionButton) {
        this.read = customInformationList;
        this.MediaBrowserCompat$ItemReceiver = draggableFloatingActionButton;
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.read.MediaBrowserCompat$CustomActionResultReceiver.read;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r1.write();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write() {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r4.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0029
            o.DraggableFloatingActionButton r0 = r4.MediaBrowserCompat$ItemReceiver
            o.CustomInformationList r1 = r4.read
            boolean r2 = r0.read
            if (r2 != 0) goto L_0x0029
            monitor-enter(r0)
            java.util.LinkedList<o.CustomDoubleCircleBorderView> r2 = r0.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0026 }
            boolean r3 = r0.read     // Catch:{ all -> 0x0026 }
            if (r3 != 0) goto L_0x0024
            if (r2 == 0) goto L_0x0024
            boolean r2 = r2.remove(r1)     // Catch:{ all -> 0x0026 }
            monitor-exit(r0)
            if (r2 == 0) goto L_0x0029
            r1.write()
            return
        L_0x0024:
            monitor-exit(r0)
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.CustomInformationList$MediaBrowserCompat$ItemReceiver.write():void");
    }
}
