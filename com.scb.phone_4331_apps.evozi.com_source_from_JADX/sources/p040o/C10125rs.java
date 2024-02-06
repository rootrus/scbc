package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.rs */
public final /* synthetic */ class C10125rs implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ o$a$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private final /* synthetic */ onStreetViewPanoramaLongClick write;

    public /* synthetic */ C10125rs(o$a$MediaBrowserCompat$ItemReceiver o_a_mediabrowsercompat_itemreceiver, onStreetViewPanoramaLongClick onstreetviewpanoramalongclick) {
        this.IconCompatParcelizer = o_a_mediabrowsercompat_itemreceiver;
        this.write = onstreetviewpanoramalongclick;
    }

    public final void IconCompatParcelizer(Object obj) {
        o$a$MediaBrowserCompat$ItemReceiver o_a_mediabrowsercompat_itemreceiver = this.IconCompatParcelizer;
        ((getTopLeftCornerWidth.RatingCompat) obj).IconCompatParcelizer(o_a_mediabrowsercompat_itemreceiver.write.read.MediaBrowserCompat$ItemReceiver(this.write, o_a_mediabrowsercompat_itemreceiver.write.MediaBrowserCompat$SearchResultReceiver));
    }
}
