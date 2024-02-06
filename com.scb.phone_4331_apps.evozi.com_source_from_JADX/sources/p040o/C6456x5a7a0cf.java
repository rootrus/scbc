package p040o;

import p040o.HmlPromptPayVerificationActivity;

/* renamed from: o.EkycSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C6456x5a7a0cf extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<closePinLocation<?>, HmlPromptPayVerificationActivity.IconCompatParcelizer, closePinLocation<?>> {
    public static final C6456x5a7a0cf IconCompatParcelizer = new C6456x5a7a0cf();

    C6456x5a7a0cf() {
        super(2);
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        closePinLocation closepinlocation = (closePinLocation) obj;
        HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer = (HmlPromptPayVerificationActivity.IconCompatParcelizer) obj2;
        onGetStartedClick.write((Object) iconCompatParcelizer, "element");
        if (closepinlocation != null) {
            return closepinlocation;
        }
        if (!(iconCompatParcelizer instanceof closePinLocation)) {
            iconCompatParcelizer = null;
        }
        return (closePinLocation) iconCompatParcelizer;
    }
}
