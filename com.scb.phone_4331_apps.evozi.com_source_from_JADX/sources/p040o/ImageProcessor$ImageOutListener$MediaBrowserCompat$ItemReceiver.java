package p040o;

import p040o.ImageProcessor;
import p040o.access$2300;

/* renamed from: o.ImageProcessor$ImageOutListener$MediaBrowserCompat$ItemReceiver */
public class ImageProcessor$ImageOutListener$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private /* synthetic */ ImageProcessor.ImageOutListener MediaBrowserCompat$ItemReceiver;

    private ImageProcessor$ImageOutListener$MediaBrowserCompat$ItemReceiver(ImageProcessor.ImageOutListener imageOutListener) {
        this.MediaBrowserCompat$ItemReceiver = imageOutListener;
    }

    public /* synthetic */ ImageProcessor$ImageOutListener$MediaBrowserCompat$ItemReceiver(ImageProcessor.ImageOutListener imageOutListener, byte b) {
        this(imageOutListener);
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        ImageProcessor.ImageOutListener.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
        ImageProcessor.ImageOutListener imageOutListener = this.MediaBrowserCompat$ItemReceiver;
        getProcessedImageMimeType getprocessedimagemimetype = getProcessedImageMimeType.write;
        if (imageOutListener.RatingCompat != null) {
            getprocessedimagemimetype.IconCompatParcelizer(imageOutListener.RatingCompat);
        }
    }
}
