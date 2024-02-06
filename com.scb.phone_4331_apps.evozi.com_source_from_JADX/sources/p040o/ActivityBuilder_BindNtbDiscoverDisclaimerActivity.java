package p040o;

import com.scb.phone.view.adapter.investment.onboarding.SelectableChoiceAdapter;
import com.scb.phone.view.fragment.investment.onboarding.FundInvestmentExperienceFragment;

/* renamed from: o.ActivityBuilder_BindNtbDiscoverDisclaimerActivity */
public final /* synthetic */ class ActivityBuilder_BindNtbDiscoverDisclaimerActivity implements SelectableChoiceAdapter.IconCompatParcelizer {
    private final /* synthetic */ FundInvestmentExperienceFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_BindNtbDiscoverDisclaimerActivity(FundInvestmentExperienceFragment fundInvestmentExperienceFragment) {
        this.MediaBrowserCompat$ItemReceiver = fundInvestmentExperienceFragment;
    }

    public final void IconCompatParcelizer(String str, int i) {
        FundInvestmentExperienceFragment.write(this.MediaBrowserCompat$ItemReceiver, str);
    }
}
