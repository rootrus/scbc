package p040o;

import p040o.LocationSource;
import p040o.access$2300;

/* renamed from: o.AppstatsThresholdReachedListener$MediaBrowserCompat$CustomActionResultReceiver */
final class C3046x22918e66 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<LocationSource.OnLocationChangedListener> {
    private /* synthetic */ AppstatsThresholdReachedListener MediaBrowserCompat$CustomActionResultReceiver;

    private C3046x22918e66(AppstatsThresholdReachedListener appstatsThresholdReachedListener) {
        this.MediaBrowserCompat$CustomActionResultReceiver = appstatsThresholdReachedListener;
    }

    /* synthetic */ C3046x22918e66(AppstatsThresholdReachedListener appstatsThresholdReachedListener, byte b) {
        this(appstatsThresholdReachedListener);
    }

    public final /* synthetic */ void onNext(Object obj) {
        LocationSource.OnLocationChangedListener onLocationChangedListener = (LocationSource.OnLocationChangedListener) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) {
            AppstatsThresholdReachedListener.write(this.MediaBrowserCompat$CustomActionResultReceiver, onLocationChangedListener.MediaBrowserCompat$CustomActionResultReceiver);
            AppstatsThresholdReachedListener.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void onError(Throwable th) {
        if ((this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat != null) && !this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            AppstatsThresholdReachedListener.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }
}
