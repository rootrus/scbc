package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.CameraInitializationFailedEvent */
public final /* synthetic */ class CameraInitializationFailedEvent implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ CameraInitializationFailedEvent MediaBrowserCompat$ItemReceiver = new CameraInitializationFailedEvent();

    private /* synthetic */ CameraInitializationFailedEvent() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.RatingCompat) obj).read(false);
    }
}
