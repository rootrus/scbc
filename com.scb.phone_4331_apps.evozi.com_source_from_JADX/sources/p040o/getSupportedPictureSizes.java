package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getSupportedPictureSizes */
public final /* synthetic */ class getSupportedPictureSizes implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ C4128bz MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getSupportedPictureSizes(C4128bz bzVar, int i) {
        this.MediaBrowserCompat$ItemReceiver = bzVar;
        this.IconCompatParcelizer = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4128bz bzVar = this.MediaBrowserCompat$ItemReceiver;
        ((getFrontImage) obj).read(bzVar.MediaDescriptionCompat.MediaSessionCompat$ResultReceiverWrapper, this.IconCompatParcelizer);
    }
}
