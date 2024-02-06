package p040o;

import p040o.HmlPromptPayVerificationActivity;

/* renamed from: o.EkycSuccessActivity$MediaBrowserCompat$ItemReceiver */
final class EkycSuccessActivity$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<Object, HmlPromptPayVerificationActivity.IconCompatParcelizer, Object> {
    public static final EkycSuccessActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new EkycSuccessActivity$MediaBrowserCompat$ItemReceiver();

    EkycSuccessActivity$MediaBrowserCompat$ItemReceiver() {
        super(2);
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer = (HmlPromptPayVerificationActivity.IconCompatParcelizer) obj2;
        onGetStartedClick.write((Object) iconCompatParcelizer, "element");
        if (!(iconCompatParcelizer instanceof closePinLocation)) {
            return obj;
        }
        if (!(obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        int intValue = num != null ? num.intValue() : 1;
        return intValue != 0 ? Integer.valueOf(intValue + 1) : iconCompatParcelizer;
    }
}
