package p040o;

import p040o.GoogleMap;
import p040o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory;
import p040o.getStringValue;
import p040o.writeUInt64NoTag;

/* renamed from: o.isAssignableFrom */
public final /* synthetic */ class isAssignableFrom implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getStringValue.C46703 IconCompatParcelizer;
    private final /* synthetic */ GoogleMap.OnMapLongClickListener read;

    public /* synthetic */ isAssignableFrom(getStringValue.C46703 r1, GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        this.IconCompatParcelizer = r1;
        this.read = onMapLongClickListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        getStringValue.C46703 r0 = this.IconCompatParcelizer;
        ((IdCaptureModule_GetIIdDeserializerOnDeviceFactory.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(getStringValue.this.read.IconCompatParcelizer(this.read));
    }
}
