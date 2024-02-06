package p040o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: o.CompositeGeneratedAdaptersObserver */
public final class CompositeGeneratedAdaptersObserver implements ReflectiveGenericLifecycleObserver<Bitmap, BitmapDrawable> {
    private final Resources read;

    public CompositeGeneratedAdaptersObserver(Resources resources) {
        if (resources != null) {
            this.read = resources;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final performOptionsMenuClosed<BitmapDrawable> MediaBrowserCompat$ItemReceiver(performOptionsMenuClosed<Bitmap> performoptionsmenuclosed, onActivityResult onactivityresult) {
        Resources resources = this.read;
        if (performoptionsmenuclosed == null) {
            return null;
        }
        return new onRetainCustomNonConfigurationInstance(resources, performoptionsmenuclosed);
    }
}
