package p040o;

import p040o.ImageProcessor;

/* renamed from: o.addProcessProgressEventListener */
public final /* synthetic */ class addProcessProgressEventListener implements Runnable {
    private final /* synthetic */ C3488xb230e6e1 read;

    public /* synthetic */ addProcessProgressEventListener(C3488xb230e6e1 imageProcessor$ImageOutListener$MediaBrowserCompat$CustomActionResultReceiver) {
        this.read = imageProcessor$ImageOutListener$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void run() {
        ImageProcessor.ImageOutListener imageOutListener = this.read.IconCompatParcelizer;
        ImageProcessor.C34811 r1 = ImageProcessor.C34811.write;
        if (imageOutListener.RatingCompat != null) {
            r1.IconCompatParcelizer(imageOutListener.RatingCompat);
        }
    }
}
