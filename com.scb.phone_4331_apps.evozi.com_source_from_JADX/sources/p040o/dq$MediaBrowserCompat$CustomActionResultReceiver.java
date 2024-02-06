package p040o;

import p040o.access$2300;

/* renamed from: o.dq$MediaBrowserCompat$CustomActionResultReceiver */
public final class dq$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setMyLocationEnabled> {
    private /* synthetic */ C4295dq MediaBrowserCompat$ItemReceiver;
    private final boolean write;

    public dq$MediaBrowserCompat$CustomActionResultReceiver(C4295dq dqVar, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = dqVar;
        this.write = z;
    }

    public final /* synthetic */ void onNext(Object obj) {
        setMyLocationEnabled setmylocationenabled = (setMyLocationEnabled) obj;
        onGetStartedClick.write((Object) setmylocationenabled, "partnerConsent");
        C4295dq.write(this.MediaBrowserCompat$ItemReceiver);
        C4295dq dqVar = this.MediaBrowserCompat$ItemReceiver;
        C4295dq.MediaBrowserCompat$CustomActionResultReceiver(dqVar, this.write, dqVar.IconCompatParcelizer.MediaMetadataCompat(setmylocationenabled.write));
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
