package p040o;

import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.jP */
public final /* synthetic */ class C4854jP implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ kb$MediaBrowserCompat$MediaItem IconCompatParcelizer;
    private final /* synthetic */ newLatLngBoundsWithSize MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4854jP(kb$MediaBrowserCompat$MediaItem kb_mediabrowsercompat_mediaitem, newLatLngBoundsWithSize newlatlngboundswithsize) {
        this.IconCompatParcelizer = kb_mediabrowsercompat_mediaitem;
        this.MediaBrowserCompat$ItemReceiver = newlatlngboundswithsize;
    }

    public final void IconCompatParcelizer(Object obj) {
        kb$MediaBrowserCompat$MediaItem kb_mediabrowsercompat_mediaitem = this.IconCompatParcelizer;
        ((getCarbonStrip.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(kb_mediabrowsercompat_mediaitem.read.setHasDecor.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver), kb_mediabrowsercompat_mediaitem.write);
    }
}
