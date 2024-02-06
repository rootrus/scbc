package p040o;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: o.setOnSnapPositionChangeListener */
public final class setOnSnapPositionChangeListener<E> extends Cdefault<E> {
    private static final Integer write = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private AtomicLong IconCompatParcelizer = new AtomicLong();
    private int MediaBrowserCompat$ItemReceiver;
    private long MediaBrowserCompat$SearchResultReceiver;
    private AtomicLong RatingCompat = new AtomicLong();

    /* renamed from: o.setOnSnapPositionChangeListener$default  reason: invalid class name */
    abstract class Cdefault<E> extends AbstractQueue<E> {
        protected final int MediaBrowserCompat$CustomActionResultReceiver;
        protected final AtomicReferenceArray<E> read;

        public Cdefault(int i) {
            int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
            this.MediaBrowserCompat$CustomActionResultReceiver = numberOfLeadingZeros - 1;
            this.read = new AtomicReferenceArray<>(numberOfLeadingZeros);
        }

        public Iterator<E> iterator() {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            while (true) {
                if (poll() == null && isEmpty()) {
                    return;
                }
            }
        }

        /* access modifiers changed from: protected */
        public final int MediaBrowserCompat$CustomActionResultReceiver(long j) {
            return ((int) j) & this.MediaBrowserCompat$CustomActionResultReceiver;
        }

        /* access modifiers changed from: protected */
        public final E MediaBrowserCompat$CustomActionResultReceiver(int i) {
            return this.read.get(i);
        }
    }

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public setOnSnapPositionChangeListener(int i) {
        super(i);
        this.MediaBrowserCompat$ItemReceiver = Math.min(i / 4, write.intValue());
    }

    public final boolean offer(E e) {
        if (e != null) {
            AtomicReferenceArray<E> atomicReferenceArray = this.read;
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            long j = this.RatingCompat.get();
            int i2 = ((int) j) & i;
            if (j >= this.MediaBrowserCompat$SearchResultReceiver) {
                long j2 = ((long) this.MediaBrowserCompat$ItemReceiver) + j;
                if (atomicReferenceArray.get(i & ((int) j2)) == null) {
                    this.MediaBrowserCompat$SearchResultReceiver = j2;
                } else if (atomicReferenceArray.get(i2) != null) {
                    return false;
                }
            }
            atomicReferenceArray.lazySet(i2, e);
            this.RatingCompat.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final E poll() {
        long j = this.IconCompatParcelizer.get();
        int MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(j);
        AtomicReferenceArray<E> atomicReferenceArray = this.read;
        E e = atomicReferenceArray.get(MediaBrowserCompat$CustomActionResultReceiver);
        if (e == null) {
            return null;
        }
        atomicReferenceArray.lazySet(MediaBrowserCompat$CustomActionResultReceiver, (Object) null);
        this.IconCompatParcelizer.lazySet(j + 1);
        return e;
    }

    public final E peek() {
        return MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.get()));
    }

    public final boolean isEmpty() {
        return this.RatingCompat.get() == this.IconCompatParcelizer.get();
    }

    public final int size() {
        long j = this.IconCompatParcelizer.get();
        while (true) {
            long j2 = this.RatingCompat.get();
            long j3 = this.IconCompatParcelizer.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }
}
