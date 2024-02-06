package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.addCameraInitializationFailedListener */
public final /* synthetic */ class addCameraInitializationFailedListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ addCameraInitializationFailedListener(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.RatingCompat) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, Iterables$3$MediaBrowserCompat$MediaItem.incomplete_information);
    }
}
