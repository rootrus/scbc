package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getFieldRequest */
public final /* synthetic */ class getFieldRequest implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ SendImage IconCompatParcelizer;

    public /* synthetic */ getFieldRequest(SendImage sendImage) {
        this.IconCompatParcelizer = sendImage;
    }

    public final void IconCompatParcelizer(Object obj) {
        SendImage sendImage = this.IconCompatParcelizer;
        ((getDocumentSkewAngle) obj).IconCompatParcelizer(sendImage.MediaMetadataCompat, sendImage.write);
    }
}
