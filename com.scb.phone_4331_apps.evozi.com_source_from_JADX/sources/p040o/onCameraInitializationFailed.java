package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.onCameraInitializationFailed */
public final /* synthetic */ class onCameraInitializationFailed implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ onCameraInitializationFailed(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.RatingCompat) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, Iterables$3$MediaBrowserCompat$MediaItem.incomplete_information);
    }
}
