package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p040o.ScbMapActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindOPRRewardsTabFragment */
public final class FragmentBuilder_BindOPRRewardsTabFragment {
    public float MediaBrowserCompat$CustomActionResultReceiver;
    public float MediaBrowserCompat$ItemReceiver;

    public FragmentBuilder_BindOPRRewardsTabFragment() {
    }

    /* renamed from: o.FragmentBuilder_BindOPRRewardsTabFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<ScbMapActivity_ViewBinding<OnBoardingTutorialActivity, HmlVerifyEmailSuccessfulActivity<? extends FragmentBuilder_BindHmlNtbOutcomeRejectFragment, ? extends FragmentBuilder_BindHmlOperatingBankFragment>>, HmlVerifyPhoneValidateOtpActivity> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final ScbMapActivity_ViewBinding scbMapActivity_ViewBinding = (ScbMapActivity_ViewBinding) obj;
            onGetStartedClick.write((Object) scbMapActivity_ViewBinding, "$receiver");
            FundFactSheetActivity fundFactSheetActivity = C65941.read;
            onGetStartedClick.write((Object) fundFactSheetActivity, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            scbMapActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = (String) fundFactSheetActivity.invoke(scbMapActivity_ViewBinding);
            ScbMapActivity_ViewBinding.write(scbMapActivity_ViewBinding, new BaseDiscoverDisclaimerActivity<ScbMapActivity_ViewBinding<OnBoardingTutorialActivity, HmlVerifyEmailSuccessfulActivity<? extends FragmentBuilder_BindHmlNtbOutcomeRejectFragment, ? extends FragmentBuilder_BindHmlOperatingBankFragment>>.write, CaptureDocumentActivity<OnBoardingTutorialActivity>, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity>, Object>((HmlNTBPromptPayNotFoundActivity) null) {
                private ScbMapActivity_ViewBinding.write IconCompatParcelizer;
                private CaptureDocumentActivity read;

                public final Object write(Object obj, Object obj2, Object obj3) {
                    ScbMapActivity_ViewBinding.write write = (ScbMapActivity_ViewBinding.write) obj;
                    CaptureDocumentActivity captureDocumentActivity = (CaptureDocumentActivity) obj2;
                    HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity = (HmlNTBPromptPayNotFoundActivity) obj3;
                    onGetStartedClick.write((Object) write, "$this$create");
                    onGetStartedClick.write((Object) captureDocumentActivity, "<name for destructuring parameter 0>");
                    onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "continuation");
                    C65953 r0 = 

                    public FragmentBuilder_BindOPRRewardsTabFragment(float f, float f2) {
                        this.MediaBrowserCompat$ItemReceiver = f;
                        this.MediaBrowserCompat$CustomActionResultReceiver = f2;
                    }

                    public final String toString() {
                        return String.format("(%.4f, %.4f)", new Object[]{Float.valueOf(this.MediaBrowserCompat$ItemReceiver), Float.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver)});
                    }
                }
