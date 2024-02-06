package p040o;

import p040o.access$2300;

/* renamed from: o.cy$MediaBrowserCompat$CustomActionResultReceiver */
public final class cy$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getProjection> {
    private /* synthetic */ C4223cy MediaBrowserCompat$ItemReceiver;

    private cy$MediaBrowserCompat$CustomActionResultReceiver(C4223cy cyVar) {
        this.MediaBrowserCompat$ItemReceiver = cyVar;
    }

    public /* synthetic */ cy$MediaBrowserCompat$CustomActionResultReceiver(C4223cy cyVar, byte b) {
        this(cyVar);
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4223cy cyVar = this.MediaBrowserCompat$ItemReceiver;
        C9882cu cuVar = C9882cu.IconCompatParcelizer;
        if (cyVar.RatingCompat != null) {
            cuVar.IconCompatParcelizer(cyVar.RatingCompat);
        }
        C4223cy.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
