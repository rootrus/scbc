package p040o;

import p040o.access$2300;

/* renamed from: o.addLicenseFoundEventListener$MediaBrowserCompat$CustomActionResultReceiver */
public class C4011x6406d919 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setOnStreetViewPanoramaChangeListener> {
    final /* synthetic */ addLicenseFoundEventListener MediaBrowserCompat$ItemReceiver;

    private C4011x6406d919(addLicenseFoundEventListener addlicensefoundeventlistener) {
        this.MediaBrowserCompat$ItemReceiver = addlicensefoundeventlistener;
    }

    public /* synthetic */ C4011x6406d919(addLicenseFoundEventListener addlicensefoundeventlistener, byte b) {
        this(addlicensefoundeventlistener);
    }

    public final /* synthetic */ void onNext(Object obj) {
        setOnStreetViewPanoramaChangeListener setonstreetviewpanoramachangelistener = (setOnStreetViewPanoramaChangeListener) obj;
        setOnStreetViewPanoramaChangeListener unused = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = setonstreetviewpanoramachangelistener;
        addLicenseFoundEventListener addlicensefoundeventlistener = this.MediaBrowserCompat$ItemReceiver;
        imageJustCaptured imagejustcaptured = new imageJustCaptured(this, setonstreetviewpanoramachangelistener);
        if (addlicensefoundeventlistener.RatingCompat != null) {
            imagejustcaptured.IconCompatParcelizer(addlicensefoundeventlistener.RatingCompat);
        }
        addLicenseFoundEventListener.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
