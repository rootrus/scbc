package p040o;

import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import com.scb.phone.view.custom.easycash.CustomAccountSelector$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.InvestmentService */
public final /* synthetic */ class InvestmentService implements FragmentBuilder_BindCcSofBillPaymentOnlyFragment {
    private final /* synthetic */ CustomAccountSelector MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CustomAccountSelector$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ InvestmentService(CustomAccountSelector customAccountSelector, CustomAccountSelector$MediaBrowserCompat$ItemReceiver customAccountSelector$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customAccountSelector;
        this.read = customAccountSelector$MediaBrowserCompat$ItemReceiver;
    }

    public final void read(int i) {
        CustomAccountSelector customAccountSelector = this.MediaBrowserCompat$CustomActionResultReceiver;
        CustomAccountSelector$MediaBrowserCompat$ItemReceiver customAccountSelector$MediaBrowserCompat$ItemReceiver = this.read;
        customAccountSelector.mViewPager.setCurrentItem(i, true);
        customAccountSelector$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(i);
    }
}
