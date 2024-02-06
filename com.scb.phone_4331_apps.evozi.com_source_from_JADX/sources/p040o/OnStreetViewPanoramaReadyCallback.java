package p040o;

import java.util.List;

/* renamed from: o.OnStreetViewPanoramaReadyCallback */
public final class OnStreetViewPanoramaReadyCallback extends zzuk {
    public List<setActivity> MediaBrowserCompat$CustomActionResultReceiver;

    public OnStreetViewPanoramaReadyCallback(List<setActivity> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        List<setActivity> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        List<setActivity> list2 = ((OnStreetViewPanoramaReadyCallback) obj).MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<setActivity> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
