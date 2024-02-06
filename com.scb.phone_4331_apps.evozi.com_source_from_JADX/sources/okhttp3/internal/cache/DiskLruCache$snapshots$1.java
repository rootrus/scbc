package okhttp3.internal.cache;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import okhttp3.internal.cache.DiskLruCache;
import p040o.FundOnboardingSuccessActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

public final class DiskLruCache$snapshots$1 implements Iterator<DiskLruCache.Snapshot>, FundOnboardingSuccessActivity.FundScreenshot {
    private final Iterator<DiskLruCache.Entry> delegate;
    private DiskLruCache.Snapshot nextSnapshot;
    private DiskLruCache.Snapshot removeSnapshot;
    final /* synthetic */ DiskLruCache this$0;

    DiskLruCache$snapshots$1(DiskLruCache diskLruCache) {
        this.this$0 = diskLruCache;
        Iterator<DiskLruCache.Entry> it = new ArrayList(diskLruCache.getLruEntries$okhttp().values()).iterator();
        onGetStartedClick.IconCompatParcelizer((Object) it, "ArrayList(lruEntries.values).iterator()");
        this.delegate = it;
    }

    public final Iterator<DiskLruCache.Entry> getDelegate() {
        return this.delegate;
    }

    public final DiskLruCache.Snapshot getNextSnapshot() {
        return this.nextSnapshot;
    }

    public final void setNextSnapshot(DiskLruCache.Snapshot snapshot) {
        this.nextSnapshot = snapshot;
    }

    public final DiskLruCache.Snapshot getRemoveSnapshot() {
        return this.removeSnapshot;
    }

    public final void setRemoveSnapshot(DiskLruCache.Snapshot snapshot) {
        this.removeSnapshot = snapshot;
    }

    public final boolean hasNext() {
        if (this.nextSnapshot != null) {
            return true;
        }
        synchronized (this.this$0) {
            if (this.this$0.getClosed$okhttp()) {
                return false;
            }
            while (this.delegate.hasNext()) {
                DiskLruCache.Entry next = this.delegate.next();
                if (next != null) {
                    if (next.getReadable$okhttp()) {
                        DiskLruCache.Snapshot snapshot$okhttp = next.snapshot$okhttp();
                        if (snapshot$okhttp != null) {
                            this.nextSnapshot = snapshot$okhttp;
                            return true;
                        }
                    }
                }
            }
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            return false;
        }
    }

    public final DiskLruCache.Snapshot next() {
        if (hasNext()) {
            DiskLruCache.Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            if (snapshot == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            return snapshot;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        DiskLruCache.Snapshot snapshot = this.removeSnapshot;
        if (snapshot != null) {
            try {
                this.this$0.remove(snapshot.key());
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.removeSnapshot = null;
                throw th;
            }
            this.removeSnapshot = null;
            return;
        }
        throw new IllegalStateException("remove() before next()".toString());
    }
}
