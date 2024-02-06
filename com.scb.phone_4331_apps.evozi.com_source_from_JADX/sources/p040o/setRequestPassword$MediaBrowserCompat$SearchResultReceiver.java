package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.setRequestPassword$MediaBrowserCompat$SearchResultReceiver */
final class setRequestPassword$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractor_Factory> {
    private /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    setRequestPassword$MediaBrowserCompat$SearchResultReceiver(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((PassportExtractor_Factory) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
