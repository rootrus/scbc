package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getSessionDeviceSize$MediaBrowserCompat$MediaItem */
public final class getSessionDeviceSize$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getRightEdgeTearHeight> {
    private /* synthetic */ getSessionDeviceSize write;

    public getSessionDeviceSize$MediaBrowserCompat$MediaItem(getSessionDeviceSize getsessiondevicesize) {
        this.write = getsessiondevicesize;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getRightEdgeTearHeight getrightedgetearheight = (getRightEdgeTearHeight) obj;
        getrightedgetearheight.read(getSessionDeviceSize.read(this.write).MediaBrowserCompat$ItemReceiver);
        getrightedgetearheight.MediaBrowserCompat$CustomActionResultReceiver(getSessionDeviceSize.read(this.write));
        if (getSessionDeviceSize.read(this.write).MediaBrowserCompat$ItemReceiver && getSessionDeviceSize.read(this.write).read) {
            getrightedgetearheight.MediaBrowserCompat$ItemReceiver(getSessionDeviceSize.read(this.write));
        }
    }
}
