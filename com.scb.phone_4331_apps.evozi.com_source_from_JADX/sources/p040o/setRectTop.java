package p040o;

import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRectTop */
public final /* synthetic */ class setRectTop implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Image.C34591 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setRectTop(Image.C34591 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C6393xc7fe0382) obj).MediaBrowserCompat$ItemReceiver(!Image.C34591.write(this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem.MediaMetadataCompat));
    }
}
