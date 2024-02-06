package p040o;

import java.util.List;
import p040o.IdCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.UnsafeAllocator */
public final /* synthetic */ class UnsafeAllocator implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ UnsafeAllocator(List list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule.RttiExceptionResponseDeserializer) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
    }
}
