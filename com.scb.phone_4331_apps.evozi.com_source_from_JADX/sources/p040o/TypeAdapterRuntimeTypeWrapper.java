package p040o;

import p040o.IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.TypeAdapterRuntimeTypeWrapper */
public final /* synthetic */ class TypeAdapterRuntimeTypeWrapper implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ TypeAdapterRuntimeTypeWrapper(int[] iArr) {
        this.MediaBrowserCompat$ItemReceiver = iArr;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory.write) obj).read(this.MediaBrowserCompat$ItemReceiver);
    }
}
