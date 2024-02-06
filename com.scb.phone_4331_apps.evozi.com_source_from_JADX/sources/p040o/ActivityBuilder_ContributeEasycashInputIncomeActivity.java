package p040o;

import com.scb.phone.R;
import com.scb.phone.view.fragment.merchant.MerchantWalletTransactionFragment;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.ActivityBuilder_ContributeEasycashInputIncomeActivity */
public final /* synthetic */ class ActivityBuilder_ContributeEasycashInputIncomeActivity implements findFragmentByWho {
    private final /* synthetic */ MerchantWalletTransactionFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ OffsetDateTime write;

    public /* synthetic */ ActivityBuilder_ContributeEasycashInputIncomeActivity(MerchantWalletTransactionFragment merchantWalletTransactionFragment, OffsetDateTime offsetDateTime) {
        this.MediaBrowserCompat$ItemReceiver = merchantWalletTransactionFragment;
        this.write = offsetDateTime;
    }

    public final Object IconCompatParcelizer(Object obj) {
        MerchantWalletTransactionFragment merchantWalletTransactionFragment = this.MediaBrowserCompat$ItemReceiver;
        OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
        if (this.write.getMonth() == offsetDateTime.getMonth()) {
            return merchantWalletTransactionFragment.getString(R.string.deposit_detail_filter_this_month);
        }
        return CheckCaptureActivity.read(merchantWalletTransactionFragment.getResources(), "MMM yyyy", offsetDateTime);
    }
}
