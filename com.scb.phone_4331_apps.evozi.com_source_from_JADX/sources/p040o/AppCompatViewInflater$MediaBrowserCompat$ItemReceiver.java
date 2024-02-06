package p040o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import p040o.setExpandedFormat;

/* renamed from: o.AppCompatViewInflater$MediaBrowserCompat$ItemReceiver */
class AppCompatViewInflater$MediaBrowserCompat$ItemReceiver extends setExpandedFormat.read {
    int[][] ListMenuItemView;

    AppCompatViewInflater$MediaBrowserCompat$ItemReceiver(AppCompatViewInflater$MediaBrowserCompat$ItemReceiver appCompatViewInflater$MediaBrowserCompat$ItemReceiver, AppCompatViewInflater appCompatViewInflater, Resources resources) {
        super(appCompatViewInflater$MediaBrowserCompat$ItemReceiver, appCompatViewInflater, resources);
        if (appCompatViewInflater$MediaBrowserCompat$ItemReceiver != null) {
            this.ListMenuItemView = appCompatViewInflater$MediaBrowserCompat$ItemReceiver.ListMenuItemView;
        } else {
            this.ListMenuItemView = new int[IconCompatParcelizer()][];
        }
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$ItemReceiver() {
        int[][] iArr = this.ListMenuItemView;
        int[][] iArr2 = new int[iArr.length][];
        for (int length = iArr.length - 1; length >= 0; length--) {
            int[][] iArr3 = this.ListMenuItemView;
            iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
        }
        this.ListMenuItemView = iArr2;
    }

    /* access modifiers changed from: package-private */
    public int IconCompatParcelizer(int[] iArr, Drawable drawable) {
        int read = read(drawable);
        this.ListMenuItemView[read] = iArr;
        return read;
    }

    /* access modifiers changed from: package-private */
    public int IconCompatParcelizer(int[] iArr) {
        int[][] iArr2 = this.ListMenuItemView;
        int read = read();
        for (int i = 0; i < read; i++) {
            if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    public Drawable newDrawable() {
        return new AppCompatViewInflater(this, (Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return new AppCompatViewInflater(this, resources);
    }

    public void write(int i, int i2) {
        super.write(i, i2);
        int[][] iArr = new int[i2][];
        System.arraycopy(this.ListMenuItemView, 0, iArr, 0, i);
        this.ListMenuItemView = iArr;
    }
}
