package p040o;

import android.widget.RadioGroup;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import com.scb.phone.view.fragment.easycash.loaninformation.EasycashLoanFeaturesAccountFragment;

/* renamed from: o.DeepLinkModule_BillerDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_BillerDeepLinkActivity implements RadioGroup.OnCheckedChangeListener {
    private final /* synthetic */ EasycashLoanFeaturesAccountFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ DeepLinkModule_BillerDeepLinkActivity(EasycashLoanFeaturesAccountFragment easycashLoanFeaturesAccountFragment) {
        this.MediaBrowserCompat$ItemReceiver = easycashLoanFeaturesAccountFragment;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        EasycashLoanFeaturesAccountFragment easycashLoanFeaturesAccountFragment = this.MediaBrowserCompat$ItemReceiver;
        int i2 = 0;
        boolean z = i == R.id.rdb_direct_debit;
        CustomAccountSelector customAccountSelector = easycashLoanFeaturesAccountFragment.accountRepaySelector;
        if (!z) {
            i2 = 8;
        }
        customAccountSelector.setVisibility(i2);
    }
}
