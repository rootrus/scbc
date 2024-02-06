package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.IpImageMetadata */
public final /* synthetic */ class IpImageMetadata implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeWriteTiffImageWithMetaData IconCompatParcelizer;
    private final /* synthetic */ double MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ IpImageMetadata(nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata, double d) {
        this.IconCompatParcelizer = nativewritetiffimagewithmetadata;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata = this.IconCompatParcelizer;
        ((FieldLocation) obj).MediaBrowserCompat$ItemReceiver(!nativeWriteTiffImageWithMetaData.MediaBrowserCompat$ItemReceiver(nativewritetiffimagewithmetadata.write, this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
