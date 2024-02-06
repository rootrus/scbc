package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.eQ */
public final /* synthetic */ class C4351eQ implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4353eU MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4351eQ(C4353eU eUVar) {
        this.MediaBrowserCompat$ItemReceiver = eUVar;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4353eU eUVar = this.MediaBrowserCompat$ItemReceiver;
        ((LocalProjectProvider.C69364) obj).read(eUVar.ParcelableVolumeInfo && eUVar.MediaSessionCompat$ResultReceiverWrapper && eUVar.MediaSessionCompat$Token != null);
    }
}
