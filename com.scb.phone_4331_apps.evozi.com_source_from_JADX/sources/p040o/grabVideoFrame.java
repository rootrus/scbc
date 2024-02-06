package p040o;

import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.grabVideoFrame */
public final /* synthetic */ class grabVideoFrame implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ long MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ nativeConfigureFromFile MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ PlacePhotoMetadataResult write;

    public /* synthetic */ grabVideoFrame(nativeConfigureFromFile nativeconfigurefromfile, PlacePhotoMetadataResult placePhotoMetadataResult, long j) {
        this.MediaBrowserCompat$ItemReceiver = nativeconfigurefromfile;
        this.write = placePhotoMetadataResult;
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigureFromFile nativeconfigurefromfile = this.MediaBrowserCompat$ItemReceiver;
        PlacePhotoMetadataResult placePhotoMetadataResult = this.write;
        ((IdParameters.C6915a) obj).MediaBrowserCompat$ItemReceiver(nativeconfigurefromfile.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(placePhotoMetadataResult), this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
