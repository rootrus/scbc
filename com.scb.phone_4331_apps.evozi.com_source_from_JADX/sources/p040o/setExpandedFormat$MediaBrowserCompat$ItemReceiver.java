package p040o;

import android.graphics.drawable.Drawable;

/* renamed from: o.setExpandedFormat$MediaBrowserCompat$ItemReceiver */
class setExpandedFormat$MediaBrowserCompat$ItemReceiver implements Drawable.Callback {
    Drawable.Callback read;

    public final void invalidateDrawable(Drawable drawable) {
    }

    setExpandedFormat$MediaBrowserCompat$ItemReceiver() {
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.read;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.read;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}
