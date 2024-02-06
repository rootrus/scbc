package p040o;

import p040o.access$2300;

/* renamed from: o.sH$MediaBrowserCompat$ItemReceiver */
public final class sH$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<useViewLifecycleInFragment> {
    final /* synthetic */ C7433sH write;

    public final void onComplete() {
    }

    private sH$MediaBrowserCompat$ItemReceiver(C7433sH sHVar) {
        this.write = sHVar;
    }

    public /* synthetic */ sH$MediaBrowserCompat$ItemReceiver(C7433sH sHVar, byte b) {
        this(sHVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        C7433sH sHVar = this.write;
        C10160tf tfVar = new C10160tf(this, (useViewLifecycleInFragment) obj);
        if (sHVar.RatingCompat != null) {
            tfVar.IconCompatParcelizer(sHVar.RatingCompat);
        }
        boolean unused = this.write.write = false;
    }

    public final void onError(Throwable th) {
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        boolean unused = this.write.write = false;
    }
}
