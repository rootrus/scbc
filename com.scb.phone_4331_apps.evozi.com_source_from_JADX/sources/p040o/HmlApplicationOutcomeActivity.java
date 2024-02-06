package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.HmlApplicationOutcomeActivity */
public final class HmlApplicationOutcomeActivity<T> implements HmlLoanOfferStatusDeepLinkBaseActivity<T> {
    private final AtomicReference<C9754xd7f8c0e5<T>> MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>();
    private final AtomicReference<C9754xd7f8c0e5<T>> write = new AtomicReference<>();

    public HmlApplicationOutcomeActivity() {
        C9754xd7f8c0e5 hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver = new C9754xd7f8c0e5();
        this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver);
        this.write.getAndSet(hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final boolean IconCompatParcelizer(T t) {
        if (t != null) {
            C9754xd7f8c0e5 hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver = new C9754xd7f8c0e5(t);
            this.write.getAndSet(hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver).lazySet(hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        boolean z;
        while (read() != null) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.get() == this.write.get()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return;
            }
        }
    }

    public final boolean write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.get() == this.write.get();
    }

    public final T read() {
        C9754xd7f8c0e5 hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver;
        C9754xd7f8c0e5 hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        C9754xd7f8c0e5 hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver3 = (C9754xd7f8c0e5) hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver2.get();
        if (hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver3 != null) {
            Object obj = hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver;
            hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver3.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver3);
            return obj;
        } else if (hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver2 == this.write.get()) {
            return null;
        } else {
            do {
                hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver = (C9754xd7f8c0e5) hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver2.get();
            } while (hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver == null);
            Object obj2 = hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.lazySet(hmlApplicationOutcomeActivity$MediaBrowserCompat$CustomActionResultReceiver);
            return obj2;
        }
    }
}
