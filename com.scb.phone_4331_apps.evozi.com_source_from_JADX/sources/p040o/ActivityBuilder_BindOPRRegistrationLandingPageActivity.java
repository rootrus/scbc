package p040o;

import com.scb.phone.view.fragment.investment.onboarding.FundInvestmentExperienceFragment;

/* renamed from: o.ActivityBuilder_BindOPRRegistrationLandingPageActivity */
public final /* synthetic */ class ActivityBuilder_BindOPRRegistrationLandingPageActivity implements Runnable {
    private final /* synthetic */ FundInvestmentExperienceFragment read;

    public /* synthetic */ ActivityBuilder_BindOPRRegistrationLandingPageActivity(FundInvestmentExperienceFragment fundInvestmentExperienceFragment) {
        this.read = fundInvestmentExperienceFragment;
    }

    public final void run() {
        FundInvestmentExperienceFragment fundInvestmentExperienceFragment = this.read;
        FundInvestmentExperienceFragment fundInvestmentExperienceFragment2 = (FundInvestmentExperienceFragment) fundInvestmentExperienceFragment.getFragmentManager().findFragmentByTag(FundInvestmentExperienceFragment.class.getName());
        if (fundInvestmentExperienceFragment2 != null && fundInvestmentExperienceFragment2.isVisible()) {
            fundInvestmentExperienceFragment.recyclerViewHoldingTax.write(0).write.performClick();
        }
    }
}
