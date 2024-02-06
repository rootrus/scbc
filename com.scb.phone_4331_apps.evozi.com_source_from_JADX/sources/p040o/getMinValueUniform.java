package p040o;

/* renamed from: o.getMinValueUniform */
public final /* synthetic */ class getMinValueUniform implements Runnable {
    private final /* synthetic */ nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ getMinValueUniform(nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver) {
        this.write = nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver;
    }

    public final void run() {
        nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = this.write.MediaBrowserCompat$CustomActionResultReceiver;
        getThresholdUniform getthresholduniform = getThresholdUniform.write;
        if (nativewriteimagetofilebuffer.RatingCompat != null) {
            getthresholduniform.IconCompatParcelizer(nativewriteimagetofilebuffer.RatingCompat);
        }
    }
}
