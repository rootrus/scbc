package p040o;

import p040o.getDocumentSkew;
import p040o.writeUInt64NoTag;

/* renamed from: o.gE */
public final /* synthetic */ class C4448gE implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ gM$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
    private final /* synthetic */ newLatLngBoundsWithSize MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4448gE(gM$MediaBrowserCompat$CustomActionResultReceiver gm_mediabrowsercompat_customactionresultreceiver, newLatLngBoundsWithSize newlatlngboundswithsize) {
        this.IconCompatParcelizer = gm_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$ItemReceiver = newlatlngboundswithsize;
    }

    public final void IconCompatParcelizer(Object obj) {
        gM$MediaBrowserCompat$CustomActionResultReceiver gm_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
        ((getDocumentSkew.write) obj).MediaBrowserCompat$CustomActionResultReceiver(gm_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver));
    }
}
