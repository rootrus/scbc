package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_Application;
import p040o.C3085x7c929f5b;

/* renamed from: o.nE$MediaBrowserCompat$ItemReceiver */
public final class nE$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<scrollGesturesEnabled> {
    private /* synthetic */ C3085x7c929f5b.C30861 IconCompatParcelizer;
    private /* synthetic */ AutoValue_CrashlyticsReport_Session_Application.C30641 MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ C5000nE write;

    public nE$MediaBrowserCompat$ItemReceiver(C5000nE nEVar, C3085x7c929f5b.C30861 r2, AutoValue_CrashlyticsReport_Session_Application.C30641 r3) {
        this.write = nEVar;
        this.IconCompatParcelizer = r2;
        this.MediaBrowserCompat$CustomActionResultReceiver = r3;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        scrollGesturesEnabled scrollgesturesenabled = (scrollGesturesEnabled) obj;
        C5000nE nEVar = this.write;
        C3085x7c929f5b.C30861 r1 = this.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) scrollgesturesenabled, "it");
        C5000nE.MediaBrowserCompat$ItemReceiver(nEVar, r1, scrollgesturesenabled, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
