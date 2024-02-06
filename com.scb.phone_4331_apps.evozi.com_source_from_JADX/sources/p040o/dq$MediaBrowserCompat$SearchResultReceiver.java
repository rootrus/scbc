package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.dq$MediaBrowserCompat$SearchResultReceiver */
final class dq$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getBelowMinFrontImageSize> {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ C4295dq write;

    dq$MediaBrowserCompat$SearchResultReceiver(C4295dq dqVar, String str) {
        this.write = dqVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getBelowMinFrontImageSize) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, C4295dq.MediaBrowserCompat$CustomActionResultReceiver(this.write).IconCompatParcelizer);
    }
}
