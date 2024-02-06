package p040o;

import p040o.C4339eH;
import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.eH$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver */
final class eH$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70729.write> {
    private /* synthetic */ setOnMapLoadedCallback MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ C4339eH.IconCompatParcelizer write;

    eH$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver(C4339eH.IconCompatParcelizer iconCompatParcelizer, setOnMapLoadedCallback setonmaploadedcallback) {
        this.write = iconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = setonmaploadedcallback;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((ServerProjectProvider.C70729.write) obj).read(this.write.MediaBrowserCompat$ItemReceiver.read.read(this.write.write, this.MediaBrowserCompat$ItemReceiver, true));
    }
}
