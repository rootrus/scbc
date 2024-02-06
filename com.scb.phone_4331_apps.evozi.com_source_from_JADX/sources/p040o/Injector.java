package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.Injector */
public final /* synthetic */ class Injector implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFiles MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ Injector(getFiles getfiles) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getfiles;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck.ParcelableVolumeInfo) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem);
    }
}
