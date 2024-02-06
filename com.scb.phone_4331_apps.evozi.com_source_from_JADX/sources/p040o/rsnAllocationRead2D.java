package p040o;

import android.view.View;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: o.rsnAllocationRead2D */
public final class rsnAllocationRead2D implements GoogleMap.OnInfoWindowClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnMarkerDragListener, GoogleMap.InfoWindowAdapter {
    final GoogleMap IconCompatParcelizer;
    final Map<Marker, IconCompatParcelizer> MediaBrowserCompat$ItemReceiver = new HashMap();

    public rsnAllocationRead2D(GoogleMap googleMap) {
        new HashMap();
        this.IconCompatParcelizer = googleMap;
    }

    public final View getInfoWindow(Marker marker) {
        this.MediaBrowserCompat$ItemReceiver.get(marker);
        return null;
    }

    public final View getInfoContents(Marker marker) {
        this.MediaBrowserCompat$ItemReceiver.get(marker);
        return null;
    }

    public final void onInfoWindowClick(Marker marker) {
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.get(marker);
        if (iconCompatParcelizer != null && iconCompatParcelizer.IconCompatParcelizer != null) {
            iconCompatParcelizer.IconCompatParcelizer.onInfoWindowClick(marker);
        }
    }

    public final boolean onMarkerClick(Marker marker) {
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.get(marker);
        if (iconCompatParcelizer == null || iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver == null) {
            return false;
        }
        return iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.onMarkerClick(marker);
    }

    public final void onMarkerDragStart(Marker marker) {
        this.MediaBrowserCompat$ItemReceiver.get(marker);
    }

    public final void onMarkerDrag(Marker marker) {
        this.MediaBrowserCompat$ItemReceiver.get(marker);
    }

    public final void onMarkerDragEnd(Marker marker) {
        this.MediaBrowserCompat$ItemReceiver.get(marker);
    }

    public final boolean write(Marker marker) {
        boolean z;
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.get(marker);
        if (iconCompatParcelizer != null) {
            if (iconCompatParcelizer.write.remove(marker)) {
                rsnAllocationRead2D.this.MediaBrowserCompat$ItemReceiver.remove(marker);
                marker.remove();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o.rsnAllocationRead2D$IconCompatParcelizer */
    public class IconCompatParcelizer {
        public GoogleMap.OnInfoWindowClickListener IconCompatParcelizer;
        public GoogleMap.OnMarkerClickListener MediaBrowserCompat$CustomActionResultReceiver;
        final Set<Marker> write = new HashSet();

        public IconCompatParcelizer() {
        }

        public final Marker MediaBrowserCompat$CustomActionResultReceiver(MarkerOptions markerOptions) {
            Marker addMarker = rsnAllocationRead2D.this.IconCompatParcelizer.addMarker(markerOptions);
            this.write.add(addMarker);
            rsnAllocationRead2D.this.MediaBrowserCompat$ItemReceiver.put(addMarker, this);
            return addMarker;
        }

        public final void write() {
            for (Marker next : this.write) {
                next.remove();
                rsnAllocationRead2D.this.MediaBrowserCompat$ItemReceiver.remove(next);
            }
            this.write.clear();
        }
    }
}
