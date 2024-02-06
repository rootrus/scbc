package p040o;

import p040o.access$2300;

/* renamed from: o.ICheckDetector$MediaBrowserCompat$ItemReceiver */
final class ICheckDetector$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<performAction> {
    private /* synthetic */ ICheckDetector read;

    private ICheckDetector$MediaBrowserCompat$ItemReceiver(ICheckDetector iCheckDetector) {
        this.read = iCheckDetector;
    }

    /* synthetic */ ICheckDetector$MediaBrowserCompat$ItemReceiver(ICheckDetector iCheckDetector, byte b) {
        this(iCheckDetector);
    }

    public final /* synthetic */ void onNext(Object obj) {
        performAction performaction = (performAction) obj;
        super.onNext(performaction);
        ICheckDetector iCheckDetector = this.read;
        nativeRotateImage nativerotateimage = nativeRotateImage.write;
        boolean z = true;
        if (iCheckDetector.RatingCompat != null) {
            nativerotateimage.IconCompatParcelizer(iCheckDetector.RatingCompat);
        }
        if (performaction.MediaBrowserCompat$CustomActionResultReceiver) {
            ICheckDetector iCheckDetector2 = this.read;
            iCheckDetector2.MediaBrowserCompat$ItemReceiver(iCheckDetector2.MediaBrowserCompat$CustomActionResultReceiver.read(performaction.IconCompatParcelizer, performaction.write, access$2300.write.JUST_DISMISS));
            return;
        }
        ICheckDetector iCheckDetector3 = this.read;
        DetectorDebugUtils detectorDebugUtils = DetectorDebugUtils.IconCompatParcelizer;
        if (iCheckDetector3.RatingCompat == null) {
            z = false;
        }
        if (z) {
            detectorDebugUtils.IconCompatParcelizer(iCheckDetector3.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        ICheckDetector iCheckDetector = this.read;
        iCheckDetector.MediaBrowserCompat$ItemReceiver(iCheckDetector.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
