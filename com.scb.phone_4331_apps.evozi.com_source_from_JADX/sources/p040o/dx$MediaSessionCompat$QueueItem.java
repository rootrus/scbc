package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.dx$MediaSessionCompat$QueueItem */
final class dx$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
    private /* synthetic */ C4305dx IconCompatParcelizer;
    private /* synthetic */ LocationServices MediaBrowserCompat$ItemReceiver;

    dx$MediaSessionCompat$QueueItem(C4305dx dxVar, LocationServices locationServices) {
        this.IconCompatParcelizer = dxVar;
        this.MediaBrowserCompat$ItemReceiver = locationServices;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        valueIteratorImpl unused = this.IconCompatParcelizer.ParcelableVolumeInfo;
        ((LocalProjectProvider.write) obj).read(valueIteratorImpl.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.write));
    }
}
