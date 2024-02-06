package p040o;

import p040o.access$2300;

/* renamed from: o.cj$MediaBrowserCompat$CustomActionResultReceiver */
public class cj$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getProjection> {
    private /* synthetic */ C4192cj MediaBrowserCompat$CustomActionResultReceiver;

    public cj$MediaBrowserCompat$CustomActionResultReceiver(C4192cj cjVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = cjVar;
    }

    public final void onError(Throwable th) {
        C4192cj.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        C4192cj.MediaBrowserCompat$SearchResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
        C4192cj cjVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        C9879cc ccVar = C9879cc.read;
        if (cjVar.RatingCompat != null) {
            ccVar.IconCompatParcelizer(cjVar.RatingCompat);
        }
    }
}
