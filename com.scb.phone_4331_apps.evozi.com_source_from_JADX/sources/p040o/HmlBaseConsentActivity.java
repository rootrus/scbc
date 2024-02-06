package p040o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: o.HmlBaseConsentActivity */
public final class HmlBaseConsentActivity<E> extends AtomicReferenceArray<E> implements HmlLoanOfferStatusDeepLinkBaseActivity<E> {
    private static final Integer read = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private AtomicLong IconCompatParcelizer = new AtomicLong();
    private AtomicLong MediaBrowserCompat$CustomActionResultReceiver = new AtomicLong();
    private int MediaBrowserCompat$ItemReceiver;
    private long MediaBrowserCompat$MediaItem;
    private int write = (length() - 1);

    public final boolean IconCompatParcelizer(E e) {
        if (e != null) {
            int i = this.write;
            long j = this.IconCompatParcelizer.get();
            int i2 = ((int) j) & i;
            if (j >= this.MediaBrowserCompat$MediaItem) {
                long j2 = ((long) this.MediaBrowserCompat$ItemReceiver) + j;
                if (get(i & ((int) j2)) == null) {
                    this.MediaBrowserCompat$MediaItem = j2;
                } else if (get(i2) != null) {
                    return false;
                }
            }
            lazySet(i2, e);
            this.IconCompatParcelizer.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final E read() {
        long j = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        int i = ((int) j) & this.write;
        E e = get(i);
        if (e == null) {
            return null;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(j + 1);
        lazySet(i, (Object) null);
        return e;
    }

    public final boolean write() {
        return this.IconCompatParcelizer.get() == this.MediaBrowserCompat$CustomActionResultReceiver.get();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        while (true) {
            if (read() == null) {
                if (this.IconCompatParcelizer.get() == this.MediaBrowserCompat$CustomActionResultReceiver.get()) {
                    return;
                }
            }
        }
    }

    public HmlBaseConsentActivity(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.MediaBrowserCompat$ItemReceiver = Math.min(i / 4, read.intValue());
    }
}
