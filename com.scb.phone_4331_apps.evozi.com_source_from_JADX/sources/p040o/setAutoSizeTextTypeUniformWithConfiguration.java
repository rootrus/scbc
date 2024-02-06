package p040o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.setAutoSizeTextTypeUniformWithConfiguration */
public final class setAutoSizeTextTypeUniformWithConfiguration<E> implements Collection<E>, Set<E> {
    private static final Object[] IconCompatParcelizer = new Object[0];
    private static Object[] MediaBrowserCompat$CustomActionResultReceiver;
    private static int MediaBrowserCompat$MediaItem;
    private static int MediaBrowserCompat$SearchResultReceiver;
    private static Object[] MediaMetadataCompat;
    private static final int[] read = new int[0];
    public Object[] MediaBrowserCompat$ItemReceiver;
    private setSupportButtonTintList<E, E> MediaDescriptionCompat;
    private int[] RatingCompat;
    int write;

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$ItemReceiver(Object obj, int i) {
        int i2 = this.write;
        if (i2 == 0) {
            return -1;
        }
        int write2 = setAutoSizeTextTypeUniformWithPresetSizes.write(this.RatingCompat, i2, i);
        if (write2 < 0 || obj.equals(this.MediaBrowserCompat$ItemReceiver[write2])) {
            return write2;
        }
        int i3 = write2 + 1;
        while (i3 < i2 && this.RatingCompat[i3] == i) {
            if (obj.equals(this.MediaBrowserCompat$ItemReceiver[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = write2 - 1;
        while (i4 >= 0 && this.RatingCompat[i4] == i) {
            if (obj.equals(this.MediaBrowserCompat$ItemReceiver[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$ItemReceiver() {
        int i = this.write;
        if (i == 0) {
            return -1;
        }
        int write2 = setAutoSizeTextTypeUniformWithPresetSizes.write(this.RatingCompat, i, 0);
        if (write2 < 0 || this.MediaBrowserCompat$ItemReceiver[write2] == null) {
            return write2;
        }
        int i2 = write2 + 1;
        while (i2 < i && this.RatingCompat[i2] == 0) {
            if (this.MediaBrowserCompat$ItemReceiver[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = write2 - 1;
        while (i3 >= 0 && this.RatingCompat[i3] == 0) {
            if (this.MediaBrowserCompat$ItemReceiver[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    private void IconCompatParcelizer(int i) {
        Class<setAutoSizeTextTypeUniformWithConfiguration> cls = setAutoSizeTextTypeUniformWithConfiguration.class;
        if (i == 8) {
            synchronized (cls) {
                if (MediaMetadataCompat != null) {
                    Object[] objArr = MediaMetadataCompat;
                    this.MediaBrowserCompat$ItemReceiver = objArr;
                    MediaMetadataCompat = (Object[]) objArr[0];
                    this.RatingCompat = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    MediaBrowserCompat$MediaItem--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                    Object[] objArr2 = MediaBrowserCompat$CustomActionResultReceiver;
                    this.MediaBrowserCompat$ItemReceiver = objArr2;
                    MediaBrowserCompat$CustomActionResultReceiver = (Object[]) objArr2[0];
                    this.RatingCompat = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    MediaBrowserCompat$SearchResultReceiver--;
                    return;
                }
            }
        }
        this.RatingCompat = new int[i];
        this.MediaBrowserCompat$ItemReceiver = new Object[i];
    }

    private static void IconCompatParcelizer(int[] iArr, Object[] objArr, int i) {
        Class<setAutoSizeTextTypeUniformWithConfiguration> cls = setAutoSizeTextTypeUniformWithConfiguration.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (MediaBrowserCompat$MediaItem < 10) {
                    objArr[0] = MediaMetadataCompat;
                    objArr[1] = iArr;
                    while (true) {
                        i--;
                        if (i < 2) {
                            break;
                        }
                        objArr[i] = null;
                    }
                    MediaMetadataCompat = objArr;
                    MediaBrowserCompat$MediaItem++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (MediaBrowserCompat$SearchResultReceiver < 10) {
                    objArr[0] = MediaBrowserCompat$CustomActionResultReceiver;
                    objArr[1] = iArr;
                    while (true) {
                        i--;
                        if (i < 2) {
                            break;
                        }
                        objArr[i] = null;
                    }
                    MediaBrowserCompat$CustomActionResultReceiver = objArr;
                    MediaBrowserCompat$SearchResultReceiver++;
                }
            }
        }
    }

    public setAutoSizeTextTypeUniformWithConfiguration() {
        this(0);
    }

    public setAutoSizeTextTypeUniformWithConfiguration(int i) {
        if (i == 0) {
            this.RatingCompat = read;
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        } else {
            IconCompatParcelizer(i);
        }
        this.write = 0;
    }

    public final void clear() {
        int i = this.write;
        if (i != 0) {
            IconCompatParcelizer(this.RatingCompat, this.MediaBrowserCompat$ItemReceiver, i);
            this.RatingCompat = read;
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
            this.write = 0;
        }
    }

    public final boolean isEmpty() {
        return this.write <= 0;
    }

    public final boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = MediaBrowserCompat$ItemReceiver();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = MediaBrowserCompat$ItemReceiver(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.write;
        if (i4 >= this.RatingCompat.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            int[] iArr = this.RatingCompat;
            Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
            IconCompatParcelizer(i5);
            int[] iArr2 = this.RatingCompat;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.MediaBrowserCompat$ItemReceiver, 0, objArr.length);
            }
            IconCompatParcelizer(iArr, objArr, this.write);
        }
        int i6 = this.write;
        if (i3 < i6) {
            int[] iArr3 = this.RatingCompat;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.MediaBrowserCompat$ItemReceiver;
            System.arraycopy(objArr2, i3, objArr2, i7, this.write - i3);
        }
        this.RatingCompat[i3] = i;
        this.MediaBrowserCompat$ItemReceiver[i3] = e;
        this.write++;
        return true;
    }

    public final E MediaBrowserCompat$ItemReceiver(int i) {
        E[] eArr = this.MediaBrowserCompat$ItemReceiver;
        E e = eArr[i];
        int i2 = this.write;
        if (i2 <= 1) {
            IconCompatParcelizer(this.RatingCompat, eArr, i2);
            this.RatingCompat = read;
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
            this.write = 0;
        } else {
            int[] iArr = this.RatingCompat;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = this.write - 1;
                this.write = i4;
                if (i < i4) {
                    int[] iArr2 = this.RatingCompat;
                    int i5 = i + 1;
                    System.arraycopy(iArr2, i5, iArr2, i, i4 - i);
                    Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
                    System.arraycopy(objArr, i5, objArr, i, this.write - i);
                }
                this.MediaBrowserCompat$ItemReceiver[this.write] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                int[] iArr3 = this.RatingCompat;
                Object[] objArr2 = this.MediaBrowserCompat$ItemReceiver;
                IconCompatParcelizer(i3);
                this.write--;
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.RatingCompat, 0, i);
                    System.arraycopy(objArr2, 0, this.MediaBrowserCompat$ItemReceiver, 0, i);
                }
                int i6 = this.write;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr3, i7, this.RatingCompat, i, i6 - i);
                    System.arraycopy(objArr2, i7, this.MediaBrowserCompat$ItemReceiver, i, this.write - i);
                }
            }
        }
        return e;
    }

    public final int size() {
        return this.write;
    }

    public final Object[] toArray() {
        int i = this.write;
        Object[] objArr = new Object[i];
        System.arraycopy(this.MediaBrowserCompat$ItemReceiver, 0, objArr, 0, i);
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.write) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.write);
        }
        System.arraycopy(this.MediaBrowserCompat$ItemReceiver, 0, tArr, 0, this.write);
        int length = tArr.length;
        int i = this.write;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.write) {
                try {
                    if (!set.contains(this.MediaBrowserCompat$ItemReceiver[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.RatingCompat;
        int i = this.write;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.write * 14);
        sb.append('{');
        for (int i = 0; i < this.write; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.MediaBrowserCompat$ItemReceiver[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.write + collection.size();
        int[] iArr = this.RatingCompat;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
            IconCompatParcelizer(size);
            int i = this.write;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.RatingCompat, 0, i);
                System.arraycopy(objArr, 0, this.MediaBrowserCompat$ItemReceiver, 0, this.write);
            }
            IconCompatParcelizer(iArr, objArr, this.write);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.write - 1; i >= 0; i--) {
            if (!collection.contains(this.MediaBrowserCompat$ItemReceiver[i])) {
                MediaBrowserCompat$ItemReceiver(i);
                z = true;
            }
        }
        return z;
    }

    public final boolean contains(Object obj) {
        return (obj == null ? MediaBrowserCompat$ItemReceiver() : MediaBrowserCompat$ItemReceiver(obj, obj.hashCode())) >= 0;
    }

    public final Iterator<E> iterator() {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new setSupportButtonTintList<E, E>() {
                /* access modifiers changed from: protected */
                public final int MediaBrowserCompat$CustomActionResultReceiver() {
                    return setAutoSizeTextTypeUniformWithConfiguration.this.write;
                }

                /* access modifiers changed from: protected */
                public final Object read(int i, int i2) {
                    return setAutoSizeTextTypeUniformWithConfiguration.this.MediaBrowserCompat$ItemReceiver[i];
                }

                /* access modifiers changed from: protected */
                public final int IconCompatParcelizer(Object obj) {
                    setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration = setAutoSizeTextTypeUniformWithConfiguration.this;
                    return obj == null ? setautosizetexttypeuniformwithconfiguration.MediaBrowserCompat$ItemReceiver() : setautosizetexttypeuniformwithconfiguration.MediaBrowserCompat$ItemReceiver(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                public final int MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
                    setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration = setAutoSizeTextTypeUniformWithConfiguration.this;
                    return obj == null ? setautosizetexttypeuniformwithconfiguration.MediaBrowserCompat$ItemReceiver() : setautosizetexttypeuniformwithconfiguration.MediaBrowserCompat$ItemReceiver(obj, obj.hashCode());
                }

                /* access modifiers changed from: protected */
                public final Map<E, E> MediaBrowserCompat$ItemReceiver() {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                public final void MediaBrowserCompat$CustomActionResultReceiver(E e, E e2) {
                    setAutoSizeTextTypeUniformWithConfiguration.this.add(e);
                }

                /* access modifiers changed from: protected */
                public final E MediaBrowserCompat$CustomActionResultReceiver(int i, E e) {
                    throw new UnsupportedOperationException("not a map");
                }

                /* access modifiers changed from: protected */
                public final void read(int i) {
                    setAutoSizeTextTypeUniformWithConfiguration.this.MediaBrowserCompat$ItemReceiver(i);
                }

                /* access modifiers changed from: protected */
                public final void read() {
                    setAutoSizeTextTypeUniformWithConfiguration.this.clear();
                }
            };
        }
        setSupportButtonTintList<E, E> setsupportbuttontintlist = this.MediaDescriptionCompat;
        if (setsupportbuttontintlist.IconCompatParcelizer == null) {
            setsupportbuttontintlist.IconCompatParcelizer = new setSupportButtonTintList$MediaBrowserCompat$ItemReceiver(setsupportbuttontintlist);
        }
        return setsupportbuttontintlist.IconCompatParcelizer.iterator();
    }

    public final boolean remove(Object obj) {
        int i;
        if (obj == null) {
            i = MediaBrowserCompat$ItemReceiver();
        } else {
            i = MediaBrowserCompat$ItemReceiver(obj, obj.hashCode());
        }
        if (i < 0) {
            return false;
        }
        MediaBrowserCompat$ItemReceiver(i);
        return true;
    }
}
