package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.onProviderDisabled */
public final /* synthetic */ class onProviderDisabled implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setUuidFromUtf8Bytes write;

    public /* synthetic */ onProviderDisabled(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.write = setuuidfromutf8bytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth$MediaBrowserCompat$SearchResultReceiver) obj).read(this.write);
    }
}
