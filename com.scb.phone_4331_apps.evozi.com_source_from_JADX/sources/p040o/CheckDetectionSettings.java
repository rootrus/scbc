package p040o;

import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.CheckDetectionSettings */
public final /* synthetic */ class CheckDetectionSettings implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Image.C34591 MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ CheckDetectionSettings(Image.C34591 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C6393xc7fe0382) obj).MediaMetadataCompat(!Image.C34591.write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem.MediaBrowserCompat$SearchResultReceiver));
    }
}
