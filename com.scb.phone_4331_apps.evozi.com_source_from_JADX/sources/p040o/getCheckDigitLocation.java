package p040o;

/* renamed from: o.getCheckDigitLocation */
public final /* synthetic */ class getCheckDigitLocation implements Runnable {
    private final /* synthetic */ C9764x43753c2b MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getCheckDigitLocation(C9764x43753c2b imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$ItemReceiver = imageClassificationCompletedListener$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void run() {
        ImageClassificationCompletedListener imageClassificationCompletedListener = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        ForcedGpuDocumentDetector_Factory forcedGpuDocumentDetector_Factory = ForcedGpuDocumentDetector_Factory.MediaBrowserCompat$ItemReceiver;
        if (imageClassificationCompletedListener.RatingCompat != null) {
            forcedGpuDocumentDetector_Factory.IconCompatParcelizer(imageClassificationCompletedListener.RatingCompat);
        }
    }
}
