package p040o;

import p040o.ImageProcessor;
import p040o.access$2300;

/* renamed from: o.ImageProcessor$ImageOutEvent$MediaBrowserCompat$CustomActionResultReceiver */
public class C9766xa5c55d07 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
    private /* synthetic */ ImageProcessor.ImageOutEvent IconCompatParcelizer;

    private C9766xa5c55d07(ImageProcessor.ImageOutEvent imageOutEvent) {
        this.IconCompatParcelizer = imageOutEvent;
    }

    public /* synthetic */ C9766xa5c55d07(ImageProcessor.ImageOutEvent imageOutEvent, byte b) {
        this(imageOutEvent);
    }

    public final /* synthetic */ void onNext(Object obj) {
        super.onNext((Boolean) obj);
        ImageProcessor.ImageOutEvent.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        ImageProcessor.ImageOutEvent imageOutEvent = this.IconCompatParcelizer;
        getImageID getimageid = getImageID.MediaBrowserCompat$ItemReceiver;
        if (imageOutEvent.RatingCompat != null) {
            getimageid.IconCompatParcelizer(imageOutEvent.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
