package p040o;

import java.util.List;
import p040o.access$2300;

/* renamed from: o.XVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver */
final class XVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<setInfoWindowAnchor>> {
    final /* synthetic */ XVrsMrzDetector MediaBrowserCompat$CustomActionResultReceiver;

    private XVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver(XVrsMrzDetector xVrsMrzDetector) {
        this.MediaBrowserCompat$CustomActionResultReceiver = xVrsMrzDetector;
    }

    /* synthetic */ XVrsMrzDetector$MediaBrowserCompat$CustomActionResultReceiver(XVrsMrzDetector xVrsMrzDetector, byte b) {
        this(xVrsMrzDetector);
    }

    public final /* synthetic */ void onNext(Object obj) {
        XVrsMrzDetector.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        XVrsMrzDetector xVrsMrzDetector = this.MediaBrowserCompat$CustomActionResultReceiver;
        process process = new process(this, (List) obj);
        if (xVrsMrzDetector.RatingCompat != null) {
            process.IconCompatParcelizer(xVrsMrzDetector.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
