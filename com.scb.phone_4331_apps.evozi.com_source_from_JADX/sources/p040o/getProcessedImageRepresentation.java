package p040o;

import p040o.ImageProcessor;

/* renamed from: o.getProcessedImageRepresentation */
public final /* synthetic */ class getProcessedImageRepresentation implements Runnable {
    private final /* synthetic */ ImageProcessor.IpProgressClient.C34831.write IconCompatParcelizer;

    public /* synthetic */ getProcessedImageRepresentation(ImageProcessor.IpProgressClient.C34831.write write) {
        this.IconCompatParcelizer = write;
    }

    public final void run() {
        ImageProcessor.IpProgressClient.C34831 r0 = ImageProcessor.IpProgressClient.C34831.this;
        ImageProcessor.AnalysisProgressListener analysisProgressListener = ImageProcessor.AnalysisProgressListener.MediaBrowserCompat$CustomActionResultReceiver;
        if (r0.RatingCompat != null) {
            analysisProgressListener.IconCompatParcelizer(r0.RatingCompat);
        }
    }
}
