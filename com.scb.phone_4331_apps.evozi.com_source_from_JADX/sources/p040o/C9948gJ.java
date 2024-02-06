package p040o;

import p040o.getDocumentSkew;
import p040o.writeUInt64NoTag;

/* renamed from: o.gJ */
public final /* synthetic */ class C9948gJ implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ C4455gM read;

    public /* synthetic */ C9948gJ(C4455gM gMVar, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.read = gMVar;
        this.MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        this.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, (getDocumentSkew.write) obj);
    }
}
