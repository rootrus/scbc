package p040o;

/* renamed from: o.FatcaActivity */
public final class FatcaActivity extends FundAppFormActivity {
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$ItemReceiver;
    private final CheckSCBSEligibilityActivity write;

    public FatcaActivity(CheckSCBSEligibilityActivity checkSCBSEligibilityActivity, String str, String str2) {
        this.write = checkSCBSEligibilityActivity;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return this.write;
    }

    public final String getName() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String getSignature() {
        return this.IconCompatParcelizer;
    }

    public final Object IconCompatParcelizer(Object obj) {
        return IconCompatParcelizer().call(obj);
    }
}
