package p040o;

import p040o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory;
import p040o.access$2300;
import p040o.getStringValue;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSuperclassTypeParameter */
public final /* synthetic */ class getSuperclassTypeParameter implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable read;
    private final /* synthetic */ getStringValue.C46703 write;

    public /* synthetic */ getSuperclassTypeParameter(getStringValue.C46703 r1, Throwable th) {
        this.write = r1;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getStringValue.C46703 r0 = this.write;
        ((IdCaptureModule_GetIIdDeserializerOnDeviceFactory.IconCompatParcelizer) obj).IconCompatParcelizer(getStringValue.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
