package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setFileSizeThreshold */
public final /* synthetic */ class setFileSizeThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ double IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ removeDataStoreInitializedListener read;

    public /* synthetic */ setFileSizeThreshold(removeDataStoreInitializedListener removedatastoreinitializedlistener, double d, String str) {
        this.read = removedatastoreinitializedlistener;
        this.IconCompatParcelizer = d;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        removeDataStoreInitializedListener removedatastoreinitializedlistener = this.read;
        double d = this.IconCompatParcelizer;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        getEpc getepc = (getEpc) obj;
        getepc.read(d);
        getepc.IconCompatParcelizer(removeDataStoreInitializedListener.write(removedatastoreinitializedlistener.MediaBrowserCompat$MediaItem, str, d));
    }
}
