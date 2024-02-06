package p040o;

import p040o.writeUInt64NoTag;
import p040o.zzqj;

/* renamed from: o.isJsonObject */
public final /* synthetic */ class isJsonObject implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzqj.zza IconCompatParcelizer;
    private final /* synthetic */ getArrayComponentType$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ isJsonObject(getArrayComponentType$MediaBrowserCompat$ItemReceiver getarraycomponenttype_mediabrowsercompat_itemreceiver, zzqj.zza zza) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getarraycomponenttype_mediabrowsercompat_itemreceiver;
        this.IconCompatParcelizer = zza;
    }

    public final void IconCompatParcelizer(Object obj) {
        getArrayComponentType$MediaBrowserCompat$ItemReceiver getarraycomponenttype_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((IdCaptureModule) obj).MediaBrowserCompat$CustomActionResultReceiver(getarraycomponenttype_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer));
    }
}
