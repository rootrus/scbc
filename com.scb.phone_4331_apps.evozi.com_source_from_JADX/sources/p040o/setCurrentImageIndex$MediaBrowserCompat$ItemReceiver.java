package p040o;

import p040o.setCurrentImageIndex;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCurrentImageIndex$MediaBrowserCompat$ItemReceiver */
final class setCurrentImageIndex$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
    private /* synthetic */ setCurrentImageIndex.write MediaBrowserCompat$ItemReceiver;

    setCurrentImageIndex$MediaBrowserCompat$ItemReceiver(setCurrentImageIndex.write write) {
        this.MediaBrowserCompat$ItemReceiver = write;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ExtractionParameters) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
