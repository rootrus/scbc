package p040o;

import p040o.getIIdDeserializerOnDevice;
import p040o.writeUInt64NoTag;

/* renamed from: o.typeToString$MediaBrowserCompat$MediaItem */
final class typeToString$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getIIdDeserializerOnDevice.IconCompatParcelizer> {
    private /* synthetic */ boolean IconCompatParcelizer;
    private /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ typeToString write;

    typeToString$MediaBrowserCompat$MediaItem(typeToString typetostring, boolean z, int i) {
        this.write = typetostring;
        this.IconCompatParcelizer = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getIIdDeserializerOnDevice.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver(this.write.IconCompatParcelizer, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
