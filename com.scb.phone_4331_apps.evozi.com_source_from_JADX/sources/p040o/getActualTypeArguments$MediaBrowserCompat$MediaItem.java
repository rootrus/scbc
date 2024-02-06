package p040o;

import p040o.getIExceptionResponseDeserializerOnDevice;
import p040o.writeUInt64NoTag;

/* renamed from: o.getActualTypeArguments$MediaBrowserCompat$MediaItem */
public final class getActualTypeArguments$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getIExceptionResponseDeserializerOnDevice.IconCompatParcelizer> {
    public static final getActualTypeArguments$MediaBrowserCompat$MediaItem IconCompatParcelizer = new getActualTypeArguments$MediaBrowserCompat$MediaItem();

    getActualTypeArguments$MediaBrowserCompat$MediaItem() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getIExceptionResponseDeserializerOnDevice.IconCompatParcelizer iconCompatParcelizer = (getIExceptionResponseDeserializerOnDevice.IconCompatParcelizer) obj;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(false);
        iconCompatParcelizer.read();
    }
}
