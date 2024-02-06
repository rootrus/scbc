package p040o;

import com.scb.phone.view.fragment.investment.onboarding.FundOnboardingReviewFragment;

/* renamed from: o.ActivityBuilder_BindPersonalizeActivity */
public final class ActivityBuilder_BindPersonalizeActivity implements MileageQuantitySelectionActivity<FundOnboardingReviewFragment> {
    public static void read(FundOnboardingReviewFragment fundOnboardingReviewFragment, surfaceDestroyed surfacedestroyed) {
        fundOnboardingReviewFragment.presenter = surfacedestroyed;
    }
}
