package p040o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: o.AppCompatCheckBox */
public class AppCompatCheckBox<K, V> {
    private static Object[] IconCompatParcelizer;
    private static int MediaBrowserCompat$ItemReceiver;
    private static int MediaBrowserCompat$SearchResultReceiver;
    private static Object[] write;
    int MediaBrowserCompat$CustomActionResultReceiver;
    private int[] MediaBrowserCompat$MediaItem;
    public Object[] read;

    private static int MediaBrowserCompat$ItemReceiver(int[] iArr, int i, int i2) {
        try {
            return setAutoSizeTextTypeUniformWithPresetSizes.write(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int read(Object obj, int i) {
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i2 == 0) {
            return -1;
        }
        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, i2, i);
        if (MediaBrowserCompat$ItemReceiver2 < 0 || obj.equals(this.read[MediaBrowserCompat$ItemReceiver2 << 1])) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        int i3 = MediaBrowserCompat$ItemReceiver2 + 1;
        while (i3 < i2 && this.MediaBrowserCompat$MediaItem[i3] == i) {
            if (obj.equals(this.read[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = MediaBrowserCompat$ItemReceiver2 - 1;
        while (i4 >= 0 && this.MediaBrowserCompat$MediaItem[i4] == i) {
            if (obj.equals(this.read[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public final int IconCompatParcelizer() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i == 0) {
            return -1;
        }
        int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, i, 0);
        if (MediaBrowserCompat$ItemReceiver2 < 0 || this.read[MediaBrowserCompat$ItemReceiver2 << 1] == null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        int i2 = MediaBrowserCompat$ItemReceiver2 + 1;
        while (i2 < i && this.MediaBrowserCompat$MediaItem[i2] == 0) {
            if (this.read[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = MediaBrowserCompat$ItemReceiver2 - 1;
        while (i3 >= 0 && this.MediaBrowserCompat$MediaItem[i3] == 0) {
            if (this.read[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    private void MediaBrowserCompat$ItemReceiver(int i) {
        if (i == 8) {
            synchronized (setTextAppearance.class) {
                if (write != null) {
                    Object[] objArr = write;
                    this.read = objArr;
                    write = (Object[]) objArr[0];
                    this.MediaBrowserCompat$MediaItem = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    MediaBrowserCompat$SearchResultReceiver--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (setTextAppearance.class) {
                if (IconCompatParcelizer != null) {
                    Object[] objArr2 = IconCompatParcelizer;
                    this.read = objArr2;
                    IconCompatParcelizer = (Object[]) objArr2[0];
                    this.MediaBrowserCompat$MediaItem = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    MediaBrowserCompat$ItemReceiver--;
                    return;
                }
            }
        }
        this.MediaBrowserCompat$MediaItem = new int[i];
        this.read = new Object[(i << 1)];
    }

    private static void write(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (setTextAppearance.class) {
                if (MediaBrowserCompat$SearchResultReceiver < 10) {
                    objArr[0] = write;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    write = objArr;
                    MediaBrowserCompat$SearchResultReceiver++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (setTextAppearance.class) {
                if (MediaBrowserCompat$ItemReceiver < 10) {
                    objArr[0] = IconCompatParcelizer;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    IconCompatParcelizer = objArr;
                    MediaBrowserCompat$ItemReceiver++;
                }
            }
        }
    }

    public AppCompatCheckBox() {
        this.MediaBrowserCompat$MediaItem = setAutoSizeTextTypeUniformWithPresetSizes.write;
        this.read = setAutoSizeTextTypeUniformWithPresetSizes.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
    }

    public AppCompatCheckBox(int i) {
        if (i == 0) {
            this.MediaBrowserCompat$MediaItem = setAutoSizeTextTypeUniformWithPresetSizes.write;
            this.read = setAutoSizeTextTypeUniformWithPresetSizes.read;
        } else {
            MediaBrowserCompat$ItemReceiver(i);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
    }

    public AppCompatCheckBox(AppCompatCheckBox<K, V> appCompatCheckBox) {
        this();
        if (appCompatCheckBox != null) {
            MediaBrowserCompat$ItemReceiver(appCompatCheckBox);
        }
    }

    public void clear() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i > 0) {
            int[] iArr = this.MediaBrowserCompat$MediaItem;
            Object[] objArr = this.read;
            this.MediaBrowserCompat$MediaItem = setAutoSizeTextTypeUniformWithPresetSizes.write;
            this.read = setAutoSizeTextTypeUniformWithPresetSizes.read;
            this.MediaBrowserCompat$CustomActionResultReceiver = 0;
            write(iArr, objArr, i);
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void read(int i) {
        int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int[] iArr = this.MediaBrowserCompat$MediaItem;
        if (iArr.length < i) {
            Object[] objArr = this.read;
            MediaBrowserCompat$ItemReceiver(i);
            if (this.MediaBrowserCompat$CustomActionResultReceiver > 0) {
                System.arraycopy(iArr, 0, this.MediaBrowserCompat$MediaItem, 0, i2);
                System.arraycopy(objArr, 0, this.read, 0, i2 << 1);
            }
            write(iArr, objArr, i2);
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* access modifiers changed from: package-private */
    public final int write(Object obj) {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver << 1;
        Object[] objArr = this.read;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(Object obj) {
        return write(obj) >= 0;
    }

    public V read(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.read;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    public boolean isEmpty() {
        return this.MediaBrowserCompat$CustomActionResultReceiver <= 0;
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (k == null) {
            i2 = IconCompatParcelizer();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = read((Object) k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.read;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        if (i3 >= this.MediaBrowserCompat$MediaItem.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            int[] iArr = this.MediaBrowserCompat$MediaItem;
            Object[] objArr = this.read;
            MediaBrowserCompat$ItemReceiver(i6);
            if (i3 == this.MediaBrowserCompat$CustomActionResultReceiver) {
                int[] iArr2 = this.MediaBrowserCompat$MediaItem;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.read, 0, objArr.length);
                }
                write(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.MediaBrowserCompat$MediaItem;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.read;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.MediaBrowserCompat$CustomActionResultReceiver - i5) << 1);
        }
        int i8 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i3 == i8) {
            int[] iArr4 = this.MediaBrowserCompat$MediaItem;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.read;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.MediaBrowserCompat$CustomActionResultReceiver = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void MediaBrowserCompat$ItemReceiver(AppCompatCheckBox<? extends K, ? extends V> appCompatCheckBox) {
        int i = appCompatCheckBox.MediaBrowserCompat$CustomActionResultReceiver;
        read(this.MediaBrowserCompat$CustomActionResultReceiver + i);
        if (this.MediaBrowserCompat$CustomActionResultReceiver != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                Object[] objArr = appCompatCheckBox.read;
                int i3 = i2 << 1;
                put(objArr[i3], objArr[i3 + 1]);
            }
        } else if (i > 0) {
            System.arraycopy(appCompatCheckBox.MediaBrowserCompat$MediaItem, 0, this.MediaBrowserCompat$MediaItem, 0, i);
            System.arraycopy(appCompatCheckBox.read, 0, this.read, 0, i << 1);
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
        }
    }

    public V write(int i) {
        V[] vArr = this.read;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i4 = 0;
        if (i3 <= 1) {
            write(this.MediaBrowserCompat$MediaItem, vArr, i3);
            this.MediaBrowserCompat$MediaItem = setAutoSizeTextTypeUniformWithPresetSizes.write;
            this.read = setAutoSizeTextTypeUniformWithPresetSizes.read;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.MediaBrowserCompat$MediaItem;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int[] iArr2 = this.MediaBrowserCompat$MediaItem;
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr2, i7, iArr2, i, i8);
                    Object[] objArr = this.read;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.read;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                int[] iArr3 = this.MediaBrowserCompat$MediaItem;
                Object[] objArr3 = this.read;
                MediaBrowserCompat$ItemReceiver(i6);
                if (i3 == this.MediaBrowserCompat$CustomActionResultReceiver) {
                    if (i > 0) {
                        System.arraycopy(iArr3, 0, this.MediaBrowserCompat$MediaItem, 0, i);
                        System.arraycopy(objArr3, 0, this.read, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr3, i10, this.MediaBrowserCompat$MediaItem, i, i11);
                        System.arraycopy(objArr3, i10 << 1, this.read, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public int size() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppCompatCheckBox) {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) obj;
            if (size() != appCompatCheckBox.size()) {
                return false;
            }
            int i = 0;
            while (i < this.MediaBrowserCompat$CustomActionResultReceiver) {
                try {
                    int i2 = i << 1;
                    Object obj2 = this.read[i2];
                    Object obj3 = this.read[i2 + 1];
                    Object obj4 = appCompatCheckBox.get(obj2);
                    if (obj3 == null) {
                        if (obj4 != null || !appCompatCheckBox.containsKey(obj2)) {
                            return false;
                        }
                    } else if (!obj3.equals(obj4)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.MediaBrowserCompat$CustomActionResultReceiver) {
                try {
                    int i4 = i3 << 1;
                    Object obj5 = this.read[i4];
                    Object obj6 = this.read[i4 + 1];
                    Object obj7 = map.get(obj5);
                    if (obj6 == null) {
                        if (obj7 != null || !map.containsKey(obj5)) {
                            return false;
                        }
                    } else if (!obj6.equals(obj7)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.MediaBrowserCompat$MediaItem;
        Object[] objArr = this.read;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.MediaBrowserCompat$CustomActionResultReceiver * 28);
        sb.append('{');
        for (int i = 0; i < this.MediaBrowserCompat$CustomActionResultReceiver; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = i << 1;
            Object obj = this.read[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object obj2 = this.read[i2 + 1];
            if (obj2 != this) {
                sb.append(obj2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean containsKey(Object obj) {
        return (obj == null ? IconCompatParcelizer() : read(obj, obj.hashCode())) >= 0;
    }

    public V get(Object obj) {
        int i;
        if (obj == null) {
            i = IconCompatParcelizer();
        } else {
            i = read(obj, obj.hashCode());
        }
        if (i >= 0) {
            return this.read[(i << 1) + 1];
        }
        return null;
    }

    public V remove(Object obj) {
        int i;
        if (obj == null) {
            i = IconCompatParcelizer();
        } else {
            i = read(obj, obj.hashCode());
        }
        if (i >= 0) {
            return write(i);
        }
        return null;
    }
}
