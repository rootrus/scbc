package p040o;

import android.os.Parcelable;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.ZHPR */
abstract class ZHPR<V extends View> extends CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver<V> {
    private int IconCompatParcelizer = 0;
    private int MediaBrowserCompat$ItemReceiver = 0;
    private int read = 0;

    /* access modifiers changed from: package-private */
    public abstract boolean IconCompatParcelizer(V v, int i);

    /* access modifiers changed from: package-private */
    public abstract void MediaBrowserCompat$ItemReceiver(V v, int i);

    public final boolean MediaBrowserCompat$ItemReceiver(int i) {
        return (i & 2) != 0;
    }

    ZHPR() {
    }

    public final void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        super.IconCompatParcelizer(coordinatorLayout, v, view, i, i2, i3, i4);
        if (i4 > 0 && this.MediaBrowserCompat$ItemReceiver < 0) {
            this.MediaBrowserCompat$ItemReceiver = 0;
        } else if (i4 < 0 && this.MediaBrowserCompat$ItemReceiver > 0) {
            this.MediaBrowserCompat$ItemReceiver = 0;
        }
        this.MediaBrowserCompat$ItemReceiver += i4;
    }

    public final void MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        super.MediaBrowserCompat$ItemReceiver(coordinatorLayout, v, view, i, i2, iArr);
        if (i2 > 0 && this.IconCompatParcelizer < 0) {
            this.IconCompatParcelizer = 0;
            this.read = 1;
        } else if (i2 < 0 && this.IconCompatParcelizer > 0) {
            this.IconCompatParcelizer = 0;
            this.read = -1;
        }
        this.IconCompatParcelizer += i2;
        MediaBrowserCompat$ItemReceiver(v, this.read);
    }

    public final boolean MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
        super.MediaBrowserCompat$ItemReceiver(coordinatorLayout, v, view, f, f2, z);
        int i = f2 > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
        this.read = i;
        return IconCompatParcelizer(v, i);
    }

    public final boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return super.IconCompatParcelizer(coordinatorLayout, v, view, f, f2);
    }

    public final setTextOff write(CoordinatorLayout coordinatorLayout, V v, setTextOff settextoff) {
        return super.write(coordinatorLayout, v, settextoff);
    }

    public final Parcelable MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, V v) {
        return super.MediaBrowserCompat$CustomActionResultReceiver(coordinatorLayout, v);
    }
}
