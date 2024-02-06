package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getClassificationAlternatives */
public final /* synthetic */ class getClassificationAlternatives implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ SendImageResponse read;

    public /* synthetic */ getClassificationAlternatives(SendImageResponse sendImageResponse) {
        this.read = sendImageResponse;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule_GetIPassportDeserializerRttiFactory) obj).IconCompatParcelizer(this.read.write.read.MediaBrowserCompat$SearchResultReceiver());
    }
}
