package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.createIpImageFromBitmap */
public final /* synthetic */ class createIpImageFromBitmap implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setDomain MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ createIpImageFromBitmap(setDomain setdomain) {
        this.MediaBrowserCompat$ItemReceiver = setdomain;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((ExtractionParameters_Factory) obj).MediaBrowserCompat$ItemReceiver(Double.valueOf(this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo));
    }
}
