package p040o;

import p040o.HmlPromptPayVerificationActivity;

/* renamed from: o.HmlMoaActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class HmlMoaActivity$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<String, HmlPromptPayVerificationActivity.IconCompatParcelizer, String> {
    public static final HmlMoaActivity$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer = new HmlMoaActivity$MediaBrowserCompat$CustomActionResultReceiver();

    HmlMoaActivity$MediaBrowserCompat$CustomActionResultReceiver() {
        super(2);
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        String str = (String) obj;
        HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer = (HmlPromptPayVerificationActivity.IconCompatParcelizer) obj2;
        onGetStartedClick.write((Object) str, "acc");
        onGetStartedClick.write((Object) iconCompatParcelizer, "element");
        if (str.length() == 0) {
            return iconCompatParcelizer.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(iconCompatParcelizer);
        return sb.toString();
    }
}
