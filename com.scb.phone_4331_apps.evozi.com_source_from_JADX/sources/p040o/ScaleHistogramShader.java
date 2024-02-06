package p040o;

import p040o.C7126xb23daf18;

/* renamed from: o.ScaleHistogramShader */
public final /* synthetic */ class ScaleHistogramShader implements C7126xb23daf18.read {
    private final /* synthetic */ setUuidFromUtf8Bytes IconCompatParcelizer;
    private final /* synthetic */ nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ ScaleHistogramShader(nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.read = nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver;
        this.IconCompatParcelizer = setuuidfromutf8bytes;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver = this.read;
        setUuidFromUtf8Bytes setuuidfromutf8bytes = this.IconCompatParcelizer;
        boolean z = true;
        setuuidfromutf8bytes.MediaBrowserCompat$ItemReceiver(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(setuuidfromutf8bytes.write(), true));
        nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        Shader shader = new Shader(setuuidfromutf8bytes);
        if (nativewriteimagetofilebuffer.RatingCompat == null) {
            z = false;
        }
        if (z) {
            shader.IconCompatParcelizer(nativewriteimagetofilebuffer.RatingCompat);
        }
    }
}
