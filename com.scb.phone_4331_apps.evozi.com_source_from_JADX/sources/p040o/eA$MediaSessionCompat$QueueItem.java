package p040o;

import p040o.access$2300;
import p040o.getProjectAsync;
import p040o.writeUInt64NoTag;

/* renamed from: o.eA$MediaSessionCompat$QueueItem */
final class eA$MediaSessionCompat$QueueItem<V> implements writeUInt64NoTag.IconCompatParcelizer<getProjectAsync.write> {
    private /* synthetic */ Throwable read;
    private /* synthetic */ C4323eA write;

    eA$MediaSessionCompat$QueueItem(C4323eA eAVar, Throwable th) {
        this.write = eAVar;
        this.read = th;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS));
    }
}
