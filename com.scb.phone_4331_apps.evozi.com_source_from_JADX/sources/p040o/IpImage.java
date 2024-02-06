package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.IpImage */
public final /* synthetic */ class IpImage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeWriteTiffImageWithMetaData read;

    public /* synthetic */ IpImage(nativeWriteTiffImageWithMetaData nativewritetiffimagewithmetadata) {
        this.read = nativewritetiffimagewithmetadata;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((FieldLocation) obj).mo14444a_(this.read.MediaBrowserCompat$CustomActionResultReceiver());
    }
}
