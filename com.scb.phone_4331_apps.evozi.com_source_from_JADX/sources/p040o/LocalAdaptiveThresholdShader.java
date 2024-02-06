package p040o;

import p040o.nativeWriteImageToFileBuffer;
import p040o.newCheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.LocalAdaptiveThresholdShader */
public final /* synthetic */ class LocalAdaptiveThresholdShader implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ nativeWriteImageToFileBuffer.write write;

    public /* synthetic */ LocalAdaptiveThresholdShader(nativeWriteImageToFileBuffer.write write2, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.write = write2;
        this.MediaBrowserCompat$CustomActionResultReceiver = setuuidfromutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        newCheckExtractor.IconCompatParcelizer iconCompatParcelizer = (newCheckExtractor.IconCompatParcelizer) obj;
        iconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, nativeWriteImageToFileBuffer.MediaMetadataCompat(nativeWriteImageToFileBuffer.this));
    }
}
