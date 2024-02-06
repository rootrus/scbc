package p040o;

import p040o.C4128bz;
import p040o.writeUInt64NoTag;

/* renamed from: o.getFileProvider */
public final /* synthetic */ class getFileProvider implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ MoreExecutors MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ C4128bz.C41303 write;

    public /* synthetic */ getFileProvider(C4128bz.C41303 r1, MoreExecutors moreExecutors) {
        this.write = r1;
        this.MediaBrowserCompat$ItemReceiver = moreExecutors;
    }

    public final void IconCompatParcelizer(Object obj) {
        getFrontImage getfrontimage = (getFrontImage) obj;
        getfrontimage.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, C4128bz.this.ParcelableVolumeInfo);
    }
}
