package p040o;

import java.util.List;
import p040o.access$2300;

/* renamed from: o.gM$MediaBrowserCompat$ItemReceiver */
final class gM$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<setZoomControlsEnabled>> {
    private /* synthetic */ C4455gM IconCompatParcelizer;

    public final void onComplete() {
    }

    private gM$MediaBrowserCompat$ItemReceiver(C4455gM gMVar) {
        this.IconCompatParcelizer = gMVar;
    }

    /* synthetic */ gM$MediaBrowserCompat$ItemReceiver(C4455gM gMVar, byte b) {
        this(gMVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4455gM.IconCompatParcelizer(this.IconCompatParcelizer);
        List unused = this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper = (List) obj;
        C4455gM gMVar = this.IconCompatParcelizer;
        gMVar.MediaBrowserCompat$ItemReceiver(gMVar.MediaBrowserCompat$ItemReceiver());
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
