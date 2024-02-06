package p040o;

import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.rotateImage */
public final /* synthetic */ class rotateImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String read;

    public /* synthetic */ rotateImage(String str) {
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((PassportCaptureModule.RttiExceptionResponseDeserializer) obj).write(this.read);
    }
}
