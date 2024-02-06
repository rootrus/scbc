package p040o;

import kotlin.TypeCastException;

/* renamed from: o.HmlPromptpayEnterCodeActivity */
public class HmlPromptpayEnterCodeActivity {
    public static final <T> HmlNTBPromptPayNotFoundActivity<T> MediaBrowserCompat$ItemReceiver(HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        HmlNTBPromptPayNotFoundActivity<Object> intercepted;
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "$this$intercepted");
        HmlDocumentSubmissionTutorialsActivity hmlDocumentSubmissionTutorialsActivity = (HmlDocumentSubmissionTutorialsActivity) (!(hmlNTBPromptPayNotFoundActivity instanceof HmlDocumentSubmissionTutorialsActivity) ? null : hmlNTBPromptPayNotFoundActivity);
        return (hmlDocumentSubmissionTutorialsActivity == null || (intercepted = hmlDocumentSubmissionTutorialsActivity.intercepted()) == null) ? hmlNTBPromptPayNotFoundActivity : intercepted;
    }

    public static final <R, T> HmlNTBPromptPayNotFoundActivity<HmlVerifyPhoneValidateOtpActivity> read(BaseDiscoverFundFilterActivity<? super R, ? super HmlNTBPromptPayNotFoundActivity<? super T>, ? extends Object> baseDiscoverFundFilterActivity, R r, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "$this$createCoroutineUnintercepted");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        if (baseDiscoverFundFilterActivity instanceof HmlNTBCropDocumentActivity) {
            return ((HmlNTBCropDocumentActivity) baseDiscoverFundFilterActivity).create(r, hmlNTBPromptPayNotFoundActivity);
        }
        HmlPromptPayVerificationActivity context = hmlNTBPromptPayNotFoundActivity.getContext();
        if (context == HmlPromptPayAboutActivity.IconCompatParcelizer) {
            if (hmlNTBPromptPayNotFoundActivity != null) {
                return new C6895x4e0c044(hmlNTBPromptPayNotFoundActivity, baseDiscoverFundFilterActivity, r);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        } else if (hmlNTBPromptPayNotFoundActivity != null) {
            return new HmlPromptpayEnterCodeActivity$MediaBrowserCompat$ItemReceiver(hmlNTBPromptPayNotFoundActivity, context, baseDiscoverFundFilterActivity, r);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }
    }
}
