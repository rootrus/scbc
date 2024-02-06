package p040o;

/* renamed from: o.detectVersion$MediaBrowserCompat$CustomActionResultReceiver */
public class detectVersion$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<afterExecute> {
    final /* synthetic */ detectVersion MediaBrowserCompat$ItemReceiver;

    private detectVersion$MediaBrowserCompat$CustomActionResultReceiver(detectVersion detectversion) {
        this.MediaBrowserCompat$ItemReceiver = detectversion;
    }

    public /* synthetic */ detectVersion$MediaBrowserCompat$CustomActionResultReceiver(detectVersion detectversion, byte b) {
        this(detectversion);
    }

    public final /* synthetic */ void onNext(Object obj) {
        detectVersion detectversion = this.MediaBrowserCompat$ItemReceiver;
        getClassificationMode getclassificationmode = new getClassificationMode(this, (afterExecute) obj);
        if (detectversion.RatingCompat != null) {
            getclassificationmode.IconCompatParcelizer(detectversion.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        detectVersion detectversion = this.MediaBrowserCompat$ItemReceiver;
        FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions = new FirebaseVisionFaceDetectorOptions(detectversion, th);
        if (detectversion.RatingCompat != null) {
            firebaseVisionFaceDetectorOptions.IconCompatParcelizer(detectversion.RatingCompat);
        }
    }
}
