package p040o;

import p040o.OcrFailureData;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.setImageRep */
public final /* synthetic */ class setImageRep implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable read;
    private final /* synthetic */ OcrFailureData.write write;

    public /* synthetic */ setImageRep(OcrFailureData.write write2, Throwable th) {
        this.write = write2;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        OcrFailureData.write write2 = this.write;
        ((getDocumentState) obj).IconCompatParcelizer(OcrFailureData.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
