package okhttp3.internal.cache;

final class DiskLruCache$cleanupRunnable$1 implements Runnable {
    final /* synthetic */ DiskLruCache this$0;

    DiskLruCache$cleanupRunnable$1(DiskLruCache diskLruCache) {
        this.this$0 = diskLruCache;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.this$0.mostRecentRebuildFailed = true;
        r4.this$0.journalWriter = p040o.onSubmit.read(p040o.onSubmit.write());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
            monitor-enter(r0)
            okhttp3.internal.cache.DiskLruCache r1 = r4.this$0     // Catch:{ all -> 0x004b }
            boolean r1 = r1.initialized     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0049
            okhttp3.internal.cache.DiskLruCache r1 = r4.this$0     // Catch:{ all -> 0x004b }
            boolean r1 = r1.getClosed$okhttp()     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x0049
            r1 = 1
            okhttp3.internal.cache.DiskLruCache r2 = r4.this$0     // Catch:{ IOException -> 0x001a }
            r2.trimToSize()     // Catch:{ IOException -> 0x001a }
            goto L_0x001f
        L_0x001a:
            okhttp3.internal.cache.DiskLruCache r2 = r4.this$0     // Catch:{ all -> 0x004b }
            r2.mostRecentTrimFailed = r1     // Catch:{ all -> 0x004b }
        L_0x001f:
            okhttp3.internal.cache.DiskLruCache r2 = r4.this$0     // Catch:{ IOException -> 0x0033 }
            boolean r2 = r2.journalRebuildRequired()     // Catch:{ IOException -> 0x0033 }
            if (r2 == 0) goto L_0x0045
            okhttp3.internal.cache.DiskLruCache r2 = r4.this$0     // Catch:{ IOException -> 0x0033 }
            r2.rebuildJournal$okhttp()     // Catch:{ IOException -> 0x0033 }
            okhttp3.internal.cache.DiskLruCache r2 = r4.this$0     // Catch:{ IOException -> 0x0033 }
            r3 = 0
            r2.redundantOpCount = r3     // Catch:{ IOException -> 0x0033 }
            goto L_0x0045
        L_0x0033:
            okhttp3.internal.cache.DiskLruCache r2 = r4.this$0     // Catch:{ all -> 0x004b }
            r2.mostRecentRebuildFailed = r1     // Catch:{ all -> 0x004b }
            okhttp3.internal.cache.DiskLruCache r1 = r4.this$0     // Catch:{ all -> 0x004b }
            o.PinChangeActivity r2 = p040o.onSubmit.write()     // Catch:{ all -> 0x004b }
            o.NsipPartnerPaymentReviewActivity r2 = p040o.onSubmit.read((p040o.PinChangeActivity) r2)     // Catch:{ all -> 0x004b }
            r1.journalWriter = r2     // Catch:{ all -> 0x004b }
        L_0x0045:
            o.HmlVerifyPhoneValidateOtpActivity r1 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x004b }
            monitor-exit(r0)
            return
        L_0x0049:
            monitor-exit(r0)
            return
        L_0x004b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache$cleanupRunnable$1.run():void");
    }
}
