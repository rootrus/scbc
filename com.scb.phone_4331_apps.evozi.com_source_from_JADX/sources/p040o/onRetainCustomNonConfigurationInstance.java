package p040o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: o.onRetainCustomNonConfigurationInstance */
public final class onRetainCustomNonConfigurationInstance implements performOptionsMenuClosed<BitmapDrawable>, performDestroy {
    private final performOptionsMenuClosed<Bitmap> MediaBrowserCompat$ItemReceiver;
    private final Resources write;

    public onRetainCustomNonConfigurationInstance(Resources resources, performOptionsMenuClosed<Bitmap> performoptionsmenuclosed) {
        if (resources != null) {
            this.write = resources;
            if (performoptionsmenuclosed != null) {
                this.MediaBrowserCompat$ItemReceiver = performoptionsmenuclosed;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final Class<BitmapDrawable> IconCompatParcelizer() {
        return BitmapDrawable.class;
    }

    public final int read() {
        return this.MediaBrowserCompat$ItemReceiver.read();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        performOptionsMenuClosed<Bitmap> performoptionsmenuclosed = this.MediaBrowserCompat$ItemReceiver;
        if (performoptionsmenuclosed instanceof performDestroy) {
            ((performDestroy) performoptionsmenuclosed).MediaBrowserCompat$ItemReceiver();
        }
    }

    public final /* synthetic */ Object write() {
        return new BitmapDrawable(this.write, this.MediaBrowserCompat$ItemReceiver.write());
    }
}
