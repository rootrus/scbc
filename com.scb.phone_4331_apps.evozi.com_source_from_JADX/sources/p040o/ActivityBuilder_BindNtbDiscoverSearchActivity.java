package p040o;

import com.scb.phone.view.adapter.investment.onboarding.SelectableChoiceAdapter;
import com.scb.phone.view.fragment.investment.onboarding.FundInvestmentExperienceFragment;

/* renamed from: o.ActivityBuilder_BindNtbDiscoverSearchActivity */
public final /* synthetic */ class ActivityBuilder_BindNtbDiscoverSearchActivity implements SelectableChoiceAdapter.IconCompatParcelizer {
    private final /* synthetic */ FundInvestmentExperienceFragment write;

    public /* synthetic */ ActivityBuilder_BindNtbDiscoverSearchActivity(FundInvestmentExperienceFragment fundInvestmentExperienceFragment) {
        this.write = fundInvestmentExperienceFragment;
    }

    public final void IconCompatParcelizer(String str, int i) {
        FundInvestmentExperienceFragment.MediaBrowserCompat$ItemReceiver(this.write, i);
    }
}
