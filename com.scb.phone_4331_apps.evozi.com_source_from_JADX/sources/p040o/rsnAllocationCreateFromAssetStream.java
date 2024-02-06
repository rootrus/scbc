package p040o;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: o.rsnAllocationCreateFromAssetStream */
public class rsnAllocationCreateFromAssetStream<K, V> extends AbstractMap<K, V> implements Cloneable {
    int MediaBrowserCompat$CustomActionResultReceiver;
    Object[] MediaBrowserCompat$ItemReceiver;

    public static <K, V> rsnAllocationCreateFromAssetStream<K, V> MediaBrowserCompat$CustomActionResultReceiver() {
        return new rsnAllocationCreateFromAssetStream<>();
    }

    public final int size() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final V IconCompatParcelizer(int i) {
        int i2;
        if (i < 0 || i >= this.MediaBrowserCompat$CustomActionResultReceiver || (i2 = (i << 1) + 1) < 0) {
            return null;
        }
        return this.MediaBrowserCompat$ItemReceiver[i2];
    }

    public final V MediaBrowserCompat$ItemReceiver(int i, V v) {
        V v2;
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = (i << 1) + 1;
        if (i3 < 0) {
            v2 = null;
        } else {
            v2 = this.MediaBrowserCompat$ItemReceiver[i3];
        }
        this.MediaBrowserCompat$ItemReceiver[i3] = v;
        return v2;
    }

    public final boolean containsKey(Object obj) {
        return -2 != IconCompatParcelizer(obj);
    }

    public final V get(Object obj) {
        int IconCompatParcelizer = IconCompatParcelizer(obj) + 1;
        if (IconCompatParcelizer < 0) {
            return null;
        }
        return this.MediaBrowserCompat$ItemReceiver[IconCompatParcelizer];
    }

    public final V remove(Object obj) {
        return read(IconCompatParcelizer(obj));
    }

    private int IconCompatParcelizer(Object obj) {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        while (i2 < (i << 1)) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return i2;
        }
        return -2;
    }

    /* access modifiers changed from: package-private */
    public final V read(int i) {
        V v;
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver << 1;
        if (i < 0 || i >= i2) {
            return null;
        }
        int i3 = i + 1;
        if (i3 < 0) {
            v = null;
        } else {
            v = this.MediaBrowserCompat$ItemReceiver[i3];
        }
        Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
        int i4 = (i2 - i) - 2;
        if (i4 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i4);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver--;
        int i5 = i2 - 2;
        Object[] objArr2 = this.MediaBrowserCompat$ItemReceiver;
        objArr2[i5] = null;
        objArr2[i5 + 1] = null;
        return v;
    }

    public void clear() {
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    public final boolean containsValue(Object obj) {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 1;
        while (i2 < (i << 1)) {
            Object obj2 = objArr[i2];
            if (obj == null) {
                if (obj2 != null) {
                    i2 += 2;
                }
            } else if (!obj.equals(obj2)) {
                i2 += 2;
            }
            return true;
        }
        return false;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return new write();
    }

    /* renamed from: IconCompatParcelizer */
    public final rsnAllocationCreateFromAssetStream<K, V> clone() {
        try {
            rsnAllocationCreateFromAssetStream<K, V> rsnallocationcreatefromassetstream = (rsnAllocationCreateFromAssetStream) super.clone();
            Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                rsnallocationcreatefromassetstream.MediaBrowserCompat$ItemReceiver = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return rsnallocationcreatefromassetstream;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: o.rsnAllocationCreateFromAssetStream$write */
    final class write extends AbstractSet<Map.Entry<K, V>> {
        write() {
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C10127x542f38f9(rsnAllocationCreateFromAssetStream.this);
        }

        public final int size() {
            return rsnAllocationCreateFromAssetStream.this.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    public final V put(K k, V v) {
        int i;
        int IconCompatParcelizer = IconCompatParcelizer((Object) k) >> 1;
        if (IconCompatParcelizer == -1) {
            IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (IconCompatParcelizer >= 0) {
            int i2 = IconCompatParcelizer + 1;
            if (i2 >= 0) {
                Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
                int i3 = i2 << 1;
                if (objArr == null) {
                    i = 0;
                } else {
                    i = objArr.length;
                }
                V v2 = null;
                if (i3 > i) {
                    int i4 = ((i / 2) * 3) + 1;
                    if (i4 % 2 != 0) {
                        i4++;
                    }
                    if (i4 >= i3) {
                        i3 = i4;
                    }
                    if (i3 == 0) {
                        this.MediaBrowserCompat$ItemReceiver = null;
                    } else {
                        int i5 = this.MediaBrowserCompat$CustomActionResultReceiver;
                        Object[] objArr2 = this.MediaBrowserCompat$ItemReceiver;
                        if (i5 == 0 || i3 != objArr2.length) {
                            Object[] objArr3 = new Object[i3];
                            this.MediaBrowserCompat$ItemReceiver = objArr3;
                            if (i5 != 0) {
                                System.arraycopy(objArr2, 0, objArr3, 0, i5 << 1);
                            }
                        }
                    }
                }
                int i6 = IconCompatParcelizer << 1;
                int i7 = i6 + 1;
                if (i7 >= 0) {
                    v2 = this.MediaBrowserCompat$ItemReceiver[i7];
                }
                Object[] objArr4 = this.MediaBrowserCompat$ItemReceiver;
                objArr4[i6] = k;
                objArr4[i7] = v;
                if (i2 > this.MediaBrowserCompat$CustomActionResultReceiver) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = i2;
                }
                return v2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }
}
