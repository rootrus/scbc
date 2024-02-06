package p040o;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: o.completeWakefulIntent */
public final class completeWakefulIntent implements ReflectiveGenericLifecycleObserver<Bitmap, byte[]> {
    private final int MediaBrowserCompat$ItemReceiver;
    private final Bitmap.CompressFormat read;

    public completeWakefulIntent() {
        this(Bitmap.CompressFormat.JPEG);
    }

    private completeWakefulIntent(Bitmap.CompressFormat compressFormat) {
        this.read = compressFormat;
        this.MediaBrowserCompat$ItemReceiver = 100;
    }

    public final performOptionsMenuClosed<byte[]> MediaBrowserCompat$ItemReceiver(performOptionsMenuClosed<Bitmap> performoptionsmenuclosed, onActivityResult onactivityresult) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        performoptionsmenuclosed.write().compress(this.read, 100, byteArrayOutputStream);
        performoptionsmenuclosed.MediaBrowserCompat$CustomActionResultReceiver();
        return new supportStartPostponedEnterTransition(byteArrayOutputStream.toByteArray());
    }
}
