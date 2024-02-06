package p040o;

import p040o.GeoDataClient;
import p040o.getCheckSampleImage;
import p040o.writeUInt64NoTag;

/* renamed from: o.isCheckCaptureExperience */
public final /* synthetic */ class isCheckCaptureExperience implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCheckSampleImage.C45185 IconCompatParcelizer;
    private final /* synthetic */ getRating MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ isCheckCaptureExperience(getCheckSampleImage.C45185 r1, getRating getrating) {
        this.IconCompatParcelizer = r1;
        this.MediaBrowserCompat$ItemReceiver = getrating;
    }

    public final void IconCompatParcelizer(Object obj) {
        getCheckSampleImage.C45185 r0 = this.IconCompatParcelizer;
        getRating getrating = this.MediaBrowserCompat$ItemReceiver;
        toPrettyString MediaBrowserCompat$ItemReceiver2 = getCheckSampleImage.this.MediaMetadataCompat;
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(new GeoDataClient.BoundsMode(getrating.MediaBrowserCompat$ItemReceiver, getrating.MediaBrowserCompat$CustomActionResultReceiver, getrating.read));
        ((C7130hD) obj).read();
    }
}
