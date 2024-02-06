package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.getLongitude */
public final /* synthetic */ class getLongitude implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ sA$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getLongitude(sA$MediaBrowserCompat$ItemReceiver sa_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$ItemReceiver = sa_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTopLeftCornerWidth.MediaMetadataCompat mediaMetadataCompat = (getTopLeftCornerWidth.MediaMetadataCompat) obj;
        mediaMetadataCompat.IconCompatParcelizer(C7425sA.read(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaSessionCompat$Token));
        mediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
        mediaMetadataCompat.write();
    }
}
