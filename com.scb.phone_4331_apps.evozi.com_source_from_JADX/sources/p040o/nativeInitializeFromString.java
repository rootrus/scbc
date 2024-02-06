package p040o;

import java.util.List;
import p040o.IdParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeInitializeFromString */
public final /* synthetic */ class nativeInitializeFromString implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ nativeConfigureFromFile$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ nativeInitializeFromString(nativeConfigureFromFile$MediaBrowserCompat$ItemReceiver nativeconfigurefromfile_mediabrowsercompat_itemreceiver, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nativeconfigurefromfile_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        nativeConfigureFromFile$MediaBrowserCompat$ItemReceiver nativeconfigurefromfile_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        List list = this.MediaBrowserCompat$ItemReceiver;
        IdParameters.C6915a aVar = (IdParameters.C6915a) obj;
        aVar.aj_();
        aVar.IconCompatParcelizer(list != null ? nativeconfigurefromfile_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat.write(list, nativeconfigurefromfile_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.setCheckable()) : null);
    }
}
