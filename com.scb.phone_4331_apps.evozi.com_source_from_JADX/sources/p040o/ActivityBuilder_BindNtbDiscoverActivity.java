package p040o;

import com.scb.phone.view.fragment.investment.onboarding.FundAddressDetailFragment$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.investment.onboarding.FundAddressMainFragment;

/* renamed from: o.ActivityBuilder_BindNtbDiscoverActivity */
public final /* synthetic */ class ActivityBuilder_BindNtbDiscoverActivity implements FundAddressDetailFragment$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ FundAddressMainFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_BindNtbDiscoverActivity(FundAddressMainFragment fundAddressMainFragment) {
        this.MediaBrowserCompat$ItemReceiver = fundAddressMainFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaBrowserCompat$ItemReceiver.fundAddressPresenter.read();
    }
}
