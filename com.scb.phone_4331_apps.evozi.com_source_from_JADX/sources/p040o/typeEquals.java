package p040o;

import p040o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory;
import p040o.access$2300;
import p040o.getStringValue;
import p040o.writeUInt64NoTag;

/* renamed from: o.typeEquals */
public final /* synthetic */ class typeEquals implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getStringValue.C46703 IconCompatParcelizer;
    private final /* synthetic */ Throwable MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ typeEquals(getStringValue.C46703 r1, Throwable th) {
        this.IconCompatParcelizer = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getStringValue.C46703 r0 = this.IconCompatParcelizer;
        ((IdCaptureModule_GetIIdDeserializerOnDeviceFactory.IconCompatParcelizer) obj).read(getStringValue.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
