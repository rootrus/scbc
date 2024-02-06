package p040o;

/* renamed from: o.setButtonDrawable */
public class setButtonDrawable<E> implements Cloneable {
    private static final Object MediaBrowserCompat$CustomActionResultReceiver = new Object();
    private int[] IconCompatParcelizer;
    private Object[] MediaBrowserCompat$ItemReceiver;
    private boolean read;
    private int write;

    public setButtonDrawable() {
        this(10);
    }

    public setButtonDrawable(int i) {
        this.read = false;
        if (i == 0) {
            this.IconCompatParcelizer = setAutoSizeTextTypeUniformWithPresetSizes.write;
            this.MediaBrowserCompat$ItemReceiver = setAutoSizeTextTypeUniformWithPresetSizes.read;
        } else {
            int MediaBrowserCompat$CustomActionResultReceiver2 = setAutoSizeTextTypeUniformWithPresetSizes.MediaBrowserCompat$CustomActionResultReceiver(i);
            this.IconCompatParcelizer = new int[MediaBrowserCompat$CustomActionResultReceiver2];
            this.MediaBrowserCompat$ItemReceiver = new Object[MediaBrowserCompat$CustomActionResultReceiver2];
        }
        this.write = 0;
    }

    /* renamed from: write */
    public setButtonDrawable<E> clone() {
        try {
            setButtonDrawable<E> setbuttondrawable = (setButtonDrawable) super.clone();
            setbuttondrawable.IconCompatParcelizer = (int[]) this.IconCompatParcelizer.clone();
            setbuttondrawable.MediaBrowserCompat$ItemReceiver = (Object[]) this.MediaBrowserCompat$ItemReceiver.clone();
            return setbuttondrawable;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public E MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return MediaBrowserCompat$ItemReceiver(i, (Object) null);
    }

    public E MediaBrowserCompat$ItemReceiver(int i, E e) {
        int write2 = setAutoSizeTextTypeUniformWithPresetSizes.write(this.IconCompatParcelizer, this.write, i);
        if (write2 >= 0) {
            E[] eArr = this.MediaBrowserCompat$ItemReceiver;
            if (eArr[write2] != MediaBrowserCompat$CustomActionResultReceiver) {
                return eArr[write2];
            }
        }
        return e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.MediaBrowserCompat$ItemReceiver;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void read(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.IconCompatParcelizer
            int r1 = r3.write
            int r4 = p040o.setAutoSizeTextTypeUniformWithPresetSizes.write(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.MediaBrowserCompat$ItemReceiver
            r1 = r0[r4]
            java.lang.Object r2 = MediaBrowserCompat$CustomActionResultReceiver
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.read = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setButtonDrawable.read(int):void");
    }

    public void write(int i) {
        read(i);
    }

    private void IconCompatParcelizer() {
        int i = this.write;
        int[] iArr = this.IconCompatParcelizer;
        Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != MediaBrowserCompat$CustomActionResultReceiver) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.read = false;
        this.write = i2;
    }

    public void read(int i, E e) {
        int write2 = setAutoSizeTextTypeUniformWithPresetSizes.write(this.IconCompatParcelizer, this.write, i);
        if (write2 >= 0) {
            this.MediaBrowserCompat$ItemReceiver[write2] = e;
            return;
        }
        int i2 = ~write2;
        if (i2 < this.write) {
            Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
            if (objArr[i2] == MediaBrowserCompat$CustomActionResultReceiver) {
                this.IconCompatParcelizer[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.read && this.write >= this.IconCompatParcelizer.length) {
            IconCompatParcelizer();
            i2 = ~setAutoSizeTextTypeUniformWithPresetSizes.write(this.IconCompatParcelizer, this.write, i);
        }
        int i3 = this.write;
        if (i3 >= this.IconCompatParcelizer.length) {
            int MediaBrowserCompat$CustomActionResultReceiver2 = setAutoSizeTextTypeUniformWithPresetSizes.MediaBrowserCompat$CustomActionResultReceiver(i3 + 1);
            int[] iArr = new int[MediaBrowserCompat$CustomActionResultReceiver2];
            Object[] objArr2 = new Object[MediaBrowserCompat$CustomActionResultReceiver2];
            int[] iArr2 = this.IconCompatParcelizer;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.MediaBrowserCompat$ItemReceiver;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.IconCompatParcelizer = iArr;
            this.MediaBrowserCompat$ItemReceiver = objArr2;
        }
        int i4 = this.write - i2;
        if (i4 != 0) {
            int[] iArr3 = this.IconCompatParcelizer;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4);
            Object[] objArr4 = this.MediaBrowserCompat$ItemReceiver;
            System.arraycopy(objArr4, i2, objArr4, i5, this.write - i2);
        }
        this.IconCompatParcelizer[i2] = i;
        this.MediaBrowserCompat$ItemReceiver[i2] = e;
        this.write++;
    }

    public int MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.read) {
            IconCompatParcelizer();
        }
        return this.write;
    }

    public int IconCompatParcelizer(int i) {
        if (this.read) {
            IconCompatParcelizer();
        }
        return this.IconCompatParcelizer[i];
    }

    public E MediaBrowserCompat$SearchResultReceiver(int i) {
        if (this.read) {
            IconCompatParcelizer();
        }
        return this.MediaBrowserCompat$ItemReceiver[i];
    }

    public int MediaBrowserCompat$ItemReceiver(int i) {
        if (this.read) {
            IconCompatParcelizer();
        }
        return setAutoSizeTextTypeUniformWithPresetSizes.write(this.IconCompatParcelizer, this.write, i);
    }

    public void MediaBrowserCompat$ItemReceiver() {
        int i = this.write;
        Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.write = 0;
        this.read = false;
    }

    public void IconCompatParcelizer(int i, E e) {
        int i2 = this.write;
        if (i2 == 0 || i > this.IconCompatParcelizer[i2 - 1]) {
            if (this.read && this.write >= this.IconCompatParcelizer.length) {
                IconCompatParcelizer();
            }
            int i3 = this.write;
            if (i3 >= this.IconCompatParcelizer.length) {
                int MediaBrowserCompat$CustomActionResultReceiver2 = setAutoSizeTextTypeUniformWithPresetSizes.MediaBrowserCompat$CustomActionResultReceiver(i3 + 1);
                int[] iArr = new int[MediaBrowserCompat$CustomActionResultReceiver2];
                Object[] objArr = new Object[MediaBrowserCompat$CustomActionResultReceiver2];
                int[] iArr2 = this.IconCompatParcelizer;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.MediaBrowserCompat$ItemReceiver;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.IconCompatParcelizer = iArr;
                this.MediaBrowserCompat$ItemReceiver = objArr;
            }
            this.IconCompatParcelizer[i3] = i;
            this.MediaBrowserCompat$ItemReceiver[i3] = e;
            this.write = i3 + 1;
            return;
        }
        read(i, e);
    }

    public String toString() {
        if (MediaBrowserCompat$CustomActionResultReceiver() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.write * 28);
        sb.append('{');
        for (int i = 0; i < this.write; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(IconCompatParcelizer(i));
            sb.append('=');
            Object MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$SearchResultReceiver(i);
            if (MediaBrowserCompat$SearchResultReceiver != this) {
                sb.append(MediaBrowserCompat$SearchResultReceiver);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
