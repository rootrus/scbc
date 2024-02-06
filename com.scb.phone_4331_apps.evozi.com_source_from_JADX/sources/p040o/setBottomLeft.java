package p040o;

import p040o.Image;
import p040o.writeUInt64NoTag;

/* renamed from: o.setBottomLeft */
public final /* synthetic */ class setBottomLeft implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Image.C34591.write IconCompatParcelizer;
    private final /* synthetic */ onCircleClick MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setBottomLeft(Image.C34591.write write, onCircleClick oncircleclick) {
        this.IconCompatParcelizer = write;
        this.MediaBrowserCompat$ItemReceiver = oncircleclick;
    }

    public final void IconCompatParcelizer(Object obj) {
        Image.C34591.write write = this.IconCompatParcelizer;
        ((C6393xc7fe0382) obj).read(Image.C34591.this.MediaDescriptionCompat.read(Image.C34591.this.AlertController$RecycleListView.MediaMetadataCompat(write.MediaBrowserCompat$CustomActionResultReceiver), this.MediaBrowserCompat$ItemReceiver, true, false, write.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
