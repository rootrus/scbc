package androidx.coordinatorlayout.widget;

import android.view.ViewTreeObserver;

class CoordinatorLayout$MediaBrowserCompat$SearchResultReceiver implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ CoordinatorLayout read;

    CoordinatorLayout$MediaBrowserCompat$SearchResultReceiver(CoordinatorLayout coordinatorLayout) {
        this.read = coordinatorLayout;
    }

    public final boolean onPreDraw() {
        this.read.MediaBrowserCompat$CustomActionResultReceiver(0);
        return true;
    }
}
