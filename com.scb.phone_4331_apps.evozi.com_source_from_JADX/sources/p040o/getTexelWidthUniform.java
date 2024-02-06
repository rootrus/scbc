package p040o;

import p040o.nativeWriteImageToFileBuffer;
import p040o.newCheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTexelWidthUniform */
public final /* synthetic */ class getTexelWidthUniform implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setBoundsBias MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getTexelWidthUniform(setBoundsBias setboundsbias) {
        this.MediaBrowserCompat$ItemReceiver = setboundsbias;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeWriteImageToFileBuffer.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, (newCheckExtractor.IconCompatParcelizer) obj);
    }
}
