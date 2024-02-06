package p040o;

import p040o.access$2300;

/* renamed from: o.cy$MediaBrowserCompat$ItemReceiver */
public final class cy$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzwg> {
    final /* synthetic */ C4223cy MediaBrowserCompat$CustomActionResultReceiver;

    private cy$MediaBrowserCompat$ItemReceiver(C4223cy cyVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = cyVar;
    }

    public /* synthetic */ cy$MediaBrowserCompat$ItemReceiver(C4223cy cyVar, byte b) {
        this(cyVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4223cy cyVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        C4218cs csVar = new C4218cs(this, (zzwg) obj);
        if (cyVar.RatingCompat != null) {
            csVar.IconCompatParcelizer(cyVar.RatingCompat);
        }
        C4223cy.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
