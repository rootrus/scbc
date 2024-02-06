package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getVideoFiles */
public final /* synthetic */ class getVideoFiles implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4124by MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getVideoFiles(C4124by byVar) {
        this.MediaBrowserCompat$ItemReceiver = byVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4124by byVar = this.MediaBrowserCompat$ItemReceiver;
        getExtractFaceImage getextractfaceimage = (getExtractFaceImage) obj;
        getextractfaceimage.MediaBrowserCompat$CustomActionResultReceiver(byVar.write);
        if (byVar.write == C7040xee086eb3.PENDING_VERIFYING_PARTNER_STATE) {
            getextractfaceimage.MediaBrowserCompat$SearchResultReceiver();
        }
    }
}
