package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.CameraInitializationListener */
public final /* synthetic */ class CameraInitializationListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ CameraInitializationListener(int i, int i2) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.IconCompatParcelizer = i2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.RatingCompat) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
    }
}
