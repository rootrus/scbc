package p040o;

import p040o.nativeWriteImageToFileBuffer;
import p040o.newCheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.YuvToRgbShader */
public final /* synthetic */ class YuvToRgbShader implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ finalizePreviousNativeSession write;

    public /* synthetic */ YuvToRgbShader(finalizePreviousNativeSession finalizepreviousnativesession) {
        this.write = finalizepreviousnativesession;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeWriteImageToFileBuffer.read.IconCompatParcelizer(this.write, (newCheckExtractor.IconCompatParcelizer) obj);
    }
}
