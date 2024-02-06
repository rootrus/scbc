package p040o;

import p040o.C4131c;
import p040o.access$2300;

/* renamed from: o.c$3$MediaBrowserCompat$CustomActionResultReceiver */
public class c$3$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setMyLocationEnabled> {
    private /* synthetic */ C4131c.C41333 MediaBrowserCompat$ItemReceiver;

    protected c$3$MediaBrowserCompat$CustomActionResultReceiver(C4131c.C41333 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4131c.C41333.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, ((setMyLocationEnabled) obj).write, this.MediaBrowserCompat$ItemReceiver.write.IconCompatParcelizer);
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final void onComplete() {
        C4131c.C41333.MediaBrowserCompat$SearchResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
