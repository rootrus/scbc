package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getkfsServerType */
public final /* synthetic */ class getkfsServerType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C10859sendImage MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getkfsServerType(C10859sendImage sendimage) {
        this.MediaBrowserCompat$CustomActionResultReceiver = sendimage;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getFoldedOrTornDocumentEdges) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.read != null);
    }
}
