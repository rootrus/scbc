package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setFieldRequest */
public final /* synthetic */ class setFieldRequest implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ SendImage MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setFieldRequest(SendImage sendImage) {
        this.MediaBrowserCompat$CustomActionResultReceiver = sendImage;
    }

    public final void IconCompatParcelizer(Object obj) {
        SendImage sendImage = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getDocumentSkewAngle) obj).MediaBrowserCompat$ItemReceiver(sendImage.MediaBrowserCompat$SearchResultReceiver, sendImage.read);
    }
}
