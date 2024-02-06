package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p040o.setTextOff;

public abstract class CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver<V extends View> {
    public void IconCompatParcelizer(CoordinatorLayout.read read) {
    }

    public void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, View view) {
    }

    @Deprecated
    public void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
    }

    public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, int i) {
        return false;
    }

    public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        return false;
    }

    public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return false;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return false;
    }

    @Deprecated
    public void MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
    }

    @Deprecated
    public boolean MediaBrowserCompat$ItemReceiver(int i) {
        return false;
    }

    public boolean MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, V v, View view) {
        return false;
    }

    public boolean MediaBrowserCompat$ItemReceiver(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2, boolean z) {
        return false;
    }

    public void read(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
    }

    public boolean read(V v, View view) {
        return false;
    }

    public setTextOff write(CoordinatorLayout coordinatorLayout, V v, setTextOff settextoff) {
        return settextoff;
    }

    public boolean write(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
        return false;
    }

    public boolean write(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
        return false;
    }

    public boolean write(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return false;
    }

    public CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public CoordinatorLayout$MediaBrowserCompat$CustomActionResultReceiver(Context context, AttributeSet attributeSet) {
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return MediaBrowserCompat$ItemReceiver(i);
        }
        return false;
    }

    public void read(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            IconCompatParcelizer(coordinatorLayout, v, view, i, i2, i3, i4);
        }
    }

    public void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            MediaBrowserCompat$ItemReceiver(coordinatorLayout, v, view, i, i2, iArr);
        }
    }

    public Parcelable MediaBrowserCompat$CustomActionResultReceiver(CoordinatorLayout coordinatorLayout, V v) {
        return View.BaseSavedState.EMPTY_STATE;
    }
}
