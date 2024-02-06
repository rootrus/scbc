package p040o;

import p040o.HmlPromptPayVerificationActivity;

/* renamed from: o.HmlPromptPayVerificationActivity$write$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6894x2375c6f extends CheckEligibilityActivity implements BaseDiscoverFundFilterActivity<HmlPromptPayVerificationActivity, HmlPromptPayVerificationActivity.IconCompatParcelizer, HmlPromptPayVerificationActivity> {
    public static final C6894x2375c6f write = new C6894x2375c6f();

    C6894x2375c6f() {
        super(2);
    }

    public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        HmlMoaActivity hmlMoaActivity;
        HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity = (HmlPromptPayVerificationActivity) obj;
        HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer = (HmlPromptPayVerificationActivity.IconCompatParcelizer) obj2;
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "acc");
        onGetStartedClick.write((Object) iconCompatParcelizer, "element");
        HmlPromptPayVerificationActivity read = hmlPromptPayVerificationActivity.read(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
        if (read == HmlPromptPayAboutActivity.IconCompatParcelizer) {
            return iconCompatParcelizer;
        }
        HmlNTBPromptPayNotFoundActivity_ViewBinding hmlNTBPromptPayNotFoundActivity_ViewBinding = (HmlNTBPromptPayNotFoundActivity_ViewBinding) read.IconCompatParcelizer(HmlNTBPromptPayNotFoundActivity_ViewBinding.write);
        if (hmlNTBPromptPayNotFoundActivity_ViewBinding == null) {
            hmlMoaActivity = new HmlMoaActivity(read, iconCompatParcelizer);
        } else {
            HmlPromptPayVerificationActivity read2 = read.read(HmlNTBPromptPayNotFoundActivity_ViewBinding.write);
            if (read2 == HmlPromptPayAboutActivity.IconCompatParcelizer) {
                hmlMoaActivity = new HmlMoaActivity(iconCompatParcelizer, hmlNTBPromptPayNotFoundActivity_ViewBinding);
            } else {
                hmlMoaActivity = new HmlMoaActivity(new HmlMoaActivity(read2, iconCompatParcelizer), hmlNTBPromptPayNotFoundActivity_ViewBinding);
            }
        }
        return hmlMoaActivity;
    }
}
