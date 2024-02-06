package p040o;

/* renamed from: o.FundAppFormActivity_ViewBinding */
public final class FundAppFormActivity_ViewBinding extends CheckEligibilityActivity_ViewBinding {
    private final String IconCompatParcelizer;
    private final CheckSCBSEligibilityActivity MediaBrowserCompat$CustomActionResultReceiver;
    private final String read;

    public FundAppFormActivity_ViewBinding(CheckSCBSEligibilityActivity checkSCBSEligibilityActivity, String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = checkSCBSEligibilityActivity;
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String getName() {
        return this.read;
    }

    public final String getSignature() {
        return this.IconCompatParcelizer;
    }

    public final Object IconCompatParcelizer(Object obj) {
        return IconCompatParcelizer().call(obj);
    }
}
