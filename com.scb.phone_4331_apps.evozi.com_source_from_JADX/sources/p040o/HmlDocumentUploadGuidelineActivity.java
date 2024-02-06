package p040o;

/* renamed from: o.HmlDocumentUploadGuidelineActivity */
public final class HmlDocumentUploadGuidelineActivity<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private boolean IconCompatParcelizer;
    private HmlBaseSuccessActivity<Object> MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$MediaItem;
    private BankingAgentTransactionsDeepLinkActivity<? super T> read;
    private volatile boolean write;

    public HmlDocumentUploadGuidelineActivity(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this(bankingAgentTransactionsDeepLinkActivity, (byte) 0);
    }

    private HmlDocumentUploadGuidelineActivity(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, byte b) {
        this.read = bankingAgentTransactionsDeepLinkActivity;
        this.IconCompatParcelizer = false;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$MediaItem, bulkTransferDeepLinkActivity)) {
            this.MediaBrowserCompat$MediaItem = bulkTransferDeepLinkActivity;
            this.read.onSubscribe(this);
        }
    }

    public final void dispose() {
        this.MediaBrowserCompat$MediaItem.dispose();
    }

    public final boolean isDisposed() {
        return this.MediaBrowserCompat$MediaItem.isDisposed();
    }

    public final void onNext(T t) {
        if (!this.write) {
            if (t == null) {
                this.MediaBrowserCompat$MediaItem.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.write) {
                    if (this.MediaBrowserCompat$ItemReceiver) {
                        HmlBaseSuccessActivity<Object> hmlBaseSuccessActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                        if (hmlBaseSuccessActivity == null) {
                            hmlBaseSuccessActivity = new HmlBaseSuccessActivity<>();
                            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBaseSuccessActivity;
                        }
                        hmlBaseSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(HmlCaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(t));
                        return;
                    }
                    this.MediaBrowserCompat$ItemReceiver = true;
                    this.read.onNext(t);
                    IconCompatParcelizer();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        if (r1 == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        p040o.AlertController$RecycleListView.read.read(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        r3.read.onError(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onError(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.write
            if (r0 == 0) goto L_0x0008
            p040o.AlertController$RecycleListView.read.read((java.lang.Throwable) r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.write     // Catch:{ all -> 0x003d }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x002f
            boolean r0 = r3.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x002a
            r3.write = r2     // Catch:{ all -> 0x003d }
            o.HmlBaseSuccessActivity<java.lang.Object> r0 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0020
            o.HmlBaseSuccessActivity r0 = new o.HmlBaseSuccessActivity     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            r3.MediaBrowserCompat$CustomActionResultReceiver = r0     // Catch:{ all -> 0x003d }
        L_0x0020:
            java.lang.Object r4 = p040o.HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Throwable) r4)     // Catch:{ all -> 0x003d }
            java.lang.Object[] r0 = r0.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x003d }
            r0[r1] = r4     // Catch:{ all -> 0x003d }
            monitor-exit(r3)
            return
        L_0x002a:
            r3.write = r2     // Catch:{ all -> 0x003d }
            r3.MediaBrowserCompat$ItemReceiver = r2     // Catch:{ all -> 0x003d }
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            monitor-exit(r3)
            if (r1 == 0) goto L_0x0037
            p040o.AlertController$RecycleListView.read.read((java.lang.Throwable) r4)
            return
        L_0x0037:
            o.BankingAgentTransactionsDeepLinkActivity<? super T> r0 = r3.read
            r0.onError(r4)
            return
        L_0x003d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlDocumentUploadGuidelineActivity.onError(java.lang.Throwable):void");
    }

    public final void onComplete() {
        if (!this.write) {
            synchronized (this) {
                if (!this.write) {
                    if (this.MediaBrowserCompat$ItemReceiver) {
                        HmlBaseSuccessActivity<Object> hmlBaseSuccessActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                        if (hmlBaseSuccessActivity == null) {
                            hmlBaseSuccessActivity = new HmlBaseSuccessActivity<>();
                            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBaseSuccessActivity;
                        }
                        hmlBaseSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(HmlCaptureDocumentActivity.MediaBrowserCompat$CustomActionResultReceiver());
                        return;
                    }
                    this.write = true;
                    this.MediaBrowserCompat$ItemReceiver = true;
                    this.read.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        r2 = r6.read;
        r0 = r0.MediaBrowserCompat$ItemReceiver;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0012, code lost:
        if (r0 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0016, code lost:
        if (r3 >= 4) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0018, code lost:
        r5 = r0[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001a, code lost:
        if (r5 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0020, code lost:
        if (p040o.HmlCaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(r5, r2) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0022, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0024, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0027, code lost:
        r0 = r0[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x002c, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void IconCompatParcelizer() {
        /*
            r6 = this;
        L_0x0000:
            monitor-enter(r6)
            o.HmlBaseSuccessActivity<java.lang.Object> r0 = r6.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x002f }
            r1 = 0
            if (r0 != 0) goto L_0x000a
            r6.MediaBrowserCompat$ItemReceiver = r1     // Catch:{ all -> 0x002f }
            monitor-exit(r6)
            return
        L_0x000a:
            r2 = 0
            r6.MediaBrowserCompat$CustomActionResultReceiver = r2     // Catch:{ all -> 0x002f }
            monitor-exit(r6)
            o.BankingAgentTransactionsDeepLinkActivity<? super T> r2 = r6.read
            java.lang.Object[] r0 = r0.MediaBrowserCompat$ItemReceiver
        L_0x0012:
            if (r0 == 0) goto L_0x002c
            r3 = r1
        L_0x0015:
            r4 = 4
            if (r3 >= r4) goto L_0x0027
            r5 = r0[r3]
            if (r5 == 0) goto L_0x0027
            boolean r4 = p040o.HmlCaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(r5, r2)
            if (r4 == 0) goto L_0x0024
            r1 = 1
            goto L_0x002c
        L_0x0024:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x0027:
            r0 = r0[r4]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L_0x0012
        L_0x002c:
            if (r1 == 0) goto L_0x0000
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.HmlDocumentUploadGuidelineActivity.IconCompatParcelizer():void");
    }
}
