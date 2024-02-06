package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.onCameraInitialized */
public final /* synthetic */ class onCameraInitialized implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ onCameraInitialized(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.RatingCompat) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
