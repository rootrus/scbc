package p040o;

import p040o.C7126xb23daf18;

/* renamed from: o.SinglePassShader */
public final /* synthetic */ class SinglePassShader implements C7126xb23daf18.read {
    private final /* synthetic */ setUuidFromUtf8Bytes read;
    private final /* synthetic */ nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ SinglePassShader(nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.write = nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver;
        this.read = setuuidfromutf8bytes;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        nativeWriteImageToFileBuffer$MediaBrowserCompat$ItemReceiver nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver = this.write;
        setUuidFromUtf8Bytes setuuidfromutf8bytes = this.read;
        nativeWriteImageToFileBuffer nativewriteimagetofilebuffer = nativewriteimagetofilebuffer_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        getContextManager getcontextmanager = new getContextManager(setuuidfromutf8bytes);
        if (nativewriteimagetofilebuffer.RatingCompat != null) {
            getcontextmanager.IconCompatParcelizer(nativewriteimagetofilebuffer.RatingCompat);
        }
    }
}
