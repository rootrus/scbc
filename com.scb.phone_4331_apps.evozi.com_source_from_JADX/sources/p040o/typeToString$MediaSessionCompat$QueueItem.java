package p040o;

import p040o.getIIdDeserializerOnDevice;
import p040o.writeUInt64NoTag;

/* renamed from: o.typeToString$MediaSessionCompat$QueueItem */
final class typeToString$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdDeserializerOnDevice.IconCompatParcelizer> {
    private /* synthetic */ ComponentDiscoveryService IconCompatParcelizer;
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    typeToString$MediaSessionCompat$QueueItem(ComponentDiscoveryService componentDiscoveryService, String str) {
        this.IconCompatParcelizer = componentDiscoveryService;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getIIdDeserializerOnDevice.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
