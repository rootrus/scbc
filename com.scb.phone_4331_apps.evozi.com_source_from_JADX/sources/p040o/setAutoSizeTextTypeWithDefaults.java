package p040o;

/* renamed from: o.setAutoSizeTextTypeWithDefaults */
public class setAutoSizeTextTypeWithDefaults<E> implements Cloneable {
    public static final Object read = new Object();
    public int IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public Object[] MediaBrowserCompat$ItemReceiver;
    public long[] write;

    public setAutoSizeTextTypeWithDefaults() {
        this(10);
    }

    public setAutoSizeTextTypeWithDefaults(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        if (i == 0) {
            this.write = setAutoSizeTextTypeUniformWithPresetSizes.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$ItemReceiver = setAutoSizeTextTypeUniformWithPresetSizes.read;
        } else {
            int IconCompatParcelizer2 = setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer(i);
            this.write = new long[IconCompatParcelizer2];
            this.MediaBrowserCompat$ItemReceiver = new Object[IconCompatParcelizer2];
        }
        this.IconCompatParcelizer = 0;
    }

    /* renamed from: MediaBrowserCompat$ItemReceiver */
    public final setAutoSizeTextTypeWithDefaults<E> clone() {
        try {
            setAutoSizeTextTypeWithDefaults<E> setautosizetexttypewithdefaults = (setAutoSizeTextTypeWithDefaults) super.clone();
            setautosizetexttypewithdefaults.write = (long[]) this.write.clone();
            setautosizetexttypewithdefaults.MediaBrowserCompat$ItemReceiver = (Object[]) this.MediaBrowserCompat$ItemReceiver.clone();
            return setautosizetexttypewithdefaults;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final E MediaBrowserCompat$ItemReceiver(long j, E e) {
        int MediaBrowserCompat$ItemReceiver2 = setAutoSizeTextTypeUniformWithPresetSizes.MediaBrowserCompat$ItemReceiver(this.write, this.IconCompatParcelizer, j);
        if (MediaBrowserCompat$ItemReceiver2 >= 0) {
            E[] eArr = this.MediaBrowserCompat$ItemReceiver;
            if (eArr[MediaBrowserCompat$ItemReceiver2] != read) {
                return eArr[MediaBrowserCompat$ItemReceiver2];
            }
        }
        return e;
    }

    public final void write() {
        int i = this.IconCompatParcelizer;
        long[] jArr = this.write;
        Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != read) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.IconCompatParcelizer = i2;
    }

    public final void read(long j, E e) {
        int MediaBrowserCompat$ItemReceiver2 = setAutoSizeTextTypeUniformWithPresetSizes.MediaBrowserCompat$ItemReceiver(this.write, this.IconCompatParcelizer, j);
        if (MediaBrowserCompat$ItemReceiver2 >= 0) {
            this.MediaBrowserCompat$ItemReceiver[MediaBrowserCompat$ItemReceiver2] = e;
            return;
        }
        int i = ~MediaBrowserCompat$ItemReceiver2;
        if (i < this.IconCompatParcelizer) {
            Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
            if (objArr[i] == read) {
                this.write[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver && this.IconCompatParcelizer >= this.write.length) {
            write();
            i = ~setAutoSizeTextTypeUniformWithPresetSizes.MediaBrowserCompat$ItemReceiver(this.write, this.IconCompatParcelizer, j);
        }
        int i2 = this.IconCompatParcelizer;
        if (i2 >= this.write.length) {
            int IconCompatParcelizer2 = setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer(i2 + 1);
            long[] jArr = new long[IconCompatParcelizer2];
            Object[] objArr2 = new Object[IconCompatParcelizer2];
            long[] jArr2 = this.write;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.MediaBrowserCompat$ItemReceiver;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.write = jArr;
            this.MediaBrowserCompat$ItemReceiver = objArr2;
        }
        int i3 = this.IconCompatParcelizer - i;
        if (i3 != 0) {
            long[] jArr3 = this.write;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3);
            Object[] objArr4 = this.MediaBrowserCompat$ItemReceiver;
            System.arraycopy(objArr4, i, objArr4, i4, this.IconCompatParcelizer - i);
        }
        this.write[i] = j;
        this.MediaBrowserCompat$ItemReceiver[i] = e;
        this.IconCompatParcelizer++;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            write();
        }
        return this.IconCompatParcelizer;
    }

    public final long IconCompatParcelizer(int i) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            write();
        }
        return this.write[i];
    }

    public final void IconCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.IconCompatParcelizer = 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(long j, E e) {
        int i = this.IconCompatParcelizer;
        if (i == 0 || j > this.write[i - 1]) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver && this.IconCompatParcelizer >= this.write.length) {
                write();
            }
            int i2 = this.IconCompatParcelizer;
            if (i2 >= this.write.length) {
                int IconCompatParcelizer2 = setAutoSizeTextTypeUniformWithPresetSizes.IconCompatParcelizer(i2 + 1);
                long[] jArr = new long[IconCompatParcelizer2];
                Object[] objArr = new Object[IconCompatParcelizer2];
                long[] jArr2 = this.write;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.MediaBrowserCompat$ItemReceiver;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.write = jArr;
                this.MediaBrowserCompat$ItemReceiver = objArr;
            }
            this.write[i2] = j;
            this.MediaBrowserCompat$ItemReceiver[i2] = e;
            this.IconCompatParcelizer = i2 + 1;
            return;
        }
        read(j, e);
    }

    public String toString() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            write();
        }
        int i = this.IconCompatParcelizer;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.IconCompatParcelizer; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(IconCompatParcelizer(i2));
            sb.append('=');
            if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                write();
            }
            Object obj = this.MediaBrowserCompat$ItemReceiver[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
