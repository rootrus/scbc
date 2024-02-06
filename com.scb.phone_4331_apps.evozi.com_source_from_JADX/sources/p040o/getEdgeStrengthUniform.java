package p040o;

import p040o.newCheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.getEdgeStrengthUniform */
public final /* synthetic */ class getEdgeStrengthUniform implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUuidFromUtf8Bytes IconCompatParcelizer;
    private final /* synthetic */ nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ animateCameraWithDurationAndCallback write;

    public /* synthetic */ getEdgeStrengthUniform(nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver, animateCameraWithDurationAndCallback animatecamerawithdurationandcallback, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.MediaBrowserCompat$ItemReceiver = nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver;
        this.write = animatecamerawithdurationandcallback;
        this.IconCompatParcelizer = setuuidfromutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$ItemReceiver;
        animateCameraWithDurationAndCallback animatecamerawithdurationandcallback = this.write;
        ((newCheckExtractor.IconCompatParcelizer) obj).read(animatecamerawithdurationandcallback.f2799x50fd9e4a, animatecamerawithdurationandcallback.RatingCompat, new ScaleHistogramShader(nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver, this.IconCompatParcelizer));
    }
}
