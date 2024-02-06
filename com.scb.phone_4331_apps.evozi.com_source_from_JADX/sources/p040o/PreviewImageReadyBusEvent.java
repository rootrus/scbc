package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.PreviewImageReadyBusEvent */
public final /* synthetic */ class PreviewImageReadyBusEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getAmbientEnabled MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ PreviewImageReadyBusEvent(getAmbientEnabled getambientenabled) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getambientenabled;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C7535ub) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver.write);
    }
}
