package p040o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: o.HmlBaseEmailAboutActivity */
public final class HmlBaseEmailAboutActivity<T> implements HmlLoanOfferStatusDeepLinkBaseActivity<T> {
    private static int read = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object write = new Object();
    private AtomicReferenceArray<Object> IconCompatParcelizer;
    public final AtomicLong MediaBrowserCompat$CustomActionResultReceiver = new AtomicLong();
    public final AtomicLong MediaBrowserCompat$ItemReceiver = new AtomicLong();
    private int MediaBrowserCompat$MediaItem;
    private long MediaBrowserCompat$SearchResultReceiver;
    private int MediaDescriptionCompat;
    private AtomicReferenceArray<Object> MediaMetadataCompat;
    private int RatingCompat;

    public HmlBaseEmailAboutActivity(int i) {
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i2 = numberOfLeadingZeros - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(numberOfLeadingZeros + 1);
        this.MediaMetadataCompat = atomicReferenceArray;
        this.MediaBrowserCompat$MediaItem = i2;
        this.RatingCompat = Math.min(numberOfLeadingZeros / 4, read);
        this.IconCompatParcelizer = atomicReferenceArray;
        this.MediaDescriptionCompat = i2;
        this.MediaBrowserCompat$SearchResultReceiver = (long) (i2 - 1);
        this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(0);
    }

    public final boolean IconCompatParcelizer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.MediaMetadataCompat;
            long j = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            int i = this.MediaBrowserCompat$MediaItem;
            int i2 = ((int) j) & i;
            if (j < this.MediaBrowserCompat$SearchResultReceiver) {
                atomicReferenceArray.lazySet(i2, t);
                this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(j + 1);
                return true;
            }
            long j2 = ((long) this.RatingCompat) + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                this.MediaBrowserCompat$SearchResultReceiver = j2 - 1;
                atomicReferenceArray.lazySet(i2, t);
                this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(j + 1);
                return true;
            }
            long j3 = 1 + j;
            if (atomicReferenceArray.get(((int) j3) & i) == null) {
                atomicReferenceArray.lazySet(i2, t);
                this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(j3);
                return true;
            }
            MediaBrowserCompat$CustomActionResultReceiver(atomicReferenceArray, j, i2, t, (long) i);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.MediaMetadataCompat = atomicReferenceArray2;
        this.MediaBrowserCompat$SearchResultReceiver = (j2 + j) - 1;
        atomicReferenceArray2.lazySet(i, t);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i, write);
        this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(j + 1);
    }

    public final T read() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.IconCompatParcelizer;
        long j = this.MediaBrowserCompat$ItemReceiver.get();
        int i = this.MediaDescriptionCompat;
        int i2 = ((int) j) & i;
        T t = atomicReferenceArray.get(i2);
        boolean z = t == write;
        if (t != null && !z) {
            atomicReferenceArray.lazySet(i2, (Object) null);
            this.MediaBrowserCompat$ItemReceiver.lazySet(j + 1);
            return t;
        } else if (!z) {
            return null;
        } else {
            int i3 = i + 1;
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
            atomicReferenceArray.lazySet(i3, (Object) null);
            this.IconCompatParcelizer = atomicReferenceArray2;
            T t2 = atomicReferenceArray2.get(i2);
            if (t2 != null) {
                atomicReferenceArray2.lazySet(i2, (Object) null);
                this.MediaBrowserCompat$ItemReceiver.lazySet(j + 1);
            }
            return t2;
        }
    }

    public final T IconCompatParcelizer() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.IconCompatParcelizer;
        long j = this.MediaBrowserCompat$ItemReceiver.get();
        int i = this.MediaDescriptionCompat;
        int i2 = ((int) j) & i;
        T t = atomicReferenceArray.get(i2);
        if (t != write) {
            return t;
        }
        int i3 = i + 1;
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i3);
        atomicReferenceArray.lazySet(i3, (Object) null);
        this.IconCompatParcelizer = atomicReferenceArray2;
        return atomicReferenceArray2.get(i2);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        while (true) {
            if (read() == null) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver.get() == this.MediaBrowserCompat$ItemReceiver.get()) {
                    return;
                }
            }
        }
    }

    public final boolean read(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.MediaMetadataCompat;
        long j = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        int i = this.MediaBrowserCompat$MediaItem;
        long j2 = 2 + j;
        if (atomicReferenceArray.get(((int) j2) & i) == null) {
            int i2 = ((int) j) & i;
            atomicReferenceArray.lazySet(i2 + 1, t2);
            atomicReferenceArray.lazySet(i2, t);
            this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(j2);
        } else {
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.MediaMetadataCompat = atomicReferenceArray2;
            int i3 = ((int) j) & i;
            atomicReferenceArray2.lazySet(i3 + 1, t2);
            atomicReferenceArray2.lazySet(i3, t);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i3, write);
            this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(j2);
        }
        return true;
    }

    public final boolean write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.get() == this.MediaBrowserCompat$ItemReceiver.get();
    }
}
