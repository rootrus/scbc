package p040o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.setSupportButtonTintList */
public abstract class setSupportButtonTintList<K, V> {
    setSupportButtonTintList<K, V>.ItemReceiver IconCompatParcelizer;
    setSupportButtonTintList<K, V>.read MediaBrowserCompat$CustomActionResultReceiver;
    setSupportButtonTintList<K, V>.CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

    /* access modifiers changed from: protected */
    public abstract int IconCompatParcelizer(Object obj);

    /* access modifiers changed from: protected */
    public abstract int MediaBrowserCompat$CustomActionResultReceiver();

    /* access modifiers changed from: protected */
    public abstract int MediaBrowserCompat$CustomActionResultReceiver(Object obj);

    /* access modifiers changed from: protected */
    public abstract V MediaBrowserCompat$CustomActionResultReceiver(int i, V v);

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$CustomActionResultReceiver(K k, V v);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> MediaBrowserCompat$ItemReceiver();

    /* access modifiers changed from: protected */
    public abstract Object read(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void read();

    /* access modifiers changed from: protected */
    public abstract void read(int i);

    setSupportButtonTintList() {
    }

    /* renamed from: o.setSupportButtonTintList$IconCompatParcelizer */
    final class IconCompatParcelizer<T> implements Iterator<T> {
        private boolean IconCompatParcelizer = false;
        private int MediaBrowserCompat$CustomActionResultReceiver;
        private int read;
        final int write;

        IconCompatParcelizer(int i) {
            this.write = i;
            this.read = setSupportButtonTintList.this.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final boolean hasNext() {
            return this.MediaBrowserCompat$CustomActionResultReceiver < this.read;
        }

        public final T next() {
            if (hasNext()) {
                T read2 = setSupportButtonTintList.this.read(this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
                this.MediaBrowserCompat$CustomActionResultReceiver++;
                this.IconCompatParcelizer = true;
                return read2;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.IconCompatParcelizer) {
                int i = this.MediaBrowserCompat$CustomActionResultReceiver - 1;
                this.MediaBrowserCompat$CustomActionResultReceiver = i;
                this.read--;
                this.IconCompatParcelizer = false;
                setSupportButtonTintList.this.read(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: o.setSupportButtonTintList$write */
    final class write implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        private boolean IconCompatParcelizer = false;
        private int MediaBrowserCompat$CustomActionResultReceiver;
        private int read;

        write() {
            this.read = setSupportButtonTintList.this.MediaBrowserCompat$CustomActionResultReceiver() - 1;
            this.MediaBrowserCompat$CustomActionResultReceiver = -1;
        }

        public final boolean hasNext() {
            return this.MediaBrowserCompat$CustomActionResultReceiver < this.read;
        }

        public final void remove() {
            if (this.IconCompatParcelizer) {
                setSupportButtonTintList.this.read(this.MediaBrowserCompat$CustomActionResultReceiver);
                this.MediaBrowserCompat$CustomActionResultReceiver--;
                this.read--;
                this.IconCompatParcelizer = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final K getKey() {
            if (this.IconCompatParcelizer) {
                return setSupportButtonTintList.this.read(this.MediaBrowserCompat$CustomActionResultReceiver, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.IconCompatParcelizer) {
                return setSupportButtonTintList.this.read(this.MediaBrowserCompat$CustomActionResultReceiver, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V setValue(V v) {
            if (this.IconCompatParcelizer) {
                return setSupportButtonTintList.this.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean equals(Object obj) {
            if (!this.IconCompatParcelizer) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!setAutoSizeTextTypeUniformWithPresetSizes.write(entry.getKey(), setSupportButtonTintList.this.read(this.MediaBrowserCompat$CustomActionResultReceiver, 0)) || !setAutoSizeTextTypeUniformWithPresetSizes.write(entry.getValue(), setSupportButtonTintList.this.read(this.MediaBrowserCompat$CustomActionResultReceiver, 1))) {
                    return false;
                }
                return true;
            }
        }

        public final int hashCode() {
            int i;
            if (this.IconCompatParcelizer) {
                int i2 = 0;
                Object read2 = setSupportButtonTintList.this.read(this.MediaBrowserCompat$CustomActionResultReceiver, 0);
                Object read3 = setSupportButtonTintList.this.read(this.MediaBrowserCompat$CustomActionResultReceiver, 1);
                if (read2 == null) {
                    i = 0;
                } else {
                    i = read2.hashCode();
                }
                if (read3 != null) {
                    i2 = read3.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public final /* synthetic */ Object next() {
            if (hasNext()) {
                this.MediaBrowserCompat$CustomActionResultReceiver++;
                this.IconCompatParcelizer = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: o.setSupportButtonTintList$read */
    final class read implements Set<Map.Entry<K, V>> {
        read() {
        }

        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int MediaBrowserCompat$CustomActionResultReceiver = setSupportButtonTintList.this.MediaBrowserCompat$CustomActionResultReceiver();
            for (Map.Entry entry : collection) {
                setSupportButtonTintList.this.MediaBrowserCompat$CustomActionResultReceiver(entry.getKey(), entry.getValue());
            }
            return MediaBrowserCompat$CustomActionResultReceiver != setSupportButtonTintList.this.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void clear() {
            setSupportButtonTintList.this.read();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int IconCompatParcelizer = setSupportButtonTintList.this.IconCompatParcelizer(entry.getKey());
            if (IconCompatParcelizer < 0) {
                return false;
            }
            return setAutoSizeTextTypeUniformWithPresetSizes.write(setSupportButtonTintList.this.read(IconCompatParcelizer, 1), entry.getValue());
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
            return setSupportButtonTintList.this.MediaBrowserCompat$CustomActionResultReceiver() == 0;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new write();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return setSupportButtonTintList.this.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            return setSupportButtonTintList.IconCompatParcelizer(this, obj);
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int MediaBrowserCompat$CustomActionResultReceiver = setSupportButtonTintList.this.MediaBrowserCompat$CustomActionResultReceiver() - 1; MediaBrowserCompat$CustomActionResultReceiver >= 0; MediaBrowserCompat$CustomActionResultReceiver--) {
                Object read = setSupportButtonTintList.this.read(MediaBrowserCompat$CustomActionResultReceiver, 0);
                Object read2 = setSupportButtonTintList.this.read(MediaBrowserCompat$CustomActionResultReceiver, 1);
                if (read == null) {
                    i = 0;
                } else {
                    i = read.hashCode();
                }
                if (read2 == null) {
                    i2 = 0;
                } else {
                    i2 = read2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    public static <K, V> boolean write(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public final Object[] write(int i) {
        int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        Object[] objArr = new Object[MediaBrowserCompat$CustomActionResultReceiver2];
        for (int i2 = 0; i2 < MediaBrowserCompat$CustomActionResultReceiver2; i2++) {
            objArr[i2] = read(i2, i);
        }
        return objArr;
    }

    public final <T> T[] MediaBrowserCompat$ItemReceiver(T[] tArr, int i) {
        int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (tArr.length < MediaBrowserCompat$CustomActionResultReceiver2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), MediaBrowserCompat$CustomActionResultReceiver2);
        }
        for (int i2 = 0; i2 < MediaBrowserCompat$CustomActionResultReceiver2; i2++) {
            tArr[i2] = read(i2, i);
        }
        if (tArr.length > MediaBrowserCompat$CustomActionResultReceiver2) {
            tArr[MediaBrowserCompat$CustomActionResultReceiver2] = null;
        }
        return tArr;
    }

    public static <T> boolean IconCompatParcelizer(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
