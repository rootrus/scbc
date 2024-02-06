package p040o;

import java.util.Map;
import p040o.nAllocationCreateFromBitmap;

/* renamed from: o.nAllocationCreateBitmapRef */
public final class nAllocationCreateBitmapRef extends nAllocationCreateFromBitmap {
    private final CreditCardCaptureModule_GetIParametersFactory MediaBrowserCompat$CustomActionResultReceiver;
    private final Map<Int4, nAllocationCreateFromBitmap.write> MediaBrowserCompat$ItemReceiver;

    public nAllocationCreateBitmapRef(CreditCardCaptureModule_GetIParametersFactory creditCardCaptureModule_GetIParametersFactory, Map<Int4, nAllocationCreateFromBitmap.write> map) {
        if (creditCardCaptureModule_GetIParametersFactory != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = creditCardCaptureModule_GetIParametersFactory;
            if (map != null) {
                this.MediaBrowserCompat$ItemReceiver = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: package-private */
    public final CreditCardCaptureModule_GetIParametersFactory IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: package-private */
    public final Map<Int4, nAllocationCreateFromBitmap.write> read() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SchedulerConfig{clock=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", values=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nAllocationCreateFromBitmap)) {
            return false;
        }
        nAllocationCreateFromBitmap nallocationcreatefrombitmap = (nAllocationCreateFromBitmap) obj;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.equals(nallocationcreatefrombitmap.IconCompatParcelizer()) || !this.MediaBrowserCompat$ItemReceiver.equals(nallocationcreatefrombitmap.read())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.MediaBrowserCompat$CustomActionResultReceiver.hashCode() ^ 1000003) * 1000003) ^ this.MediaBrowserCompat$ItemReceiver.hashCode();
    }
}
