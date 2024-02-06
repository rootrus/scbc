package p040o;

import p040o.ColorPassThroughShader;
import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.OpenGLESContextManager */
public final /* synthetic */ class OpenGLESContextManager implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setBoundsBias write;

    public /* synthetic */ OpenGLESContextManager(setBoundsBias setboundsbias) {
        this.write = setboundsbias;
    }

    public final void IconCompatParcelizer(Object obj) {
        ColorPassThroughShader.write.read(this.write, (setCvv.write) obj);
    }
}
