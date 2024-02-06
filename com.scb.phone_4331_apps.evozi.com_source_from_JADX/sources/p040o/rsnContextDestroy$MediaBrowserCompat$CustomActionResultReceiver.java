package p040o;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;

/* renamed from: o.rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver */
class rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver {
    final Marker read;
    LatLng write;

    /* synthetic */ rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver(Marker marker, byte b) {
        this(marker);
    }

    private rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver(Marker marker) {
        this.read = marker;
        this.write = marker.getPosition();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver) {
            return this.read.equals(((rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver) obj).read);
        }
        return false;
    }

    public final int hashCode() {
        return this.read.hashCode();
    }
}
