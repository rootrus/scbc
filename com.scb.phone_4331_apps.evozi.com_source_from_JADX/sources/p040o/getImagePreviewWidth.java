package p040o;

import p040o.injectRttiCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImagePreviewWidth */
public final /* synthetic */ class getImagePreviewWidth implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ onGlobalLayout$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getImagePreviewWidth(onGlobalLayout$MediaBrowserCompat$ItemReceiver ongloballayout_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ongloballayout_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((injectRttiCheckDeserializer.write) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver.write.IconCompatParcelizer);
    }
}
