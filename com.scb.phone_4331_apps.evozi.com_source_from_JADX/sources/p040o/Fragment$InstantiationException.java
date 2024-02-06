package p040o;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* renamed from: o.Fragment$InstantiationException */
public final class Fragment$InstantiationException<DataType> implements isVisible<DataType, BitmapDrawable> {
    private final Resources read;
    private final isVisible<DataType, Bitmap> write;

    public Fragment$InstantiationException(Resources resources, isVisible<DataType, Bitmap> isvisible) {
        if (resources != null) {
            this.read = resources;
            if (isvisible != null) {
                this.write = isvisible;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final boolean IconCompatParcelizer(DataType datatype, onActivityResult onactivityresult) throws IOException {
        return this.write.IconCompatParcelizer(datatype, onactivityresult);
    }

    public final performOptionsMenuClosed<BitmapDrawable> MediaBrowserCompat$CustomActionResultReceiver(DataType datatype, int i, int i2, onActivityResult onactivityresult) throws IOException {
        performOptionsMenuClosed<Bitmap> MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver(datatype, i, i2, onactivityresult);
        Resources resources = this.read;
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        return new onRetainCustomNonConfigurationInstance(resources, MediaBrowserCompat$CustomActionResultReceiver);
    }
}
