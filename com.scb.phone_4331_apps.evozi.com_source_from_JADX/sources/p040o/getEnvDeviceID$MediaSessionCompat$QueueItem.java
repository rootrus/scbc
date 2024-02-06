package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getEnvDeviceID$MediaSessionCompat$QueueItem */
final class getEnvDeviceID$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<C7144hz> {
    private /* synthetic */ String IconCompatParcelizer;

    getEnvDeviceID$MediaSessionCompat$QueueItem(String str) {
        this.IconCompatParcelizer = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((C7144hz) obj).read(this.IconCompatParcelizer);
    }
}
