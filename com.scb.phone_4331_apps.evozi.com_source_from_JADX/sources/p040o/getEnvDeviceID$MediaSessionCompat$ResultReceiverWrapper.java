package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getEnvDeviceID$MediaSessionCompat$ResultReceiverWrapper */
final class getEnvDeviceID$MediaSessionCompat$ResultReceiverWrapper<V> implements writeUInt64NoTag.IconCompatParcelizer<C7144hz> {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    getEnvDeviceID$MediaSessionCompat$ResultReceiverWrapper(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((C7144hz) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
