package p040o;

import java.util.Collection;
import java.util.Iterator;
import p040o.setSupportButtonTintList;

/* renamed from: o.setSupportButtonTintList$MediaBrowserCompat$CustomActionResultReceiver */
final class C1548xcb723485 implements Collection<V> {
    final /* synthetic */ setSupportButtonTintList MediaBrowserCompat$CustomActionResultReceiver;

    C1548xcb723485(setSupportButtonTintList setsupportbuttontintlist) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setsupportbuttontintlist;
    }

    public final boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.MediaBrowserCompat$CustomActionResultReceiver.read();
    }

    public final boolean contains(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(obj) >= 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver() == 0;
    }

    public final Iterator<V> iterator() {
        return new setSupportButtonTintList.IconCompatParcelizer(1);
    }

    public final boolean remove(Object obj) {
        int MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(obj);
        if (MediaBrowserCompat$CustomActionResultReceiver2 < 0) {
            return false;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.read(MediaBrowserCompat$CustomActionResultReceiver2);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        int MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        int i = 0;
        boolean z = false;
        while (i < MediaBrowserCompat$CustomActionResultReceiver2) {
            if (collection.contains(this.MediaBrowserCompat$CustomActionResultReceiver.read(i, 1))) {
                this.MediaBrowserCompat$CustomActionResultReceiver.read(i);
                i--;
                MediaBrowserCompat$CustomActionResultReceiver2--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        int MediaBrowserCompat$CustomActionResultReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        int i = 0;
        boolean z = false;
        while (i < MediaBrowserCompat$CustomActionResultReceiver2) {
            if (!collection.contains(this.MediaBrowserCompat$CustomActionResultReceiver.read(i, 1))) {
                this.MediaBrowserCompat$CustomActionResultReceiver.read(i);
                i--;
                MediaBrowserCompat$CustomActionResultReceiver2--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final int size() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final Object[] toArray() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.write(1);
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(tArr, 1);
    }
}
