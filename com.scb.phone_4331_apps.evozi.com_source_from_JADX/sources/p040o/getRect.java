package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getRect */
public final /* synthetic */ class getRect implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4124by MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getRect(C4124by byVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = byVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        getExtractFaceImage getextractfaceimage = (getExtractFaceImage) obj;
        if (C7040xee086eb3.SCANNING_ID_STATE == this.MediaBrowserCompat$CustomActionResultReceiver.write) {
            getextractfaceimage.write();
        } else {
            getextractfaceimage.read();
        }
    }
}
