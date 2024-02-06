package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import p040o.HmlVerifyIdentifyActivity;
import p040o.ScbMapActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindNdidSelectIdpSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6582x9ea389c9 extends CheckEligibilityActivity implements FundFactSheetActivity<ScbMapActivity_ViewBinding<OnBoardingTutorialActivity, Object>, HmlVerifyPhoneValidateOtpActivity> {
    public static final C6582x9ea389c9 write = new C6582x9ea389c9();

    C6582x9ea389c9() {
        super(1);
    }

    /* renamed from: o.FragmentBuilder_BindNdidSelectIdpSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver$1 */
    static final class C65831 extends InsurancePortfolioActivity_ViewBinding implements BaseDiscoverDisclaimerActivity<ScbMapActivity_ViewBinding<OnBoardingTutorialActivity, Object>.write, CaptureDocumentActivity<OnBoardingTutorialActivity>, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity>, Object> {
        private ScbMapActivity_ViewBinding.write MediaBrowserCompat$CustomActionResultReceiver;
        private CaptureDocumentActivity read;

        public final Object write(Object obj, Object obj2, Object obj3) {
            ScbMapActivity_ViewBinding.write write = (ScbMapActivity_ViewBinding.write) obj;
            CaptureDocumentActivity captureDocumentActivity = (CaptureDocumentActivity) obj2;
            HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity = (HmlNTBPromptPayNotFoundActivity) obj3;
            onGetStartedClick.write((Object) write, "$this$create");
            onGetStartedClick.write((Object) captureDocumentActivity, "<name for destructuring parameter 0>");
            onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "continuation");
            C65831 r0 = new C65831(hmlNTBPromptPayNotFoundActivity);
            r0.MediaBrowserCompat$CustomActionResultReceiver = write;
            r0.read = captureDocumentActivity;
            return r0.invokeSuspend(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
        }

        public final Object invokeSuspend(Object obj) {
            HmlPromptPayVerificationActivity_ViewBinding hmlPromptPayVerificationActivity_ViewBinding = HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED;
            if (!(obj instanceof HmlVerifyIdentifyActivity.write)) {
                ScbMapActivity_ViewBinding.write write = this.MediaBrowserCompat$CustomActionResultReceiver;
                CaptureDocumentActivity captureDocumentActivity = this.read;
                FundActionsSuccessActivity<S> fundActionsSuccessActivity = captureDocumentActivity.read;
                Object obj2 = captureDocumentActivity.MediaBrowserCompat$ItemReceiver;
                OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) fundActionsSuccessActivity.invoke();
                if (onBoardingTutorialActivity == null) {
                    onBoardingTutorialActivity = new OnBoardingTutorialActivity((byte) 0);
                }
                boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) FragmentBuilder_BindOnboardingInputAddressFragment.MediaSessionCompat$ResultReceiverWrapper().invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
                boolean MediaBrowserCompat$ItemReceiver2 = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) FragmentBuilder_BindMyFundsFragment.MediaBrowserCompat$ItemReceiver().invoke(onBoardingTutorialActivity), (Object) Boolean.TRUE);
                if ((obj2 instanceof C6567xcb022142) && MediaBrowserCompat$ItemReceiver && MediaBrowserCompat$ItemReceiver2) {
                    onSeeInstructionsClicked onseeinstructionsclicked = C6752x41f3bcab.read;
                    onGetStartedClick.write((Object) onseeinstructionsclicked, "action");
                    ScbMapActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(write.MediaBrowserCompat$CustomActionResultReceiver, onseeinstructionsclicked);
                }
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
            throw ((HmlVerifyIdentifyActivity.write) obj).read;
        }
    }

    public final /* synthetic */ Object invoke(Object obj) {
        ScbMapActivity_ViewBinding scbMapActivity_ViewBinding = (ScbMapActivity_ViewBinding) obj;
        onGetStartedClick.write((Object) scbMapActivity_ViewBinding, "$receiver");
        FundFactSheetActivity fundFactSheetActivity = C65845.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundFactSheetActivity, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        scbMapActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = (String) fundFactSheetActivity.invoke(scbMapActivity_ViewBinding);
        ScbMapActivity_ViewBinding.write(scbMapActivity_ViewBinding, new C65831((HmlNTBPromptPayNotFoundActivity) null));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
