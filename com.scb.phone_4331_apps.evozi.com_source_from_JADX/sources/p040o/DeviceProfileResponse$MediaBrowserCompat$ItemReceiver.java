package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.DeviceProfileResponse$MediaBrowserCompat$ItemReceiver */
final class DeviceProfileResponse$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaJsonCheck$MediaBrowserCompat$SearchResultReceiver> {
    private /* synthetic */ getFiles MediaBrowserCompat$CustomActionResultReceiver;

    DeviceProfileResponse$MediaBrowserCompat$ItemReceiver(getFiles getfiles) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getfiles;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck$MediaBrowserCompat$SearchResultReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
