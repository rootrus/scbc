package androidx.recyclerview.widget;

import android.util.SparseIntArray;

public abstract class GridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver {
    final SparseIntArray read = new SparseIntArray();

    public abstract int IconCompatParcelizer(int i);

    public int IconCompatParcelizer(int i, int i2) {
        int IconCompatParcelizer = IconCompatParcelizer(i);
        if (IconCompatParcelizer == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int IconCompatParcelizer2 = IconCompatParcelizer(i4);
            i3 += IconCompatParcelizer2;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = IconCompatParcelizer2;
            }
        }
        if (IconCompatParcelizer + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    public final int MediaBrowserCompat$ItemReceiver(int i, int i2) {
        int IconCompatParcelizer = IconCompatParcelizer(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int IconCompatParcelizer2 = IconCompatParcelizer(i5);
            i4 += IconCompatParcelizer2;
            if (i4 == i2) {
                i3++;
                i4 = 0;
            } else if (i4 > i2) {
                i3++;
                i4 = IconCompatParcelizer2;
            }
        }
        return i4 + IconCompatParcelizer > i2 ? i3 + 1 : i3;
    }
}
