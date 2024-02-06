package p040o;

import p040o.nativeWriteImageToFileBuffer;
import p040o.newCheckExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.GraySobelShader */
public final /* synthetic */ class GraySobelShader implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ GraySobelShader read = new GraySobelShader();

    private /* synthetic */ GraySobelShader() {
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeWriteImageToFileBuffer.IconCompatParcelizer.write((newCheckExtractor.IconCompatParcelizer) obj);
    }
}
