package p040o;

import p040o.nativeWriteImageToFileBuffer;

/* renamed from: o.getTexelHeightUniform */
public final /* synthetic */ class getTexelHeightUniform implements Runnable {
    private final /* synthetic */ nativeWriteImageToFileBuffer.write MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getTexelHeightUniform(nativeWriteImageToFileBuffer.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
    }

    public final void run() {
        nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = nativeWriteImageToFileBuffer.this;
        getThresholdUniform getthresholduniform = getThresholdUniform.write;
        if (nativewriteimagetofilebuffer.RatingCompat != null) {
            getthresholduniform.IconCompatParcelizer(nativewriteimagetofilebuffer.RatingCompat);
        }
    }
}
