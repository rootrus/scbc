package p040o;

/* renamed from: o.HmlETBOperatingAccountActivity */
public final class HmlETBOperatingAccountActivity<T> extends HmlETBManageEmailVerificationActivity<T> implements C9755xfc1cf0c7<Object> {
    private volatile boolean IconCompatParcelizer;
    private HmlETBManageEmailVerificationActivity<T> MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private HmlBaseSuccessActivity<Object> read;

    public HmlETBOperatingAccountActivity(HmlETBManageEmailVerificationActivity<T> hmlETBManageEmailVerificationActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlETBManageEmailVerificationActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(bankingAgentTransactionsDeepLinkActivity);
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        boolean z = true;
        if (!this.IconCompatParcelizer) {
            synchronized (this) {
                if (!this.IconCompatParcelizer) {
                    if (this.MediaBrowserCompat$ItemReceiver) {
                        HmlBaseSuccessActivity<Object> hmlBaseSuccessActivity = this.read;
                        if (hmlBaseSuccessActivity == null) {
                            hmlBaseSuccessActivity = new HmlBaseSuccessActivity<>();
                            this.read = hmlBaseSuccessActivity;
                        }
                        hmlBaseSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(HmlCaptureDocumentActivity.write(bulkTransferDeepLinkActivity));
                        return;
                    }
                    this.MediaBrowserCompat$ItemReceiver = true;
                    z = false;
                }
            }
        }
        if (z) {
            bulkTransferDeepLinkActivity.dispose();
            return;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(bulkTransferDeepLinkActivity);
        MediaBrowserCompat$ItemReceiver();
    }

    public final void onNext(T t) {
        if (!this.IconCompatParcelizer) {
            synchronized (this) {
                if (!this.IconCompatParcelizer) {
                    if (this.MediaBrowserCompat$ItemReceiver) {
                        HmlBaseSuccessActivity<Object> hmlBaseSuccessActivity = this.read;
                        if (hmlBaseSuccessActivity == null) {
                            hmlBaseSuccessActivity = new HmlBaseSuccessActivity<>();
                            this.read = hmlBaseSuccessActivity;
                        }
                        hmlBaseSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(HmlCaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(t));
                        return;
                    }
                    this.MediaBrowserCompat$ItemReceiver = true;
                    this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
                    MediaBrowserCompat$ItemReceiver();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r1 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        p040o.AlertController$RecycleListView.read.read(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        r3.MediaBrowserCompat$CustomActionResultReceiver.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.IconCompatParcelizer
            if (r0 == 0) goto L_0x0008
            p040o.AlertController$RecycleListView.read.read((java.lang.Throwable) r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.IconCompatParcelizer     // Catch:{ all -> 0x003b }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x002d
            r3.IconCompatParcelizer = r2     // Catch:{ all -> 0x003b }
            boolean r0 = r3.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002a
            o.HmlBaseSuccessActivity<java.lang.Object> r0 = r3.read     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0020
            o.HmlBaseSuccessActivity r0 = new o.HmlBaseSuccessActivity     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            r3.read = r0     // Catch:{ all -> 0x003b }
        L_0x0020:
            java.lang.Object r4 = p040o.HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Throwable) r4)     // Catch:{ all -> 0x003b }
            java.lang.Object[] r0 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x003b }
            r0[r1] = r4     // Catch:{ all -> 0x003b }
            monitor-exit(r3)
            return
        L_0x002a:
            r3.MediaBrowserCompat$ItemReceiver = r2     // Catch:{ all -> 0x003b }
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            monitor-exit(r3)
            if (r1 == 0) goto L_0x0035
            p040o.AlertController$RecycleListView.read.read((java.lang.Throwable) r4)
            return
        L_0x0035:
            o.HmlETBManageEmailVerificationActivity<T> r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
            r0.onError(r4)
            return
        L_0x003b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlETBOperatingAccountActivity.onError(java.lang.Throwable):void");
    }

    public final void onComplete() {
        if (!this.IconCompatParcelizer) {
            synchronized (this) {
                if (!this.IconCompatParcelizer) {
                    this.IconCompatParcelizer = true;
                    if (this.MediaBrowserCompat$ItemReceiver) {
                        HmlBaseSuccessActivity<Object> hmlBaseSuccessActivity = this.read;
                        if (hmlBaseSuccessActivity == null) {
                            hmlBaseSuccessActivity = new HmlBaseSuccessActivity<>();
                            this.read = hmlBaseSuccessActivity;
                        }
                        hmlBaseSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver());
                        return;
                    }
                    this.MediaBrowserCompat$ItemReceiver = true;
                    this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        r0 = r0.MediaBrowserCompat$ItemReceiver;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0010, code lost:
        if (r0 == null) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0012, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0014, code lost:
        if (r2 >= 4) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0016, code lost:
        r4 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0018, code lost:
        if (r4 == null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x001e, code lost:
        if (MediaBrowserCompat$CustomActionResultReceiver(r4) != false) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0020, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        r0 = r0[4];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$ItemReceiver() {
        /*
            r5 = this;
        L_0x0000:
            monitor-enter(r5)
            o.HmlBaseSuccessActivity<java.lang.Object> r0 = r5.read     // Catch:{ all -> 0x0028 }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            r5.MediaBrowserCompat$ItemReceiver = r1     // Catch:{ all -> 0x0028 }
            monitor-exit(r5)
            return
        L_0x000a:
            r2 = 0
            r5.read = r2     // Catch:{ all -> 0x0028 }
            monitor-exit(r5)
            java.lang.Object[] r0 = r0.MediaBrowserCompat$ItemReceiver
        L_0x0010:
            if (r0 == 0) goto L_0x0000
            r2 = r1
        L_0x0013:
            r3 = 4
            if (r2 >= r3) goto L_0x0023
            r4 = r0[r2]
            if (r4 == 0) goto L_0x0023
            boolean r3 = r5.MediaBrowserCompat$CustomActionResultReceiver(r4)
            if (r3 != 0) goto L_0x0000
            int r2 = r2 + 1
            goto L_0x0013
        L_0x0023:
            r0 = r0[r3]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L_0x0010
        L_0x0028:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlETBOperatingAccountActivity.MediaBrowserCompat$ItemReceiver():void");
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        return HmlCaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(obj, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
