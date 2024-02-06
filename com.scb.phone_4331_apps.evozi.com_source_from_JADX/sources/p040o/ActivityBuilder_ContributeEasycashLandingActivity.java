package p040o;

import android.view.MenuItem;
import com.scb.phone.view.fragment.merchant.MerchantWalletTransactionFragment;
import p040o.setOverflowReserved;

/* renamed from: o.ActivityBuilder_ContributeEasycashLandingActivity */
public final /* synthetic */ class ActivityBuilder_ContributeEasycashLandingActivity implements setOverflowReserved.IconCompatParcelizer {
    private final /* synthetic */ MerchantWalletTransactionFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeEasycashLandingActivity(MerchantWalletTransactionFragment merchantWalletTransactionFragment) {
        this.IconCompatParcelizer = merchantWalletTransactionFragment;
    }

    public final boolean write(MenuItem menuItem) {
        return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(menuItem);
    }
}
