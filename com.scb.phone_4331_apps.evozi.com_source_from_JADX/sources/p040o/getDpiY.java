package p040o;

import p040o.RegularImmutableMap;
import p040o.nativeWriteTiffImageWithMetaData;
import p040o.writeUInt64NoTag;
import p040o.zzca;

/* renamed from: o.getDpiY */
public final /* synthetic */ class getDpiY implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzca.zzd MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ nativeWriteTiffImageWithMetaData.write read;

    public /* synthetic */ getDpiY(nativeWriteTiffImageWithMetaData.write write, zzca.zzd zzd) {
        this.read = write;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzd;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeWriteTiffImageWithMetaData.write write = this.read;
        zzca.zzd zzd = this.MediaBrowserCompat$CustomActionResultReceiver;
        FieldLocation fieldLocation = (FieldLocation) obj;
        fieldLocation.aj_();
        RegularImmutableMap.Values unused = nativeWriteTiffImageWithMetaData.this.MediaBrowserCompat$SearchResultReceiver;
        fieldLocation.read(RegularImmutableMap.Values.MediaBrowserCompat$ItemReceiver(zzd));
    }
}
