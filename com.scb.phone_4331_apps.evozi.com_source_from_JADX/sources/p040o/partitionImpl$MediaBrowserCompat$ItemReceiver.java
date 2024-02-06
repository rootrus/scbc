package p040o;

import p040o.Component;
import p040o.Maps;
import p040o.zztx;

/* renamed from: o.partitionImpl$MediaBrowserCompat$ItemReceiver */
public final class partitionImpl$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<zztx.zza, Component.C31841> {
    private /* synthetic */ partitionImpl MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public partitionImpl$MediaBrowserCompat$ItemReceiver(partitionImpl partitionimpl) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = partitionimpl;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        zztx.zza zza = (zztx.zza) obj;
        onGetStartedClick.write((Object) zza, "model");
        return Maps.TransformedEntriesMap.EntrySet.C36501.C36511.MediaBrowserCompat$ItemReceiver(zza);
    }
}
