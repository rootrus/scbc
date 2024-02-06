package p040o;

import p040o.nativeWriteImageToFileBuffer;
import p040o.newCheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.RgbSobelShader */
public final /* synthetic */ class RgbSobelShader implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUuidFromUtf8Bytes IconCompatParcelizer;
    private final /* synthetic */ nativeWriteImageToFileBuffer.write MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ RgbSobelShader(nativeWriteImageToFileBuffer.write write, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
        this.IconCompatParcelizer = setuuidfromutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        newCheckExtractor.IconCompatParcelizer iconCompatParcelizer = (newCheckExtractor.IconCompatParcelizer) obj;
        iconCompatParcelizer.write(this.IconCompatParcelizer, nativeWriteImageToFileBuffer.MediaMetadataCompat(nativeWriteImageToFileBuffer.this));
    }
}
