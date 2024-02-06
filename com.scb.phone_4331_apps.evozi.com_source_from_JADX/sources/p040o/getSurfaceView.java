package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSurfaceView */
public final /* synthetic */ class getSurfaceView implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFiles MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getSurfaceView(getFiles getfiles) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getfiles;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck.ParcelableVolumeInfo) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat, this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver.read);
    }
}
