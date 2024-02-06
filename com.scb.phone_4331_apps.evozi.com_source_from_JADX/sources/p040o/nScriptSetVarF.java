package p040o;

import java.util.Queue;

/* renamed from: o.nScriptSetVarF */
final class nScriptSetVarF<ResultT> {
    Queue<nScriptSetVarI<ResultT>> MediaBrowserCompat$ItemReceiver;
    private boolean read;
    final Object write = new Object();

    nScriptSetVarF() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r0 = r2.write;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1 = r2.MediaBrowserCompat$ItemReceiver.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r1 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.read = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r1.read(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(p040o.nScriptInvokeIDCreate<ResultT> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.write
            monitor-enter(r0)
            java.util.Queue<o.nScriptSetVarI<ResultT>> r1 = r2.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.read     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.read = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r0 = r2.write
            monitor-enter(r0)
            java.util.Queue<o.nScriptSetVarI<ResultT>> r1 = r2.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0027 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0027 }
            o.nScriptSetVarI r1 = (p040o.nScriptSetVarI) r1     // Catch:{ all -> 0x0027 }
            if (r1 != 0) goto L_0x0022
            r3 = 0
            r2.read = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r0)
            r1.read(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x002a:
            monitor-exit(r0)
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.nScriptSetVarF.MediaBrowserCompat$CustomActionResultReceiver(o.nScriptInvokeIDCreate):void");
    }
}
