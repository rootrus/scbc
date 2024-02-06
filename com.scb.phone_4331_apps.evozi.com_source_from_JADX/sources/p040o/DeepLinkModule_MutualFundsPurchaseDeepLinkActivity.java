package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlBasePersonalInfoFragment;

/* renamed from: o.DeepLinkModule_MutualFundsPurchaseDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_MutualFundsPurchaseDeepLinkActivity implements View.OnFocusChangeListener {
    private final /* synthetic */ HmlBasePersonalInfoFragment IconCompatParcelizer;

    public /* synthetic */ DeepLinkModule_MutualFundsPurchaseDeepLinkActivity(HmlBasePersonalInfoFragment hmlBasePersonalInfoFragment) {
        this.IconCompatParcelizer = hmlBasePersonalInfoFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        HmlBasePersonalInfoFragment hmlBasePersonalInfoFragment = this.IconCompatParcelizer;
        hmlBasePersonalInfoFragment.IconCompatParcelizer.write(getPageID$MediaBrowserCompat$ItemReceiver.INCOMING, hmlBasePersonalInfoFragment.income.getText().toString(), 0, z);
    }
}
