package p040o;

import p040o.removeDataStoreInitializedListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.writeToFile */
public final /* synthetic */ class writeToFile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ removeDataStoreInitializedListener.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ writeToFile(removeDataStoreInitializedListener.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getEpc) obj).write(removeDataStoreInitializedListener.this.MediaSessionCompat$Token);
    }
}
