package p040o;

import p040o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory;
import p040o.access$2300;
import p040o.getStringValue;
import p040o.writeUInt64NoTag;

/* renamed from: o.JsonToken */
public final /* synthetic */ class JsonToken implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Throwable IconCompatParcelizer;
    private final /* synthetic */ getStringValue.C46703 write;

    public /* synthetic */ JsonToken(getStringValue.C46703 r1, Throwable th) {
        this.write = r1;
        this.IconCompatParcelizer = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getStringValue.C46703 r0 = this.write;
        ((IdCaptureModule_GetIIdDeserializerOnDeviceFactory.IconCompatParcelizer) obj).write(getStringValue.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, access$2300.write.JUST_DISMISS));
    }
}
