package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.rt */
public final /* synthetic */ class C10136rt implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ putInstance IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ onStreetViewPanoramaLongClick MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ o$a$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ C10136rt(o$a$MediaBrowserCompat$ItemReceiver o_a_mediabrowsercompat_itemreceiver, onStreetViewPanoramaLongClick onstreetviewpanoramalongclick, putInstance putinstance, String str) {
        this.read = o_a_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$ItemReceiver = onstreetviewpanoramalongclick;
        this.IconCompatParcelizer = putinstance;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        o$a$MediaBrowserCompat$ItemReceiver o_a_mediabrowsercompat_itemreceiver = this.read;
        ((getTopLeftCornerWidth.RatingCompat) obj).IconCompatParcelizer(o_a_mediabrowsercompat_itemreceiver.write.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, o_a_mediabrowsercompat_itemreceiver.write.MediaBrowserCompat$SearchResultReceiver, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
