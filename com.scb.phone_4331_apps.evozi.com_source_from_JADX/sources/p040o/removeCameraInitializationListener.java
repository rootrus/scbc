package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.removeCameraInitializationListener */
public final /* synthetic */ class removeCameraInitializationListener implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ removeCameraInitializationListener write = new removeCameraInitializationListener();

    private /* synthetic */ removeCameraInitializationListener() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.MediaMetadataCompat) obj).write(false);
    }
}
