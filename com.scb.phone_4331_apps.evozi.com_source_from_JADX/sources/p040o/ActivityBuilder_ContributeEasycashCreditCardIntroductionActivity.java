package p040o;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.scb.phone.R;
import com.scb.phone.view.fragment.merchant.MerchantWalletTransactionFragment;

/* renamed from: o.ActivityBuilder_ContributeEasycashCreditCardIntroductionActivity */
public final /* synthetic */ class ActivityBuilder_ContributeEasycashCreditCardIntroductionActivity implements Toolbar.IconCompatParcelizer {
    private final /* synthetic */ MerchantWalletTransactionFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeEasycashCreditCardIntroductionActivity(MerchantWalletTransactionFragment merchantWalletTransactionFragment) {
        this.MediaBrowserCompat$ItemReceiver = merchantWalletTransactionFragment;
    }

    public final boolean read(MenuItem menuItem) {
        MerchantWalletTransactionFragment merchantWalletTransactionFragment = this.MediaBrowserCompat$ItemReceiver;
        if (menuItem.getItemId() != R.id.menu_filter) {
            return false;
        }
        merchantWalletTransactionFragment.MediaBrowserCompat$CustomActionResultReceiver();
        return true;
    }
}
