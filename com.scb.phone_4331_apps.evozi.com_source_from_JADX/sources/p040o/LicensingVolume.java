package p040o;

import p040o.C10829Sizeof;
import p040o.writeUInt64NoTag;

/* renamed from: o.LicensingVolume */
public final /* synthetic */ class LicensingVolume implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C10829Sizeof.C37931 MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ PlacePhotoMetadataResult MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ long write;

    /* renamed from: o.LicensingVolume$LicenseResults */
    public final /* synthetic */ class LicenseResults implements getAllowReturnTransitionOverlap {
        public static final /* synthetic */ LicenseResults write = new LicenseResults();

        private /* synthetic */ LicenseResults() {
        }

        public final boolean write(Object obj) {
            return C10829Sizeof.C37931.read((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) obj);
        }
    }

    public /* synthetic */ LicensingVolume(C10829Sizeof.C37931 r1, PlacePhotoMetadataResult placePhotoMetadataResult, long j) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
        this.MediaBrowserCompat$ItemReceiver = placePhotoMetadataResult;
        this.write = j;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10829Sizeof.C37931 r0 = this.MediaBrowserCompat$CustomActionResultReceiver;
        PlacePhotoMetadataResult placePhotoMetadataResult = this.MediaBrowserCompat$ItemReceiver;
        ((getPayee) obj).MediaBrowserCompat$CustomActionResultReceiver(r0.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(placePhotoMetadataResult), this.write);
    }
}
