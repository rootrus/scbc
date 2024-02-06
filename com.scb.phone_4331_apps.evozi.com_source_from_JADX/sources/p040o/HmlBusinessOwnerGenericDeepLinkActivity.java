package p040o;

import java.util.LinkedList;
import java.util.List;

/* renamed from: o.HmlBusinessOwnerGenericDeepLinkActivity */
public final class HmlBusinessOwnerGenericDeepLinkActivity implements BulkTransferDeepLinkActivity, FacebookBillPaymentDeepLinkActivity {
    private volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
    private List<BulkTransferDeepLinkActivity> MediaBrowserCompat$ItemReceiver;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0017, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        if (r1.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.next().dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002c, code lost:
        p040o.AlertController$RecycleListView.read.write(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        if (r2.size() != 1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        throw p040o.HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        throw new p039io.reactivex.exceptions.CompositeException((java.lang.Iterable<? extends java.lang.Throwable>) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r4 = this;
            boolean r0 = r4.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r4)
            boolean r0 = r4.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)
            return
        L_0x000c:
            r0 = 1
            r4.MediaBrowserCompat$CustomActionResultReceiver = r0     // Catch:{ all -> 0x0055 }
            java.util.List<o.BulkTransferDeepLinkActivity> r1 = r4.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0055 }
            r2 = 0
            r4.MediaBrowserCompat$ItemReceiver = r2     // Catch:{ all -> 0x0055 }
            monitor-exit(r4)
            if (r1 == 0) goto L_0x0054
            java.util.Iterator r1 = r1.iterator()
        L_0x001b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r1.next()
            o.BulkTransferDeepLinkActivity r3 = (p040o.BulkTransferDeepLinkActivity) r3
            r3.dispose()     // Catch:{ all -> 0x002b }
            goto L_0x001b
        L_0x002b:
            r3 = move-exception
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r3)
            if (r2 != 0) goto L_0x0036
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0036:
            r2.add(r3)
            goto L_0x001b
        L_0x003a:
            if (r2 == 0) goto L_0x0054
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004e
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = p040o.HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r0)
            throw r0
        L_0x004e:
            io.reactivex.exceptions.CompositeException r0 = new io.reactivex.exceptions.CompositeException
            r0.<init>((java.lang.Iterable<? extends java.lang.Throwable>) r2)
            throw r0
        L_0x0054:
            return
        L_0x0055:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlBusinessOwnerGenericDeepLinkActivity.dispose():void");
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(bulkTransferDeepLinkActivity, "d is null");
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            synchronized (this) {
                if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                    List list = this.MediaBrowserCompat$ItemReceiver;
                    if (list == null) {
                        list = new LinkedList();
                        this.MediaBrowserCompat$ItemReceiver = list;
                    }
                    list.add(bulkTransferDeepLinkActivity);
                    return true;
                }
            }
        }
        bulkTransferDeepLinkActivity.dispose();
        return false;
    }

    public final boolean write(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (!read(bulkTransferDeepLinkActivity)) {
            return false;
        }
        bulkTransferDeepLinkActivity.dispose();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean read(p040o.BulkTransferDeepLinkActivity r3) {
        /*
            r2 = this;
            java.lang.String r0 = "Disposable item is null"
            p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r3, r0)
            boolean r0 = r2.MediaBrowserCompat$CustomActionResultReceiver
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r2)
            boolean r0 = r2.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)
            return r1
        L_0x0012:
            java.util.List<o.BulkTransferDeepLinkActivity> r0 = r2.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0020
            boolean r3 = r0.remove(r3)     // Catch:{ all -> 0x0022 }
            if (r3 != 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            monitor-exit(r2)
            r3 = 1
            return r3
        L_0x0020:
            monitor-exit(r2)
            return r1
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlBusinessOwnerGenericDeepLinkActivity.read(o.BulkTransferDeepLinkActivity):boolean");
    }
}
