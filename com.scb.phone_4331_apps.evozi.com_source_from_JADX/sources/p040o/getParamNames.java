package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getParamNames */
public final /* synthetic */ class getParamNames implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ SendImage write;

    public /* synthetic */ getParamNames(SendImage sendImage) {
        this.write = sendImage;
    }

    public final void IconCompatParcelizer(Object obj) {
        SendImage sendImage = this.write;
        ((getDocumentSkewAngle) obj).write(sendImage.MediaBrowserCompat$SearchResultReceiver, sendImage.read, sendImage.MediaBrowserCompat$ItemReceiver);
    }
}
