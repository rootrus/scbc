package p040o;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.KtaJsonCheck;

/* renamed from: o.waitForLoader */
public final class waitForLoader<R> implements dataToString<R>, deliverCancellation<R> {
    private static final write MediaBrowserCompat$CustomActionResultReceiver = new write();
    private final int IconCompatParcelizer;
    private GlideException MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem;
    private final int MediaBrowserCompat$SearchResultReceiver;
    private R MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private commitContentChanged RatingCompat;
    private final boolean read;
    private boolean write;

    public final void MediaBrowserCompat$CustomActionResultReceiver(KtaJsonCheck.C69271 r1) {
    }

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final void read(Drawable drawable) {
    }

    public final void write(Drawable drawable) {
    }

    public waitForLoader(int i, int i2) {
        this(PKIFailureInfo.systemUnavail, PKIFailureInfo.systemUnavail, MediaBrowserCompat$CustomActionResultReceiver);
    }

    private waitForLoader(int i, int i2, write write2) {
        this.MediaBrowserCompat$SearchResultReceiver = i;
        this.IconCompatParcelizer = i2;
        this.read = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        if (r1 == null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        r1.MediaBrowserCompat$CustomActionResultReceiver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001e, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x000a
            monitor-exit(r2)
            r3 = 0
            return r3
        L_0x000a:
            r0 = 1
            r2.write = r0     // Catch:{ all -> 0x001f }
            r2.notifyAll()     // Catch:{ all -> 0x001f }
            r1 = 0
            if (r3 == 0) goto L_0x0018
            o.commitContentChanged r3 = r2.RatingCompat     // Catch:{ all -> 0x001f }
            r2.RatingCompat = r1     // Catch:{ all -> 0x001f }
            r1 = r3
        L_0x0018:
            monitor-exit(r2)
            if (r1 == 0) goto L_0x001e
            r1.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x001e:
            return r0
        L_0x001f:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.waitForLoader.cancel(boolean):boolean");
    }

    public final boolean isCancelled() {
        boolean z;
        synchronized (this) {
            z = this.write;
        }
        return z;
    }

    public final boolean isDone() {
        boolean z;
        synchronized (this) {
            z = this.write || this.MediaBrowserCompat$MediaItem || this.MediaMetadataCompat;
        }
        return z;
    }

    public final R get() throws InterruptedException, ExecutionException {
        try {
            return write((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public final R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return write(Long.valueOf(timeUnit.toMillis(j)));
    }

    public final void IconCompatParcelizer(KtaJsonCheck.C69271 r3) {
        r3.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$SearchResultReceiver, this.IconCompatParcelizer);
    }

    public final void MediaBrowserCompat$ItemReceiver(commitContentChanged commitcontentchanged) {
        synchronized (this) {
            this.RatingCompat = commitcontentchanged;
        }
    }

    public final commitContentChanged read() {
        commitContentChanged commitcontentchanged;
        synchronized (this) {
            commitcontentchanged = this.RatingCompat;
        }
        return commitcontentchanged;
    }

    public final void IconCompatParcelizer(Drawable drawable) {
        synchronized (this) {
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(R r) {
        synchronized (this) {
        }
    }

    private R write(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        synchronized (this) {
            if (!isDone()) {
                LinearLayoutManager.MediaBrowserCompat$CustomActionResultReceiver();
            }
            if (this.write) {
                throw new CancellationException();
            } else if (this.MediaMetadataCompat) {
                throw new ExecutionException(this.MediaBrowserCompat$ItemReceiver);
            } else if (this.MediaBrowserCompat$MediaItem) {
                R r = this.MediaDescriptionCompat;
                return r;
            } else {
                if (l == null) {
                    wait(0);
                } else if (l.longValue() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long longValue = l.longValue() + currentTimeMillis;
                    while (!isDone() && currentTimeMillis < longValue) {
                        wait(longValue - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    }
                }
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                } else if (this.MediaMetadataCompat) {
                    throw new ExecutionException(this.MediaBrowserCompat$ItemReceiver);
                } else if (this.write) {
                    throw new CancellationException();
                } else if (this.MediaBrowserCompat$MediaItem) {
                    R r2 = this.MediaDescriptionCompat;
                    return r2;
                } else {
                    throw new TimeoutException();
                }
            }
        }
    }

    public final boolean write(GlideException glideException) {
        synchronized (this) {
            this.MediaMetadataCompat = true;
            this.MediaBrowserCompat$ItemReceiver = glideException;
            notifyAll();
        }
        return false;
    }

    public final boolean IconCompatParcelizer(R r) {
        synchronized (this) {
            this.MediaBrowserCompat$MediaItem = true;
            this.MediaDescriptionCompat = r;
            notifyAll();
        }
        return false;
    }

    /* renamed from: o.waitForLoader$write */
    static class write {
        write() {
        }
    }
}
