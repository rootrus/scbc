package p040o;

import java.util.ArrayList;
import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.ChequeInquiryDeepLinkActivity */
public final class ChequeInquiryDeepLinkActivity implements BulkTransferDeepLinkActivity, FacebookBillPaymentDeepLinkActivity {
    private HmlConsumerEmailAboutActivity<BulkTransferDeepLinkActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private volatile boolean read;

    public final void dispose() {
        if (!this.read) {
            synchronized (this) {
                if (!this.read) {
                    this.read = true;
                    HmlConsumerEmailAboutActivity<BulkTransferDeepLinkActivity> hmlConsumerEmailAboutActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                    this.MediaBrowserCompat$CustomActionResultReceiver = null;
                    IconCompatParcelizer(hmlConsumerEmailAboutActivity);
                }
            }
        }
    }

    public final boolean isDisposed() {
        return this.read;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(p040o.BulkTransferDeepLinkActivity r11) {
        /*
            r10 = this;
            java.lang.String r0 = "disposable is null"
            p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r11, r0)
            boolean r0 = r10.read
            if (r0 != 0) goto L_0x0090
            monitor-enter(r10)
            boolean r0 = r10.read     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x008b
            o.HmlConsumerEmailAboutActivity<o.BulkTransferDeepLinkActivity> r0 = r10.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x0019
            o.HmlConsumerEmailAboutActivity r0 = new o.HmlConsumerEmailAboutActivity     // Catch:{ all -> 0x008d }
            r0.<init>()     // Catch:{ all -> 0x008d }
            r10.MediaBrowserCompat$CustomActionResultReceiver = r0     // Catch:{ all -> 0x008d }
        L_0x0019:
            T[] r1 = r0.IconCompatParcelizer     // Catch:{ all -> 0x008d }
            int r2 = r0.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x008d }
            int r3 = r11.hashCode()     // Catch:{ all -> 0x008d }
            r4 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r3 = r3 * r4
            int r5 = r3 >>> 16
            r3 = r3 ^ r5
            r3 = r3 & r2
            r5 = r1[r3]     // Catch:{ all -> 0x008d }
            r6 = 1
            if (r5 == 0) goto L_0x0042
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x008d }
            if (r5 != 0) goto L_0x0089
        L_0x0034:
            int r3 = r3 + r6
            r3 = r3 & r2
            r5 = r1[r3]     // Catch:{ all -> 0x008d }
            if (r5 != 0) goto L_0x003b
            goto L_0x0042
        L_0x003b:
            boolean r5 = r5.equals(r11)     // Catch:{ all -> 0x008d }
            if (r5 == 0) goto L_0x0034
            goto L_0x0089
        L_0x0042:
            r1[r3] = r11     // Catch:{ all -> 0x008d }
            int r11 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x008d }
            int r11 = r11 + r6
            r0.MediaBrowserCompat$ItemReceiver = r11     // Catch:{ all -> 0x008d }
            int r1 = r0.write     // Catch:{ all -> 0x008d }
            if (r11 < r1) goto L_0x0089
            T[] r11 = r0.IconCompatParcelizer     // Catch:{ all -> 0x008d }
            int r1 = r11.length     // Catch:{ all -> 0x008d }
            int r2 = r1 << 1
            int r3 = r2 + -1
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x008d }
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch:{ all -> 0x008d }
            int r7 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x008d }
        L_0x005a:
            if (r7 == 0) goto L_0x007e
        L_0x005c:
            int r1 = r1 + -1
            r8 = r11[r1]     // Catch:{ all -> 0x008d }
            if (r8 == 0) goto L_0x005c
            r8 = r11[r1]     // Catch:{ all -> 0x008d }
            int r8 = r8.hashCode()     // Catch:{ all -> 0x008d }
            int r8 = r8 * r4
            int r9 = r8 >>> 16
            r8 = r8 ^ r9
            r8 = r8 & r3
            r9 = r5[r8]     // Catch:{ all -> 0x008d }
            if (r9 == 0) goto L_0x0077
        L_0x0071:
            int r8 = r8 + r6
            r8 = r8 & r3
            r9 = r5[r8]     // Catch:{ all -> 0x008d }
            if (r9 != 0) goto L_0x0071
        L_0x0077:
            r9 = r11[r1]     // Catch:{ all -> 0x008d }
            r5[r8] = r9     // Catch:{ all -> 0x008d }
            int r7 = r7 + -1
            goto L_0x005a
        L_0x007e:
            r0.MediaBrowserCompat$CustomActionResultReceiver = r3     // Catch:{ all -> 0x008d }
            float r11 = (float) r2     // Catch:{ all -> 0x008d }
            r1 = 1061158912(0x3f400000, float:0.75)
            float r11 = r11 * r1
            int r11 = (int) r11     // Catch:{ all -> 0x008d }
            r0.write = r11     // Catch:{ all -> 0x008d }
            r0.IconCompatParcelizer = r5     // Catch:{ all -> 0x008d }
        L_0x0089:
            monitor-exit(r10)
            return r6
        L_0x008b:
            monitor-exit(r10)
            goto L_0x0090
        L_0x008d:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        L_0x0090:
            r11.dispose()
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ChequeInquiryDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(o.BulkTransferDeepLinkActivity):boolean");
    }

    public final boolean write(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (!read(bulkTransferDeepLinkActivity)) {
            return false;
        }
        bulkTransferDeepLinkActivity.dispose();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c A[DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean read(p040o.BulkTransferDeepLinkActivity r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposables is null"
            p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r8, r0)
            boolean r0 = r7.read
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r7)
            boolean r0 = r7.read     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r7)
            return r1
        L_0x0012:
            o.HmlConsumerEmailAboutActivity<o.BulkTransferDeepLinkActivity> r0 = r7.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x004e
            T[] r2 = r0.IconCompatParcelizer     // Catch:{ all -> 0x0050 }
            int r3 = r0.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0050 }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x0050 }
            r5 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r5
            int r5 = r4 >>> 16
            r4 = r4 ^ r5
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x0050 }
            r6 = 1
            if (r5 != 0) goto L_0x002d
        L_0x002b:
            r8 = r1
            goto L_0x0049
        L_0x002d:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x0038
            boolean r8 = r0.MediaBrowserCompat$CustomActionResultReceiver(r4, r2, r3)     // Catch:{ all -> 0x0050 }
            goto L_0x0049
        L_0x0038:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x0050 }
            if (r5 != 0) goto L_0x003f
            goto L_0x002b
        L_0x003f:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x0038
            boolean r8 = r0.MediaBrowserCompat$CustomActionResultReceiver(r4, r2, r3)     // Catch:{ all -> 0x0050 }
        L_0x0049:
            if (r8 != 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            monitor-exit(r7)
            return r6
        L_0x004e:
            monitor-exit(r7)
            return r1
        L_0x0050:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ChequeInquiryDeepLinkActivity.read(o.BulkTransferDeepLinkActivity):boolean");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!this.read) {
            synchronized (this) {
                if (!this.read) {
                    HmlConsumerEmailAboutActivity<BulkTransferDeepLinkActivity> hmlConsumerEmailAboutActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                    this.MediaBrowserCompat$CustomActionResultReceiver = null;
                    IconCompatParcelizer(hmlConsumerEmailAboutActivity);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0014, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int IconCompatParcelizer() {
        /*
            r2 = this;
            boolean r0 = r2.read
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            monitor-enter(r2)
            boolean r0 = r2.read     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)
            return r1
        L_0x000d:
            o.HmlConsumerEmailAboutActivity<o.BulkTransferDeepLinkActivity> r0 = r2.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x0013
            int r1 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r2)
            return r1
        L_0x0015:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ChequeInquiryDeepLinkActivity.IconCompatParcelizer():int");
    }

    private static void IconCompatParcelizer(HmlConsumerEmailAboutActivity<BulkTransferDeepLinkActivity> hmlConsumerEmailAboutActivity) {
        if (hmlConsumerEmailAboutActivity != null) {
            ArrayList arrayList = null;
            for (T t : hmlConsumerEmailAboutActivity.IconCompatParcelizer) {
                if (t instanceof BulkTransferDeepLinkActivity) {
                    try {
                        ((BulkTransferDeepLinkActivity) t).dispose();
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((Throwable) arrayList.get(0));
            }
            throw new CompositeException((Iterable<? extends Throwable>) arrayList);
        }
    }
}
