package p040o;

import p040o.access$2300;
import p040o.cancelExtraction;
import p040o.writeUInt64NoTag;

/* renamed from: o.mo */
public final /* synthetic */ class C10058mo implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ cancelExtraction.C41735 write;

    public /* synthetic */ C10058mo(cancelExtraction.C41735 r1, Throwable th) {
        this.write = r1;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        cancelExtraction.C41735 r0 = this.write;
        Throwable th = this.IconCompatParcelizer;
        getFoldedOrTornDocumentCorners getfoldedortorndocumentcorners = (getFoldedOrTornDocumentCorners) obj;
        if (!cancelExtraction.this.MediaBrowserCompat$SearchResultReceiver(th)) {
            getfoldedortorndocumentcorners.mo13730i_(cancelExtraction.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
        }
    }
}
