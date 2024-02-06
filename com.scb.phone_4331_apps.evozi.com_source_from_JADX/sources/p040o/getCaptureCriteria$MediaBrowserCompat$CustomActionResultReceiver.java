package p040o;

import p040o.access$2300;

/* renamed from: o.getCaptureCriteria$MediaBrowserCompat$CustomActionResultReceiver */
public class getCaptureCriteria$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<isStreetNamesEnabled> {
    private /* synthetic */ getCaptureCriteria IconCompatParcelizer;

    private getCaptureCriteria$MediaBrowserCompat$CustomActionResultReceiver(getCaptureCriteria getcapturecriteria) {
        this.IconCompatParcelizer = getcapturecriteria;
    }

    public /* synthetic */ getCaptureCriteria$MediaBrowserCompat$CustomActionResultReceiver(getCaptureCriteria getcapturecriteria, byte b) {
        this(getcapturecriteria);
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }

    public final /* synthetic */ void onNext(Object obj) {
        getCaptureCriteria.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        getCaptureCriteria getcapturecriteria = this.IconCompatParcelizer;
        setPageLongEdgeThreshold setpagelongedgethreshold = setPageLongEdgeThreshold.read;
        if (getcapturecriteria.RatingCompat != null) {
            setpagelongedgethreshold.IconCompatParcelizer(getcapturecriteria.RatingCompat);
        }
    }
}
