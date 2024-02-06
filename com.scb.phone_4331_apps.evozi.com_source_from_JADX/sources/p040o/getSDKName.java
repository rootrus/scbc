package p040o;

import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.activity.merchant.MerchantWalletDetailActivity;
import com.scb.phone.view.fragment.merchant.MerchantWalletTransactionFragment;

/* renamed from: o.getSDKName */
public final /* synthetic */ class getSDKName implements NestedScrollView.IconCompatParcelizer {
    private final /* synthetic */ MerchantWalletDetailActivity IconCompatParcelizer;

    public /* synthetic */ getSDKName(MerchantWalletDetailActivity merchantWalletDetailActivity) {
        this.IconCompatParcelizer = merchantWalletDetailActivity;
    }

    public final void write(NestedScrollView nestedScrollView, int i, int i2) {
        MerchantWalletTransactionFragment merchantWalletTransactionFragment;
        MerchantWalletDetailActivity merchantWalletDetailActivity = this.IconCompatParcelizer;
        if (i >= i2 && i >= (nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) - 250 && (merchantWalletTransactionFragment = (MerchantWalletTransactionFragment) merchantWalletDetailActivity.getSupportFragmentManager().findFragmentById(R.id.layout_transactions)) != null) {
            merchantWalletTransactionFragment.aw_();
        }
    }
}
