package p040o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.NtbDiscoverActivity */
public final class NtbDiscoverActivity<T> implements Iterator<T>, FundOnboardingSuccessActivity_ViewBinding {
    private int IconCompatParcelizer;
    private final T[] MediaBrowserCompat$ItemReceiver;

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public NtbDiscoverActivity(T[] tArr) {
        onGetStartedClick.write((Object) tArr, "array");
        this.MediaBrowserCompat$ItemReceiver = tArr;
    }

    public final boolean hasNext() {
        return this.IconCompatParcelizer < this.MediaBrowserCompat$ItemReceiver.length;
    }

    public final T next() {
        try {
            T[] tArr = this.MediaBrowserCompat$ItemReceiver;
            int i = this.IconCompatParcelizer;
            this.IconCompatParcelizer = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.IconCompatParcelizer--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
