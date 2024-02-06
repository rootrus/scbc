package p040o;

import com.google.common.base.Throwables;
import java.io.IOException;

/* renamed from: o.rsnAllocationCreateBitmapBackedAllocation */
public class rsnAllocationCreateBitmapBackedAllocation extends rsnAllocationGenerateMipmaps implements Cloneable {
    private rsnAllocationCubeCreateFromBitmap jsonFactory;

    public final rsnAllocationCubeCreateFromBitmap getFactory() {
        return this.jsonFactory;
    }

    public final void setFactory(rsnAllocationCubeCreateFromBitmap rsnallocationcubecreatefrombitmap) {
        this.jsonFactory = rsnallocationcubecreatefrombitmap;
    }

    public String toString() {
        rsnAllocationCubeCreateFromBitmap rsnallocationcubecreatefrombitmap = this.jsonFactory;
        if (rsnallocationcubecreatefrombitmap == null) {
            return super.toString();
        }
        try {
            return rsnallocationcubecreatefrombitmap.MediaBrowserCompat$CustomActionResultReceiver(this).toString("UTF-8");
        } catch (IOException e) {
            throw Throwables.propagate(e);
        }
    }

    public String toPrettyString() throws IOException {
        rsnAllocationCubeCreateFromBitmap rsnallocationcubecreatefrombitmap = this.jsonFactory;
        return rsnallocationcubecreatefrombitmap != null ? rsnallocationcubecreatefrombitmap.MediaBrowserCompat$CustomActionResultReceiver(this).toString("UTF-8") : super.toString();
    }

    public rsnAllocationCreateBitmapBackedAllocation clone() {
        return (rsnAllocationCreateBitmapBackedAllocation) super.clone();
    }

    public rsnAllocationCreateBitmapBackedAllocation set(String str, Object obj) {
        return (rsnAllocationCreateBitmapBackedAllocation) super.set(str, obj);
    }
}
