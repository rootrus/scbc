package p040o;

import p040o.GoogleMap;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDsValueInt */
public final /* synthetic */ class setDsValueInt implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ GoogleMap.OnMarkerDragListener MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setDsValueInt(GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        this.MediaBrowserCompat$CustomActionResultReceiver = onMarkerDragListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getAverageSpotNoiseGroupingsPerSquareInch) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver.setTitle);
    }
}
