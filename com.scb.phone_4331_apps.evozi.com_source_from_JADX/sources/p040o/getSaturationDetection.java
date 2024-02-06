package p040o;

import p040o.GoogleMap;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSaturationDetection */
public final /* synthetic */ class getSaturationDetection implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ GoogleMap.OnMarkerDragListener MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setShadowDetection read;

    public /* synthetic */ getSaturationDetection(setShadowDetection setshadowdetection, GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        this.read = setshadowdetection;
        this.MediaBrowserCompat$CustomActionResultReceiver = onMarkerDragListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        setShadowDetection setshadowdetection = this.read;
        getRestrictiveEndorsement getrestrictiveendorsement = (getRestrictiveEndorsement) obj;
        getrestrictiveendorsement.read(this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat);
        getrestrictiveendorsement.MediaBrowserCompat$ItemReceiver(setshadowdetection.MediaBrowserCompat$ItemReceiver);
    }
}
