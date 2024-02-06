package p040o;

import p040o.newCheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.PassThroughShader */
public final /* synthetic */ class PassThroughShader implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUuidFromUtf8Bytes IconCompatParcelizer;
    private final /* synthetic */ nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ animateCameraWithDurationAndCallback read;

    public /* synthetic */ PassThroughShader(nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver, animateCameraWithDurationAndCallback animatecamerawithdurationandcallback, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.MediaBrowserCompat$ItemReceiver = nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver;
        this.read = animatecamerawithdurationandcallback;
        this.IconCompatParcelizer = setuuidfromutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$ItemReceiver;
        animateCameraWithDurationAndCallback animatecamerawithdurationandcallback = this.read;
        ((newCheckExtractor.IconCompatParcelizer) obj).read(animatecamerawithdurationandcallback.f2799x50fd9e4a, animatecamerawithdurationandcallback.RatingCompat, new SinglePassShader(nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver, this.IconCompatParcelizer));
    }
}
