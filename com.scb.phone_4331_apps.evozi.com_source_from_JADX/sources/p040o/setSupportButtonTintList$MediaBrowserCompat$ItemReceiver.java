package p040o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p040o.setSupportButtonTintList;

/* renamed from: o.setSupportButtonTintList$MediaBrowserCompat$ItemReceiver */
final class setSupportButtonTintList$MediaBrowserCompat$ItemReceiver implements Set<K> {
    final /* synthetic */ setSupportButtonTintList IconCompatParcelizer;

    setSupportButtonTintList$MediaBrowserCompat$ItemReceiver(setSupportButtonTintList setsupportbuttontintlist) {
        this.IconCompatParcelizer = setsupportbuttontintlist;
    }

    public final boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.IconCompatParcelizer.read();
    }

    public final boolean contains(Object obj) {
        return this.IconCompatParcelizer.IconCompatParcelizer(obj) >= 0;
    }

    public final boolean containsAll(Collection<?> collection) {
        Map MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        for (Object containsKey : collection) {
            if (!MediaBrowserCompat$ItemReceiver.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver() == 0;
    }

    public final Iterator<K> iterator() {
        return new setSupportButtonTintList.IconCompatParcelizer(0);
    }

    public final boolean remove(Object obj) {
        int IconCompatParcelizer2 = this.IconCompatParcelizer.IconCompatParcelizer(obj);
        if (IconCompatParcelizer2 < 0) {
            return false;
        }
        this.IconCompatParcelizer.read(IconCompatParcelizer2);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        Map MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        int size = MediaBrowserCompat$ItemReceiver.size();
        for (Object remove : collection) {
            MediaBrowserCompat$ItemReceiver.remove(remove);
        }
        return size != MediaBrowserCompat$ItemReceiver.size();
    }

    public final boolean retainAll(Collection<?> collection) {
        return setSupportButtonTintList.write(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(), collection);
    }

    public final int size() {
        return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final Object[] toArray() {
        return this.IconCompatParcelizer.write(0);
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(tArr, 0);
    }

    public final boolean equals(Object obj) {
        return setSupportButtonTintList.IconCompatParcelizer(this, obj);
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        for (int MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver() - 1; MediaBrowserCompat$CustomActionResultReceiver >= 0; MediaBrowserCompat$CustomActionResultReceiver--) {
            Object read = this.IconCompatParcelizer.read(MediaBrowserCompat$CustomActionResultReceiver, 0);
            if (read == null) {
                i = 0;
            } else {
                i = read.hashCode();
            }
            i2 += i;
        }
        return i2;
    }
}
