package p040o;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: o.setImageHeight */
public final class setImageHeight<T> implements Queue<T> {
    private final int MediaBrowserCompat$ItemReceiver;
    private final LinkedList<T> read;

    public setImageHeight() {
        this.read = new LinkedList<>();
        this.MediaBrowserCompat$ItemReceiver = -1;
    }

    public setImageHeight(int i) {
        this.read = new LinkedList<>();
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this) {
            isEmpty = this.read.isEmpty();
        }
        return isEmpty;
    }

    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this) {
            contains = this.read.contains(obj);
        }
        return contains;
    }

    public final Iterator<T> iterator() {
        Iterator<T> it;
        synchronized (this) {
            it = this.read.iterator();
        }
        return it;
    }

    public final int size() {
        int size;
        synchronized (this) {
            size = this.read.size();
        }
        return size;
    }

    public final boolean add(T t) {
        boolean add;
        synchronized (this) {
            add = this.read.add(t);
        }
        return add;
    }

    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this) {
            remove = this.read.remove(obj);
        }
        return remove;
    }

    public final boolean containsAll(Collection<?> collection) {
        boolean containsAll;
        synchronized (this) {
            containsAll = this.read.containsAll(collection);
        }
        return containsAll;
    }

    public final boolean addAll(Collection<? extends T> collection) {
        boolean addAll;
        synchronized (this) {
            addAll = this.read.addAll(collection);
        }
        return addAll;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean removeAll;
        synchronized (this) {
            removeAll = this.read.removeAll(collection);
        }
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean retainAll;
        synchronized (this) {
            retainAll = this.read.retainAll(collection);
        }
        return retainAll;
    }

    public final void clear() {
        synchronized (this) {
            this.read.clear();
        }
    }

    public final String toString() {
        String obj;
        synchronized (this) {
            obj = this.read.toString();
        }
        return obj;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setImageHeight setimageheight = (setImageHeight) obj;
        LinkedList<T> linkedList = this.read;
        if (linkedList == null) {
            if (setimageheight.read != null) {
                return false;
            }
        } else if (!linkedList.equals(setimageheight.read)) {
            return false;
        }
        return true;
    }

    public final T peek() {
        T peek;
        synchronized (this) {
            peek = this.read.peek();
        }
        return peek;
    }

    public final T element() {
        T element;
        synchronized (this) {
            element = this.read.element();
        }
        return element;
    }

    public final T poll() {
        T poll;
        synchronized (this) {
            poll = this.read.poll();
        }
        return poll;
    }

    public final T remove() {
        T remove;
        synchronized (this) {
            remove = this.read.remove();
        }
        return remove;
    }

    public final boolean offer(T t) {
        synchronized (this) {
            if (this.MediaBrowserCompat$ItemReceiver >= 0) {
                if (this.read.size() + 1 > this.MediaBrowserCompat$ItemReceiver) {
                    return false;
                }
            }
            boolean offer = this.read.offer(t);
            return offer;
        }
    }

    public final Object clone() {
        setImageHeight setimageheight;
        synchronized (this) {
            setimageheight = new setImageHeight(this.MediaBrowserCompat$ItemReceiver);
            setimageheight.addAll(this.read);
        }
        return setimageheight;
    }

    public final Object[] toArray() {
        Object[] array;
        synchronized (this) {
            array = this.read.toArray();
        }
        return array;
    }

    public final <R> R[] toArray(R[] rArr) {
        R[] array;
        synchronized (this) {
            array = this.read.toArray(rArr);
        }
        return array;
    }
}
