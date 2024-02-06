package p040o;

import com.scb.phone.view.fragment.investment.InvestmentDetailsFragment;
import p040o.FragmentBuilder_BindCreditCardFragment;

/* renamed from: o.ActivityBuilder_BindHowToAddAccountStep2Activity */
public final /* synthetic */ class ActivityBuilder_BindHowToAddAccountStep2Activity implements FragmentBuilder_BindCreditCardFragment.IconCompatParcelizer {
    private final /* synthetic */ InvestmentDetailsFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindHowToAddAccountStep2Activity(InvestmentDetailsFragment investmentDetailsFragment) {
        this.IconCompatParcelizer = investmentDetailsFragment;
    }

    public final void read(int i) {
        InvestmentDetailsFragment investmentDetailsFragment = this.IconCompatParcelizer;
        investmentDetailsFragment.pivAdsIndicator.setSelection(investmentDetailsFragment.MediaBrowserCompat$CustomActionResultReceiver.read(i));
    }
}
