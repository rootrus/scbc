package p040o;

import p040o.zzxc;

/* renamed from: o.AbstractAppSpiCall$MediaBrowserCompat$ItemReceiver */
public final class AbstractAppSpiCall$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<zzxc.zzc, endTask> {
    private /* synthetic */ AbstractAppSpiCall MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractAppSpiCall$MediaBrowserCompat$ItemReceiver(AbstractAppSpiCall abstractAppSpiCall) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = abstractAppSpiCall;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        zzxc.zzc zzc = (zzxc.zzc) obj;
        onGetStartedClick.write((Object) zzc, "qrBarcode");
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(zzc);
    }
}
