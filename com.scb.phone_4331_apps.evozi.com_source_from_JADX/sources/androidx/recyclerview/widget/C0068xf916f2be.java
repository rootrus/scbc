package androidx.recyclerview.widget;

import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver */
class C0068xf916f2be {
    List<C0069x3a4b86cb> IconCompatParcelizer;
    int[] MediaBrowserCompat$ItemReceiver;

    C0068xf916f2be() {
    }

    /* access modifiers changed from: package-private */
    public final int IconCompatParcelizer(int i) {
        int[] iArr = this.MediaBrowserCompat$ItemReceiver;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        int read = read(i);
        if (read == -1) {
            int[] iArr2 = this.MediaBrowserCompat$ItemReceiver;
            Arrays.fill(iArr2, i, iArr2.length, -1);
            return this.MediaBrowserCompat$ItemReceiver.length;
        }
        int i2 = read + 1;
        Arrays.fill(this.MediaBrowserCompat$ItemReceiver, i, i2, -1);
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final void write(int i) {
        int[] iArr = this.MediaBrowserCompat$ItemReceiver;
        if (iArr == null) {
            int[] iArr2 = new int[(Math.max(i, 10) + 1)];
            this.MediaBrowserCompat$ItemReceiver = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length <<= 1;
            }
            int[] iArr3 = new int[length];
            this.MediaBrowserCompat$ItemReceiver = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = this.MediaBrowserCompat$ItemReceiver;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(int i, int i2) {
        int[] iArr = this.MediaBrowserCompat$ItemReceiver;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            write(i3);
            int[] iArr2 = this.MediaBrowserCompat$ItemReceiver;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.MediaBrowserCompat$ItemReceiver;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            MediaBrowserCompat$ItemReceiver(i, i2);
        }
    }

    private void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        List<C0069x3a4b86cb> list = this.IconCompatParcelizer;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0069x3a4b86cb staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.get(size);
                if (staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver.write >= i) {
                    if (staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver.write < i + i2) {
                        this.IconCompatParcelizer.remove(size);
                    } else {
                        staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver.write -= i2;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(int i, int i2) {
        int[] iArr = this.MediaBrowserCompat$ItemReceiver;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            write(i3);
            int[] iArr2 = this.MediaBrowserCompat$ItemReceiver;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.MediaBrowserCompat$ItemReceiver, i, i3, -1);
            write(i, i2);
        }
    }

    private void write(int i, int i2) {
        List<C0069x3a4b86cb> list = this.IconCompatParcelizer;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0069x3a4b86cb staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.get(size);
                if (staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver.write >= i) {
                    staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver.write += i2;
                }
            }
        }
    }

    private int read(int i) {
        C0069x3a4b86cb staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver;
        List<C0069x3a4b86cb> list = this.IconCompatParcelizer;
        if (list == null) {
            return -1;
        }
        if (list != null) {
            int size = list.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.get(size);
                if (staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver.write == i) {
                    break;
                }
                size--;
            }
        }
        staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver = null;
        if (staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.IconCompatParcelizer.remove(staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver);
        }
        int size2 = this.IconCompatParcelizer.size();
        int i2 = 0;
        while (true) {
            if (i2 < size2) {
                if (this.IconCompatParcelizer.get(i2).write >= i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        this.IconCompatParcelizer.remove(i2);
        return this.IconCompatParcelizer.get(i2).write;
    }
}
