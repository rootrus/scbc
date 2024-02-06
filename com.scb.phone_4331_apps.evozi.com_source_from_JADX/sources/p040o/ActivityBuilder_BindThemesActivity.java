package p040o;

import com.scb.phone.view.fragment.investment.scbs.open.OnboardingInvestmentInformationSourceOfFundFragment;
import p040o.validateEligibility;

/* renamed from: o.ActivityBuilder_BindThemesActivity */
public final /* synthetic */ class ActivityBuilder_BindThemesActivity implements validateEligibility.read {
    private final /* synthetic */ OnboardingInvestmentInformationSourceOfFundFragment write;

    public /* synthetic */ ActivityBuilder_BindThemesActivity(OnboardingInvestmentInformationSourceOfFundFragment onboardingInvestmentInformationSourceOfFundFragment) {
        this.write = onboardingInvestmentInformationSourceOfFundFragment;
    }

    public final void write(lambda$getSortedCustomAttributes$0 lambda_getsortedcustomattributes_0) {
        setMessage setmessage = this.write.presenter;
        CaptureExperience captureExperience = new CaptureExperience(lambda_getsortedcustomattributes_0);
        if (setmessage.RatingCompat != null) {
            captureExperience.IconCompatParcelizer(setmessage.RatingCompat);
        }
    }
}
