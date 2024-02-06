package p040o;

import java.util.Iterator;

/* renamed from: o.getTargetFragment */
public final class getTargetFragment<T> extends getContext<T> {
    private final Iterator<? extends T> MediaBrowserCompat$ItemReceiver;
    private final getAllowReturnTransitionOverlap<? super T> write;

    public getTargetFragment(Iterator<? extends T> it, getAllowReturnTransitionOverlap<? super T> getallowreturntransitionoverlap) {
        this.MediaBrowserCompat$ItemReceiver = it;
        this.write = getallowreturntransitionoverlap;
    }

    public final void write() {
        boolean z;
        if (this.MediaBrowserCompat$ItemReceiver.hasNext()) {
            getAllowReturnTransitionOverlap<? super T> getallowreturntransitionoverlap = this.write;
            T next = this.MediaBrowserCompat$ItemReceiver.next();
            this.read = next;
            if (getallowreturntransitionoverlap.write(next)) {
                z = true;
                this.IconCompatParcelizer = z;
            }
        }
        z = false;
        this.IconCompatParcelizer = z;
    }
}
