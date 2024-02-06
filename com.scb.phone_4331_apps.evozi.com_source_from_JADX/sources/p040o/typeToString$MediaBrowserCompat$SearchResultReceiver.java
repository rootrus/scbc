package p040o;

import p040o.getIIdDeserializerOnDevice;
import p040o.writeUInt64NoTag;

/* renamed from: o.typeToString$MediaBrowserCompat$SearchResultReceiver */
final class typeToString$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdDeserializerOnDevice.IconCompatParcelizer> {
    public static final typeToString$MediaBrowserCompat$SearchResultReceiver write = new typeToString$MediaBrowserCompat$SearchResultReceiver();

    typeToString$MediaBrowserCompat$SearchResultReceiver() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getIIdDeserializerOnDevice.IconCompatParcelizer iconCompatParcelizer = (getIIdDeserializerOnDevice.IconCompatParcelizer) obj;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(false);
        iconCompatParcelizer.write(false);
        iconCompatParcelizer.IconCompatParcelizer(false);
    }
}
