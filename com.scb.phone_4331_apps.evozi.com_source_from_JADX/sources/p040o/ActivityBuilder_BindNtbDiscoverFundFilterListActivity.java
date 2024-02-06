package p040o;

import com.scb.phone.view.fragment.investment.onboarding.FundAddressDetailFragment$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.investment.onboarding.FundAddressMainFragment;

/* renamed from: o.ActivityBuilder_BindNtbDiscoverFundFilterListActivity */
public final /* synthetic */ class ActivityBuilder_BindNtbDiscoverFundFilterListActivity implements FundAddressDetailFragment$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ FundAddressMainFragment write;

    public /* synthetic */ ActivityBuilder_BindNtbDiscoverFundFilterListActivity(FundAddressMainFragment fundAddressMainFragment) {
        this.write = fundAddressMainFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.write.fundAddressPresenter.read();
    }
}
