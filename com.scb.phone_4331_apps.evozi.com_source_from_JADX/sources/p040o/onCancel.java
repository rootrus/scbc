package p040o;

import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: o.onCancel */
final class onCancel<T> extends AbstractList<T> implements RandomAccess {
    private final T[] MediaBrowserCompat$CustomActionResultReceiver;

    onCancel(T[] tArr) {
        this.MediaBrowserCompat$CustomActionResultReceiver = tArr;
    }

    public final T get(int i) {
        return this.MediaBrowserCompat$CustomActionResultReceiver[i];
    }

    public final int size() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.length;
    }

    public final boolean contains(Object obj) {
        for (T t : this.MediaBrowserCompat$CustomActionResultReceiver) {
            if (t == obj) {
                return true;
            }
        }
        return false;
    }
}
