package p040o;

import p040o.GeoDataClient;
import p040o.getCheckSampleImage;
import p040o.writeUInt64NoTag;

/* renamed from: o.isCriteriaMet */
public final /* synthetic */ class isCriteriaMet implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getRating MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getCheckSampleImage.C45173 read;

    public /* synthetic */ isCriteriaMet(getCheckSampleImage.C45173 r1, getRating getrating) {
        this.read = r1;
        this.MediaBrowserCompat$ItemReceiver = getrating;
    }

    public final void IconCompatParcelizer(Object obj) {
        getCheckSampleImage.C45173 r0 = this.read;
        getRating getrating = this.MediaBrowserCompat$ItemReceiver;
        toPrettyString MediaBrowserCompat$ItemReceiver2 = getCheckSampleImage.this.MediaMetadataCompat;
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(new GeoDataClient.BoundsMode(getrating.MediaBrowserCompat$ItemReceiver, getrating.MediaBrowserCompat$CustomActionResultReceiver, getrating.read));
        ((C7130hD) obj).read();
    }
}
