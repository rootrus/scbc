package p040o;

import p040o.access$2300;

/* renamed from: o.getProcessingParameters$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9980xe36c8520 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onStreetViewPanoramaLongClick> {
    final /* synthetic */ getProcessingParameters read;

    private C9980xe36c8520(getProcessingParameters getprocessingparameters) {
        this.read = getprocessingparameters;
    }

    public /* synthetic */ C9980xe36c8520(getProcessingParameters getprocessingparameters, byte b) {
        this(getprocessingparameters);
    }

    public final /* synthetic */ void onNext(Object obj) {
        getProcessingParameters getprocessingparameters = this.read;
        isOdeSupported isodesupported = new isOdeSupported(this, (onStreetViewPanoramaLongClick) obj);
        if (getprocessingparameters.RatingCompat != null) {
            isodesupported.IconCompatParcelizer(getprocessingparameters.RatingCompat);
        }
        boolean unused = this.read.IconCompatParcelizer = false;
    }

    public final void onError(Throwable th) {
        getProcessingParameters getprocessingparameters = this.read;
        getprocessingparameters.MediaBrowserCompat$ItemReceiver(getprocessingparameters.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
        boolean unused = this.read.IconCompatParcelizer = false;
        getProcessingParameters getprocessingparameters2 = this.read;
        BillCaptureActivity_MembersInjector billCaptureActivity_MembersInjector = BillCaptureActivity_MembersInjector.IconCompatParcelizer;
        if (getprocessingparameters2.RatingCompat != null) {
            billCaptureActivity_MembersInjector.IconCompatParcelizer(getprocessingparameters2.RatingCompat);
        }
    }
}
