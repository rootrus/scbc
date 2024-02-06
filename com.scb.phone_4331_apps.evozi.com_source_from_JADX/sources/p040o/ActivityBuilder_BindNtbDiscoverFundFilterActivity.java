package p040o;

import android.view.ViewGroup;
import com.scb.phone.view.adapter.investment.onboarding.SelectableChoiceAdapter;
import com.scb.phone.view.fragment.investment.onboarding.FundMaritalStatusFragment;

/* renamed from: o.ActivityBuilder_BindNtbDiscoverFundFilterActivity */
public final /* synthetic */ class ActivityBuilder_BindNtbDiscoverFundFilterActivity implements SelectableChoiceAdapter.IconCompatParcelizer {
    private final /* synthetic */ FundMaritalStatusFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindNtbDiscoverFundFilterActivity(FundMaritalStatusFragment fundMaritalStatusFragment) {
        this.IconCompatParcelizer = fundMaritalStatusFragment;
    }

    public final void IconCompatParcelizer(String str, int i) {
        FundMaritalStatusFragment fundMaritalStatusFragment = this.IconCompatParcelizer;
        if (i == 1) {
            setLuminanceThreshold setluminancethreshold = fundMaritalStatusFragment.fundMaritalPresenter;
            setluminancethreshold.MediaBrowserCompat$SearchResultReceiver = C5340x8b529e22.MARRIED_DESELECTED;
            setluminancethreshold.MediaBrowserCompat$ItemReceiver();
            fundMaritalStatusFragment.layoutNotMarried.setVisibility(0);
            fundMaritalStatusFragment.layoutDisclosed.setVisibility(8);
        } else {
            setLuminanceThreshold setluminancethreshold2 = fundMaritalStatusFragment.fundMaritalPresenter;
            setluminancethreshold2.MediaBrowserCompat$SearchResultReceiver = C5340x8b529e22.NON_MARRIED;
            setluminancethreshold2.MediaBrowserCompat$ItemReceiver();
            fundMaritalStatusFragment.layoutNotMarried.setVisibility(8);
        }
        fundMaritalStatusFragment.MediaBrowserCompat$CustomActionResultReceiver((ViewGroup) fundMaritalStatusFragment.layoutContainer);
    }
}
