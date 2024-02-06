package p040o;

import p040o.access$2300;

/* renamed from: o.getProfile$MediaBrowserCompat$ItemReceiver */
public final class getProfile$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getInitialTrigger> {
    private /* synthetic */ getProfile MediaBrowserCompat$ItemReceiver;

    private getProfile$MediaBrowserCompat$ItemReceiver(getProfile getprofile) {
        this.MediaBrowserCompat$ItemReceiver = getprofile;
    }

    public /* synthetic */ getProfile$MediaBrowserCompat$ItemReceiver(getProfile getprofile, byte b) {
        this(getprofile);
    }

    public final void onError(Throwable th) {
        getProfile.read(this.MediaBrowserCompat$ItemReceiver);
        if (!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public final /* synthetic */ void onNext(Object obj) {
        getProfile.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        getProfile getprofile = this.MediaBrowserCompat$ItemReceiver;
        RetrieveScanSettings retrieveScanSettings = RetrieveScanSettings.MediaBrowserCompat$CustomActionResultReceiver;
        if (getprofile.RatingCompat != null) {
            retrieveScanSettings.IconCompatParcelizer(getprofile.RatingCompat);
        }
    }
}
