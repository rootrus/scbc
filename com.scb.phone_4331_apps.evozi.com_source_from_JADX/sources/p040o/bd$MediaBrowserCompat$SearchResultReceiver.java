package p040o;

import p040o.IIdImageProcessingListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.bd$MediaBrowserCompat$SearchResultReceiver */
public final class bd$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<IIdImageProcessingListener.IconCompatParcelizer> {
    public static final bd$MediaBrowserCompat$SearchResultReceiver IconCompatParcelizer = new bd$MediaBrowserCompat$SearchResultReceiver();

    bd$MediaBrowserCompat$SearchResultReceiver() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        IIdImageProcessingListener.IconCompatParcelizer iconCompatParcelizer = (IIdImageProcessingListener.IconCompatParcelizer) obj;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        iconCompatParcelizer.write();
    }
}
