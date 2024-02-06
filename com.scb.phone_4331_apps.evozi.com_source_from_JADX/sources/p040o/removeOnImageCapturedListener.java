package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.removeOnImageCapturedListener */
public final /* synthetic */ class removeOnImageCapturedListener implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ removeOnImageCapturedListener MediaBrowserCompat$ItemReceiver = new removeOnImageCapturedListener();

    private /* synthetic */ removeOnImageCapturedListener() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.MediaMetadataCompat) obj).write(true);
    }
}
