package p040o;

import java.util.Iterator;
import java.util.Map;
import p040o.rsnAllocationElementData1D;

/* renamed from: o.rsnAllocationGenerateMipmaps$MediaBrowserCompat$CustomActionResultReceiver */
final class C10129xd388b9b6 implements Iterator<Map.Entry<String, Object>> {
    private final Iterator<Map.Entry<String, Object>> IconCompatParcelizer;
    private boolean MediaBrowserCompat$ItemReceiver;
    private final Iterator<Map.Entry<String, Object>> write;

    C10129xd388b9b6(rsnAllocationGenerateMipmaps rsnallocationgeneratemipmaps, rsnAllocationElementData1D.read read) {
        this.write = new rsnAllocationElementData1D.write();
        this.IconCompatParcelizer = rsnallocationgeneratemipmaps.unknownFields.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.write.hasNext() || this.IconCompatParcelizer.hasNext();
    }

    public final void remove() {
        if (this.MediaBrowserCompat$ItemReceiver) {
            this.IconCompatParcelizer.remove();
        }
        this.write.remove();
    }

    public final /* synthetic */ Object next() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            if (this.write.hasNext()) {
                return this.write.next();
            }
            this.MediaBrowserCompat$ItemReceiver = true;
        }
        return this.IconCompatParcelizer.next();
    }
}
