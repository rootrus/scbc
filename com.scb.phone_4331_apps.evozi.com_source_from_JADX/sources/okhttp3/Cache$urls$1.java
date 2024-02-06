package okhttp3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.internal.cache.DiskLruCache;
import p040o.FundOnboardingSuccessActivity;
import p040o.onGetStartedClick;

public final class Cache$urls$1 implements Iterator<String>, FundOnboardingSuccessActivity.FundScreenshot {
    private boolean canRemove;
    private final Iterator<DiskLruCache.Snapshot> delegate;
    private String nextUrl;
    final /* synthetic */ Cache this$0;

    Cache$urls$1(Cache cache) {
        this.this$0 = cache;
        this.delegate = cache.getCache$okhttp().snapshots();
    }

    public final Iterator<DiskLruCache.Snapshot> getDelegate() {
        return this.delegate;
    }

    public final String getNextUrl() {
        return this.nextUrl;
    }

    public final void setNextUrl(String str) {
        this.nextUrl = str;
    }

    public final boolean getCanRemove() {
        return this.canRemove;
    }

    public final void setCanRemove(boolean z) {
        this.canRemove = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r5 = this;
            java.lang.String r0 = r5.nextUrl
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 0
            r5.canRemove = r0
        L_0x0009:
            java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r5.delegate
            boolean r2 = r2.hasNext()
            if (r2 == 0) goto L_0x0036
            java.util.Iterator<okhttp3.internal.cache.DiskLruCache$Snapshot> r2 = r5.delegate     // Catch:{ IOException -> 0x0009 }
            java.lang.Object r2 = r2.next()     // Catch:{ IOException -> 0x0009 }
            java.io.Closeable r2 = (java.io.Closeable) r2     // Catch:{ IOException -> 0x0009 }
            r3 = r2
            okhttp3.internal.cache.DiskLruCache$Snapshot r3 = (okhttp3.internal.cache.DiskLruCache.Snapshot) r3     // Catch:{ all -> 0x002f }
            o.HowToAddAccountStep2Activity r3 = r3.getSource(r0)     // Catch:{ all -> 0x002f }
            o.NsipPartnerPaymentOtpActivity r3 = p040o.onSubmit.read((p040o.HowToAddAccountStep2Activity) r3)     // Catch:{ all -> 0x002f }
            java.lang.String r3 = r3.Keep()     // Catch:{ all -> 0x002f }
            r5.nextUrl = r3     // Catch:{ all -> 0x002f }
            r3 = 0
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r2, (java.lang.Throwable) r3)     // Catch:{ IOException -> 0x0009 }
            return r1
        L_0x002f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r4 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r2, (java.lang.Throwable) r3)     // Catch:{ IOException -> 0x0009 }
            throw r4     // Catch:{ IOException -> 0x0009 }
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cache$urls$1.hasNext():boolean");
    }

    public final String next() {
        if (hasNext()) {
            String str = this.nextUrl;
            if (str == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.canRemove) {
            this.delegate.remove();
            return;
        }
        throw new IllegalStateException("remove() before next()".toString());
    }
}
