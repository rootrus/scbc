package p040o;

import p040o.nativeWriteImageToFileBuffer;
import p040o.newCheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.TwoPassShader */
public final /* synthetic */ class TwoPassShader implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeWriteImageToFileBuffer.read MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ TwoPassShader(nativeWriteImageToFileBuffer.read read) {
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((newCheckExtractor.IconCompatParcelizer) obj).read(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.write.read));
    }
}
